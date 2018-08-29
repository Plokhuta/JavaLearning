public class Exceptions {
    public static void main(String... args){
        String[] str = new String[2];
        String[] str1 = new String[2];
        String[] str2 = new String[2];
        String[] str3 = new String[2];

        try{
            System.out.println(str[5]);
        }catch (Exception ex){
            System.out.println("Цим значенням ви не попали в масив!!!");
        }
        try{
            System.out.println(str[1]);
        }catch (Exception ex){
            System.out.println("Цим значенням ви не попали в масив!!!");
        }
        try{
            System.out.println(str[5]);
        }catch (Throwable ex){
            System.out.println("Цим значенням ви не попали в масив!!!");
        }
        try{
            System.out.println(str[5]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Цим значенням ви не попали в масив!!!");
        }
    }
}
