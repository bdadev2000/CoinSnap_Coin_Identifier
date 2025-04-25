package com.glority.widget.purchase.purchase;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.glority.android.core.app.AppContext;
import com.glority.android.uimaker.parameter.ClickEnum;
import com.glority.android.uimaker.parameter.ResourceConverter;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView9Parameter;
import com.glority.android.xx.constants.Args;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.R;
import com.glority.widget.databinding.GlPurchaseLayout9Binding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GlPurchaseView9.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0016J$\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u00162\b\u0010&\u001a\u0004\u0018\u00010\u0016H\u0016J\u001c\u0010'\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00162\b\u0010%\u001a\u0004\u0018\u00010\u0016H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006("}, d2 = {"Lcom/glority/widget/purchase/purchase/GlPurchaseView9;", "Lcom/glority/widget/purchase/purchase/GlBasePurchaseView;", "Lcom/glority/android/uimaker/parameter/componentview/GlPurchaseView9Parameter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/glority/widget/databinding/GlPurchaseLayout9Binding;", "getBinding", "()Lcom/glority/widget/databinding/GlPurchaseLayout9Binding;", "uiMakerOnClickListener", "Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "getUiMakerOnClickListener", "()Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "setUiMakerOnClickListener", "(Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;)V", "getTextColorSpan", "Landroid/text/SpannableStringBuilder;", "text", "key", "", "colorParameter", "Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "getViewContext", "initClick", "", "parseParameter", "loadLocalResource", "", "resourceConverter", "Lcom/glority/android/uimaker/parameter/ResourceConverter;", "parameter", "setPrice", "purchaseType", "Lcom/glority/widget/purchase/purchase/PurchaseType;", "price", "currencyCode", "textBold", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlPurchaseView9 extends GlBasePurchaseView<GlPurchaseView9Parameter> {
    private final GlPurchaseLayout9Binding binding;
    private UiMakerOnClickListener uiMakerOnClickListener;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlPurchaseView9(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.purchase.purchase.GlPurchaseView9.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlPurchaseView9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        GlPurchaseLayout9Binding inflate = GlPurchaseLayout9Binding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "GlPurchaseLayout9Binding…rom(context), this, true)");
        this.binding = inflate;
        initClick();
    }

    public final GlPurchaseLayout9Binding getBinding() {
        return this.binding;
    }

    @Override // com.glority.widget.purchase.purchase.GlBasePurchaseView
    public void setPrice(PurchaseType purchaseType, String price, String currencyCode) {
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        if (StringsKt.contains((CharSequence) purchaseType.name(), (CharSequence) Args.year, true)) {
            String string = getResources().getString(R.string.base_widget_text_just_s_year, Intrinsics.stringPlus(currencyCode, price));
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…xt_just_s_year,realPrice)");
            SpannableStringBuilder textBold = textBold(string, price);
            TextView textView = this.binding.tryTv;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tryTv");
            textView.setText(textBold);
        }
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
    public Context getViewContext() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return context;
    }

    @Override // com.glority.widget.purchase.purchase.GlBasePurchaseView, com.glority.android.uimaker.parameter.IUIMakerView
    public void parseParameter(boolean loadLocalResource, ResourceConverter resourceConverter, GlPurchaseView9Parameter parameter) {
        Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        setParameter(parameter);
        this.binding.tryTv.setTextColor(getColor(parameter.getPriceColor()));
        this.binding.continueTv.setTextColor(getColor(parameter.getContinueColor()));
        setDrawable(loadLocalResource, parameter.getContinueBackground(), resourceConverter, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView9$parseParameter$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
                invoke2(drawable);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Drawable drawable) {
                TextView textView = GlPurchaseView9.this.getBinding().continueTv;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.continueTv");
                textView.setBackground(drawable);
            }
        });
    }

    private final SpannableStringBuilder textBold(String text, String price) {
        String str;
        String str2 = text;
        if (str2 == null || str2.length() == 0 || (str = price) == null || str.length() == 0 || !StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) {
            return new SpannableStringBuilder("");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, price, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new StyleSpan(1), indexOf$default, price.length() + indexOf$default, 33);
        return spannableStringBuilder;
    }

    private final SpannableStringBuilder getTextColorSpan(SpannableStringBuilder text, String key, ColorParameter colorParameter) {
        if (colorParameter != null) {
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getColor(colorParameter));
                int indexOf$default = StringsKt.indexOf$default((CharSequence) text, key, 0, false, 6, (Object) null);
                text.setSpan(foregroundColorSpan, indexOf$default, key.length() + indexOf$default, 17);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
        return text;
    }

    @Override // com.glority.widget.purchase.purchase.GlBasePurchaseView
    public void initClick() {
        this.binding.continueTv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView9$initClick$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UiMakerOnClickListener uiMakerOnClickListener = GlPurchaseView9.this.getUiMakerOnClickListener();
                if (uiMakerOnClickListener != null) {
                    uiMakerOnClickListener.onClick(ClickEnum.buyYearly);
                }
            }
        });
    }
}
