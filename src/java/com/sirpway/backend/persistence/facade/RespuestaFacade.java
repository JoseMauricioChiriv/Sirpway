/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sirpway.backend.persistence.facade;

import com.sirpway.backend.persistence.entity.Respuesta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jency
 */
@Stateless
public class RespuestaFacade extends AbstractFacade<Respuesta> implements RespuestaFacadeLocal {

    @PersistenceContext(unitName = "LaprincipalSubwayPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RespuestaFacade() {
        super(Respuesta.class);
    }
    
}
