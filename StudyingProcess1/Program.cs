using System;

namespace StudyingProcess1
{
    public class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine($"Students list in group1, Professor: ");
            Teacher.Professor();
            Console.WriteLine($"\nStudents list in group2, Lecturer: ");
            Teacher.Lecturer();
            Console.WriteLine($"\nStudents list in group3, Assistant: ");
            Teacher.Assistant();
            Console.WriteLine("\n\nSorting the array group1: \n");
            Bubble.Bubble1();

            Console.ReadLine(); 
        }
    }
}
