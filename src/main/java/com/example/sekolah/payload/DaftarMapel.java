package com.example.sekolah.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DaftarMapel {
    List<PayloadMapel> mapelList = new ArrayList<>();
}
