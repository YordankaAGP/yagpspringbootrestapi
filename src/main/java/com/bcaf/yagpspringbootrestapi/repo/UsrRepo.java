package com.bcaf.yagpspringbootrestapi.repo;

import com.bcaf.yagpspringbootrestapi.model.Usr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsrRepo extends JpaRepository<Usr,Long> {

    //SELECT * FROM MstUser WHERE UserName = ? OR NoHp = ? OR Email = ?
    public Optional<Usr> findByUserNameOrNoHpOrEmail(String userName, String noHp, String email);
}

