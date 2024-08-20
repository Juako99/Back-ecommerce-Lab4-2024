package com.entidades.buenSabor.presentation.rest.Base;

import com.entidades.buenSabor.domain.dto.BaseDto;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;
//DC Dto create
//DE Dte edit
public interface BaseController <D extends BaseDto, ID extends Serializable> {
    ResponseEntity<D> getById(ID id);

    ResponseEntity<List<D>> getAll();
}