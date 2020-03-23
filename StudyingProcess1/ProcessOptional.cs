using System;
using System.Collections.Generic;

namespace StudyingProcess1
{
    abstract class Students
    {
        
        
        public static string[] students1 = new string[] { "Petrov", "Ivanov", "Popova", "Badalov", "Budnik", "Radchenko", "Dmitrenko", "Nechaev" };
        public static string[] students2 = new string[] { "Kolubelova", "Tarareeva", "Babaev", "Petrenko" };
        public static string[] students3 = new string[] { "Kriat", "Boichenko" };

    }
    abstract class Group: Students
    {
        //List<Group> group = new List<Group>();
        public static string[] group = new string[13];
        public static string[] group1;
        public static string[] group2;
        public static string[] group3;
    }
    abstract class Teacher : Group
    {
        public static void Professor()
        {
            group1 = new string[8];
            students1.CopyTo(group1, 0);
            foreach (var i in group1)
            {
                Console.WriteLine(i);
            }
            group1.CopyTo(group, 0);
        }
        public static void Lecturer()
        {
            group2 = new string[4];
            students2.CopyTo(group2, 0);
            foreach (var i in group2)
            {
                Console.WriteLine(i);
            }
            group2.CopyTo(group, 0);
        }
        public static void Assistant()
        {
            group3 = new string[2];
            students3.CopyTo(group3, 0);
            foreach (var i in group3)
            {
                Console.WriteLine(i);
            }
            group3.CopyTo(group, 0);
        }
    }
    abstract class Bubble : Group
    {
        public static void Bubble1()
        {
            int i, j, l;
            string temp;
            l = group.Length;

            for (i = 0; i < l; i++)
            {
                for (j = 0; j < l - 1; j++)
                {
                    if (group[j].CompareTo(group[j + 1]) > 0)
                    {
                        temp = group[j];
                        group[j] = group[j + 1];
                        group[j + 1] = temp;
                    }
                }
            }

            for (i = 0; i < l; i++)
            {
                Console.WriteLine(group[i]);
            }
        }

    }
}
