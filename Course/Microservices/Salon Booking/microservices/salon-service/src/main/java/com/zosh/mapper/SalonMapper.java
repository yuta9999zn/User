package com.zosh.mapper;

import com.zosh.modal.Salon;
import com.zosh.payload.dto.SalonDTO;

public class SalonMapper {
    public static SalonDTO mapToDTO(Salon salon) {
        SalonDTO salonDTO = new SalonDTO();
        salonDTO.setId(salon.getId());

        salonDTO.setName(salon.getName());
        salonDTO.setAddress(salon.getAddress());
        salonDTO.setCity(salon.getCity());
        salonDTO.setImages(salon.getImages());
        salonDTO.setCloseTime(salon.getCloseTime());
        salonDTO.setOpenTime(salon.getOpenTime());
        salonDTO.setPhoneName(salon.getPhoneName());
        salonDTO.setOwnerId(salon.getOwnerId());
        salonDTO.setEmail(salon.getEmail());
        return salonDTO;
    }
}
