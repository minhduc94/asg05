public class Employee extends Person
{
        private double salary;
        public Employee()
        {
                super();
                salary=0;
        }
        public Employee(String name, Date birthday, double salary)
        {
                super(name,birthday);
                this.salary=salary;
        }
        public double getSalary()
        {
                return salary;
        }
        public String toString()
        {
                return String.format("%sSalary: %.2f Vnd\n",super.toString(),salary);
        }
}