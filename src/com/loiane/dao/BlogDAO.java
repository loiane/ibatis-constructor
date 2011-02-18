package com.loiane.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.loiane.data.BlogMapper;
import com.loiane.model.Blog;

/**
 * Blog DAO - xml configuration
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public class BlogDAO {

	/**
	 * Returns the list of all Contact instances from the database.
	 * @return the list of all Contact instances from the database.
	 */
	@SuppressWarnings("unchecked")
	public List<Blog> select(){

		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			List<Blog> list = session.selectList("Blog.selectBlog");
			return list;
		} finally {
			session.close();
		}
	}
	
	/**
	 * Returns the list of all Contact instances from the database.
	 * @return the list of all Contact instances from the database.
	 */
	public List<Blog> selectAnnotations(){
		
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();

		try {
			
			BlogMapper mapper = session.getMapper(BlogMapper.class);
			List<Blog> list = mapper.selectAllBlogs();
			
			return list;
		} finally {
			session.close();
		}
	}
}
