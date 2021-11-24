package com.itmuch.usercenter.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class UserReo{
    private String name;
    private int age;
}
