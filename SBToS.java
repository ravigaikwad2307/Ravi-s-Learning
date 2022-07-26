public class SBToS {
    public static void main(String[] args){
        StringBuffer s1 = new StringBuffer("Naresh Technology");
        String s2 = s1.toString();

        System.out.println("s1 = " +s1);
        System.out.println("s2 = " +s2);

        String s3 = s1.substring(7);
        System.out.println("s3 = " +s3);

        String s4 = s1.substring(0,6);
        System.out.println("s4 = "+s4);

    }
}
