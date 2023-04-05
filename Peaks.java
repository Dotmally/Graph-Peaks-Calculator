import java.util.Arrays;

//
public class Peaks{

    public static int numPeaks(int[] data){
        int len = data.length;
        int counter = 0;
        for( int i = 1; i < len-1; i++){
            if( data[i] > data[i -1] &&  data[i] > data[i + 1]){
                counter++;
            }
        }
        if( len==1){
            counter++;}
        if (len > 1){
            if( data[0] > data[1] ){
                counter++;
            }
            if ( data [len-1] > data[len-2]){
                counter++;
            }
        }
       

        return counter;
    }

    public static int[] peaks(int[] data){
        int len = data.length;
        int array[];
        int counter1 = 0;
        for( int i = 1; i < len - 1; i++){
            if( data[i] > data[i -1] &&  data[i] > data[i + 1]){
                counter1++;}
            // if( data[0] > data[1] || data [len-1] > data[len-2]){
            //     counter1++;}
            }
        if( len==1){
            counter1=1;}
        if (len > 1){
            if( data[0] > data[1] ){
                counter1++;
            }
            if(data [len-1] > data[len-2]){
                counter1++;
            }
        }    
        array = new int [counter1];
        counter1 = 0;
        for( int i = 1; i < len - 1; i++){
            if( data[i] > data[i -1] &&  data[i] > data[i + 1]){
                array[counter1++] = i;}
            // if( data[0] > data[1] || data [len-1] > data[len-2]){
            //     array[counter1++] = i;

        }
        if( len==1){
            array[0]=0;}
        if (len > 1){
            if( data[0] > data[1] ){
            array[counter1++]=0;
            }
            if( data [len-1] > data[len-2]){
            array[counter1++]=len-1;

            }
       
         
    }
        return array;
    }

    public static int[][] minmax(int[] data){
        int len = data.length;
        int min = 200;
        int positionmax = 0;
        int positionmaxex = -1;
        int positionmin = 0;
        int positionminex = -1;
        int max = 0;
        int counter = 0;
        int counter1 = 0;
        int exception;
        int exception2;
        int [][] finalarray = {{}};

        for (int i = 0 ; i < len; i++){
        if ( data[i] < min ){
            min=data[i];
            positionmax = i;
            counter++;
        if ( data[i] == min){
            exception = data[i];
            positionminex = i;
            counter++;
           
        }
        }
        }
        for (int i = 0 ; i < len; i++){
            if ( data[i] > max ){
                max=data[i];
                counter1++;
            if ( data[i] == max){
                exception2 = data[i];
                positionmaxex = i;
                counter1++;

            }
           
        }
        finalarray = new int [2][2];
        finalarray [0][0] = min;
        finalarray [0][1] = positionminex;
        finalarray [1][0] = max;
        finalarray [1][1] = positionmaxex;  
        }
        return finalarray;
    }

    public static void main(String[] args){
        System.out.println("Testing numpeaks");
        int[] data1 = {28,4,46};
        int expect = 2;
        int out = Peaks.numPeaks(data1);
        System.out.println("...expect : " + expect);
        System.out.println("...actual : " + out);
        System.out.println("Testing peaks");
        int[] expect2 = {0,2};
        int [] out2 = Peaks.peaks(data1);
        System.out.println("...expect : " + Arrays.toString(expect2));
        System.out.println("...actual : " + Arrays.toString(out2));
        int[] expect3 = {4, 1, 30, 3};
        int[][] out3 = minmax(data1);
        System.out.println("...expect : " + Arrays.toString(expect3));
        System.out.println("...actual : " + Arrays.deepToString(out3));





       



    }
}
