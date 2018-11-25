
import java.util.*;

/**
 * @Author Lui
 * @create 2018-11-20-下午 09:53
 **/


public class adjanency {

    public static class MatrixUDG {
        private char[] mVexs;
        private int[][] mMatrix;

        /*
         * vexs = Vertex array
         * edges = edges array
         *
         * */
        public int[][] MatrixUDG(char[] vexs, char[][] edges) {
            //initial "length of Vertex and Edges
            int vlen = vexs.length;
            int elen = edges.length;


            //Initialize the vertex to the length of the input vexs
            // Copy one more to mVexs
            mVexs = new char[vlen];
            for (int i = 0; i < mVexs.length; i++)
                mVexs[i] = vexs[i];
            for (char i : mVexs) {
                //System.out.println(i);
            }
            //Initialize edge
            mMatrix = new int[vlen][vlen];
            for (int i = 0; i < elen; i++) {
                // read the starting vex and ending ves of the edge
                int p1 = getPosition(edges[i][0]);

                //System.out.println(p1);
                int p2 = getPosition(edges[i][1]);
                //System.out.println(p2);

                mMatrix[p1][p2] = 1;
                mMatrix[p2][p1] = 1;
            }
            return mMatrix;
        }

        private int getPosition(char ch) {
            for (int i = 0; i < mVexs.length; i++) {
                //System.out.println(mVexs[i]);
                if (mVexs[i] == ch)
                    return i;
            }
            return -1;
        }

        public void print() {
            System.out.printf("Martix Graph:\n");
            for (int i = 0; i < mVexs.length; i++) {
                for (int j = 0; j < mVexs.length; j++)
                    System.out.printf("%d ", mMatrix[i][j]);
                System.out.printf("\n");
            }
        }

        public static boolean contains(int[] visited, int item) {
            if (visited == null) {
                System.out.println("null");
                return false;
            }
            //System.out.println(visited);
            for (int n : visited) {
                //System.out.println(n);
                if (item == n) {
                    return true;
                }
            }
            return false;
        }

        public void DFS()
        {

            Stack <Integer> stack=new Stack<Integer>();
            int []visited=new int[mVexs.length];

            int unvisited=getUnvisited(visited);

            while(unvisited>=0)
            {
                //start with starting node and push to stack
                visited[unvisited]=1;
                stack.push(unvisited);

                System.out.print(mVexs[unvisited]+" ");
                while(!stack.isEmpty())
                {
                    //find the top of stack but dont pop
                    int index=stack.peek();

                    //find which mVexs not be visited by iteration
                    boolean found=false;
                    for(int i=0;i<mVexs.length;i++)
                    {
                        if(index!=i&&visited[i]==0&&mMatrix[index][i]>0)
                        {
                            visited[i]=1;
                            stack.push(i);
                            //output the iteration element
                            System.out.print(mVexs[i]+" ");
                            found=true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        //pop the element at the stack
                        stack.pop();
                    }
                }
                // find the node which was not be visited
                unvisited=getUnvisited(visited);
            }

        }
        private int getUnvisited(int[] visited) {
            int index=-1;
            for(int i=0;i<visited.length;i++)
            {
                // the node of i not be visited
                if(visited[i]==0)
                {
                    index=i;
                    break;
                }
            }

            return index;
        }
    }

    public static void main(String[] args) {
        char[] vexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[][] edges = new char[][]{
                {'A', 'C'},
                {'A', 'D'},
                {'A', 'F'},
                {'B', 'C'},
                {'C', 'D'},
                {'E', 'G'},
                {'F', 'G'}};

        MatrixUDG pG;

        pG = new MatrixUDG();
        System.out.println("dfs traversal");
        int[][] Matrix = pG.MatrixUDG(vexs, edges);
        int[] array = null;
        pG.DFS();
        System.out.println();
        pG.print();   // print out the martix


    }
}



