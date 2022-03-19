package com.example.DPTeller.qrcode;

import com.example.DPTeller.qrcode.entity.QRcode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QRcodeRepository extends JpaRepository<QRcode, Long> {

    Optional<QRcode> findById(Long id);
    
}