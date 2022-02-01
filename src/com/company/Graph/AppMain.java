package com.company.Graph;

import java.util.ArrayList;

public class AppMain {

    public static void main(String[] args){
        ArrayList<GraphNode> graphs = new ArrayList<>();
        graphs.add(new GraphNode("A  ",0));
        graphs.add(new GraphNode("B  ",1));
        graphs.add(new GraphNode("C  ",2));
        graphs.add(new GraphNode("D  ",3));
        graphs.add(new GraphNode("E  ",4));
        graphs.add(new GraphNode("F  ",5));
        graphs.add(new GraphNode("G  ",6));
        Graph graphList = new Graph(graphs);
        graphList.InsertNode(0,1);
        graphList.InsertNode(0,2);

        graphList.InsertNode(1,0);
        graphList.InsertNode(1,3);
        graphList.InsertNode(1,6);

        graphList.InsertNode(2,0);
        graphList.InsertNode(2,3);
        graphList.InsertNode(2,4);

        graphList.InsertNode(3,1);
        graphList.InsertNode(3,2);
        graphList.InsertNode(3,5);

        graphList.InsertNode(4,2);
        graphList.InsertNode(4,5);

        graphList.InsertNode(5,4);
        graphList.InsertNode(5,3);
        graphList.InsertNode(5,6);

        graphList.InsertNode(6,1);
        graphList.InsertNode(6,5);
        System.out.println( graphList.toString());
        graphList.BST();
        /*
        ArrayList<GraphNode> graphs = new ArrayList<>();
        graphs.add(new GraphNode("Bob",0));
        graphs.add(new GraphNode("Ali",1));
        graphs.add(new GraphNode("Mar",2));
        graphs.add(new GraphNode("Rob",3));
        graphs.add(new GraphNode("Mak",4));
        Graph graphList = new Graph(graphs);
        graphList.InsertNode(0,1);
        graphList.InsertNode(0,3);
        graphList.InsertNode(1,0);
        graphList.InsertNode(1,2);
        graphList.InsertNode(1,4);
        graphList.InsertNode(2,1);
        graphList.InsertNode(2,3);

        graphList.InsertNode(3,0);
        graphList.InsertNode(3,2);
        graphList.InsertNode(3,4);

        graphList.InsertNode(4,1);
        graphList.InsertNode(4,3);

        System.out.println( graphList.toString());
        graphList.BST();


        System.out.print("\n Bob :");
        for(GraphNode node :  graphList.getNeighbours(new GraphNode("Bob",0))){
            System.out.print(node.name + " ");
        }


        System.out.print("\n Rob :");
        for(GraphNode node :  graphList.getNeighbours(new GraphNode("Rob",3))){
            System.out.print(node.name + " ");
        }

*/



    }
}
