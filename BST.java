public class BST {

    public class Node
    {
        private int val;
        private Node left;
        private Node right;
        private int height;

    
    private Node(int val)
    {
        this.val=val;
    }
    public int getValue() {
        return val;
      }
    } //Node class over

    private Node root;

    BST()
    {
        //empty constructor
    }

    //to calculate height
    public int height(Node node) {
        if (node == null) {
            //if the leaf node return -1;
          return -1;
        }
        // return diff of left and right node + 1
        return node.height;
      }
      public boolean isEmpty() {
        return root == null;
    }

    //inserting root element
    public void insert(int value) {
        //inserting left and right node
        root = insert(value, root);
      }

      private Node insert(int value, Node node) {
        if (node == null) {
            ///if no left node or right then create one and insert 
            //and return new node
          node = new Node(value);
          return node;
        }
    
        if (value < node.val) {
          node.left = insert(value, node.left);
        }
    
        if (value > node.val) {
          node.right = insert(value, node.right);
        }
    
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
      }

      //just for inserting
      public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
          this.insert(nums[i]);
        }
      }

      //checking balanced or not
     public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(Node node) {
    if (node == null) {
      return true;
    }
    return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
  }


  //displaying
  public void display() {
    display(this.root, "Root Node: ");
  }

  private void display(Node node, String details) {
    if (node == null) {
      return;
    }
    System.out.println(details + node.val);
    display(node.left, "Left child of " + node.val + " : ");
    display(node.right, "Right child of " + node.val + " : ");
  }


  //main
  public static void main(String[] args) {
    BST tree = new BST();
    int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
    tree.populate(nums);
    tree.display();
  }

    
}
