package com.example.smsdrw.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper=true)
@DiscriminatorValue(value = "Withdraw")
public class Withdraw extends Transaction {
}
