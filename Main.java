
class Main {
  public static void main(String[] args) {
    // ****************************************
    // ** Call your function to test them in **
    // ** the main function here.            **
    // ****************************************
    
    //Files
    String file = Input.readFile("Essay.txt");
    
    //Encodes
    String encodeFile1 = encode1(file);//layer1
    String encodeFile2 = encode2(encodeFile1);//layer2
    String encodeFile3 = encode3(encodeFile2);//layer3
    String encodeFile4 = encode4(encodeFile3);//layer4

    Input.writeFile("encodedFile.txt",encodeFile4);

    //Decodes
    String decodeFile4 = decode4(encodeFile4);//layer4
    String decodeFile3 = decode3(decodeFile4);//layer3
    String decodeFile2 = decode2(decodeFile3);//layer2
    String decodeFile1 = decode1(decodeFile2);//layer1

    Input.writeFile("decodeFile.txt", decodeFile1);


    
    
  }
  // Write you functions below here

  //Encoding

  static String encode1(String txt){
    String result = "";
    int ascii;
    for(int x=0; x<=txt.length()-1;x++){
      ascii = (int)txt.charAt(x) +2;
      result = result + (char)ascii;
    }
    return result;
  }
//Shift letters by 2

  static String encode2(String txt){
    String result = "";
      result = txt.substring( txt.length()/2) + 
               txt.substring(0, txt.length()/2);
    return result;

  }
//Swap first half with the second half of the word

  static String encode3(String txt){
    String rev ="";
    int length =txt.length();
    for(int i=length-1;i>=0;i--){
      rev = rev + txt.charAt(i);
    }
    return rev;
  }
//Swap the letters

  static String encode4(String txt){
    int length = txt.length();
    if (length <= 1) {
      return txt;
    } else {
      return txt.charAt(length - 1) + txt.substring(1, length - 1) + txt.charAt(0);
    }
  }
//Swap the first and last letters

  //Decoding
  static String decode4(String txt){
    int length = txt.length();
    if (length <= 1) {
      return txt;
    } else {
      return txt.charAt(length - 1) + txt.substring(1, length - 1) + txt.charAt(0);
    }
  }

  static String decode3(String txt){
    String rev ="";
    int length =txt.length();
    for(int i=length-1;i>=0;i--){
      rev = rev + txt.charAt(i);
    }
    return rev;
  }

  static String decode2(String txt){
    String result = "";
      result = txt.substring( txt.length()/2) + 
               txt.substring(0, txt.length()/2);
    return result;

  }

  static String decode1(String txt){
    String result = "";
    int ascii;
    for(int x=0; x<=txt.length()-1;x++){
      ascii = (int)txt.charAt(x) -2;
      result = result + (char)ascii;
    }
    return result;
  }


  // ***************************************
  // ** Don't write any code below here.  **
  // ***************************************

}