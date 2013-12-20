package net.paxcel.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import net.paxcel.dao.AbstractDao;
import net.paxcel.dao.EmployeeDao;
import net.paxcel.hibernate.pojos.Address;
import net.paxcel.hibernate.pojos.Employee;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sun.org.omg.CORBA.InitializerHelper;

@Scope("prototype")
@Repository(value="employeeDao")
public class EmployeeDaoImpl extends AbstractDao<Employee> implements EmployeeDao{
	
	public EmployeeDaoImpl() {
		super(Employee.class);
	}

	public void deleteEmployee(Employee employee) {
		super.delete(employee);
	}
	
	
	@Override
	public Employee getEmployeeByName(String name) {
		return (Employee) getSession().createCriteria(getType())
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).add(Restrictions.eq("name", name)).uniqueResult();
	}

	@Override
	public void save(Employee employee) {
		getSession().saveOrUpdate(employee);		
	}
}
