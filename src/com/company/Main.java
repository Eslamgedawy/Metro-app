package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    // Driver program
    public static void main(String[] args)
    {
        // Create a sample graph

//        String[] stationNameList = new String[]{
//                "Netaji Subhash Place",
//                "Shalimar Bagh",
//                "Azadpur",
//                "Model Town",
//                "G.T.B. Nagar",
//                "Vishwavidyalaya",
//                "Vidhan Sabha",
//                "Civil Lines",
//                "Kashmere Gate",
//                "Tis Hazari",
//                "Pulbangash",
//                "Pratap Nagar",
//                "Shastri Nagar",
//                "Inderlok",
//                "Kanhaiya Nagar",
//                "Keshav Puram",
//                "Chandni Chowk",
//                "Chawri Bazar",
//                "New Delhi", "Rajiv Chowk", "RK Ashram Marg", "Jhandewalan", "Karol Bagh", "Rajendra Place", "Patel Nagar", "Shadipur", "Kirti Nagar", "Satguru Ram Singh Marg", "Ashok Park Main", "Moti Nagar", "Ramesh Nagar", "Rajouri Garden", "ESI - Basaidarapur", "Punjabi Bagh (W)", "Shakurpur"};

        String[] stationNameList = new String[]{
                "New El-Marg",
                "El-Marg",
                "Ezbet El-Nakhl",
                "Ain Shams",
                "El-Matareyya",
                "Helmeyet El-Zaitoun",
                "Hadayeq El-Zaitoun",
                "Saray El-Qobba",
                "Hammamat El-Qobba",
                "Kobri El-Qobba",
                "Manshiet El-Sadr",
                "El-Demerdash",
                "Ghamra",
                "Al-Shohadaa",
                "Orabi",
                "Nasser",
                "Sadat",
                "Saad Zaghloul",
                //l2 ---------------------------------------------------------

                "Shubra El-Kheima",
                "Kolleyyet El-Zeraa",
                "Mezallat",
                "Khalafawy",
                "St. Teresa",
                "Rod El-Farag",
                "Masarra",
                "Attaba",
                "Mohamed Naguib",
                "Opera",
                "Dokki",
                "El Bohoth",
                "Cairo University",
                "Faisal",
                "Giza",
                "Omm El-Masryeen",
                "Sakiat Mekky",
                "El-Monib",

                ///////l3
                "El shams Club",                //36
                "Alf Maskan",
                "Heliopolis",
                "Haroun El Rashid",
                "Al Ahram",
                "Koleyet El-Banat",
                "Stadium",
                "Fair Zone",
                "Abbassiya",
                "Abdou Pasha",
                "El-Geish",
                "Bab El-Shaaria",                //47

        };

        int[] stationNodeList = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34,35,36,37,38,39,40,41,42,43,44,45,46,47,48};


        Graph metroMap = new Graph(48);  //35
        addEdgesToMetroMap(metroMap);
        showPath(metroMap, "Koleyet El-Banat", "Mezallat", stationNameList, stationNodeList); /// new elmarg -> orabi

    }

    public static int search(String[] stationNameList, String s){
        int index=0;
        for(int i=0; i<stationNameList.length; i++)
            if(s == stationNameList[i])
                index = i;
        return index;
    }


    public static void addEdgesToMetroMap(Graph metroMap){

        // New El-Marg
        metroMap.addEdge(0, 0);
        metroMap.addEdge(0, 1);


        // El-Marg
        metroMap.addEdge(1, 0);
        metroMap.addEdge(1, 2);


        // Ezbet El-Nakhl
        metroMap.addEdge(2, 1);
        metroMap.addEdge(2, 3);


        // Ain Shams
        metroMap.addEdge(3, 2);
        metroMap.addEdge(3, 4);

        // El-Matareyya
        metroMap.addEdge(4, 3);
        metroMap.addEdge(4, 5);


        // Helmeyet El-Zaitoun
        metroMap.addEdge(5, 4);
        metroMap.addEdge(5, 6);


        // "Hadayeq El-Zaitoun"
        metroMap.addEdge(6, 5);
        metroMap.addEdge(6, 7);


        // "Saray El-Qobba"
        metroMap.addEdge(7, 6);
        metroMap.addEdge(7, 8);


        // "Hammamat El-Qobba"
        metroMap.addEdge(8, 7);
        metroMap.addEdge(8, 9);


        // "Kobri El-Qobba"
        metroMap.addEdge(9, 8);
        metroMap.addEdge(9, 10);


        // "Manshiet El-Sadr"
        metroMap.addEdge(10, 9);
        metroMap.addEdge(10, 11);


        // "El-Demerdash"
        metroMap.addEdge(11, 10);
        metroMap.addEdge(11, 12);


        // "Ghamra"
        metroMap.addEdge(12, 11);
        metroMap.addEdge(12, 13);


        // "Al-Shohadaa" -> attaba 25 , orabi 14, masarra 24 ,Ghamra
        metroMap.addEdge(13, 25);
        metroMap.addEdge(13, 14);
        metroMap.addEdge(13, 24);
        metroMap.addEdge(13, 12);

        // Orabi
        metroMap.addEdge(14, 13);
        metroMap.addEdge(14, 15);

        // Nasser
        metroMap.addEdge(15, 14);
        metroMap.addEdge(15, 16);

        // Sadat
        metroMap.addEdge(16, 17); //saad
        metroMap.addEdge(16, 26);  //naguib
        metroMap.addEdge(16, 27); //opra
        metroMap.addEdge(16, 15);//nasser

        // Saad Zaghloul
        metroMap.addEdge(17, 16);   //sadat
       // metroMap.addEdge(17, 0);

        // Shubra El-Kheima
        //metroMap.addEdge(18, 0);
        metroMap.addEdge(18, 19);

        // Kolleyyet El-Zeraa
        metroMap.addEdge(19, 18);
        metroMap.addEdge(19, 20);

        // Mezallat
        metroMap.addEdge(20, 19);
        metroMap.addEdge(20, 21);

        // Khalafawy
        metroMap.addEdge(21, 20);
        metroMap.addEdge(21, 22);

        // St. Teresa
        metroMap.addEdge(22, 21);
        metroMap.addEdge(22, 23);

        // Rod El-Farag
        metroMap.addEdge(23, 22);
        metroMap.addEdge(23, 24);

        // Masarra
        metroMap.addEdge(24, 23);
        //metroMap.addEdge(24, 25);
        metroMap.addEdge(24, 13);//////////////////////////////////////////////////////


        // Attaba
        metroMap.addEdge(25, 13); //shohda
        metroMap.addEdge(25, 47);  //bab elshaariah
        metroMap.addEdge(25, 26);// nagiub

        // Mohamed Naguib
        metroMap.addEdge(26, 25); //attaba
        metroMap.addEdge(26, 16); //sadat

        // Opera
        metroMap.addEdge(27, 26);
        metroMap.addEdge(27, 28);

        // Dokki
        metroMap.addEdge(28, 27);
        metroMap.addEdge(28, 29);

        // El Bohoth
        metroMap.addEdge(29, 28);
        metroMap.addEdge(29, 30);

        // cairo unversity
        metroMap.addEdge(30, 29);
        metroMap.addEdge(30, 31);

        // faisal
        metroMap.addEdge(31, 30);
        metroMap.addEdge(31, 32);

        //giza
        metroMap.addEdge(32, 31);
        metroMap.addEdge(32, 33);

        // Omm El-Masryeen
        metroMap.addEdge(33, 32);
        metroMap.addEdge(33, 34);

        // sakiet mekki
        metroMap.addEdge(34, 33);
       // metroMap.addEdge(34, 0);
        metroMap.addEdge(34, 35);  //elmonib

        //el monib
        metroMap.addEdge(35, 34);

        //El shams Club
        metroMap.addEdge(36, 37);

        //alf Maskan
        metroMap.addEdge(37, 36);
        metroMap.addEdge(37, 38);
        //
        //helipolis
        metroMap.addEdge(38, 37);
        metroMap.addEdge(38, 39);

        //haroun el rashed
        metroMap.addEdge(39, 38);
        metroMap.addEdge(39, 40);

        //alahram
        metroMap.addEdge(40, 39);
        metroMap.addEdge(40, 41);

        //koliet elbanat
        metroMap.addEdge(41, 40);
        metroMap.addEdge(41, 42);

        //satdium
        metroMap.addEdge(42, 41);
        metroMap.addEdge(42, 43);

        //cairo Fairground
        metroMap.addEdge(43, 42);
        metroMap.addEdge(43, 44);

        //Abbasia
        metroMap.addEdge(44, 43);
        metroMap.addEdge(44, 45);

        //abdou Bash
        metroMap.addEdge(45, 44);
        metroMap.addEdge(45, 46);

        //elgeish
        metroMap.addEdge(46, 45);
        metroMap.addEdge(46, 47);

        //bab elshasria
        metroMap.addEdge(47, 46);
        metroMap.addEdge(47,25 );  //attaba



    }

    public static void showPath(Graph metroMap, String source, String destination, String[] stationNameList, int[] stationNodeList) {
        int src, dest;
        src = search(stationNameList, source);
        dest = search( stationNameList, destination);

        System.out.println("src: " + src);
        System.out.println("dest: " + dest);

        // use something like: metroMap.get(position).getStationGraphNode;
        metroMap.printAllPaths(src, dest);
        ArrayList <ArrayList<Integer>> allRouteArrayList = new ArrayList <ArrayList<Integer>>();

        allRouteArrayList = metroMap.getAllPaths();



        // say, selecting the first path only
        ArrayList<Integer> routeArrayList = new ArrayList<>();
        for(int j=0; j<allRouteArrayList.size(); j++){
            System.out.println("\n\nPath #"+(j+1));
            routeArrayList = allRouteArrayList.get(j);


            int routeLength = routeArrayList.size();

            // a string array of stations in route
            String[] routeNameArray = new  String[routeLength];
            int[] routeNodeArray = new int[routeLength];

            routeNameArray = nodeToStation(stationNameList, routeArrayList, routeLength);
            routeNodeArray = nodeArrayListToNodeArray(stationNodeList, routeArrayList, routeLength);

             for(int i=0; i<routeNameArray.length; i++){
             	System.out.println("\t"+routeNameArray[i]);
             }
        }


//        // passing strings to intent
//        Intent intent = new Intent(getApplicationContext(), RouteActivity.class);
//        intent.putExtra("nameList", routeNameArray);
//        intent.putExtra("nodeList", routeNodeArray);
//        startActivity(intent);

    }

    public static String[] nodeToStation(String stationNameList[], ArrayList<Integer> route, int length){
        String[] stationName = new String[length];
        for(int i = 0; i < length; i++){
            stationName[i] = stationNameList[route.get(i)];
        }
        return stationName;
    }

    public static int[] nodeArrayListToNodeArray(int stationNodeList[], ArrayList<Integer> route, int length){
        int[] stationNode = new int[length];
        for(int i=0; i<length; i++){
            stationNode[i] = route.get(i);
        }
        return stationNode;
    }
}



