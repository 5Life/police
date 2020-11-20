package br.com.fiap.fivelife.police.dto.request;

import br.com.fiap.fivelife.police.entity.Glasses;
import com.sun.istack.NotNull;

import java.util.ArrayList;
import java.util.List;


public class GlassesDTO {
    private String glassesCode;
    private String name;

    public GlassesDTO(String glassesCode, String name) {
        this.glassesCode = glassesCode;
        this.name = name;
    }

    public String getGlassesCode() {
        return glassesCode;
    }

    public String getName() {
        return name;
    }

    public void setGlassesCode(String glassesCode) {
        this.glassesCode = glassesCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Glasses convert() {
        return new Glasses(getGlassesCode(), getName());
    }

    public static List<GlassesDTO> convertGlassesToDTO(List<Glasses> glasses) {
        List<GlassesDTO> glassesDTOs = new ArrayList<>();

        for (Glasses aPairOfGlasses : glasses) {
            glassesDTOs.add(new GlassesDTO(aPairOfGlasses.getGlassesCode(), aPairOfGlasses.getName()));
        }

        return glassesDTOs;
    }
}
