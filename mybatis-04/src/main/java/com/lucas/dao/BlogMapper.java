package com.lucas.dao;

import com.lucas.dto.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author lucas
 * @create 2020/11/23
 */
public interface BlogMapper {

    int addBlog(Blog blog);

    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Map map);

    List<Blog> queryBlogForeach(Map map);

}
