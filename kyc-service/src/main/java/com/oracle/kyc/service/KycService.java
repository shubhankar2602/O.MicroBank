package com.oracle.kyc.service;

import java.util.List;

import com.oracle.kyc.dto.KycDTO;

public interface KycService {

    KycDTO saveKyc(KycDTO kycDTO);

    KycDTO getKycByCustomerId(String customerId);

    List<KycDTO> getAllKycs();

    KycDTO updateKyc(String customerId, KycDTO kycDTO);

    void deleteKyc(String customerId);
    
    void reviewKyc(String customerId, String status, String remark);

}
