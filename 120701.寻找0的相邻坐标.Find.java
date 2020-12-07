package pac;

public class Find {
    void zero(int[][] array2d,int rm){
        for(int i=0;i<array2d.length;i++){
            for(int j=0;j<array2d[i].length;j++){
                if(array2d[i][j]==rm){
                    System.out.println("x:"+(i)+" "+"y:"+(j));
                }
            }
        }
    }
    void R_up(int[][] array2d,int rm){
        for(int i=0;i<array2d.length;i++){
            for(int j=0;j<array2d[i].length;j++){
                if(array2d[i][j]==rm){
                    System.out.println("x:"+(i)+" "+"y:"+(j));
                }
            }
        }
    }
    void R_down(int[][] array2d,int rm){
        for(int i=0;i<array2d.length;i++){
            for(int j=0;j<array2d[i].length;j++){
                if(array2d[i][j]==rm){
                    System.out.println("x:"+(i)+" "+"y:"+(j));
                }
            }
        }
    }
    void R_left(int[][] array2d,int rm){
        for(int i=0;i<array2d.length;i++){
            for(int j=0;j<array2d[i].length;j++){
                if(array2d[i][j]==rm){
                    System.out.println("x:"+(i)+" "+"y:"+(j));
                }
            }
        }
    }
    void R_rigth(int[][] array2d,int rm){
        for(int i=0;i<array2d.length;i++){
            for(int j=0;j<array2d[i].length;j++){
                if(array2d[i][j]==rm){
                    System.out.println("x:"+(i)+" "+"y:"+(j));
                    break;
                }
            }
        }
    }

}
