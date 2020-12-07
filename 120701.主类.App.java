package pac;

public class App{
    public static void main(String[] args) {
        int array2d[][]={
            {1,2,3,4,5,6},
            {7,8,9,10,0,12},
            {8,8,9,10,11,12},
            {7,8,3,10,11,12},
            {88,66,92,102,151,999}
        };

        Find find=new Find();
        find.zero(array2d,0);
        find.R_up(array2d,5);
        find.R_down(array2d,11);
        find.R_left(array2d,10);
        find.R_rigth(array2d,12);

    }
}
