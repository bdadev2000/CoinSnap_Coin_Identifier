package com.glority.widget.purchase.purchase;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.glority.android.uimaker.parameter.ClickEnum;
import com.glority.android.uimaker.parameter.ResourceConverter;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView11Parameter;
import com.glority.android.xx.constants.Args;
import com.glority.widget.GlTextView;
import com.glority.widget.R;
import com.glority.widget.databinding.GlPurchaseLayout11Binding;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GlPurchaseView11.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0016J$\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010%\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001eH\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lcom/glority/widget/purchase/purchase/GlPurchaseView11;", "Lcom/glority/widget/purchase/purchase/GlBasePurchaseView;", "Lcom/glority/android/uimaker/parameter/componentview/GlPurchaseView11Parameter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/glority/widget/databinding/GlPurchaseLayout11Binding;", "getBinding", "()Lcom/glority/widget/databinding/GlPurchaseLayout11Binding;", "selectedSKU", "Lcom/glority/android/uimaker/parameter/ClickEnum;", "uiMakerOnClickListener", "Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "getUiMakerOnClickListener", "()Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "setUiMakerOnClickListener", "(Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;)V", "getTextBoldSpan", "Landroid/text/SpannableStringBuilder;", TtmlNode.TAG_SPAN, "price", "", "getViewContext", "initClick", "", "parseParameter", "loadLocalResource", "", "resourceConverter", "Lcom/glority/android/uimaker/parameter/ResourceConverter;", "parameter", "setPrice", "purchaseType", "Lcom/glority/widget/purchase/purchase/PurchaseType;", "currencyCode", "skuSelected", "isYear", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlPurchaseView11 extends GlBasePurchaseView<GlPurchaseView11Parameter> {
    private final GlPurchaseLayout11Binding binding;
    private ClickEnum selectedSKU;
    private UiMakerOnClickListener uiMakerOnClickListener;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlPurchaseView11(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.purchase.purchase.GlPurchaseView11.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlPurchaseView11(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.selectedSKU = ClickEnum.buyYearly;
        GlPurchaseLayout11Binding inflate = GlPurchaseLayout11Binding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "GlPurchaseLayout11Bindin…rom(context), this, true)");
        this.binding = inflate;
        initClick();
    }

    public final GlPurchaseLayout11Binding getBinding() {
        return this.binding;
    }

    @Override // com.glority.widget.purchase.purchase.GlBasePurchaseView
    public void setPrice(PurchaseType purchaseType, String price, String currencyCode) {
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        String stringPlus = Intrinsics.stringPlus(currencyCode, price);
        if (StringsKt.contains((CharSequence) purchaseType.name(), (CharSequence) Args.year, true)) {
            SpannableStringBuilder textBoldSpan = getTextBoldSpan(new SpannableStringBuilder(getResources().getString(R.string.base_widget_text_try_7_then_s_year, stringPlus)), stringPlus);
            GlTextView glTextView = this.binding.tvYearPrice;
            Intrinsics.checkNotNullExpressionValue(glTextView, "binding.tvYearPrice");
            glTextView.setText(textBoldSpan);
            return;
        }
        if (purchaseType == PurchaseType.WEEKLY) {
            SpannableStringBuilder textBoldSpan2 = getTextBoldSpan(new SpannableStringBuilder("No free trial, " + stringPlus + "/week"), stringPlus);
            GlTextView glTextView2 = this.binding.tvWeeklyPrice;
            Intrinsics.checkNotNullExpressionValue(glTextView2, "binding.tvWeeklyPrice");
            glTextView2.setText(textBoldSpan2);
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
    public void parseParameter(boolean loadLocalResource, ResourceConverter resourceConverter, GlPurchaseView11Parameter parameter) {
        Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        super.parseParameter(loadLocalResource, resourceConverter, (ResourceConverter) parameter);
        skuSelected(true);
        setDrawable(loadLocalResource, parameter.getContinueBackground(), resourceConverter, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView11$parseParameter$1
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
                LinearLayout linearLayout = GlPurchaseView11.this.getBinding().llContinue;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llContinue");
                linearLayout.setBackground(drawable);
            }
        });
        this.binding.containerV.setTextColor(getColor(parameter.getContinueColor()));
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
        this.binding.llYearly.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView11$initClick$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GlPurchaseView11.this.selectedSKU = ClickEnum.buyYearly;
                GlPurchaseView11.this.skuSelected(true);
                UiMakerOnClickListener uiMakerOnClickListener = GlPurchaseView11.this.getUiMakerOnClickListener();
                if (uiMakerOnClickListener != null) {
                    uiMakerOnClickListener.onClick(ClickEnum.buyYearly);
                }
            }
        });
        this.binding.llWeekly.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView11$initClick$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GlPurchaseView11.this.selectedSKU = ClickEnum.buyWeakly;
                GlPurchaseView11.this.skuSelected(false);
                UiMakerOnClickListener uiMakerOnClickListener = GlPurchaseView11.this.getUiMakerOnClickListener();
                if (uiMakerOnClickListener != null) {
                    uiMakerOnClickListener.onClick(ClickEnum.buyWeakly);
                }
            }
        });
        this.binding.llContinue.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView11$initClick$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClickEnum clickEnum;
                UiMakerOnClickListener uiMakerOnClickListener = GlPurchaseView11.this.getUiMakerOnClickListener();
                if (uiMakerOnClickListener != null) {
                    clickEnum = GlPurchaseView11.this.selectedSKU;
                    uiMakerOnClickListener.onClick(clickEnum);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void skuSelected(boolean isYear) {
        if (isYear) {
            GlPurchaseView11Parameter parameter = getParameter();
            this.binding.tvYearPrice.setTextColor(getColor(parameter != null ? parameter.getYearSelectedColor() : null));
            GlPurchaseView11Parameter parameter2 = getParameter();
            this.binding.tvWeeklyPrice.setTextColor(getColor(parameter2 != null ? parameter2.getWeeklyUnselectedColor() : null));
            ResourceConverter resourceConverter = getResourceConverter();
            if (resourceConverter != null) {
                boolean loadLocalResource = getLoadLocalResource();
                GlPurchaseView11Parameter parameter3 = getParameter();
                setDrawable(loadLocalResource, parameter3 != null ? parameter3.getYearSelectedBg() : null, resourceConverter, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView11$skuSelected$$inlined$let$lambda$1
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
                        LinearLayout linearLayout = GlPurchaseView11.this.getBinding().llYearly;
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llYearly");
                        linearLayout.setBackground(drawable);
                    }
                });
                boolean loadLocalResource2 = getLoadLocalResource();
                GlPurchaseView11Parameter parameter4 = getParameter();
                setDrawable(loadLocalResource2, parameter4 != null ? parameter4.getWeeklyUnselectedBg() : null, resourceConverter, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView11$skuSelected$$inlined$let$lambda$2
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
                        LinearLayout linearLayout = GlPurchaseView11.this.getBinding().llWeekly;
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llWeekly");
                        linearLayout.setBackground(drawable);
                    }
                });
                return;
            }
            return;
        }
        GlPurchaseView11Parameter parameter5 = getParameter();
        this.binding.tvYearPrice.setTextColor(getColor(parameter5 != null ? parameter5.getYearUnselectedColor() : null));
        GlPurchaseView11Parameter parameter6 = getParameter();
        this.binding.tvWeeklyPrice.setTextColor(getColor(parameter6 != null ? parameter6.getWeeklySelectedColor() : null));
        ResourceConverter resourceConverter2 = getResourceConverter();
        if (resourceConverter2 != null) {
            boolean loadLocalResource3 = getLoadLocalResource();
            GlPurchaseView11Parameter parameter7 = getParameter();
            setDrawable(loadLocalResource3, parameter7 != null ? parameter7.getYearUnselectedBg() : null, resourceConverter2, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView11$skuSelected$$inlined$let$lambda$3
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
                    LinearLayout linearLayout = GlPurchaseView11.this.getBinding().llYearly;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llYearly");
                    linearLayout.setBackground(drawable);
                }
            });
            boolean loadLocalResource4 = getLoadLocalResource();
            GlPurchaseView11Parameter parameter8 = getParameter();
            setDrawable(loadLocalResource4, parameter8 != null ? parameter8.getWeeklySelectedBg() : null, resourceConverter2, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView11$skuSelected$$inlined$let$lambda$4
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
                    LinearLayout linearLayout = GlPurchaseView11.this.getBinding().llWeekly;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llWeekly");
                    linearLayout.setBackground(drawable);
                }
            });
        }
    }
}
