package com.bj.training.crud.addressbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressbookService {
	
	@Autowired
	AddressbookDao addressbookDao;
	
	public List<AddressbookDto> selectList() {
		return addressbookDao.selectList();
	}
	
	public AddressbookDto selectOne(AddressbookDto addressbookDto) {
		return addressbookDao.selectOne(addressbookDto);
	}

}
