package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import common.bean.Memberinfo;
import common.bean.Messagerecord;
import common.exception.MessengerServiceException;
import dao.IMessengerDaoMapping;
import service.IMessengerService;

@Service
public class MessengerServiceImpl implements IMessengerService {
	
	@Autowired
	private IMessengerDaoMapping messengerDao;
	@Override
	public IMessengerDaoMapping getMessengerDao() {
		// TODO Auto-generated method stub
		return messengerDao;
	}

	@Override
	public Integer findNewMessageNum(String nickname) throws MessengerServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Memberinfo findOneMemberinfo() throws MessengerServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Memberinfo> findFriends(String age, String gender, String city) throws MessengerServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveMessage(Messagerecord message) throws MessengerServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Messagerecord> listSendMessage(String senderName) throws MessengerServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Messagerecord> listRecieveMessage(String recieveName) throws MessengerServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Messagerecord findMessage(Long id) throws MessengerServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delRecieveMessage(Long id) throws MessengerServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delSendMessage(Long id) throws MessengerServiceException {
		// TODO Auto-generated method stub

	}

}
