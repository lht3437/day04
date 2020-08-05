package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.DeviceMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Device;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class DeviceService {
	@Autowired
	DeviceMapper deviceMapper;
	
	public PageInfo<Device> findList(Device device, Integer pageNum, Integer pageSize, String ordername, String order) {
		PageHelper.startPage(pageNum, pageSize);
		List<Device> list=deviceMapper.findList(device);
		
		return new PageInfo<>(list);
	}

	public void deleteDevice(Integer did) {
		// TODO Auto-generated method stub
		deviceMapper.deleteByPrimaryKey(did);
	}

	public void updateDevice(Device device) {
		// TODO Auto-generated method stub
		deviceMapper.updateByPrimaryKeySelective(device);
	}

	public void addDevice(Device device) {
		// TODO Auto-generated method stub
		deviceMapper.insert(device);
	}

}
