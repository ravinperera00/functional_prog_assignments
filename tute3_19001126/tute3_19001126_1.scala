/*
A modified version of Caesar Cipher.
    + The program can take input of both Upper case and Lower case letters.
    + The program requests a random key of any size, instead of the number of shifts.
    + Unlike the number of shifts, the key is not limited to a number between 1 - 25 which increases security.
    + The program generates a decryption key based on the number of shifts which can then be used to decrypt the message.

    - The program isn't by any means an acceptable encryption mechanism due to the presence of numerous flaws.
*/

object tute3_19001126_1 extends App{


    val ALPH_COUNT = 26;            // Size of the alphabet

    // The Encryption Function
    def encrypt(text : String, shift : Int) : String ={

        // The function that shifts a single character
        val shiftFn = (i : Char) => {
            var start = 'A'; var end = 'Z';
            if(i >= 'a')            // Changes parameters if the letter is lowercase
            {
                start = 'a';
                end = 'z';
            }
            if(i != ' ')            // Ignore if character is a space
            {
                val off = (i%start - ALPH_COUNT  + shift);
                if(off >= 0 )
                {
                    start + off;
                }else
                {
                    i + shift;
                }
            }else
            {
                i;                  
            }
            
        }
        return text.map(x => shiftFn(x).toChar);        // return by mapping the function to every character of the text
    }

    // The Decryption Function
    def decrypt(text : String, shift : Int) : String ={

        // The function shifts a character
        val shiftFn = (i : Char) => {
            var start = 'A'; var end = 'Z';
            if(i >= 'a')                    // Change params if he letter is lowercase
            {
                start = 'a';
                end = 'z';
            }

            if(i != ' ')                    // Ignore if character is a space
            {
                val off = (i%start + 1 - shift);
                if(off > 0 )
                {
                    i - shift;
                }else
                {
                    end + off;
                }
            }else
            {
                i;
            }

            
        }
        return text.map(x => shiftFn(x).toChar);        // return by mapping the function to every character of the text
    }

    //Prompt for options
    def promptChoice()={
        println("\nSelect an option :");
        println("\t1.) Encrypt\n\t2.) Decrypt\n\t3.) Exit");
        print("Enter number : ");
    }

    // Function that handles the encryption process
    def encryptProcess()={
        println("Please enter the string you want to encrypt :");
        val text = scala.io.StdIn.readLine();
        print("Please enter a random key : ");
        var key = scala.io.StdIn.readInt();
        while(key < 1)
        {
            println("Invalid Key! Try again...");
            key = scala.io.StdIn.readInt();
        }
        val shift = key%ALPH_COUNT;             // Convert key to number of shifts
        println("Encrypted text");
        println("--------------");
        println(encrypt(text, shift));          // Encrypt text
        val r = scala.util.Random;
        print("\nDecryption Key : ");
        print((ALPH_COUNT*r.nextInt(1000000) + key).toString);  // Generate decryption key using a random number
        println("");

    }

    // Function that handles the decryption process
    def decryptProcess()={
        println("Please enter the string you want to decrypt :");
        val text = scala.io.StdIn.readLine();
        print("Please enter the Decryption Key : ");
        var key = scala.io.StdIn.readInt();
        while(key < 1)
        {
            println("Invalid Key! Try again...");
            key = scala.io.StdIn.readInt();
        }
        val shift = key%ALPH_COUNT;     // Find number of shifts hidden in the key
        println("Decrypted text");
        println("--------------");
        println(decrypt(text, shift));  // Decrypt text
    }
    

    // Block that works as the main function (The main function is defined in trait App)
    println("\t---### CAESAR CIPHER ENCRYPTION ###---");
    var choice = -1;
    while(choice != 3)
    {
        promptChoice();
        choice = scala.io.StdIn.readInt()
        if(choice == 1)
        {
            encryptProcess();
        }else if(choice == 2)
        {
            decryptProcess();
        }else if(choice == 3)
        {
            //do nothing
        }else
        {
            println("Invalid Input. Try again..");
        }
    }


}
