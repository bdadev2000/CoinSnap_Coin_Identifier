package com.glority.widget.purchase.purchase;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.uimaker.parameter.ClickEnum;
import com.glority.android.uimaker.parameter.ResourceConverter;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView4Parameter;
import com.glority.android.xx.constants.Args;
import com.glority.widget.R;
import com.glority.widget.databinding.GlPurchaseLayout4Binding;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GlPurchaseView4.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016J$\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010#\u001a\u0004\u0018\u00010\u0016H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006$"}, d2 = {"Lcom/glority/widget/purchase/purchase/GlPurchaseView4;", "Lcom/glority/widget/purchase/purchase/GlBasePurchaseView;", "Lcom/glority/android/uimaker/parameter/componentview/GlPurchaseView4Parameter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/glority/widget/databinding/GlPurchaseLayout4Binding;", "getBinding", "()Lcom/glority/widget/databinding/GlPurchaseLayout4Binding;", "uiMakerOnClickListener", "Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "getUiMakerOnClickListener", "()Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "setUiMakerOnClickListener", "(Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;)V", "getTextBoldSpan", "Landroid/text/SpannableStringBuilder;", TtmlNode.TAG_SPAN, "price", "", "getViewContext", "initClick", "", "parseParameter", "loadLocalResource", "", "resourceConverter", "Lcom/glority/android/uimaker/parameter/ResourceConverter;", "parameter", "setPrice", "purchaseType", "Lcom/glority/widget/purchase/purchase/PurchaseType;", "currencyCode", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlPurchaseView4 extends GlBasePurchaseView<GlPurchaseView4Parameter> {
    private final GlPurchaseLayout4Binding binding;
    private UiMakerOnClickListener uiMakerOnClickListener;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlPurchaseView4(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.purchase.purchase.GlPurchaseView4.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlPurchaseView4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        GlPurchaseLayout4Binding inflate = GlPurchaseLayout4Binding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "GlPurchaseLayout4Binding…rom(context), this, true)");
        this.binding = inflate;
        initClick();
    }

    public final GlPurchaseLayout4Binding getBinding() {
        return this.binding;
    }

    @Override // com.glority.widget.purchase.purchase.GlBasePurchaseView
    public void setPrice(PurchaseType purchaseType, String price, String currencyCode) {
        String string;
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        String stringPlus = Intrinsics.stringPlus(currencyCode, price);
        if (StringsKt.contains((CharSequence) purchaseType.name(), (CharSequence) Args.year, true)) {
            GlPurchaseView4Parameter parameter = getParameter();
            if (parameter != null && parameter.getInfoType() == 1) {
                string = getResources().getString(R.string.base_widget_text_just_s_year, stringPlus);
            } else {
                GlPurchaseView4Parameter parameter2 = getParameter();
                if (parameter2 != null && parameter2.getInfoType() == 2) {
                    string = getResources().getString(R.string.base_widget_text_7_days_free_then_s_year, stringPlus);
                } else {
                    GlPurchaseView4Parameter parameter3 = getParameter();
                    if (parameter3 != null && parameter3.getInfoType() == 3) {
                        String string2 = getResources().getString(R.string.base_widget_text_7_days_free_then_s_year, stringPlus);
                        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.st…ee_then_s_year,realPrice)");
                        string = StringsKt.replace$default(string2, "7", ExifInterface.GPS_MEASUREMENT_3D, false, 4, (Object) null);
                    } else {
                        string = getResources().getString(R.string.base_widget_text_just_s_year, stringPlus);
                        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…t_just_s_year, realPrice)");
                    }
                }
            }
            Intrinsics.checkNotNullExpressionValue(string, "if (parameter?.infoType … realPrice)\n            }");
            SpannableStringBuilder textBoldSpan = getTextBoldSpan(new SpannableStringBuilder(string), price);
            TextView textView = this.binding.tvPrice1;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvPrice1");
            textView.setText(textBoldSpan);
            return;
        }
        if (purchaseType == PurchaseType.WEEKLY) {
            TextView textView2 = this.binding.tvPrice3;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvPrice3");
            textView2.setText(stringPlus);
        } else if (purchaseType == PurchaseType.MONTHLY) {
            TextView textView3 = this.binding.tvPrice2;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvPrice2");
            textView3.setText(stringPlus);
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
    public void parseParameter(boolean loadLocalResource, ResourceConverter resourceConverter, GlPurchaseView4Parameter parameter) {
        Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        setParameter(parameter);
        this.binding.containerV.setTextColor(getColor(parameter.getContinueColor()));
        this.binding.tvPrice1.setTextColor(getColor(parameter.getJustColor()));
        int color = getColor(parameter.getWeeklyColor());
        this.binding.tvPrice3.setTextColor(color);
        this.binding.tvWeeklyPrice.setTextColor(color);
        int color2 = getColor(parameter.getMonthlyColor());
        this.binding.tvPrice2.setTextColor(color2);
        this.binding.tvMonthlyPrice.setTextColor(color2);
        setDrawable(loadLocalResource, parameter.getContinueBackground(), resourceConverter, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView4$parseParameter$5
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
                LinearLayout linearLayout = GlPurchaseView4.this.getBinding().llYearly;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llYearly");
                linearLayout.setBackground(drawable);
            }
        });
        setDrawable(loadLocalResource, parameter.getWeeklyBackground(), resourceConverter, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView4$parseParameter$6
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
                LinearLayout linearLayout = GlPurchaseView4.this.getBinding().llWeekly;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llWeekly");
                linearLayout.setBackground(drawable);
            }
        });
        setDrawable(loadLocalResource, parameter.getMonthlyBackground(), resourceConverter, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView4$parseParameter$7
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
                LinearLayout linearLayout = GlPurchaseView4.this.getBinding().llMonthly;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llMonthly");
                linearLayout.setBackground(drawable);
            }
        });
        if (parameter.getContinueType() == 2) {
            TextView textView = this.binding.containerV;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.containerV");
            textView.setText(getResources().getString(R.string.base_widget_text_try_it_free));
        } else {
            TextView textView2 = this.binding.containerV;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.containerV");
            textView2.setText(getResources().getString(R.string.base_widget_text_continue));
        }
    }

    private final SpannableStringBuilder getTextBoldSpan(SpannableStringBuilder span, String price) {
        String str = price;
        if (str != null && str.length() != 0) {
            SpannableStringBuilder spannableStringBuilder = span;
            if (StringsKt.contains$default((CharSequence) spannableStringBuilder, (CharSequence) str, false, 2, (Object) null)) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder, price, 0, false, 6, (Object) null);
                span.setSpan(new StyleSpan(1), indexOf$default, price.length() + indexOf$default, 17);
                return span;
            }
        }
        return new SpannableStringBuilder("");
    }

    @Override // com.glority.widget.purchase.purchase.GlBasePurchaseView
    public void initClick() {
        this.binding.llYearly.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView4$initClick$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UiMakerOnClickListener uiMakerOnClickListener = GlPurchaseView4.this.getUiMakerOnClickListener();
                if (uiMakerOnClickListener != null) {
                    uiMakerOnClickListener.onClick(ClickEnum.buyYearly);
                }
            }
        });
        this.binding.llWeekly.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView4$initClick$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UiMakerOnClickListener uiMakerOnClickListener = GlPurchaseView4.this.getUiMakerOnClickListener();
                if (uiMakerOnClickListener != null) {
                    uiMakerOnClickListener.onClick(ClickEnum.buyWeakly);
                }
            }
        });
        this.binding.llMonthly.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView4$initClick$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UiMakerOnClickListener uiMakerOnClickListener = GlPurchaseView4.this.getUiMakerOnClickListener();
                if (uiMakerOnClickListener != null) {
                    uiMakerOnClickListener.onClick(ClickEnum.buyMontly);
                }
            }
        });
    }
}
