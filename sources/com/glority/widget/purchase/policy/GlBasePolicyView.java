package com.glority.widget.purchase.policy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.glority.android.uimaker.parameter.IUIMakerView;
import com.glority.android.uimaker.parameter.ResourceConverter;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.attribute.ImageFile;
import com.glority.android.uimaker.parameter.baseview.TextViewParameter;
import com.glority.android.uimaker.parameter.componentview.GlPolicyViewParameter;
import com.glority.widget.GlTextView;
import com.glority.widget.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlBasePolicyView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/glority/widget/purchase/policy/GlBasePolicyView;", "Landroid/widget/FrameLayout;", "Lcom/glority/android/uimaker/parameter/IUIMakerView;", "Lcom/glority/android/uimaker/parameter/componentview/GlPolicyViewParameter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "uiMakerOnClickListener", "Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "getUiMakerOnClickListener", "()Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "setUiMakerOnClickListener", "(Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;)V", "getGlPolicyContentView", "Lcom/glority/widget/GlTextView;", "getGlTitleView", "getPolicyContentView", "Landroid/widget/TextView;", "getTitleView", "getUiMakerViewTag", "", "getViewContext", "parseParameter", "", "loadLocalResource", "", "resourceConverter", "Lcom/glority/android/uimaker/parameter/ResourceConverter;", "parameter", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public class GlBasePolicyView extends FrameLayout implements IUIMakerView<GlPolicyViewParameter> {
    private UiMakerOnClickListener uiMakerOnClickListener;

    public GlBasePolicyView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public int getColor(ColorParameter colorParameter) {
        return IUIMakerView.DefaultImpls.getColor(this, colorParameter);
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public void setDrawable(boolean z, ImageFile imageFile, ResourceConverter resourceConverter, Function1<? super Drawable, Unit> callback) {
        Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IUIMakerView.DefaultImpls.setDrawable(this, z, imageFile, resourceConverter, callback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlBasePolicyView(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.purchase.policy.GlBasePolicyView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlBasePolicyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final TextView getTitleView() {
        View findViewById = findViewById(R.id.title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.title_tv)");
        return (TextView) findViewById;
    }

    public final TextView getPolicyContentView() {
        View findViewById = findViewById(R.id.data_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.data_tv)");
        return (TextView) findViewById;
    }

    public final GlTextView getGlTitleView() {
        View findViewById = findViewById(R.id.title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.title_tv)");
        return (GlTextView) findViewById;
    }

    public final GlTextView getGlPolicyContentView() {
        View findViewById = findViewById(R.id.data_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.data_tv)");
        return (GlTextView) findViewById;
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public UiMakerOnClickListener getUiMakerOnClickListener() {
        return this.uiMakerOnClickListener;
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public void setUiMakerOnClickListener(UiMakerOnClickListener uiMakerOnClickListener) {
        this.uiMakerOnClickListener = uiMakerOnClickListener;
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public String getUiMakerViewTag() {
        return "GlBasePolicyView";
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public Context getViewContext() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return context;
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public void parseParameter(boolean loadLocalResource, ResourceConverter resourceConverter, GlPolicyViewParameter parameter) {
        Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        if (parameter.getTitle() == null && parameter.getDesc() != null) {
            getGlTitleView().setVisibility(8);
        }
        TextViewParameter title = parameter.getTitle();
        if (title != null) {
            getGlTitleView().parseParameter(loadLocalResource, resourceConverter, title);
        }
        TextViewParameter desc = parameter.getDesc();
        if (desc != null) {
            getGlPolicyContentView().parseParameter(loadLocalResource, resourceConverter, desc);
        }
        TextView policyContentView = getPolicyContentView();
        ViewGroup.LayoutParams layoutParams = policyContentView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            policyContentView.setLayoutParams(layoutParams);
            TextView titleView = getTitleView();
            ViewGroup.LayoutParams layoutParams2 = titleView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
                titleView.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
