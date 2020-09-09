public class Soal1 {
    private boolean adjMatrix[][];
    private int numVertices;

    public Soal1(int numVertices){
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    public void addEdge(int i, int j){
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    public void removeEdge(int i, int j){
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("\t\t\tDodo "+"\t\t Jojo "+"\t\t Maman "+"\t\t Bejo"+"\t\t Sukijah"+"\n");
        for (int i = 0; i <numVertices; i++) {
            if(i==0) {
                s.append("Dodo \t\t");
            } else if(i==1) {
                s.append("Jojo \t\t");
            } else if(i==2) {
                s.append("Maman \t\t");
            } else if(i==3) {
                s.append("Bejo \t\t");
            } else if(i==4) {
                s.append("Sukijah \t");
            } else {
                s.append("Jojo ");
            }
            for(boolean j : adjMatrix[i]){
                s.append((j ? 1 : 0) + "\t\t\t ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Soal1 soal1 = new Soal1(5);
        soal1.addEdge(0,1);
        soal1.addEdge(0,3);
        soal1.addEdge(1,2);
        soal1.addEdge(1,4);
        soal1.addEdge(2,3);
        soal1.addEdge(3,4);

        System.out.println(soal1.toString());
    }
}
