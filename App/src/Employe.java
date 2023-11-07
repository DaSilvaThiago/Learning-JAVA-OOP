public class Employe extends Person {
    private double salary;
    private String position;
    private String department;
    private double bonus;

    Employe(double salary, String position, String department, String name, String civilState, String rg, String cpf, String birthday, String work) {
        super(name, civilState, rg, cpf, birthday, work);
        setSalary(salary);
        this.position = position;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }
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

    public void aumentoSalario(double percentualAumento) {
        if (percentualAumento >= 0) {
            this.salary += (this.salary * (percentualAumento / 100));
        } else {
            throw new IllegalArgumentException("Percentual de aumento inválido.");
        }
    }

    public void adicionarBonus(double valor) {
        if (valor >= 0) {
            this.bonus += valor;
        } else {
            throw new IllegalArgumentException("Valor de bônus inválido.");
        }
    }

    public void aplicarBonus() {
        this.salary += bonus;
        bonus = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\n" +
                "salary: " + salary + "\r\n" +
                "position: " + position + "\r\n" +
                "department: " + department;
    }
}
