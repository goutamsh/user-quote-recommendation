package com.gshepur.dao;

import com.gshepur.entity.Author;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.transaction.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {UserQuoteTestConfig.class},loader = AnnotationConfigContextLoader.class)
@Transactional
@DirtiesContext
public class AuthorDaoTest {

    @Autowired
    private AuthorDao authorDao;

    @Test
    public void testFindById(){
        Author author = new Author();
        author.setName("JunitAuthor");
        author.setCity("JunitCity");
        authorDao.save(author);

        Author returnedAuthor = authorDao.findByName("JunitAuthor");
        Assert.assertEquals("JunitAuthor", returnedAuthor.getName());

    }
}
