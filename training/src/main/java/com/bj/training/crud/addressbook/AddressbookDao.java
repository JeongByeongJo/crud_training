package com.bj.training.crud.addressbook;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AddressbookDao {
	
	public List<AddressbookDto> selectList();
	public AddressbookDto selectOne(AddressbookDto addressbookDto);

}
