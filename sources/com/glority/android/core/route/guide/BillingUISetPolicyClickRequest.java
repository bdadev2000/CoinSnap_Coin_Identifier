package com.glority.android.core.route.guide;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingUISetPolicyClickRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/glority/android/core/route/guide/BillingUISetPolicyClickRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "policyTv", "Landroid/widget/TextView;", TtmlNode.TAG_STYLE, "", "(Landroidx/fragment/app/FragmentActivity;Landroid/widget/TextView;I)V", "(Landroidx/fragment/app/FragmentActivity;Landroid/widget/TextView;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "setActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "getPolicyTv", "()Landroid/widget/TextView;", "setPolicyTv", "(Landroid/widget/TextView;)V", "getStyle", "()I", "setStyle", "(I)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class BillingUISetPolicyClickRequest extends RouteRequest<Boolean> {
    public FragmentActivity activity;
    public TextView policyTv;
    private int style;

    public final FragmentActivity getActivity() {
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activity");
        return null;
    }

    public final void setActivity(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.activity = fragmentActivity;
    }

    public final TextView getPolicyTv() {
        TextView textView = this.policyTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("policyTv");
        return null;
    }

    public final void setPolicyTv(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.policyTv = textView;
    }

    public final int getStyle() {
        return this.style;
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingUISetPolicyClickRequest(FragmentActivity activity, TextView policyTv, int i) {
        super(UrlGuide.INSTANCE.getURL_BILLING_SET_POLICY_CLICK(), activity, null, 4, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(policyTv, "policyTv");
        setActivity(activity);
        setPolicyTv(policyTv);
        this.style = i;
    }

    public /* synthetic */ BillingUISetPolicyClickRequest(FragmentActivity fragmentActivity, TextView textView, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, textView, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingUISetPolicyClickRequest(FragmentActivity activity, TextView policyTv) {
        super(UrlGuide.INSTANCE.getURL_BILLING_SET_POLICY_CLICK(), activity, null, 4, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(policyTv, "policyTv");
        setActivity(activity);
        setPolicyTv(policyTv);
    }
}
