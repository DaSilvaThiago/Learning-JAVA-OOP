class Employe extends Person {
    private double salary;
    private String position;
    private String department;

    Employe(double salary, String position, String department, String name, String civilState, String rg, String cpf, String birthday, String work) {
        super(name, civilState, rg, cpf, birthday, work);
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return position;
    }

    public void setRole(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return super.toString() + "\r\n" +
                "salary: " + salary + "\r\n" +
                "position: " + position + "\r\n" +
                "department: " + department;
    }
}
