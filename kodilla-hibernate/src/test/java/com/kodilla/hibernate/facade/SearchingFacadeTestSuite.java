package com.kodilla.hibernate.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.SearchingException;
import com.kodilla.hibernate.manytomany.facade.SearchingFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SearchingFacadeTestSuite {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    SearchingFacade searchingFacade;

    @Test
    public void testSearchingCompanyFacade() throws SearchingException {
        //Given
        Company company1 = new Company("Company 1");
        Company company2 = new Company("Company 2");
        Company company3 = new Company("Company 3");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //When
        List<Company> companyList = searchingFacade.findCompany("Comp");

        //Then
        assertEquals(3, companyList.size());

        //CleanUp
        try {
            companyDao.deleteAll();
        } catch (Exception e) {
            //Do nothing
        }

    }
    @Test
    public void testSearchignEmployeeFacade() throws SearchingException {
        //Given
        Employee employee1 = new Employee("Employee", "1");
        Employee employee2 = new Employee("Employee", "12");
        Employee employee3 = new Employee("Employee", "23");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        //When
        List<Employee> employeeList = searchingFacade.findEmployee("1");

        //Then
        assertEquals(2, employeeList.size());

        //CleanUp
        try {
            employeeDao.deleteAll();
        } catch (Exception e) {
            //Do nothing
        }

    }
}
