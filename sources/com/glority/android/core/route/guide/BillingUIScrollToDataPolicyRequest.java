package com.glority.android.core.route.guide;

import android.content.Context;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingUIScrollToDataPolicyRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/glority/android/core/route/guide/BillingUIScrollToDataPolicyRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "sv_top", "Landroid/widget/ScrollView;", "tv_data_policy", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "(Landroid/widget/ScrollView;Landroid/widget/TextView;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getSv_top", "()Landroid/widget/ScrollView;", "setSv_top", "(Landroid/widget/ScrollView;)V", "getTv_data_policy", "()Landroid/widget/TextView;", "setTv_data_policy", "(Landroid/widget/TextView;)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class BillingUIScrollToDataPolicyRequest extends RouteRequest<Boolean> {
    private final Context context;
    private ScrollView sv_top;
    private TextView tv_data_policy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingUIScrollToDataPolicyRequest(ScrollView sv_top, TextView tv_data_policy, Context context) {
        super(UrlGuide.INSTANCE.getURL_BILLING_SCROLL_TO_DATA_POLICY(), context, null, 4, null);
        Intrinsics.checkNotNullParameter(sv_top, "sv_top");
        Intrinsics.checkNotNullParameter(tv_data_policy, "tv_data_policy");
        this.sv_top = sv_top;
        this.tv_data_policy = tv_data_policy;
        this.context = context;
    }

    public /* synthetic */ BillingUIScrollToDataPolicyRequest(ScrollView scrollView, TextView textView, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(scrollView, textView, (i & 4) != 0 ? null : context);
    }

    public final Context getContext() {
        return this.context;
    }

    public final ScrollView getSv_top() {
        return this.sv_top;
    }

    public final TextView getTv_data_policy() {
        return this.tv_data_policy;
    }

    public final void setSv_top(ScrollView scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "<set-?>");
        this.sv_top = scrollView;
    }

    public final void setTv_data_policy(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tv_data_policy = textView;
    }
}
