package com.springboot.mysql.controller;

import org.springframework.data.repository.CrudRepository;

public interface WaterRepository extends CrudRepository<UseWater, Integer> //Entity class, Primary Id Type
{

//edit,delete,update all inherited from Crud, can use repository in controller/service
}
