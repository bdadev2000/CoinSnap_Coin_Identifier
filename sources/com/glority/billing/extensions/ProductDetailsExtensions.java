package com.glority.billing.extensions;

import com.android.billingclient.api.ProductDetails;
import com.glority.billing.definition.BillingPeriod;
import com.glority.billing.definition.ProductPrice;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductDetailsExtensions.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0002\u001a\u000e\u0010\u000b\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0002\u001a\f\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0002\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\b*\u00020\u0002\u001a\n\u0010\u0011\u001a\u00020\u0001*\u00020\u0002\u001a\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0002\u001a\f\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u0002\u001a\n\u0010\u0014\u001a\u00020\u000f*\u00020\u0002\u001a\n\u0010\u0015\u001a\u00020\n*\u00020\u0002¨\u0006\u0016"}, d2 = {"isSubscription", "", "Lcom/android/billingclient/api/ProductDetails;", "isConsumable", "isEligibleForFreeTrial", "getFreeTrialPricingPhase", "Lcom/android/billingclient/api/ProductDetails$PricingPhase;", "getFreeTrialPeriod", "Lcom/glority/billing/definition/BillingPeriod;", "getFreeTrialPeriodCycleCount", "", "getSubscriptionPricingPhase", "getSubscriptionPrice", "Lcom/glority/billing/definition/ProductPrice;", "getSubscriptionCurrency", "", "getSubscriptionPeriod", "isEligibleForIntroductoryDiscount", "getIntroductoryPricingPhase", "getIntroductoryPrice", "getIntroductoryCurrency", "getIntroductoryPriceCycle", "base-billing_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ProductDetailsExtensions {
    public static final boolean isSubscription(ProductDetails productDetails) {
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        return Intrinsics.areEqual(productDetails.getProductType(), "subs");
    }

    public static final boolean isConsumable(ProductDetails productDetails) {
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        return Intrinsics.areEqual(productDetails.getProductType(), "inapp");
    }

    public static final boolean isEligibleForFreeTrial(ProductDetails productDetails) {
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        if (!isSubscription(productDetails) || (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) == null) {
            return false;
        }
        Iterator<ProductDetails.SubscriptionOfferDetails> it = subscriptionOfferDetails.iterator();
        while (it.hasNext()) {
            for (ProductDetails.PricingPhase pricingPhase : it.next().getPricingPhases().getPricingPhaseList()) {
                if (pricingPhase.getPriceAmountMicros() == 0 && pricingPhase.getRecurrenceMode() == 2 && pricingPhase.getBillingCycleCount() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final ProductDetails.PricingPhase getFreeTrialPricingPhase(ProductDetails productDetails) {
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        if (!isSubscription(productDetails) || !isEligibleForFreeTrial(productDetails) || (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) == null) {
            return null;
        }
        Iterator<ProductDetails.SubscriptionOfferDetails> it = subscriptionOfferDetails.iterator();
        while (it.hasNext()) {
            for (ProductDetails.PricingPhase pricingPhase : it.next().getPricingPhases().getPricingPhaseList()) {
                if (pricingPhase.getPriceAmountMicros() == 0 && pricingPhase.getRecurrenceMode() == 2 && pricingPhase.getBillingCycleCount() > 0) {
                    return pricingPhase;
                }
            }
        }
        return null;
    }

    public static final BillingPeriod getFreeTrialPeriod(ProductDetails productDetails) {
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        if (!isSubscription(productDetails)) {
            return BillingPeriod.NONE;
        }
        if (!isEligibleForFreeTrial(productDetails)) {
            return BillingPeriod.NONE;
        }
        ProductDetails.PricingPhase freeTrialPricingPhase = getFreeTrialPricingPhase(productDetails);
        if (freeTrialPricingPhase == null) {
            return BillingPeriod.NONE;
        }
        BillingPeriod.Companion companion = BillingPeriod.INSTANCE;
        String billingPeriod = freeTrialPricingPhase.getBillingPeriod();
        Intrinsics.checkNotNullExpressionValue(billingPeriod, "getBillingPeriod(...)");
        return companion.fromValue(billingPeriod);
    }

    public static final int getFreeTrialPeriodCycleCount(ProductDetails productDetails) {
        ProductDetails.PricingPhase freeTrialPricingPhase;
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        if (isSubscription(productDetails) && isEligibleForFreeTrial(productDetails) && (freeTrialPricingPhase = getFreeTrialPricingPhase(productDetails)) != null) {
            return freeTrialPricingPhase.getBillingCycleCount();
        }
        return 0;
    }

    private static final ProductDetails.PricingPhase getSubscriptionPricingPhase(ProductDetails productDetails) {
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        if (!isSubscription(productDetails) || (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) == null) {
            return null;
        }
        Iterator<ProductDetails.SubscriptionOfferDetails> it = subscriptionOfferDetails.iterator();
        while (it.hasNext()) {
            for (ProductDetails.PricingPhase pricingPhase : it.next().getPricingPhases().getPricingPhaseList()) {
                if (pricingPhase.getPriceAmountMicros() > 0 && pricingPhase.getRecurrenceMode() == 1) {
                    return pricingPhase;
                }
            }
        }
        return null;
    }

    public static final ProductPrice getSubscriptionPrice(ProductDetails productDetails) {
        ProductDetails.PricingPhase subscriptionPricingPhase;
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        if (!isSubscription(productDetails) || (subscriptionPricingPhase = getSubscriptionPricingPhase(productDetails)) == null) {
            return null;
        }
        float priceAmountMicros = ((float) subscriptionPricingPhase.getPriceAmountMicros()) / 1000000.0f;
        String priceCurrencyCode = subscriptionPricingPhase.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "getPriceCurrencyCode(...)");
        return new ProductPrice(priceAmountMicros, priceCurrencyCode, productDetails);
    }

    public static final String getSubscriptionCurrency(ProductDetails productDetails) {
        ProductDetails.PricingPhase subscriptionPricingPhase;
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        if (!isSubscription(productDetails) || (subscriptionPricingPhase = getSubscriptionPricingPhase(productDetails)) == null) {
            return "";
        }
        String priceCurrencyCode = subscriptionPricingPhase.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "getPriceCurrencyCode(...)");
        return priceCurrencyCode;
    }

    public static final BillingPeriod getSubscriptionPeriod(ProductDetails productDetails) {
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        if (!isSubscription(productDetails)) {
            return BillingPeriod.NONE;
        }
        ProductDetails.PricingPhase subscriptionPricingPhase = getSubscriptionPricingPhase(productDetails);
        if (subscriptionPricingPhase == null) {
            return BillingPeriod.NONE;
        }
        BillingPeriod.Companion companion = BillingPeriod.INSTANCE;
        String billingPeriod = subscriptionPricingPhase.getBillingPeriod();
        Intrinsics.checkNotNullExpressionValue(billingPeriod, "getBillingPeriod(...)");
        return companion.fromValue(billingPeriod);
    }

    public static final boolean isEligibleForIntroductoryDiscount(ProductDetails productDetails) {
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        if (!isSubscription(productDetails) || (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) == null) {
            return false;
        }
        Iterator<ProductDetails.SubscriptionOfferDetails> it = subscriptionOfferDetails.iterator();
        while (it.hasNext()) {
            for (ProductDetails.PricingPhase pricingPhase : it.next().getPricingPhases().getPricingPhaseList()) {
                if (pricingPhase.getPriceAmountMicros() > 0 && pricingPhase.getRecurrenceMode() == 2 && pricingPhase.getBillingCycleCount() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final ProductDetails.PricingPhase getIntroductoryPricingPhase(ProductDetails productDetails) {
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        if (!isSubscription(productDetails) || (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) == null) {
            return null;
        }
        Iterator<ProductDetails.SubscriptionOfferDetails> it = subscriptionOfferDetails.iterator();
        while (it.hasNext()) {
            for (ProductDetails.PricingPhase pricingPhase : it.next().getPricingPhases().getPricingPhaseList()) {
                if (pricingPhase.getPriceAmountMicros() > 0 && pricingPhase.getRecurrenceMode() == 2 && pricingPhase.getBillingCycleCount() > 0) {
                    return pricingPhase;
                }
            }
        }
        return null;
    }

    public static final ProductPrice getIntroductoryPrice(ProductDetails productDetails) {
        ProductDetails.PricingPhase introductoryPricingPhase;
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        if (!isSubscription(productDetails) || (introductoryPricingPhase = getIntroductoryPricingPhase(productDetails)) == null) {
            return null;
        }
        float priceAmountMicros = ((float) introductoryPricingPhase.getPriceAmountMicros()) / 1000000.0f;
        String priceCurrencyCode = introductoryPricingPhase.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "getPriceCurrencyCode(...)");
        return new ProductPrice(priceAmountMicros, priceCurrencyCode, productDetails);
    }

    public static final String getIntroductoryCurrency(ProductDetails productDetails) {
        ProductDetails.PricingPhase introductoryPricingPhase;
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        if (!isSubscription(productDetails) || (introductoryPricingPhase = getIntroductoryPricingPhase(productDetails)) == null) {
            return "";
        }
        String priceCurrencyCode = introductoryPricingPhase.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "getPriceCurrencyCode(...)");
        return priceCurrencyCode;
    }

    public static final int getIntroductoryPriceCycle(ProductDetails productDetails) {
        ProductDetails.PricingPhase introductoryPricingPhase;
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        if (isSubscription(productDetails) && (introductoryPricingPhase = getIntroductoryPricingPhase(productDetails)) != null) {
            return introductoryPricingPhase.getBillingCycleCount();
        }
        return 0;
    }
}
