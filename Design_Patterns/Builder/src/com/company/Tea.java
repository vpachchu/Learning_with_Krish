package com.company;

public class Tea {
    private final String water,tea_powder,sugar,milk_powder;

    public Tea(Builder builder) {
        this.water=builder.water;
        this.tea_powder=builder.tea_powder;
        this.sugar=builder.sugar;
        this.milk_powder=builder.milk_powder;
    }

    static  class Builder
    {
        private String water,tea_powder,sugar,milk_powder;

        public Builder(String water)
        {
            this.water=water;
        }

        public Tea build()
        {

            return new Tea(this);
        }

        public Builder water(String water)
        {
            this.water=water;
            return this;
        }

        public Builder tea_powder(String tea_powder)
        {
            this.tea_powder=tea_powder;
            return this;
        }

        public Builder sugar(String sugar)
        {
            this.sugar=sugar;
            return this;
        }

        public Builder milk_powder(String milk_powder)
        {
            this.milk_powder=milk_powder;
            return this;
        }
    }

    @Override
    public String toString() {
        return "at Tea Builder's Kitchen we have{" +
                "water='" + water + '\'' +
                ", tea_powder='" + tea_powder + '\'' +
                ", sugar='" + sugar + '\'' +
                ", milk_powder='" + milk_powder + '\'' +
                '}';
    }
}
