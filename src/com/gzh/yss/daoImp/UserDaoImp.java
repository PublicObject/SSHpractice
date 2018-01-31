package com.gzh.yss.daoImp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.gzh.yss.dao.UserDao;
import com.gzh.yss.pojo.User;

public class UserDaoImp implements UserDao {
	private SessionFactory sessionFactory;
	@Override
	public User getUser(Integer id) {
		Session session = null;
		User user = null;
		try {
			session = sessionFactory.getCurrentSession();
			user = (User)session.get(User.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return user;
	}

	@Override
	public void insertUser(User user) {
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
			session.save(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public Map<String, Object> getInfo(Integer line, Integer rows) {
		Session session = null;
		Map<String,Object> info = null;
		try {
			info = new HashMap<String, Object>();
			session = sessionFactory.getCurrentSession();
			String hql = "from User";
			Query query = session.createQuery(hql);
			query.setFirstResult((line-1)*rows);
			query.setMaxResults(rows);
			List<User> list = query.list();
//			Criteria c = session.createCriteria(User.class);
//			c.setMaxResults(rows);
//			c.setFirstResult((line-1)*rows+1);
//			List<User> list = c.list();
			Criteria c1 = session.createCriteria(User.class);
			c1.setProjection(Projections.count("id"));
			long total = (long)c1.uniqueResult();
			info.put("count", total);
			info.put("page", list);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return info;
	}


	@Override
	public void updateUser(User user) {
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
			session.update(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;	
		}		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
