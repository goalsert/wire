package com.squareup.wire.exemplar;

import com.squareup.protos.wire.exemplar.MuchAwesome;

public class Exemplar {

  public static void main(String[] args) {
    MuchAwesome doggy = new MuchAwesome.Builder().very_proto("Wow!").build();
    System.out.println(doggy.toString());
  }
}
