public class Manager extends Employee
{
        private Employee assistant;
        public Manager()
        {
                super();
        }
        public Manager(String name, Date birthday, double salary)
        {
                super(name,birthday,salary);
        }
        public void setAssistant(Employee assistant)
        {
                this.assistant=assistant;
        }
        public String toString()
        {
                return String.format("%sAssistant: %s",super.toString(),assistant);
        }
}