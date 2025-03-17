package Tree;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data){
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode node){
        this.children.add(node);
    }

    private String repeat(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++){
            sb.append(str);
        }
        return sb.toString();
    }

    public String print(int level){
        String ret;
        ret = repeat(" ", level) + data + "\n";
        for (TreeNode node : this.children){
            ret += node.print(level + 1);
        }
        return ret;
    }

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode greenTea = new TreeNode("greenTea");

        tea.addChild(greenTea);
        hot.addChild(tea);
        hot.addChild(coffee);
        drinks.addChild(cold);
        drinks.addChild(hot);

        System.out.println(drinks.print(0));

    }

}
