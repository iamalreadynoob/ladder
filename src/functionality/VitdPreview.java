package functionality;

import fileReading.VitdReading;

import javax.swing.*;
import java.util.ArrayList;

public class VitdPreview
{

    private String path, name;
    private int loc, size;
    private ArrayList<String> titles, predefinedCommands;
    private ArrayList<ArrayList<String>> texts;

    public VitdPreview()
    {
        titles = new ArrayList<>();
        predefinedCommands = new ArrayList<>();
        texts = new ArrayList<>();
        setPredefinedCommands();
        loc = 0;
    }

    public void initialize(String path)
    {
        this.path = path;
        VitdReading reading = new VitdReading();
        reading.scan(path);
        texts = reading.getTexts();
        titles = reading.getHeaders();
        size = texts.size() - 1;
    }

    public void exit()
    {
        loc = 0;
        titles.clear();
        texts.clear();
    }

    public void setLoc(int loc) {this.loc = loc;}
    public int getLoc() {return loc;}
    public int getSize(){return size;}
    public String getPath() {return path;}
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void load(int point, JTextArea scene)
    {
        ArrayList<String> current = texts.get(point);
        ArrayList<Integer> commands = new ArrayList<>();
        for (int i = 0; i < current.size(); i++) if (predefinedCommands.contains(current.get(i))) commands.add(i);
        commands.add(current.size());

        String text = titles.get(point).toUpperCase() + "\n\n";
        int loc = commands.get(0);
        if (commands.size() > 2)
        {
            for (int i = 1; i < commands.size(); i++)
            {
                int type;
                if (current.get(commands.get(i-1)).equals("PLAIN")) type = 0;
                else if (current.get(commands.get(i-1)).equals("LIST")) type = 1;
                else type = 2;
                loc++;
                while (loc < commands.get(i))
                {
                    switch (type)
                    {
                        case 0: text += current.get(loc) + "\n"; break;
                        case 1: text += "     => " + current.get(loc) + "\n"; break;
                        case 2: text += current.get(loc).toLowerCase() + "\n\n"; break;
                    }
                    loc++;
                }
            }
        }
        else if (commands.size() == 2)
        {
            int type;
            if (commands.get(0).equals("PLAIN")) type = 0;
            else if (commands.get(0).equals("LIST")) type = 1;
            else type = 2;

            for (int i = commands.get(0) + 1; i < current.size(); i++)
            {
                switch (type)
                {
                    case 0: text += current.get(i) + "\n"; break;
                    case 1: text += "     => " + current.get(i) + "\n"; break;
                    case 2: text += current.get(i).toLowerCase() + "\n\n"; break;
                }
            }
        }

        scene.setText(text);
    }

    private void setPredefinedCommands()
    {
        predefinedCommands.add("PLAIN");
        predefinedCommands.add("LIST");
        predefinedCommands.add("SUBHEADER");
    }
}
