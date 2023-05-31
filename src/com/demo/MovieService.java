package com.demo;

import com.spring.Service;

import java.util.ArrayList;


@Service
public interface MovieService {
    // 팀 목록을 조회하는 메서드
    public ArrayList<baseballDto> select();

    // 특정 팀의 정보를 조회하는 메서드
    public baseballDto read(int idx);

    // 팀의 개수를 반환하는 메서드
    public int count();

    // 특정 팀을 삭제하는 메서드
    public boolean delete(int idx);

    // 새로운 팀을 추가하는 메서드
    public boolean insert(baseballDto base);

    // 팀 정보를 업데이트하는 메서드
    public boolean update(baseballDto base);
}

