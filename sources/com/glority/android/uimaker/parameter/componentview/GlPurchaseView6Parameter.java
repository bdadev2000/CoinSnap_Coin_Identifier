package com.glority.android.uimaker.parameter.componentview;

import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.attribute.ImageFile;
import com.glority.android.uimaker.parameter.baseview.TextViewParameter;
import kotlin.Metadata;

/* compiled from: GlPurchaseView6Parameter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u0014\u0010'\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001c\u0010.\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000e¨\u00062"}, d2 = {"Lcom/glority/android/uimaker/parameter/componentview/GlPurchaseView6Parameter;", "Lcom/glority/android/uimaker/parameter/componentview/ComponentViewParameter;", "()V", "continueBackground", "Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "getContinueBackground", "()Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "setContinueBackground", "(Lcom/glority/android/uimaker/parameter/attribute/ImageFile;)V", "continueColor", "Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "getContinueColor", "()Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "setContinueColor", "(Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;)V", "continueType", "", "getContinueType", "()I", "setContinueType", "(I)V", "infoTextViewParameter", "Lcom/glority/android/uimaker/parameter/baseview/TextViewParameter;", "getInfoTextViewParameter", "()Lcom/glority/android/uimaker/parameter/baseview/TextViewParameter;", "setInfoTextViewParameter", "(Lcom/glority/android/uimaker/parameter/baseview/TextViewParameter;)V", "infoType", "getInfoType", "setInfoType", "justColor", "getJustColor", "setJustColor", "monthlyBackground", "getMonthlyBackground", "setMonthlyBackground", "monthlyColor", "getMonthlyColor", "setMonthlyColor", "viewName", "", "getViewName", "()Ljava/lang/String;", "weeklyBackground", "getWeeklyBackground", "setWeeklyBackground", "weeklyColor", "getWeeklyColor", "setWeeklyColor", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class GlPurchaseView6Parameter extends ComponentViewParameter {
    public static final int TYPE_3_DAY_FREE = 3;
    public static final int TYPE_7_DAY_FREE = 2;
    public static final int TYPE_JUST = 1;
    public static final int type_continue = 1;
    public static final int type_try_it_free = 2;
    private ImageFile continueBackground;
    private ColorParameter continueColor;
    private TextViewParameter infoTextViewParameter;
    private ColorParameter justColor;
    private ImageFile monthlyBackground;
    private ColorParameter monthlyColor;
    private ImageFile weeklyBackground;
    private ColorParameter weeklyColor;
    private int infoType = 1;
    private int continueType = 1;

    public final ColorParameter getWeeklyColor() {
        return this.weeklyColor;
    }

    public final void setWeeklyColor(ColorParameter colorParameter) {
        this.weeklyColor = colorParameter;
    }

    public final ColorParameter getMonthlyColor() {
        return this.monthlyColor;
    }

    public final void setMonthlyColor(ColorParameter colorParameter) {
        this.monthlyColor = colorParameter;
    }

    public final ColorParameter getJustColor() {
        return this.justColor;
    }

    public final void setJustColor(ColorParameter colorParameter) {
        this.justColor = colorParameter;
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

    public final ImageFile getWeeklyBackground() {
        return this.weeklyBackground;
    }

    public final void setWeeklyBackground(ImageFile imageFile) {
        this.weeklyBackground = imageFile;
    }

    public final ImageFile getMonthlyBackground() {
        return this.monthlyBackground;
    }

    public final void setMonthlyBackground(ImageFile imageFile) {
        this.monthlyBackground = imageFile;
    }

    public final int getInfoType() {
        return this.infoType;
    }

    public final void setInfoType(int i) {
        this.infoType = i;
    }

    public final int getContinueType() {
        return this.continueType;
    }

    public final void setContinueType(int i) {
        this.continueType = i;
    }

    public final TextViewParameter getInfoTextViewParameter() {
        return this.infoTextViewParameter;
    }

    public final void setInfoTextViewParameter(TextViewParameter textViewParameter) {
        this.infoTextViewParameter = textViewParameter;
    }

    @Override // com.glority.android.uimaker.parameter.baseview.ViewParameter, com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter
    public String getViewName() {
        return "GlPurchaseView6";
    }
}
