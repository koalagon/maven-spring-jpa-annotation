package com.westside.domain.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


/**
 * Created by bkwak on 05/01/2017.
 */
//@MappedSuperclass
public abstract class Course {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

    protected String name;


}
