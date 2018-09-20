package service.impl;

import java.util.List;

import common.exception.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import common.bean.Friendrecord;
import common.bean.Graderecord;
import common.bean.Memberinfo;
import common.bean.Memberspace;
import common.bean.Pointaction;
import common.bean.Pointrecord;
import common.exception.MemberServiceException;
import dao.IMemberDaoMapping;
import service.IMemberService;

@Service
public class MemberSercviceImpl implements IMemberService {
	
	@Autowired
	private IMemberDaoMapping memberDao;

	@Override
	public IMemberDaoMapping getMemberDao() {
		
		return memberDao;
	}

	@Override
	public void registerMemberinfo(Memberinfo memberinfo) throws MemberServiceException {
		

	}

	@Override
	public Memberinfo findMemberinfoByName(String nickname) throws MemberServiceException {
		Memberinfo member = null;
		try {
			member = memberDao.findMemberinfoByName(nickname);

		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return member;
	}

	@Override
	public Memberinfo login(String username, String passwd) throws MemberServiceException {
		// 
		return null;
	}

	@Override
	public void logout(String nickname) throws MemberServiceException {
		

	}

	@Override
	public List<Memberinfo> findMemberinfoByNum(int number) throws MemberServiceException {
		
		return null;
	}

	@Override
	public int findMemberinfoOnline() throws MemberServiceException {
		
		return 0;
	}

	@Override
	public Graderecord findMemberinfoLevel(Long point) throws MemberServiceException {
		
		return null;
	}

	@Override
	public Memberinfo saveOrUpDate(Memberinfo memberinfo, String oldPasswd) throws MemberServiceException {
		
		return null;
	}

	@Override
	public String getBackPasswd(String nickname, String pwdQuestion, String pwdAnswer) throws MemberServiceException {
		
		return null;
	}

	@Override
	public void saveOrUpdate(Memberinfo memberinfo) throws MemberServiceException {
		

	}

	@Override
	public void saveOrUpdate(String selfname, String friendname) throws MemberServiceException {
		

	}

	@Override
	public List<Memberinfo> listFriend(String selfname) throws MemberServiceException {
		
		return null;
	}

	@Override
	public void moveToBlack(String selfname, String blackname) throws MemberServiceException {
		

	}

	@Override
	public List<Memberinfo> listBlack(String selfname) throws MemberServiceException {
		
		return null;
	}

	@Override
	public Friendrecord findFriend(String friend) throws MemberServiceException {
		
		return null;
	}

	@Override
	public Boolean isMemberspace(Long id) throws MemberServiceException {
		// 
		return null;
	}

	@Override
	public void moveToFriend(String selfName, String name_searching) throws MemberServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleleBlack(String selfName, String black) throws MemberServiceException {
		// 

	}

	@Override
	public void deleleFriend(String selfName, String friend) throws MemberServiceException {
		// 

	}

	@Override
	public void delSpace(Long id) throws MemberServiceException {
		// 

	}

	@Override
	public Pointaction findPointactionByPointAction(String actionName) throws MemberServiceException {
		// 
		return null;
	}

	@Override
	public void save(Pointrecord pointrecord) throws MemberServiceException {
		// 

	}

	@Override
	public void saveorupdateMemberspace(Memberspace space, Memberinfo memberinfo) throws MemberServiceException {
		// 

	}

	@Override
	public Memberspace findSpace(Long id) throws MemberServiceException {
		// 
		return null;
	}

	@Override
	public List<Memberinfo> match(Long id) throws MemberServiceException {
		// 
		return null;
	}

	@Override
	public List<Memberinfo> listMemberinfo() throws MemberServiceException {

		return null;
	}

	@Override
	public List<Memberinfo> findFriends(String ages, String genders, String provinceCitys, Long id)
			throws MemberServiceException {

		return null;
	}

}
