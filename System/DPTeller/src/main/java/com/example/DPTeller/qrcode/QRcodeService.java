package com.example.DPTeller.qrcode;

import com.example.DPTeller.qrcode.entity.QRcode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class QRcodeService {

    @Autowired
    private QRcodeRepository qRcodeRepository;

    //for mockito
    public void setQRcodeRepository(QRcodeRepository qRcodeRepository) {
        this.qRcodeRepository = qRcodeRepository;
    }

    public String findQRcode(long id) {
        Optional<QRcode> result = qRcodeRepository.findById(id);
        if (result.isPresent()) {
            return "found";
        }
        return "not found";
    }

    public String Generate(QRcode qRcode) {
        qRcodeRepository.save(qRcode);
        Optional<QRcode> result = qRcodeRepository.findById(qRcode.getId());
        if (result.isPresent()) {
            return "Generate Success";
        }
        return "Generate not success";
    }
}
