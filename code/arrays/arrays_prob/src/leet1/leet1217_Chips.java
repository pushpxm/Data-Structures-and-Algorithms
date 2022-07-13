package leet1;

public class leet1217_Chips {

    public static void main(String[] args) {

        int[] position = {1,2,3};
        System.out.println(minCostToMoveChips(position));

    }
static int minCostToMoveChips(int[] position){

        int evencount=0;
        int oddcount=0;

        for(int i=0;i< position.length;i++){

            if (position[i]%2==0){
                evencount++;
            }else {oddcount++;}
        }

        if(evencount>oddcount){
            return oddcount;
        }
        else return evencount;

    }
}
