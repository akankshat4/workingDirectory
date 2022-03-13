package stringOperationsExamples;
/*
*
*   String is immutable where as StringBuffer/StringBuilder are mutable.
*   StringBuffer is synchronous and thread safe. Hence, perfect option to use in multi-threaded environment.
*   StringBuilder is non-synchronous and not thread safe.
*
 */
public class StringBufferExample {
    public static void main(String args[]){
        String classicString = new String ("String1");
        StringBuilder stringBuilder = new StringBuilder("StringBuiler1");
        StringBuffer stringBuffer = new StringBuffer("StringBuffer1");

        System.out.println("String reference object is '"+classicString.hashCode()+"' before updating the string : "+classicString);
        System.out.println("StringBuilder reference object is '"+stringBuilder.hashCode()+"' before updating the string : "+stringBuilder);
        System.out.println("StringBuffer reference object is '"+stringBuffer.hashCode()+"' before updating the string : "+stringBuffer);

        classicString = classicString.concat("+concat");
        stringBuilder = stringBuilder.append("+concat");
        stringBuffer = stringBuffer.append("+concat");

        System.out.println("String reference object is '"+classicString.hashCode()+"' after updating the string : "+classicString);
        System.out.println("StringBuilder reference object is '"+stringBuilder.hashCode()+"' after updating the string : "+stringBuilder);
        System.out.println("StringBuffer reference object is '"+stringBuffer.hashCode()+"' after updating the string : "+stringBuffer);
    }
}
