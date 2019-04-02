package nithin;

import java.util.*;

abstract class Node implements Comparable<Node> {
    public  int frequency; // the frequency of this tree
    public char data;
    public  Node left;
    public Node right;
    public Node(int freq) { 
      frequency = freq; 
    }
 
    // compares on the frequency
    public int compareTo(Node tree) {
        return frequency - tree.frequency;
    }
}
 
class HuffmanLeaf extends Node {
    
 
    public HuffmanLeaf(int freq, char val) {
        super(freq);
        data = val;
    }
}
 
class HuffmanNode extends Node {
    
    public HuffmanNode(Node l, Node r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }

}


class Decoding {


	void decode(String s, Node root) {
        StringBuffer sb = new StringBuffer(); 
        Node temp = root;

        for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0')
                {
                     temp = temp.left;
                        if((temp.right == null) && (temp.left == null)){
                            sb.append(""+temp.data);
                            temp = root;                    
                        }
                }
                else{
                        temp = temp.right;
                        if((temp.right == null) && (temp.left == null)){
                            sb.append(""+temp.data);
                            temp = root;                    
                        }
                }

        }

        System.out.println(sb);

       
    }
}


