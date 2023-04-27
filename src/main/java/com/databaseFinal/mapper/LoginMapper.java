package com.databaseFinal.mapper;

import com.databaseFinal.pojo.Login;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface LoginMapper {

    @Select("select * from login_accounts")
    List<Login> list();


    @Delete("delete from login_accounts where login_account_id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into login(id, name) values(#{id},#{name})")
    void insert(Login login);

    @Select("SELECT * FROM login_accounts  WHERE account_name = #{accountName} AND passwords = #{passwords} ")
    Login getByUsernameAndPassword(Login login);
}
