package com.glority.billing.definition;

import com.android.billingclient.api.ProductDetails;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductPrice.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/glority/billing/definition/ProductPrice;", "", "price", "", FirebaseAnalytics.Param.CURRENCY, "", "productPrice", "Lcom/android/billingclient/api/ProductDetails;", "<init>", "(FLjava/lang/String;Lcom/android/billingclient/api/ProductDetails;)V", "getPrice", "()F", "getCurrency", "()Ljava/lang/String;", "getProductPrice", "()Lcom/android/billingclient/api/ProductDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class ProductPrice {
    private final String currency;
    private final float price;
    private final ProductDetails productPrice;

    /* renamed from: component1, reason: from getter */
    public final float getPrice() {
        return this.price;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component3, reason: from getter */
    public final ProductDetails getProductPrice() {
        return this.productPrice;
    }

    public final ProductPrice copy(float price, String currency, ProductDetails productPrice) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(productPrice, "productPrice");
        return new ProductPrice(price, currency, productPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductPrice)) {
            return false;
        }
        ProductPrice productPrice = (ProductPrice) other;
        return Float.compare(this.price, productPrice.price) == 0 && Intrinsics.areEqual(this.currency, productPrice.currency) && Intrinsics.areEqual(this.productPrice, productPrice.productPrice);
    }

    public int hashCode() {
        return (((Float.hashCode(this.price) * 31) + this.currency.hashCode()) * 31) + this.productPrice.hashCode();
    }

    public String toString() {
        return "ProductPrice(price=" + this.price + ", currency=" + this.currency + ", productPrice=" + this.productPrice + ")";
    }

    public ProductPrice(float f, String currency, ProductDetails productPrice) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(productPrice, "productPrice");
        this.price = f;
        this.currency = currency;
        this.productPrice = productPrice;
    }

    public static /* synthetic */ ProductPrice copy$default(ProductPrice productPrice, float f, String str, ProductDetails productDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            f = productPrice.price;
        }
        if ((i & 2) != 0) {
            str = productPrice.currency;
        }
        if ((i & 4) != 0) {
            productDetails = productPrice.productPrice;
        }
        return productPrice.copy(f, str, productDetails);
    }

    public final float getPrice() {
        return this.price;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final ProductDetails getProductPrice() {
        return this.productPrice;
    }
}
