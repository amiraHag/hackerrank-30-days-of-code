

	public static int getHeight(Node root){
      //Write your code here
      int sum=0;
      if(root==null){
          return -1;
      }
      return 1+Math.max(getHeight(root.left), getHeight(root.right)) ;
    }
