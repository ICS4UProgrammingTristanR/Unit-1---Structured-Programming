using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace PalindromePanicVisual
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        static int findMinInsertionsDP(char str[], int length)
        {
            // Create a table of size n*n. table[i][j] 
            // will store minumum number of insertions 
            // needed to convert str[i..j] to a palindrome. 
            int table[][] = new int[length][length]; 
        int l, h, gap; 
  
        // Fill the table ( 2-d array )
        for (gap = 1; gap<length; ++gap) 
        for (l = 0, h = gap; h<length; ++l, ++h) 
            table[l][h] = (str[l] == str[h])? 
                           table[l + 1][h - 1] : 
                          (Integer.min(table[l][h - 1],
                                 table[l + 1][h]) + 1); 
  
        // Return minimum number of insertions 
        // for str[0..n-1] 
        return table[0][length - 1]; 
    }

    public char[] ToCharArray()
    {
        // Cannot use Arrays.copyOf because of class initialization order issues  
        char[] result = new char[characters.length()];
        System.arraycopy(characters, 0, result, 0, characters.length());
        return result;
    }


    private void BtnAssess_Click(object sender, RoutedEventArgs e)
        {
        // Read file using StreamReader. Reads file line by line  
        using (System.IO.StreamReader file = new StreamReader(textFile))
        {
            int counter = 0;
            string ln;

            while ((ln = file.ReadLine()) != null)
            {
                Console.WriteLine(ln);
                counter++;
            }
            file.Close();
            Console.WriteLine($"File has {counter} lines.");
        }
        try
        {
           
            while (fileSc.hasNextLine())
            {
                // declare variables
                String line = "";
                line = fileSc.nextLine();
                stringFromFile = line.toCharArray();
                //lettersRequired = findMinInsertions(str.toCharArray(),0,str.length() - 1);
                System.out.println("Here:" + findMinInsertionsDP(stringFromFile, stringFromFile.length));

            }
            // closes scanner when task is completed
            fileSc.close();


        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block 
            e.printStackTrace();
        }

    }

}
    }
}
