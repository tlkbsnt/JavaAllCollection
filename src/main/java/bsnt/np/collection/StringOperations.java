package bsnt.np.collection;

public class StringOperations {

    public void stringOperation(){
        String name = "This is a literal declaration of the string";
        for(char x : name.toCharArray()){
            System.out.println(x);
        }
        char c = name.toCharArray()[0];
        System.out.println("This first character: "+c); //T

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Tilak");
        stringBuffer.append("Basnet");
        System.out.println(stringBuffer);

    }
}
