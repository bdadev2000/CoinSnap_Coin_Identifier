package com.glority.widget.purchase.policy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.glority.android.uimaker.parameter.ResourceConverter;
import com.glority.android.uimaker.parameter.baseview.TextViewParameter;
import com.glority.android.uimaker.parameter.componentview.GlPolicyViewParameter;
import com.glority.widget.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlPolicyView3.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/glority/widget/purchase/policy/GlPolicyView3;", "Lcom/glority/widget/purchase/policy/GlBasePolicyView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "parseParameter", "", "loadLocalResource", "", "resourceConverter", "Lcom/glority/android/uimaker/parameter/ResourceConverter;", "parameter", "Lcom/glority/android/uimaker/parameter/componentview/GlPolicyViewParameter;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlPolicyView3 extends GlBasePolicyView {
    public GlPolicyView3(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlPolicyView3(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            r2 = 0
            r3 = r2
            android.util.AttributeSet r3 = (android.util.AttributeSet) r3
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.purchase.policy.GlPolicyView3.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlPolicyView3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R.layout.gl_policy_layout3, (ViewGroup) this, true);
    }

    @Override // com.glority.widget.purchase.policy.GlBasePolicyView, com.glority.android.uimaker.parameter.IUIMakerView
    public void parseParameter(boolean loadLocalResource, ResourceConverter resourceConverter, GlPolicyViewParameter parameter) {
        Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        TextViewParameter desc = parameter.getDesc();
        if (desc != null) {
            desc.setTextResId("bui_text_payment_will_be_charged");
        }
        TextViewParameter title = parameter.getTitle();
        if (title != null) {
            title.setText(getContext().getString(R.string.base_widget_text_recurbilling) + getContext().getString(R.string.base_widget_text_cancel_any_time_in_google_play));
        }
        TextViewParameter title2 = parameter.getTitle();
        if (title2 != null) {
            title2.setWidth(-1);
        }
        super.parseParameter(loadLocalResource, resourceConverter, parameter);
        getTitleView().setGravity(17);
    }
}
