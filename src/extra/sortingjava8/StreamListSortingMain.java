package extra.sortingjava8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamListSortingMain {

    public static void main(String[] args) {

        // sort employee by salary in ascending order
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "JOHN", 30, 400000));
        employees.add(new Employee(20, "MERRY", 29, 350000));
        employees.add(new Employee(30, "TOM", 30, 450000));
        employees.add(new Employee(40, "RONALD", 29, 500000));
        employees.add(new Employee(50, "MAC", 23, 700000));

        // Ascending Order
        List<Employee> sortedList1 = employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println(sortedList1);

        // Descending Order
        List<Employee> sortedList2 = employees.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).toList();
        System.out.println(sortedList2);


        // Second Solution
        List<Employee> sortedList3 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).toList();
        System.out.println(sortedList3);

        // Sorting and Filter
        List<Employee> sortedWithFilter = employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).filter(x->x.getSalary()>450000).collect(Collectors.toList());
        System.out.println("sortedWithFilter : " + sortedWithFilter);

        // filter Salary and Age
        List<Employee> sortedList4 = employees.stream().filter(salary -> salary.getSalary() > 450000).toList();
        List<Employee> sortedList5 = employees.stream().filter(x -> x.getAge() > 29).toList();
        System.out.println("SalaryBise : " + sortedList4);
        System.out.println("AgeBise : " + sortedList5);

        // filter Salary and Age by

        List<Employee>sortedData=employees.stream()
                .filter(x->x.getSalary()>45000 && x.getAge()>29)
                .collect(Collectors.toList());

        System.out.println("sortedData : " + sortedData);



        // Sum Of Total Salary Given Employees
        int totalSalary = employees.stream().collect(Collectors.summingInt(salary -> (int) salary.getSalary()));
        System.out.println("Total Salary Using Collect " + totalSalary);
        int totalSalary1 = employees.stream().mapToInt(salary -> (int) salary.getSalary()).sum();
        System.out.println("Total Salary Using Map to Int " + totalSalary1);



        // Find Min and Max Salary

      //  Employee employee =employees.stream().min((o1, o2) ->o1.getSalary() > o2.getSalary()).get();


    }
}
