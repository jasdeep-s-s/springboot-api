package com.jasdeepss;

import org.springframework.stereotype.Service;

import java.util.List;

@Service   // bean class
public class SoftwareEngineerService {

    private static SoftwareEngineerRepository  softwareEngineerRepository = null;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        SoftwareEngineerService.softwareEngineerRepository = softwareEngineerRepository;
    }

    public static List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public static SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(id + "not found"));
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);
    }
}
