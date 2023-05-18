public class test {

    public static void main(String[] args) {
        String response = "<work> <id type=\"integer\"> 2361393 </id></work>";
        String[] array = response.split("</");
        for (String str : array){
            String[] st = str.split(">");
            for (String stt : st){
               
                    System.out.println(stt);

                //System.out.println(stt);
            }

        }
    }

}
