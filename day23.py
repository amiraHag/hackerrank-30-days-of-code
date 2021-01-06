

    def levelOrder(self,root):
        #Write your code here
        queue_tree = [ root ]

        for current_node in queue_tree:
            if current_node:
                print(current_node.data, end=' ')
                queue_tree.append(current_node.left)
                queue_tree.append(current_node.right)
