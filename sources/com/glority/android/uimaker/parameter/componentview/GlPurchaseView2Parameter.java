package com.glority.android.uimaker.parameter.componentview;

import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.attribute.ImageFile;
import kotlin.Metadata;

/* compiled from: GlPurchaseView2Parameter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/glority/android/uimaker/parameter/componentview/GlPurchaseView2Parameter;", "Lcom/glority/android/uimaker/parameter/componentview/ComponentViewParameter;", "()V", "continueBackground", "Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "getContinueBackground", "()Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "setContinueBackground", "(Lcom/glority/android/uimaker/parameter/attribute/ImageFile;)V", "continueColor", "Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "getContinueColor", "()Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "setContinueColor", "(Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;)V", "dayColor", "getDayColor", "setDayColor", "infoColor", "getInfoColor", "setInfoColor", "priceColor", "getPriceColor", "setPriceColor", "tryFreeColor", "getTryFreeColor", "setTryFreeColor", "viewName", "", "getViewName", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class GlPurchaseView2Parameter extends ComponentViewParameter {
    private ImageFile continueBackground;
    private ColorParameter continueColor;
    private ColorParameter dayColor;
    private ColorParameter infoColor;
    private ColorParameter priceColor;
    private ColorParameter tryFreeColor;

    public final ColorParameter getDayColor() {
        return this.dayColor;
    }

    public final void setDayColor(ColorParameter colorParameter) {
        this.dayColor = colorParameter;
    }

    public final ColorParameter getPriceColor() {
        return this.priceColor;
    }

    public final void setPriceColor(ColorParameter colorParameter) {
        this.priceColor = colorParameter;
    }

    public final ColorParameter getTryFreeColor() {
        return this.tryFreeColor;
    }

    public final void setTryFreeColor(ColorParameter colorParameter) {
        this.tryFreeColor = colorParameter;
    }

    public final ColorParameter getInfoColor() {
        return this.infoColor;
    }

    public final void setInfoColor(ColorParameter colorParameter) {
        this.infoColor = colorParameter;
    }

    public final ColorParameter getContinueColor() {
        return this.continueColor;
    }

    public final void setContinueColor(ColorParameter colorParameter) {
        this.continueColor = colorParameter;
    }

    public final ImageFile getContinueBackground() {
        return this.continueBackground;
    }

    public final void setContinueBackground(ImageFile imageFile) {
        this.continueBackground = imageFile;
    }

    @Override // com.glority.android.uimaker.parameter.baseview.ViewParameter, com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter
    public String getViewName() {
        return "GlPurchaseView2";
    }
}
