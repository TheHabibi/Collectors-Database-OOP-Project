package SystemAndMain;


import Inheritance.Figure;
import Inheritance.ComicBook;
import Inheritance.Film;
import Inheritance.Collectibles;
import java.util.ArrayList;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ali
 */
public class CollectiblesSys {

    public static HashSet<Collectibles> hs = new HashSet();
    public static ArrayList<Collectibles> list = new ArrayList();
    public static double totalWorth = 0.0;

    public static void addCollectible(Collectibles temp) {
        list.add(temp);
        totalWorth += temp.getWorth();
        Collectibles.itemCount();

    }

    public static boolean removeCollectible(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().equalsIgnoreCase(name)) {
                totalWorth -= list.get(i).getWorth();
                list.remove(i);
            }
        }

        return false;
    }

 
    public static Collectibles searchCollectible(String name) {
        String temp;
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i).getTitle();

            if (temp.equalsIgnoreCase(name)) {
                return list.get(i);
            }
        }
        return null;
    }

    public static HashSet<Collectibles> getCollectiblesSet() {
        return hs;
    }

    public static String displayCollectibles() {
        String result = "";
        result += "Total count of Collectibles = " + Collectibles.getTotalCount() +"\n\n";
        hs.addAll(list);
        for (Collectibles c : hs) {
            result += c.toString();
        }
        
        return result;
    }

    public static String displaySelectedCollectibles(String type) {
        String Selected = "";

        switch (type) {
            case "comics":
                for (Collectibles c : list) {
                    if (c instanceof ComicBook) {
                        Selected += c.toString();
                    }
                }
                break;
                case "films":
                for (Collectibles c : list) {
                    if (c instanceof Film) {
                        Selected += c.toString();
                    }
                }
                break;
                case "figures":
                for (Collectibles c : list) {
                    if (c instanceof Figure) {
                        Selected += c.toString();
                    }
                }
                break;
                

        }
return Selected;
    }

}
