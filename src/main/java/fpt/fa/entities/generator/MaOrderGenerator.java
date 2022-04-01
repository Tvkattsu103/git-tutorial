/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author voanh
 * @date Mar 31, 2022
 * version 1.0
 */
package fpt.fa.entities.generator;

import java.io.Serializable;
import java.util.stream.Stream;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MaOrderGenerator implements IdentifierGenerator {
	private String prefix = "CD";
	  @Override
	  public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
	    String query = "SELECT e.maOrder FROM TTOrder e";
	    Stream<String> ids = session.createQuery(query, String.class).stream();
	    Long max = ids.map(o -> o.replace(prefix, "")).mapToLong(Long::parseLong).max().orElse(0L);
	    return prefix + (String.format("%03d", max + 1));
	  }
}