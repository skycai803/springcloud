package com.sky.user.vo;

import com.sky.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDepartmentVO {
	private User user;
	private Department department;
}
