package com.hotel.hql.HotelDAO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.mapping.SingleTableSubclass;

import com.hotel.hql.HotelDTO.HotelDto;
import com.singleton.util.SingletonFactory;

public class HotelDao {
	
	SessionFactory factory = SingletonFactory.getFactory();
	Session session = factory.openSession();

		public void save(HotelDto hdto){
			
		System.out.println("Enter into save() method..");
		Transaction tx =session.beginTransaction();
		
		try{
			
			session.saveOrUpdate(hdto);
			tx.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
		}
		
		finally {
			
			session.close();
		}
		
		System.out.println("Exit from save() method..");
		
	}
	
	public List<HotelDto> getHotelByPlace(String placeName){
		
		System.out.println("Enter into getHotelByPlace() method..");
		List<HotelDto> list = null;
		
		try{
			
			String hql = " from HotelDto where place =  '"+placeName+"'";
			Query query = session.createQuery(hql);
			 list = query.list();
						
		}catch(HibernateException e){
			
			e.printStackTrace();
		}finally {
			
			session.close();
		}
		
		
		System.out.println("Exit from getHotelByPlace() method..");
		return list;
	}
	
	public HotelDto getHotelByAddress(String uniqueAddress){
		
		System.out.println("Enter into getHotelByAddress() method..");
		
		HotelDto hdto = null;
		
		try{
			
			String hql = " From HotelDto where address = '"+uniqueAddress+"'";
			Query query = session.createQuery(hql);
			 hdto = (HotelDto)query.uniqueResult();
			
		}catch(HibernateException e){
			
			e.printStackTrace();
		}finally{
			
			session.close();
		}
		
		System.out.println("Exit from getHotelByAddress() method..");
		
		return hdto;
	}
	

	public HotelDto getHotelByName(String hotelName){
	
		System.out.println("Enter into getHotelByName() method..");
		
		HotelDto hdto = null;
		
		try{
			
			String hql = " From HotelDto where hotelName = '"+hotelName+"'";
			Query query = session.createQuery(hql);
			 hdto = (HotelDto)query.uniqueResult();
			
		}catch(HibernateException e){
			
			e.printStackTrace();
		}finally{
			
			session.close();
		}
		
		
		System.out.println("Exit from getHotelByName() method..");
			
		
		return hdto;
	}
	
	public Object[] getRoomAndPriceByname(String hotelName){
		
		System.out.println("Enter into getRoomAndPriceByname() method..");
		
		 Object [] obj   = null;
		
		try{
			
			String hql = " select noOfRoom, rentPerDay From HotelDto where hotelName = '"+hotelName+"'";
			Query query = session.createQuery(hql);
			 obj  = (Object[]) query.uniqueResult();
			
		}catch(HibernateException e){
			
			e.printStackTrace();
		}finally{
			
			session.close();
		}
		
		
		System.out.println("Exit from getRoomAndPriceByname() method..");
			
		
		return obj;
	}
	
	public List<HotelDto> getAllHotels(){
		
		System.out.println("Enter into getAllHotels() method..");
		List<HotelDto> listOfHotel = null;
		try{
			
			String hql = " from HotelDto";
			Query query = session.createQuery(hql);
			 listOfHotel = query.list();
			
		}catch(HibernateException e){
			
			e.printStackTrace();
		}finally{
			
			session.close();
		}
		
		System.out.println("Exit from getAllHotels() method..");
			
		
		return listOfHotel;
	}
	
	public Object[] getNameAndPriceByAddress(String address){
		 
		System.out.println("Enter into getNameAndPriceByAddress() method..");
		
		Object[] objArr =  null;
		
		try{
			
			String hql = "select hotelName, rentPerDay from HotelDto where address = '"+address+"'";
			Query query = session.createQuery(hql);
			objArr = (Object[])query.uniqueResult();
		}catch(HibernateException e){
			
			e.printStackTrace();
		}finally{
			
			session.close();
		}
		
		System.out.println("Exit from getNameAndPriceByAddress() method..");
			
		return objArr;
	}
	
	public List<Object[]> getAllNameAndPriceByPlace(String plcae){
		 
		System.out.println("Enter into getAllNameAndPriceByPlace() method..");
		
		List<Object[]> objArr =  null;
		
		try{
			
			String hql = "select hotelName, rentPerDay from HotelDto where place = '"+plcae+"'";
			Query query = session.createQuery(hql);
			objArr = query.list();
		}catch(HibernateException e){
			
			e.printStackTrace();
		}finally{
			
			session.close();
		}
		
		
		System.out.println("Exit from getAllNameAndPriceByPlace() method..");
			
		return objArr;
	}
	
	public Long getTotalNumberOfHotel(){
		System.out.println("Enter into getTotalNumberOfHotel() method..");
		
		Long totalNo_OfHotel = 0l;
		
		try{
			
			String hql = "select count(*) from HotelDto ";
			Query query = session.createQuery(hql);
			totalNo_OfHotel = (Long) query.uniqueResult();
		}catch(HibernateException e){
			
			e.printStackTrace();
			
		}finally{
			
			session.close();
		}
		
		
		System.out.println("Exit from getTotalNumberOfHotel() method..");
			
		return totalNo_OfHotel;
	}
	
	public int updatePriceByName(int price, String hotelName){
		
		System.out.println("Enter into updatePriceByName() method..");
		
		int rowAffected = 0;
		
		try{
			
			String hql = "update HotelDto set rentPerDay = "+price+" where hotelName = '"+hotelName+"'";
			Query query = session.createQuery(hql);
			 rowAffected = query.executeUpdate();
		}catch(HibernateException e){
			
			e.printStackTrace();
			
		}finally{
			
			session.close();
		}
		
		System.out.println("Exit from updatePriceByName() method..");
			
		return rowAffected;
	}
	
	public int removeHotelByName(String hotelName){
		System.out.println("Enter into removeHotelByName() method..");
		
		
		int rowAffected = 0;
		
		try{
			
			String hql = "delete from HotelDto where hotelName = '"+hotelName+"'";
			Query query = session.createQuery(hql);
			 rowAffected = query.executeUpdate();
		}catch(HibernateException e){
			
			e.printStackTrace();
			
		}finally{
			
			session.close();
		}
		
		
		
		System.out.println("Exit from removeHotelByName() method..");
			
		return rowAffected;
	}
		
}
