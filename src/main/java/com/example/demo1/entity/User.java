package com.example.demo1.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

// ユーザー情報 Entity
@Entity
@Data
@Table(name="users")
public class User {
	// ID
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// 名前
	@Column(name = "username")
	private String username;
	
	// 住所
	@Column(name="address")
	private String address;
	
	// 電話番号
	@Column(name="phone")
	private String phone;
	
	// 登録日時
	@Column(name = "create_date")
	private Date createDate;
	
	// 削除日時
	@Column(name = "delete_date")
	private Date deleteDate;
	
	
}
