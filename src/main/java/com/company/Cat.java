package com.company;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@ToString
public class Cat {
    @Getter @Setter private String name;
    @Getter @Setter private String breed;
}
