package com.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Model.*;

@Repository
public interface AppDao extends CrudRepository<Address, Integer> {

}
