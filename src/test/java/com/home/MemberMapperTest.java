package com.home;

import com.home.domain.MemberVO;
import com.home.mapper.MemberMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;




public class MemberMapperTest extends HomeApplicationTests {

  @Autowired
  private MemberMapper mapper;
  
  
  @Test
  public void testInsert()throws Exception{
    
    MemberVO vo = new MemberVO();
    
    vo.setUserid("baek5d41a113");
    vo.setUserpw("user543");
    
    vo.setUsername("Billy Kang");
    
    vo.setEmail("zerockcode@gmail.com");
    
    mapper.create(vo);

        
  }
  
  @Test
  public void testLogin()throws Exception{
    
    MemberVO vo  = mapper.login("user541113", "user543");
    
    System.out.println(vo);
        
  }
  
  
  
}
