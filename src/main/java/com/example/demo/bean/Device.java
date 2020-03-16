package com.example.demo.bean;

import lombok.Data;

@Data
public class Device
{
	private String id; // id
	private String IMEI; // IMEI
	private String Name; // 名称
	private String sid; // 保留
	private String SIP; // IP地址
	private String SPort; // 保留
	private String mGroup1; // 地址
	private String mGroup; // 备注
	private String RIP; // 设备IP
	private String Remark; // 升级文件名称
	private String sVersion; // 软件版本号
	private String hVersion; // 硬件版本号
	private String Time; // 登录时间
	private String mSetIDA; // 需要设置IP
	private String mConfig; // 配置文件名称
	private String mS1; // 设备当前信息
	private String mS2; // 设备第一次登录时间
	private String mS3; // 登入设备编号 50雷击 70博海
	private String mS4; // 保留
	private String mS5; // 根据坐标得出的城市名称
	private String mS6; // 保留
	private String mS7; // 手机CDID号
	private String mS8; // 设备历史保留标志位
	private String mLat; // 纬度(GPS)
	private String mLng; // 经度(GPS)
	private String mBuf; // 心跳数据具体内容
	private String mPointFlag; // 定位状态
	private String mPointJZ; // 基站定位标志
	private String mLatJZ; // 基站定位纬度
	private String mLngJZ; // 基站定位经度

}

