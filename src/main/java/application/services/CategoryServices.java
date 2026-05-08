package application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.Repositories.CategoryRepository;
import application.entities.Category;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository CategoryRepository;

    public List<Category> findAll(){
        return CategoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = CategoryRepository.findById(id);
        return obj.get();
    }

}