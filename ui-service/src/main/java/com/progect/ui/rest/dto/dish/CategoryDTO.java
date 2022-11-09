package com.progect.ui.rest.dto.dish;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.progect.ui.rest.dto.dish.enums.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class CategoryDTO {
    @Getter
    @Setter
    @JsonProperty(value = "category")
    private Category category;

    public CategoryDTO(String category) {
        this.category = Category.valueOf(category);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryDTO that = (CategoryDTO) o;

        return category == that.category;
    }

    @Override
    public int hashCode() {
        return category != null ? category.hashCode() : 0;
    }
}
