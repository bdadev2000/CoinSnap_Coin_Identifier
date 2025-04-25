package com.glority.android.uimaker.parameter.componentview;

import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.attribute.ImageFile;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: GlPurchaseView1Parameter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020=0AH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001c\u0010'\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001c\u0010-\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR\u001c\u00100\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR\u001c\u00103\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR\u001c\u00106\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014R\u001c\u00109\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010\u0014R\u0014\u0010<\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/glority/android/uimaker/parameter/componentview/GlPurchaseView1Parameter;", "Lcom/glority/android/uimaker/parameter/componentview/ComponentViewParameter;", "()V", "by7DayTrial", "", "getBy7DayTrial", "()Z", "setBy7DayTrial", "(Z)V", "continueColorParameter", "Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "getContinueColorParameter", "()Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "setContinueColorParameter", "(Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;)V", "continueSelectedBackground", "Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "getContinueSelectedBackground", "()Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "setContinueSelectedBackground", "(Lcom/glority/android/uimaker/parameter/attribute/ImageFile;)V", "continueUnselectedBackground", "getContinueUnselectedBackground", "setContinueUnselectedBackground", "mainBilledColorParameter", "getMainBilledColorParameter", "setMainBilledColorParameter", "mainPriceColorParameter", "getMainPriceColorParameter", "setMainPriceColorParameter", "mainSkuSelectedBackground", "getMainSkuSelectedBackground", "setMainSkuSelectedBackground", "mainSkuSelectedColorParameter", "getMainSkuSelectedColorParameter", "setMainSkuSelectedColorParameter", "mainSkuUnselectedBackground", "getMainSkuUnselectedBackground", "setMainSkuUnselectedBackground", "mainSkuUnselectedColorParameter", "getMainSkuUnselectedColorParameter", "setMainSkuUnselectedColorParameter", "mostPopularColorParameter", "getMostPopularColorParameter", "setMostPopularColorParameter", "otherBilledColorParameter", "getOtherBilledColorParameter", "setOtherBilledColorParameter", "otherPriceColorParameter", "getOtherPriceColorParameter", "setOtherPriceColorParameter", "otherSkuColorParameter", "getOtherSkuColorParameter", "setOtherSkuColorParameter", "otherSkuSelectedBackground", "getOtherSkuSelectedBackground", "setOtherSkuSelectedBackground", "otherSkuUnselectedBackground", "getOtherSkuUnselectedBackground", "setOtherSkuUnselectedBackground", "viewName", "", "getViewName", "()Ljava/lang/String;", "multiStateName", "", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class GlPurchaseView1Parameter extends ComponentViewParameter {
    private boolean by7DayTrial;
    private ColorParameter continueColorParameter;
    private ImageFile continueSelectedBackground;
    private ImageFile continueUnselectedBackground;
    private ColorParameter mainBilledColorParameter;
    private ColorParameter mainPriceColorParameter;
    private ImageFile mainSkuSelectedBackground;
    private ColorParameter mainSkuSelectedColorParameter;
    private ImageFile mainSkuUnselectedBackground;
    private ColorParameter mainSkuUnselectedColorParameter;
    private ColorParameter mostPopularColorParameter;
    private ColorParameter otherBilledColorParameter;
    private ColorParameter otherPriceColorParameter;
    private ColorParameter otherSkuColorParameter;
    private ImageFile otherSkuSelectedBackground;
    private ImageFile otherSkuUnselectedBackground;

    public final ImageFile getMainSkuSelectedBackground() {
        return this.mainSkuSelectedBackground;
    }

    public final void setMainSkuSelectedBackground(ImageFile imageFile) {
        this.mainSkuSelectedBackground = imageFile;
    }

    public final ImageFile getMainSkuUnselectedBackground() {
        return this.mainSkuUnselectedBackground;
    }

    public final void setMainSkuUnselectedBackground(ImageFile imageFile) {
        this.mainSkuUnselectedBackground = imageFile;
    }

    public final ImageFile getOtherSkuSelectedBackground() {
        return this.otherSkuSelectedBackground;
    }

    public final void setOtherSkuSelectedBackground(ImageFile imageFile) {
        this.otherSkuSelectedBackground = imageFile;
    }

    public final ImageFile getOtherSkuUnselectedBackground() {
        return this.otherSkuUnselectedBackground;
    }

    public final void setOtherSkuUnselectedBackground(ImageFile imageFile) {
        this.otherSkuUnselectedBackground = imageFile;
    }

    public final ImageFile getContinueUnselectedBackground() {
        return this.continueUnselectedBackground;
    }

    public final void setContinueUnselectedBackground(ImageFile imageFile) {
        this.continueUnselectedBackground = imageFile;
    }

    public final ImageFile getContinueSelectedBackground() {
        return this.continueSelectedBackground;
    }

    public final void setContinueSelectedBackground(ImageFile imageFile) {
        this.continueSelectedBackground = imageFile;
    }

    public final ColorParameter getMostPopularColorParameter() {
        return this.mostPopularColorParameter;
    }

    public final void setMostPopularColorParameter(ColorParameter colorParameter) {
        this.mostPopularColorParameter = colorParameter;
    }

    public final ColorParameter getOtherPriceColorParameter() {
        return this.otherPriceColorParameter;
    }

    public final void setOtherPriceColorParameter(ColorParameter colorParameter) {
        this.otherPriceColorParameter = colorParameter;
    }

    public final ColorParameter getMainPriceColorParameter() {
        return this.mainPriceColorParameter;
    }

    public final void setMainPriceColorParameter(ColorParameter colorParameter) {
        this.mainPriceColorParameter = colorParameter;
    }

    public final ColorParameter getOtherBilledColorParameter() {
        return this.otherBilledColorParameter;
    }

    public final void setOtherBilledColorParameter(ColorParameter colorParameter) {
        this.otherBilledColorParameter = colorParameter;
    }

    public final ColorParameter getMainBilledColorParameter() {
        return this.mainBilledColorParameter;
    }

    public final void setMainBilledColorParameter(ColorParameter colorParameter) {
        this.mainBilledColorParameter = colorParameter;
    }

    public final ColorParameter getOtherSkuColorParameter() {
        return this.otherSkuColorParameter;
    }

    public final void setOtherSkuColorParameter(ColorParameter colorParameter) {
        this.otherSkuColorParameter = colorParameter;
    }

    public final ColorParameter getMainSkuUnselectedColorParameter() {
        return this.mainSkuUnselectedColorParameter;
    }

    public final void setMainSkuUnselectedColorParameter(ColorParameter colorParameter) {
        this.mainSkuUnselectedColorParameter = colorParameter;
    }

    public final ColorParameter getMainSkuSelectedColorParameter() {
        return this.mainSkuSelectedColorParameter;
    }

    public final void setMainSkuSelectedColorParameter(ColorParameter colorParameter) {
        this.mainSkuSelectedColorParameter = colorParameter;
    }

    public final ColorParameter getContinueColorParameter() {
        return this.continueColorParameter;
    }

    public final void setContinueColorParameter(ColorParameter colorParameter) {
        this.continueColorParameter = colorParameter;
    }

    public final boolean getBy7DayTrial() {
        return this.by7DayTrial;
    }

    public final void setBy7DayTrial(boolean z) {
        this.by7DayTrial = z;
    }

    @Override // com.glority.android.uimaker.parameter.baseview.ViewParameter, com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter
    public List<String> multiStateName() {
        return CollectionsKt.mutableListOf("GlPurchaseView1_main_selected", "GlPurchaseView1_other_selected");
    }

    @Override // com.glority.android.uimaker.parameter.baseview.ViewParameter, com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter
    public String getViewName() {
        return "GlPurchaseView1";
    }
}
