package com.gshepur.quoteservice.dto;

import com.gshepur.entity.Category;
import com.gshepur.entity.Quote;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class QuoteCategoryAddRequest {

    @ApiModelProperty(notes = "Quote")
    private Quote quote;

    @ApiModelProperty(notes = "List of categories")
    private List<Category> categoryList;

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}
