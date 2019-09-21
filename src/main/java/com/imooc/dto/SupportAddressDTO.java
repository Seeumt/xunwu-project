package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SupportAddressDTO {
    private Long id;
    @JsonProperty("belong_to")
    private String belongTo;
    @JsonProperty("en_name")
    private String enName;
    @JsonProperty("cn_name")
    private String cnName;

    private String level;




}
