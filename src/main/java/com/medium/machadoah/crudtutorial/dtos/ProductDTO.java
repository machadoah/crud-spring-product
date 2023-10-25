package com.medium.machadoah.crudtutorial.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductDTO(@NotBlank @NotNull String id,
                         String name,
                         Integer price_in_cents) {
}
