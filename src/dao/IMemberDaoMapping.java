package dao;

import java.util.List;

import common.exception.DataAccessException;
import common.bean.Blackrecord;
import common.bean.Friendrecord;
import common.bean.Graderecord;
import common.bean.Memberinfo;
import common.bean.Memberspace;
import common.bean.Pointaction;
import common.bean.Pointrecord;

public interface IMemberDaoMapping {
	Memberinfo findMemberinfoById(long id) throws DataAccessException;
	//按姓名查找用户
	Memberinfo findMemberinfoByName(String name) throws DataAccessException;
	
	//保存或更新用户
	void saveOrUpdateMemberinfo(Memberinfo memberinfo) throws DataAccessException;
	
	//查找前几名用户 
	List<Memberinfo> findMemberinfoByNum(int number)throws DataAccessException;
	
	//查找在线用户数量
	Integer findMemberinfoOnline()throws DataAccessException;
	
	//按照积分查找等级
	Graderecord findMemberinfoLevel(Long point)throws DataAccessException;
	
	//按照积分动作查找Pointaction类
	Pointaction findPointactionByPointAction(String pointAction)throws DataAccessException;
	
	//保存积分记录
	void saveOrUpdatePointrecord(Pointrecord pointrecord) throws DataAccessException;
	
	//保存好友信息
	void saveOrUpdateFriend(Friendrecord friend) throws DataAccessException;
	
	//保存黑名单会员
	void saveOrUpdateFriend(Blackrecord friend) throws DataAccessException;
	
	//查找本人的所有好友
	List<Memberinfo> listFriend(String selfname) throws DataAccessException;
	
	//查找本人的所有黑名单
	List<Memberinfo> listBlack(String selfname) throws DataAccessException;
	
	//删除黑名单会员
	void deleleBlack(Blackrecord black) throws DataAccessException;
	
	//删除好友
	void deleleFriend(Friendrecord friend) throws DataAccessException;
	
	//查找好友
	Friendrecord findfriend(String selfName, String friendName) throws DataAccessException;
	
	//查找黑名单
	Blackrecord findBlack(String selfName, String blackName) throws DataAccessException;
	
	//查找个人空间
	Memberspace findSpace(Long id) throws DataAccessException;
	
	//删除个人空间
	void delSpace(Memberspace space) throws DataAccessException;
	
	void saveoruptateMemberspace(Memberspace space)
			throws DataAccessException ;
	public List<Memberinfo> match(Long id) throws DataAccessException;
	public List<Memberinfo> listMemberinfo() throws DataAccessException;
	public List<Memberinfo> whereFriend(String hql) throws DataAccessException;
}
