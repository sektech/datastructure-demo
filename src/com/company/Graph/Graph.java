package com.company.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode> graphNodes = new ArrayList<>();
    int[][] adjustMatrix ;

    public Graph(ArrayList<GraphNode> list){
        graphNodes = list;
        adjustMatrix = new int[graphNodes.size()][graphNodes.size()];
    }
    public void InsertNode(int i,int j)
    {
        adjustMatrix[i][j] = 1;
    }

    public String toString(){
        int nodeIndex = graphNodes.size();
        StringBuilder str = new StringBuilder();
        str.append("      ");
        for (int i = 0; i < nodeIndex ; i++) {
            str.append(graphNodes.get(i).name + "   ");
        }

        for (int i = 0; i < nodeIndex ; i++) {
            str.append("\n " + graphNodes.get(i).name + ": ");
            for(int j=0;j<adjustMatrix[i].length;j++){
                str.append(+ adjustMatrix[i][j] + "     ");
            }
        }
        return str.toString();
    }
    public void BST(){
        for(GraphNode node : graphNodes){
            if(!node.isVisited){
                bstTraverse(node);
            }
        }
    }
    void bstTraverse(GraphNode node){
        Queue<GraphNode> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            GraphNode currentNode = q.remove();
            if(!currentNode.isVisited){
                currentNode.isVisited = true;
                System.out.print(currentNode.name + "  ");
                ArrayList<GraphNode> nodes = getNeighbours(currentNode);
                for(GraphNode tempNode : nodes){
                    if(!tempNode.isVisited){
                        q.add(tempNode);
                    }
                }
            }
        }
    }
    public void DFST(){
        for(GraphNode node : graphNodes){
            if(!node.isVisited){
                dfsTraverse(node);
            }
        }
    }

    private void dfsTraverse(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.add(node);
        while(!stack.isEmpty()){
            GraphNode currentNode = stack.pop();
            currentNode.isVisited=true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbour = getNeighbours(currentNode);
            for(GraphNode tempNode : neighbour){
                if(!tempNode.isVisited){
                    stack.push(tempNode);
                    tempNode.isVisited=true;
                }
            }
        }

    }
    public ArrayList<GraphNode> getNeighbours(GraphNode node){
        ArrayList<GraphNode> neighbours = new ArrayList<>();
        int index = node.index;

        for (int i = 0; i < adjustMatrix.length ; i++) {
            if(adjustMatrix[index][i] == 1){
                neighbours.add(graphNodes.get(i));
            }
        }
        return neighbours;
    }

}
