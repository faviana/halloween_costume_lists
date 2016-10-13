package com.ironyard.halloween.repositories;

import com.ironyard.halloween.data.Costume;
import org.springframework.data.repository.CrudRepository;

/**
 * We will be usign 'Costume' objects and their primary
 * key will be of type 'Long'
 *  CrudRepository<Costume, Long>
 */
public interface CostumeRepository extends CrudRepository<Costume, Long> {
}
