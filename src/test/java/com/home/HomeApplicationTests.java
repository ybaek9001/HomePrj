package com.home;

import java.sql.Connection;

import javax.sql.DataSource;

import com.home.HomeApplication;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HomeApplication.class)
@WebAppConfiguration
public class HomeApplicationTests {

	@Autowired
	private DataSource ds;

	@Autowired
	private SqlSessionFactory sqlSession;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testConnection() throws Exception {

		System.out.println(ds);

		Connection con = ds.getConnection();

		System.out.println(con);

		con.close();

	}

	@Test
	public void testSqlSession() throws Exception {


		System.out.println(sqlSession);


	}

}
