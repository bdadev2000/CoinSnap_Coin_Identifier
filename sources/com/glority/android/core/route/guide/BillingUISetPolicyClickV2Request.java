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

/* compiled from: BillingUISetPolicyClickV2Request.kt */
@NotProguard
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/glority/android/core/route/guide/BillingUISetPolicyClickV2Request;", "Lcom/glority/android/core/route/RouteRequest;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "policyTv", "Landroid/widget/TextView;", TtmlNode.TAG_STYLE, "", "containTrial", "(Landroidx/fragment/app/FragmentActivity;Landroid/widget/TextView;IZ)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "setActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "getContainTrial", "()Z", "setContainTrial", "(Z)V", "getPolicyTv", "()Landroid/widget/TextView;", "setPolicyTv", "(Landroid/widget/TextView;)V", "getStyle", "()I", "setStyle", "(I)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class BillingUISetPolicyClickV2Request extends RouteRequest<Boolean> {
    private FragmentActivity activity;
    private boolean containTrial;
    private TextView policyTv;
    private int style;

    public /* synthetic */ BillingUISetPolicyClickV2Request(FragmentActivity fragmentActivity, TextView textView, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, textView, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? true : z);
    }

    public final FragmentActivity getActivity() {
        return this.activity;
    }

    public final boolean getContainTrial() {
        return this.containTrial;
    }

    public final TextView getPolicyTv() {
        return this.policyTv;
    }

    public final int getStyle() {
        return this.style;
    }

    public final void setActivity(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.activity = fragmentActivity;
    }

    public final void setContainTrial(boolean z) {
        this.containTrial = z;
    }

    public final void setPolicyTv(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.policyTv = textView;
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingUISetPolicyClickV2Request(FragmentActivity activity, TextView policyTv, int i, boolean z) {
        super(UrlGuide.INSTANCE.getURL_BILLING_SET_POLICY_CLICK_V2(), activity, null, 4, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(policyTv, "policyTv");
        this.activity = activity;
        this.policyTv = policyTv;
        this.style = i;
        this.containTrial = z;
    }
}
