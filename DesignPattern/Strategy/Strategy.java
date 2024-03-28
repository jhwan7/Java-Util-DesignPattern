package DesignPattern.Strategy;

/**
 * Strategy
 */

public class Strategy {

    public interface DiscountStrategy {
        double applyDiscount(double amount);
    }

    public class RegularDiscount implements DiscountStrategy {

        @Override
        public double applyDiscount(double amount) {
            return amount * 0.9;
        }

    }

    public class PremiumDiscount implements DiscountStrategy {

        @Override
        public double applyDiscount(double amount) {
            return amount * 0.6;
        }

    }

    public class ShoppingCart {
        private DiscountStrategy discountStrategy;

        public void setDiscountStrategy(DiscountStrategy discountStrategy) {
            this.discountStrategy = discountStrategy;
        }

        public double checkout(double amount) {
            return discountStrategy.applyDiscount(amount);
        }
    }

    

}