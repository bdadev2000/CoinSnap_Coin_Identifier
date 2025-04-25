package com.glority.android.core.route.guide;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingSetPriceBoldRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/glority/android/core/route/guide/BillingSetPriceBoldRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "tvPrice", "Landroid/widget/TextView;", "currencyCode", "", "price", "(Landroidx/fragment/app/FragmentActivity;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "setActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "getCurrencyCode", "()Ljava/lang/String;", "setCurrencyCode", "(Ljava/lang/String;)V", "getPrice", "setPrice", "getTvPrice", "()Landroid/widget/TextView;", "setTvPrice", "(Landroid/widget/TextView;)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class BillingSetPriceBoldRequest extends RouteRequest<Boolean> {
    private FragmentActivity activity;
    private String currencyCode;
    private String price;
    private TextView tvPrice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingSetPriceBoldRequest(FragmentActivity activity, TextView tvPrice, String str, String str2) {
        super(UrlGuide.INSTANCE.getURL_BILLING_SET_PRICE_BOLD(), activity, null, 4, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tvPrice, "tvPrice");
        this.activity = activity;
        this.tvPrice = tvPrice;
        this.currencyCode = str;
        this.price = str2;
    }

    public final FragmentActivity getActivity() {
        return this.activity;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getPrice() {
        return this.price;
    }

    public final TextView getTvPrice() {
        return this.tvPrice;
    }

    public final void setActivity(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.activity = fragmentActivity;
    }

    public final void setCurrencyCode(String str) {
        this.currencyCode = str;
    }

    public final void setPrice(String str) {
        this.price = str;
    }

    public final void setTvPrice(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvPrice = textView;
    }
}
