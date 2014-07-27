public class Person
{
        private String name;
        private Date birthday;
        public Person()
        {
                this("",new Date(0,0,0));
        }
        public Person(String name, Date birthday)
        {
                this.name=name;
                this.birthday=birthday;
        }
        public String getName()
        {
                return name;
        }
        public String toString()
        {
                return String.format("Name: %s\nBirthDay: %s\n",name,birthday);
        }
}