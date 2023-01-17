package com.learn.m_s.rest.webservice.restfulwebservices.versioning;

public class PersionV2 {
   private Name name;

   @Override
   public String toString() {
      return "PersionV2{" +
              "name=" + name +
              '}';
   }

   public Name getName() {
      return name;
   }

   public PersionV2(Name name) {
      this.name = name;
   }
}
