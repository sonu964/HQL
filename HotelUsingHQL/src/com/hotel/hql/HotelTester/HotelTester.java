package com.hotel.hql.HotelTester;

import java.util.Iterator;
import java.util.List;

import com.hotel.hql.HotelDAO.HotelDao;
import com.hotel.hql.HotelDTO.HotelDto;

public class HotelTester {

	public static void main(String[] args) {
		
		System.out.println("Main method started");

		HotelDto hdto = new HotelDto();
		
		//hdto.setId(1);
		hdto.setPlace("Hotels near Banashankari Temple");
		hdto.setHotelName("Taj West End");
		hdto.setOwnerName("Shankar");
		
		hdto.setAddress("Race Course Road, Bengaluru 560001, India");
		
		hdto.setTypeOfRoom("Ac");
		hdto.setRentPerDay(14080);
		hdto.setNoOfRoom(29);
		
		HotelDao hdao = new  HotelDao();
		
		//hdao.save(hdto);
		
		
		
		/*List<HotelDto> list = hdao.getHotelByPlace("Hotels near Basavanagudi");
		
		Iterator<HotelDto> itr = list.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next().getId()+itr.next().getHotelName());
		}
		for(HotelDto li : list){
			
			System.out.println(li.getId() +" "+ li.getHotelName()+" "+li.getPlace()+" "+li.getTypeOfRoom()+" "+li.getRentPerDay()+" "+li.getOwnerName());
		}*/
		
		
		
		/* hdto =hdao.getHotelByAddress("#198, 2nd & 3rd Floor, | Above Coffee Day, Basavanagudi, Bengaluru 560004, India");
		 System.out.println(hdto.getId() +" "+ hdto.getHotelName()+" "+hdto.getPlace()+" "+hdto.getTypeOfRoom()+" "+hdto.getRentPerDay()+" "+hdto.getOwnerName());
		
		
		System.out.println("Main method ended");
		*/
		
		
		/*hdto = hdao.getHotelByName("IBC Hotels & Resorts");
		System.out.println(hdto.getId()+";"+hdto.getHotelName()+";"+hdto.getPlace()+";"+hdto.getNoOfRoom()+";"+hdto.getRentPerDay()+";"+hdto.getTypeOfRoom());
*/
		
		
		/*Object[] objArr = hdao.getRoomAndPriceByname("IBC Hotels & Resorts");
		for(Object obj : objArr){
			
			System.out.println(obj);
		}*/
		
		/*List<HotelDto> listOfHotel = hdao.getAllHotels();
		
		for(HotelDto hotel : listOfHotel){
			
			System.out.println(hotel.getId()+";"+hotel.getHotelName()+";"+hotel.getPlace()+";"+hotel.getNoOfRoom()+";"+hotel.getRentPerDay()+";"+hotel.getTypeOfRoom());
			
		}*/
		
		
		/*Object[] objArr = hdao.getNameAndPriceByAddress("No. 49, Cunningham Crescent Road | behind Sigma Mall, Bengaluru 560052, India");
		for(Object obj : objArr){
			
			System.out.println(obj);
		}*/
		
		
		/*List<Object[]> objArr = hdao.getAllNameAndPriceByPlace("Hotels near Basavanagudi");
		
		for(Object[] oa : objArr ){
			
			for(Object obj : oa ){
				
				System.out.println(obj);	
			}
		}*/
		
		
		/*Long totalNo_OfHotel = hdao.getTotalNumberOfHotel();
		System.out.println(totalNo_OfHotel);
		*/
		
		
		
		/*int rowAffected =	hdao.updatePriceByName(800, "Octave Plaza Hotel");
		System.out.println("Row Affected : "+rowAffected);
			*/
		
		
		int rowAffected = hdao.removeHotelByName("Taj West End");
		System.out.println("Row Affected : "+rowAffected);
	}

}
