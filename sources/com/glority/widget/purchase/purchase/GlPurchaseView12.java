package com.glority.widget.purchase.purchase;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.uimaker.parameter.ClickEnum;
import com.glority.android.uimaker.parameter.ResourceConverter;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.attribute.TextGravityParameter;
import com.glority.android.uimaker.parameter.baseview.TextViewParameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView12Parameter;
import com.glority.widget.GlTextView;
import com.glority.widget.R;
import com.glority.widget.databinding.GlPurchaseLayout12Binding;
import com.glority.widget.uitls.TextSizeUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GlPurchaseView12.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020\u0004H\u0016J\b\u0010@\u001a\u00020<H\u0016J\u0010\u0010A\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0002J \u0010B\u001a\u00020<2\u0006\u0010C\u001a\u00020>2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0002H\u0016J$\u0010G\u001a\u00020<2\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010L\u001a\u0004\u0018\u00010KH\u0017J+\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010K2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010P\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010QJ=\u0010R\u001a\u00020<2\u0006\u0010S\u001a\u00020T2\b\u0010O\u001a\u0004\u0018\u00010K2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010P\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010UJ\u0010\u0010V\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R(\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010 \u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R$\u0010#\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R$\u0010&\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R$\u0010)\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R$\u0010,\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010\u0010R\u001c\u0010/\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u0010\u0016R(\u00102\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R\u001c\u00105\u001a\u0004\u0018\u000106X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006W"}, d2 = {"Lcom/glority/widget/purchase/purchase/GlPurchaseView12;", "Lcom/glority/widget/purchase/purchase/GlBasePurchaseView;", "Lcom/glority/android/uimaker/parameter/componentview/GlPurchaseView12Parameter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/glority/widget/databinding/GlPurchaseLayout12Binding;", "value", "", "continueColor", "getContinueColor", "()I", "setContinueColor", "(I)V", "Landroid/graphics/drawable/Drawable;", "continueSelectedBackground", "getContinueSelectedBackground", "()Landroid/graphics/drawable/Drawable;", "setContinueSelectedBackground", "(Landroid/graphics/drawable/Drawable;)V", "continueUnselectedBackground", "getContinueUnselectedBackground", "setContinueUnselectedBackground", "mainPriceColor", "getMainPriceColor", "setMainPriceColor", "mainSkuSelectedBackground", "getMainSkuSelectedBackground", "setMainSkuSelectedBackground", "mainSkuUnselectedBackground", "getMainSkuUnselectedBackground", "setMainSkuUnselectedBackground", "mostPopularColor", "getMostPopularColor", "setMostPopularColor", "otherBilledColor", "getOtherBilledColor", "setOtherBilledColor", "otherPriceColor", "getOtherPriceColor", "setOtherPriceColor", "otherSkuColor", "getOtherSkuColor", "setOtherSkuColor", "otherSkuSelectedBackground", "getOtherSkuSelectedBackground", "setOtherSkuSelectedBackground", "otherSkuUnselectedBackground", "getOtherSkuUnselectedBackground", "setOtherSkuUnselectedBackground", "uiMakerOnClickListener", "Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "getUiMakerOnClickListener", "()Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "setUiMakerOnClickListener", "(Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;)V", "dt7Enable", "", "enable", "", "getViewContext", "initClick", "monthEnable", "parseParameter", "loadLocalResource", "resourceConverter", "Lcom/glority/android/uimaker/parameter/ResourceConverter;", "parameter", "setPrice", "purchaseType", "Lcom/glority/widget/purchase/purchase/PurchaseType;", "price", "", "currencyCode", "textBold", "Landroid/text/SpannableStringBuilder;", "text", "color", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Landroid/text/SpannableStringBuilder;", "textBold2", "textView", "Lcom/glority/widget/GlTextView;", "(Lcom/glority/widget/GlTextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "weekEnable", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlPurchaseView12 extends GlBasePurchaseView<GlPurchaseView12Parameter> {
    private final GlPurchaseLayout12Binding binding;
    private int continueColor;
    private Drawable continueSelectedBackground;
    private Drawable continueUnselectedBackground;
    private int mainPriceColor;
    private Drawable mainSkuSelectedBackground;
    private Drawable mainSkuUnselectedBackground;
    private int mostPopularColor;
    private int otherBilledColor;
    private int otherPriceColor;
    private int otherSkuColor;
    private Drawable otherSkuSelectedBackground;
    private Drawable otherSkuUnselectedBackground;
    private UiMakerOnClickListener uiMakerOnClickListener;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[PurchaseType.MONTHLY.ordinal()] = 1;
            iArr[PurchaseType.WEEKLY.ordinal()] = 2;
            iArr[PurchaseType.YEARLY_7DT.ordinal()] = 3;
            iArr[PurchaseType.YEARLY_3DT.ordinal()] = 4;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlPurchaseView12(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.purchase.purchase.GlPurchaseView12.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlPurchaseView12(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        GlPurchaseLayout12Binding inflate = GlPurchaseLayout12Binding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "GlPurchaseLayout12Bindin…rom(context), this, true)");
        this.binding = inflate;
        initClick();
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public UiMakerOnClickListener getUiMakerOnClickListener() {
        return this.uiMakerOnClickListener;
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public void setUiMakerOnClickListener(UiMakerOnClickListener uiMakerOnClickListener) {
        this.uiMakerOnClickListener = uiMakerOnClickListener;
    }

    public final Drawable getMainSkuSelectedBackground() {
        return this.mainSkuSelectedBackground;
    }

    public final void setMainSkuSelectedBackground(Drawable drawable) {
        this.mainSkuSelectedBackground = drawable;
        ConstraintLayout constraintLayout = this.binding.ll7DayFreeBg;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.ll7DayFreeBg");
        constraintLayout.setBackground(drawable);
    }

    public final Drawable getMainSkuUnselectedBackground() {
        return this.mainSkuUnselectedBackground;
    }

    public final void setMainSkuUnselectedBackground(Drawable drawable) {
        this.mainSkuUnselectedBackground = drawable;
    }

    public final Drawable getOtherSkuSelectedBackground() {
        return this.otherSkuSelectedBackground;
    }

    public final void setOtherSkuSelectedBackground(Drawable drawable) {
        this.otherSkuSelectedBackground = drawable;
    }

    public final Drawable getOtherSkuUnselectedBackground() {
        return this.otherSkuUnselectedBackground;
    }

    public final void setOtherSkuUnselectedBackground(Drawable drawable) {
        ConstraintLayout constraintLayout = this.binding.llWeeklyBg;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.llWeeklyBg");
        constraintLayout.setBackground(drawable);
        ConstraintLayout constraintLayout2 = this.binding.llMonthlyBg;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.llMonthlyBg");
        constraintLayout2.setBackground(drawable);
        this.otherSkuUnselectedBackground = drawable;
    }

    public final Drawable getContinueSelectedBackground() {
        return this.continueSelectedBackground;
    }

    public final void setContinueSelectedBackground(Drawable drawable) {
        this.continueSelectedBackground = drawable;
        TextView textView = this.binding.tvContinue;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvContinue");
        textView.setBackground(drawable);
    }

    public final Drawable getContinueUnselectedBackground() {
        return this.continueUnselectedBackground;
    }

    public final void setContinueUnselectedBackground(Drawable drawable) {
        this.continueUnselectedBackground = drawable;
    }

    public final int getOtherPriceColor() {
        return this.otherPriceColor;
    }

    public final void setOtherPriceColor(int i) {
        this.binding.tvMonthlyPrice.setTextColor(i);
        this.binding.tvWeeklyPrice.setTextColor(i);
        this.otherPriceColor = i;
    }

    public final int getMainPriceColor() {
        return this.mainPriceColor;
    }

    public final void setMainPriceColor(int i) {
        this.binding.tvThenYearPrice.setTextColor(i);
        this.mainPriceColor = i;
    }

    public final int getOtherBilledColor() {
        return this.otherBilledColor;
    }

    public final void setOtherBilledColor(int i) {
        this.binding.billedMonthly.setTextColor(i);
        this.binding.billedWeek.setTextColor(i);
        this.otherBilledColor = i;
    }

    public final int getOtherSkuColor() {
        return this.otherSkuColor;
    }

    public final void setOtherSkuColor(int i) {
        this.otherSkuColor = i;
        this.binding.weeklyTitle.setTextColor(i);
        this.binding.monthlyTitle.setTextColor(i);
    }

    public final int getMostPopularColor() {
        return this.mostPopularColor;
    }

    public final void setMostPopularColor(int i) {
        this.mostPopularColor = i;
        this.binding.tvSpecialOffer.setTextColor(i);
    }

    public final int getContinueColor() {
        return this.continueColor;
    }

    public final void setContinueColor(int i) {
        this.binding.tvContinue.setTextColor(i);
    }

    @Override // com.glority.widget.purchase.purchase.GlBasePurchaseView
    public void initClick() {
        this.binding.ll7DayFree.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView12$initClick$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                View.OnClickListener onClickListener = GlPurchaseView12.this.getClickListenerMap$mod_release().get(PurchaseType.YEARLY_7DT);
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                UiMakerOnClickListener uiMakerOnClickListener = GlPurchaseView12.this.getUiMakerOnClickListener();
                if (uiMakerOnClickListener != null) {
                    uiMakerOnClickListener.onClick(ClickEnum.buyYearly);
                }
                GlPurchaseView12.this.dt7Enable(true);
                GlPurchaseView12.this.weekEnable(false);
                GlPurchaseView12.this.monthEnable(false);
            }
        });
        this.binding.llMonthly.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView12$initClick$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                View.OnClickListener onClickListener = GlPurchaseView12.this.getClickListenerMap$mod_release().get(PurchaseType.MONTHLY);
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                UiMakerOnClickListener uiMakerOnClickListener = GlPurchaseView12.this.getUiMakerOnClickListener();
                if (uiMakerOnClickListener != null) {
                    uiMakerOnClickListener.onClick(ClickEnum.buyMontly);
                }
                GlPurchaseView12.this.dt7Enable(false);
                GlPurchaseView12.this.weekEnable(false);
                GlPurchaseView12.this.monthEnable(true);
            }
        });
        this.binding.llWeekly.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView12$initClick$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                View.OnClickListener onClickListener = GlPurchaseView12.this.getClickListenerMap$mod_release().get(PurchaseType.WEEKLY);
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                UiMakerOnClickListener uiMakerOnClickListener = GlPurchaseView12.this.getUiMakerOnClickListener();
                if (uiMakerOnClickListener != null) {
                    uiMakerOnClickListener.onClick(ClickEnum.buyWeakly);
                }
                GlPurchaseView12.this.dt7Enable(false);
                GlPurchaseView12.this.weekEnable(true);
                GlPurchaseView12.this.monthEnable(false);
            }
        });
    }

    @Override // com.glority.widget.purchase.purchase.GlBasePurchaseView
    public void setPrice(PurchaseType purchaseType, String price, String currencyCode) {
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        int i = WhenMappings.$EnumSwitchMapping$0[purchaseType.ordinal()];
        if (i == 1) {
            TextView textView = this.binding.tvMonthlyPrice;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvMonthlyPrice");
            textView.setText(textBold(currencyCode + price, price, Integer.valueOf(this.otherPriceColor)));
        } else if (i == 2) {
            TextView textView2 = this.binding.tvWeeklyPrice;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvWeeklyPrice");
            textView2.setText(textBold(currencyCode + price, price, Integer.valueOf(this.otherPriceColor)));
        } else if (i == 3 || i == 4) {
            GlTextView glTextView = this.binding.tvThenYearPrice;
            Intrinsics.checkNotNullExpressionValue(glTextView, "binding.tvThenYearPrice");
            textBold2(glTextView, getResources().getString(R.string.base_widget_text_just_s_year2, "\n" + currencyCode + price + '\n'), price, currencyCode, Integer.valueOf(this.mainPriceColor));
        }
    }

    private final SpannableStringBuilder textBold(String text, String price, Integer color) {
        String str;
        String str2 = text;
        if (str2 == null || str2.length() == 0 || (str = price) == null || str.length() == 0 || color == null || !StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) {
            return new SpannableStringBuilder("");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, price, 0, false, 6, (Object) null);
        int length = price.length() + indexOf$default;
        StyleSpan styleSpan = new StyleSpan(1);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color.intValue());
        spannableStringBuilder.setSpan(styleSpan, indexOf$default, length, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf$default, length, 33);
        return spannableStringBuilder;
    }

    private final void textBold2(GlTextView textView, String text, String price, String currencyCode, Integer color) {
        String str;
        ColorParameter colorParameter;
        ColorParameter colorParameter2;
        ColorParameter colorParameter3;
        String str2 = text;
        if (str2 == null || str2.length() == 0 || (str = price) == null || str.length() == 0 || color == null || !StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) {
            textView.setText(str2);
            return;
        }
        TextViewParameter textViewParameter = new TextViewParameter();
        textViewParameter.setLineHeightPercent(Float.valueOf(1.1f));
        textViewParameter.setTextAlignHorizontal(TextGravityParameter.INSTANCE.getCENTER());
        textViewParameter.setText(text);
        textViewParameter.setWidth(-2);
        textViewParameter.setHeight(-2);
        GlPurchaseView12Parameter parameter = getParameter();
        if (parameter == null || (colorParameter = parameter.getMainPriceColorParameter()) == null) {
            colorParameter = new ColorParameter(1.0f, 1.0f, 1.0f, 1.0f);
        }
        textViewParameter.setTextColorParameter(colorParameter);
        TextViewParameter textViewParameter2 = new TextViewParameter();
        GlPurchaseView12Parameter parameter2 = getParameter();
        if (parameter2 == null || (colorParameter2 = parameter2.getMainPriceColorParameter()) == null) {
            colorParameter2 = new ColorParameter(1.0f, 1.0f, 1.0f, 1.0f);
        }
        textViewParameter2.setTextColorParameter(colorParameter2);
        textViewParameter2.setFontSize(14);
        if (currencyCode == null) {
            currencyCode = "";
        }
        textViewParameter2.setText(currencyCode);
        TextViewParameter textViewParameter3 = new TextViewParameter();
        GlPurchaseView12Parameter parameter3 = getParameter();
        if (parameter3 == null || (colorParameter3 = parameter3.getMainPriceColorParameter()) == null) {
            colorParameter3 = new ColorParameter(1.0f, 1.0f, 1.0f, 1.0f);
        }
        textViewParameter3.setTextColorParameter(colorParameter3);
        textViewParameter3.setText(price);
        textViewParameter3.setFontSize(18);
        textViewParameter3.setFontFamily(TtmlNode.BOLD);
        textViewParameter.getChildTextViewParameter().add(textViewParameter2);
        textViewParameter.getChildTextViewParameter().add(textViewParameter3);
        ResourceConverter resourceConverter = getResourceConverter();
        if (resourceConverter != null) {
            textView.parseParameter(getLoadLocalResource(), resourceConverter, textViewParameter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dt7Enable(boolean enable) {
        if (enable) {
            ConstraintLayout constraintLayout = this.binding.ll7DayFreeBg;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.ll7DayFreeBg");
            constraintLayout.setBackground(this.mainSkuSelectedBackground);
            TextView textView = this.binding.tvContinue;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvContinue");
            textView.setBackground(this.continueSelectedBackground);
            return;
        }
        ConstraintLayout constraintLayout2 = this.binding.ll7DayFreeBg;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.ll7DayFreeBg");
        constraintLayout2.setBackground(this.mainSkuUnselectedBackground);
        TextView textView2 = this.binding.tvContinue;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvContinue");
        textView2.setBackground(this.continueUnselectedBackground);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void weekEnable(boolean enable) {
        if (enable) {
            ConstraintLayout constraintLayout = this.binding.llWeeklyBg;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.llWeeklyBg");
            constraintLayout.setBackground(this.otherSkuSelectedBackground);
        } else {
            ConstraintLayout constraintLayout2 = this.binding.llWeeklyBg;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.llWeeklyBg");
            constraintLayout2.setBackground(this.otherSkuUnselectedBackground);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void monthEnable(boolean enable) {
        if (enable) {
            ConstraintLayout constraintLayout = this.binding.llMonthlyBg;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.llMonthlyBg");
            constraintLayout.setBackground(this.otherSkuSelectedBackground);
        } else {
            ConstraintLayout constraintLayout2 = this.binding.llMonthlyBg;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.llMonthlyBg");
            constraintLayout2.setBackground(this.otherSkuUnselectedBackground);
        }
    }

    @Override // com.glority.widget.purchase.purchase.GlBasePurchaseView, com.glority.android.uimaker.parameter.IUIMakerView
    public void parseParameter(boolean loadLocalResource, ResourceConverter resourceConverter, GlPurchaseView12Parameter parameter) {
        Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        super.parseParameter(loadLocalResource, resourceConverter, (ResourceConverter) parameter);
        setOtherBilledColor(getColor(parameter.getOtherBilledColorParameter()));
        setOtherPriceColor(getColor(parameter.getOtherPriceColorParameter()));
        setMainPriceColor(getColor(parameter.getMainPriceColorParameter()));
        setMostPopularColor(getColor(parameter.getMostPopularColorParameter()));
        setOtherSkuColor(getColor(parameter.getOtherSkuColorParameter()));
        setContinueColor(getColor(parameter.getContinueColorParameter()));
        setDrawable(loadLocalResource, parameter.getMainSkuSelectedBackground(), resourceConverter, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView12$parseParameter$1
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
                GlPurchaseView12.this.setMainSkuSelectedBackground(drawable);
            }
        });
        setDrawable(loadLocalResource, parameter.getMainSkuUnselectedBackground(), resourceConverter, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView12$parseParameter$2
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
                GlPurchaseView12.this.setMainSkuUnselectedBackground(drawable);
            }
        });
        setDrawable(loadLocalResource, parameter.getOtherSkuSelectedBackground(), resourceConverter, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView12$parseParameter$3
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
                GlPurchaseView12.this.setOtherSkuSelectedBackground(drawable);
            }
        });
        setDrawable(loadLocalResource, parameter.getOtherSkuUnselectedBackground(), resourceConverter, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView12$parseParameter$4
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
                GlPurchaseView12.this.setOtherSkuUnselectedBackground(drawable);
            }
        });
        setDrawable(loadLocalResource, parameter.getContinueUnselectedBackground(), resourceConverter, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView12$parseParameter$5
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
                GlPurchaseView12.this.setContinueUnselectedBackground(drawable);
            }
        });
        setDrawable(loadLocalResource, parameter.getContinueSelectedBackground(), resourceConverter, new Function1<Drawable, Unit>() { // from class: com.glority.widget.purchase.purchase.GlPurchaseView12$parseParameter$6
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
                GlPurchaseView12.this.setContinueSelectedBackground(drawable);
            }
        });
        TextSizeUtils.INSTANCE.autoSizeAndUnify(CollectionsKt.listOf((Object[]) new GlTextView[]{this.binding.billedMonthly, this.binding.billedWeek}), 2, getResources().getDimension(R.dimen.x16));
        TextSizeUtils.INSTANCE.autoSizeAndUnify(CollectionsKt.listOf((Object[]) new GlTextView[]{this.binding.weeklyTitle, this.binding.monthlyTitle}), 1, getResources().getDimension(R.dimen.x16));
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public Context getViewContext() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return context;
    }
}
