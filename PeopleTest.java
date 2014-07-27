public class PeopleTest
{
        public static void main(String args[])
        {
                //1.a
                Employee newbie = new Employee("Newbie", new Date(2,10,1989), 1000000);
                Manager boss = new Manager("Boss", new Date(2,23,1979), 4000000);
                boss.setAssistant(newbie);
                Manager bigBoss = new Manager("Big Boss", new Date(12,3,1969), 10000000);
                bigBoss.setAssistant(boss);
                System.out.println(newbie);
                System.out.println(boss);
                System.out.println(bigBoss);
 
                //1.b
                Person people[] = {newbie,boss,bigBoss};
                for (int i=0;i<3;i++)
                {
                        System.out.println(people[i]);
                }
        }
}