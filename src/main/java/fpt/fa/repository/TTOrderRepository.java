/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author voanh
 * @date Mar 31, 2022
 * version 1.0
 */
package fpt.fa.repository;

import java.util.List;

import fpt.fa.entities.LoaiKH;
import fpt.fa.entities.TTOrder;

public interface TTOrderRepository {
	void save(TTOrder ttorder);
	List<TTOrder> getTT();
	TTOrder getTTById(String id);
}
