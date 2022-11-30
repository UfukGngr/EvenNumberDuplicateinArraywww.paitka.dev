public class Main {
    static boolean isFind(int[] arr, int value){
        for(int i :arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list={1,34,65,76,34,232,66,76,12,34,12,65,78,49};
        int[] duplicate=new int[list.length];
        int startIndex=0;

        for (int i=0 ;i < list.length-1; i++){
            for (int j=i+1; j < list.length; j++){
                if (list[i] == list[j] && list[i] % 2 == 0){
                    if ( !isFind(duplicate , list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int i :duplicate){
            if (i !=0){
                System.out.print(i+" ");
            }
        }



    }
}