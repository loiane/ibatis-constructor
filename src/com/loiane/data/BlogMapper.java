package com.loiane.data;

import java.util.List;

import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;

import com.loiane.model.Blog;

/**
 * Blog Mapper contains all the myBatis/iBatis annotations
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public interface BlogMapper {

	/**
	 * Returns the list of all Blog instances from the database.
	 * @return the list of all Blog instances from the database.
	 */
	@Select("SELECT idBlog as id, name, url FROM BLOG ")
	@ConstructorArgs(value = {
        @Arg(column="id",javaType=Integer.class),
        @Arg(column="url",javaType=String.class)
    })
	List<Blog> selectAllBlogs();
	
	
}
