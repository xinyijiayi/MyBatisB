package com.example.demo.map.device;

import com.example.demo.bean.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeviceMapper
{
	@Select("select * from tbl_xx ORDER BY mGroup ASC ")
	public List<Device> GetDevices();

	@Select("select * from tbl_xx where mLat!='' ")
	public List<Device> GetDeviceMap();

	@Select("select * from tbl_xx where IMEI like  CONCAT('%',#{IMEI},'%') ")
	public List<Device> GetDevice1(String IMEI);

	@Select("select count(*) from tbl_xx")
	public String GetDeviceCount();

	@Select("select count(*) from tbl_xx where Time > #{Time}")
	public String GetDeviceMoreTime(String Time);

	@Select("select count(*) from tbl_xx where Time <= #{Time}")
	public String GetDeviceLessTime(String Time);
}