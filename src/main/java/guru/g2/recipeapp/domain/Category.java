package guru.g2.recipeapp.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

/**
 * Created by jt on 6/13/17.
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String description;

    @ManyToMany(mappedBy = "categories")
//    @ManyToMany
//    @JoinTable(/*name = "recipe_category",*/
//        joinColumns = @JoinColumn(name = "category_id"),
//            inverseJoinColumns = @JoinColumn(name = "recipe_id"))
    private Set<Recipe> recipes;

	@Override
	public String toString() {
		return "Categoryxxx [id=" + id + ", description=" + description + ", recipes=" + recipes + "]";
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
	
}
