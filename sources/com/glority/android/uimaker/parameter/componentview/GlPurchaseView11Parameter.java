package com.glority.android.uimaker.parameter.componentview;

import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.attribute.ImageFile;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: GlPurchaseView11Parameter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u001602H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001c\u0010(\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\u001c\u0010+\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001c\u0010.\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000e¨\u00064"}, d2 = {"Lcom/glority/android/uimaker/parameter/componentview/GlPurchaseView11Parameter;", "Lcom/glority/android/uimaker/parameter/componentview/ComponentViewParameter;", "()V", "continueBackground", "Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "getContinueBackground", "()Lcom/glority/android/uimaker/parameter/attribute/ImageFile;", "setContinueBackground", "(Lcom/glority/android/uimaker/parameter/attribute/ImageFile;)V", "continueColor", "Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "getContinueColor", "()Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "setContinueColor", "(Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;)V", "continueType", "", "getContinueType", "()I", "setContinueType", "(I)V", "viewName", "", "getViewName", "()Ljava/lang/String;", "weeklySelectedBg", "getWeeklySelectedBg", "setWeeklySelectedBg", "weeklySelectedColor", "getWeeklySelectedColor", "setWeeklySelectedColor", "weeklyUnselectedBg", "getWeeklyUnselectedBg", "setWeeklyUnselectedBg", "weeklyUnselectedColor", "getWeeklyUnselectedColor", "setWeeklyUnselectedColor", "yearSelectedBg", "getYearSelectedBg", "setYearSelectedBg", "yearSelectedColor", "getYearSelectedColor", "setYearSelectedColor", "yearUnselectedBg", "getYearUnselectedBg", "setYearUnselectedBg", "yearUnselectedColor", "getYearUnselectedColor", "setYearUnselectedColor", "multiStateName", "", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class GlPurchaseView11Parameter extends ComponentViewParameter {
    public static final int type_continue = 1;
    private ImageFile continueBackground;
    private ColorParameter continueColor;
    private int continueType = 1;
    private ImageFile weeklySelectedBg;
    private ColorParameter weeklySelectedColor;
    private ImageFile weeklyUnselectedBg;
    private ColorParameter weeklyUnselectedColor;
    private ImageFile yearSelectedBg;
    private ColorParameter yearSelectedColor;
    private ImageFile yearUnselectedBg;
    private ColorParameter yearUnselectedColor;

    public final ColorParameter getWeeklySelectedColor() {
        return this.weeklySelectedColor;
    }

    public final void setWeeklySelectedColor(ColorParameter colorParameter) {
        this.weeklySelectedColor = colorParameter;
    }

    public final ColorParameter getWeeklyUnselectedColor() {
        return this.weeklyUnselectedColor;
    }

    public final void setWeeklyUnselectedColor(ColorParameter colorParameter) {
        this.weeklyUnselectedColor = colorParameter;
    }

    public final ImageFile getWeeklySelectedBg() {
        return this.weeklySelectedBg;
    }

    public final void setWeeklySelectedBg(ImageFile imageFile) {
        this.weeklySelectedBg = imageFile;
    }

    public final ImageFile getWeeklyUnselectedBg() {
        return this.weeklyUnselectedBg;
    }

    public final void setWeeklyUnselectedBg(ImageFile imageFile) {
        this.weeklyUnselectedBg = imageFile;
    }

    public final ColorParameter getYearSelectedColor() {
        return this.yearSelectedColor;
    }

    public final void setYearSelectedColor(ColorParameter colorParameter) {
        this.yearSelectedColor = colorParameter;
    }

    public final ColorParameter getYearUnselectedColor() {
        return this.yearUnselectedColor;
    }

    public final void setYearUnselectedColor(ColorParameter colorParameter) {
        this.yearUnselectedColor = colorParameter;
    }

    public final ImageFile getYearSelectedBg() {
        return this.yearSelectedBg;
    }

    public final void setYearSelectedBg(ImageFile imageFile) {
        this.yearSelectedBg = imageFile;
    }

    public final ImageFile getYearUnselectedBg() {
        return this.yearUnselectedBg;
    }

    public final void setYearUnselectedBg(ImageFile imageFile) {
        this.yearUnselectedBg = imageFile;
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

    public final int getContinueType() {
        return this.continueType;
    }

    public final void setContinueType(int i) {
        this.continueType = i;
    }

    @Override // com.glority.android.uimaker.parameter.baseview.ViewParameter, com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter
    public String getViewName() {
        return "GlPurchaseView11";
    }

    @Override // com.glority.android.uimaker.parameter.baseview.ViewParameter, com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter
    public List<String> multiStateName() {
        return CollectionsKt.listOf((Object[]) new String[]{"GlPurchaseView11_year_selected", "GlPurchaseView11_week_selected"});
    }
}
