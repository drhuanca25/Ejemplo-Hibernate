package com.ejemplo1.hibernateSimple1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.ParameterMode;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.procedure.ProcedureOutputs;
import org.hibernate.result.ResultSetOutput;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {    	
        MateriaModel mm = new MateriaModel();
        Materia mat = new Materia();
        mat.setSigla("A1");
        mat.setDescripcion("Es unamateria facil y divertida");
        mm.crear(mat);
        
    }   
}