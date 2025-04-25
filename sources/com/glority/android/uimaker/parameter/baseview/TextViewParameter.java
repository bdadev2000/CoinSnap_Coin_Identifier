package com.glority.android.uimaker.parameter.baseview;

import com.adjust.sdk.Constants;
import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.attribute.StrokeAlign;
import com.glority.android.uimaker.parameter.attribute.TextGravityParameter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextViewParameter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 X2\u00020\u0001:\u0001XB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u0000J\u000e\u0010W\u001a\u00020\u001d2\u0006\u0010V\u001a\u00020\u0000R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\u001a\u00101\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010\u0015R\u001a\u0010:\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\n\"\u0004\b<\u0010\fR\u001a\u0010=\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\n\"\u0004\b?\u0010\fR\u001a\u0010@\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\n\"\u0004\bB\u0010\fR\u001c\u0010C\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\n\"\u0004\bE\u0010\fR\u001c\u0010F\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\n\"\u0004\bH\u0010\fR\u001a\u0010I\u001a\u00020JX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001c\u0010O\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\n\"\u0004\bQ\u0010\fR\u0014\u0010R\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\n¨\u0006Y"}, d2 = {"Lcom/glority/android/uimaker/parameter/baseview/TextViewParameter;", "Lcom/glority/android/uimaker/parameter/baseview/ViewParameter;", "()V", "childTextViewParameter", "", "getChildTextViewParameter", "()Ljava/util/List;", TtmlNode.ATTR_TTS_FONT_FAMILY, "", "getFontFamily", "()Ljava/lang/String;", "setFontFamily", "(Ljava/lang/String;)V", "fontPostScriptName", "getFontPostScriptName", "setFontPostScriptName", TtmlNode.ATTR_TTS_FONT_SIZE, "", "getFontSize", "()I", "setFontSize", "(I)V", TtmlNode.ATTR_TTS_FONT_WEIGHT, "getFontWeight", "()Ljava/lang/Integer;", "setFontWeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isChildText", "", "()Z", "setChildText", "(Z)V", "letterSpacing", "", "getLetterSpacing", "()D", "setLetterSpacing", "(D)V", "lineHeightPercent", "", "getLineHeightPercent", "()Ljava/lang/Float;", "setLineHeightPercent", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "lineHeightPx", "getLineHeightPx", "setLineHeightPx", "strokeAlign", "Lcom/glority/android/uimaker/parameter/attribute/StrokeAlign;", "getStrokeAlign", "()Lcom/glority/android/uimaker/parameter/attribute/StrokeAlign;", "setStrokeAlign", "(Lcom/glority/android/uimaker/parameter/attribute/StrokeAlign;)V", "strokeWeight", "getStrokeWeight", "setStrokeWeight", "text", "getText", "setText", "textAlignHorizontal", "getTextAlignHorizontal", "setTextAlignHorizontal", "textAlignVertical", "getTextAlignVertical", "setTextAlignVertical", "textAutoResize", "getTextAutoResize", "setTextAutoResize", "textCase", "getTextCase", "setTextCase", "textColorParameter", "Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "getTextColorParameter", "()Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "setTextColorParameter", "(Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;)V", "textResId", "getTextResId", "setTextResId", "viewName", "getViewName", "addChildTextView", "", "textViewParameter", "isStyleEquals", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class TextViewParameter extends ViewParameter {
    private String fontPostScriptName;
    private Integer fontWeight;
    private boolean isChildText;
    private double letterSpacing;
    private Float lineHeightPercent;
    private double lineHeightPx;
    private int strokeWeight;
    private String textAutoResize;
    private String textCase;
    private String textResId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String text_case_upper = "UPPER";
    private static final String type_autoResize_width_and_height = "WIDTH_AND_HEIGHT";
    private static final String type_autoResize_normal = Constants.NORMAL;
    private String text = "";
    private int fontSize = 14;
    private ColorParameter textColorParameter = new ColorParameter(1.0f, 1.0f, 1.0f, 1.0f);
    private String textAlignHorizontal = TextGravityParameter.INSTANCE.getLEFT();
    private String textAlignVertical = TextGravityParameter.INSTANCE.getTOP();
    private String fontFamily = "Roboto";
    private StrokeAlign strokeAlign = StrokeAlign.OUTSIDE;
    private final List<TextViewParameter> childTextViewParameter = new ArrayList();

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final void setFontSize(int i) {
        this.fontSize = i;
    }

    public final ColorParameter getTextColorParameter() {
        return this.textColorParameter;
    }

    public final void setTextColorParameter(ColorParameter colorParameter) {
        Intrinsics.checkNotNullParameter(colorParameter, "<set-?>");
        this.textColorParameter = colorParameter;
    }

    public final String getTextAlignHorizontal() {
        return this.textAlignHorizontal;
    }

    public final void setTextAlignHorizontal(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.textAlignHorizontal = str;
    }

    public final String getTextAlignVertical() {
        return this.textAlignVertical;
    }

    public final void setTextAlignVertical(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.textAlignVertical = str;
    }

    public final Float getLineHeightPercent() {
        return this.lineHeightPercent;
    }

    public final void setLineHeightPercent(Float f) {
        this.lineHeightPercent = f;
    }

    public final String getFontPostScriptName() {
        return this.fontPostScriptName;
    }

    public final void setFontPostScriptName(String str) {
        this.fontPostScriptName = str;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final void setFontFamily(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fontFamily = str;
    }

    public final Integer getFontWeight() {
        return this.fontWeight;
    }

    public final void setFontWeight(Integer num) {
        this.fontWeight = num;
    }

    public final int getStrokeWeight() {
        return this.strokeWeight;
    }

    public final void setStrokeWeight(int i) {
        this.strokeWeight = i;
    }

    public final StrokeAlign getStrokeAlign() {
        return this.strokeAlign;
    }

    public final void setStrokeAlign(StrokeAlign strokeAlign) {
        Intrinsics.checkNotNullParameter(strokeAlign, "<set-?>");
        this.strokeAlign = strokeAlign;
    }

    public final String getTextResId() {
        return this.textResId;
    }

    public final void setTextResId(String str) {
        this.textResId = str;
    }

    /* renamed from: isChildText, reason: from getter */
    public final boolean getIsChildText() {
        return this.isChildText;
    }

    public final void setChildText(boolean z) {
        this.isChildText = z;
    }

    public final String getTextCase() {
        return this.textCase;
    }

    public final void setTextCase(String str) {
        this.textCase = str;
    }

    public final String getTextAutoResize() {
        return this.textAutoResize;
    }

    public final void setTextAutoResize(String str) {
        this.textAutoResize = str;
    }

    public final double getLetterSpacing() {
        return this.letterSpacing;
    }

    public final void setLetterSpacing(double d) {
        this.letterSpacing = d;
    }

    public final double getLineHeightPx() {
        return this.lineHeightPx;
    }

    public final void setLineHeightPx(double d) {
        this.lineHeightPx = d;
    }

    /* compiled from: TextViewParameter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/glority/android/uimaker/parameter/baseview/TextViewParameter$Companion;", "", "()V", "text_case_upper", "", "getText_case_upper", "()Ljava/lang/String;", "type_autoResize_normal", "getType_autoResize_normal", "type_autoResize_width_and_height", "getType_autoResize_width_and_height", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getText_case_upper() {
            return TextViewParameter.text_case_upper;
        }

        public final String getType_autoResize_width_and_height() {
            return TextViewParameter.type_autoResize_width_and_height;
        }

        public final String getType_autoResize_normal() {
            return TextViewParameter.type_autoResize_normal;
        }
    }

    public final List<TextViewParameter> getChildTextViewParameter() {
        return this.childTextViewParameter;
    }

    public final void addChildTextView(TextViewParameter textViewParameter) {
        Intrinsics.checkNotNullParameter(textViewParameter, "textViewParameter");
        this.childTextViewParameter.add(textViewParameter);
    }

    public final boolean isStyleEquals(TextViewParameter textViewParameter) {
        Intrinsics.checkNotNullParameter(textViewParameter, "textViewParameter");
        String str = textViewParameter.fontPostScriptName;
        if (str == null || str.length() == 0) {
            return true;
        }
        return textViewParameter.fontSize == this.fontSize && textViewParameter.textColorParameter.equals(this) && Intrinsics.areEqual(textViewParameter.textAlignHorizontal, this.textAlignHorizontal) && Intrinsics.areEqual(textViewParameter.textAlignVertical, this.textAlignVertical) && Intrinsics.areEqual(textViewParameter.lineHeightPercent, this.lineHeightPercent) && Intrinsics.areEqual(textViewParameter.fontPostScriptName, this.fontPostScriptName) && Intrinsics.areEqual(textViewParameter.fontFamily, this.fontFamily) && Intrinsics.areEqual(textViewParameter.fontWeight, this.fontWeight) && textViewParameter.strokeWeight == this.strokeWeight && textViewParameter.strokeAlign == this.strokeAlign;
    }

    @Override // com.glority.android.uimaker.parameter.baseview.ViewParameter, com.glority.android.uimaker.parameter.baseview.BaseUiMakerParameter
    public String getViewName() {
        return "TEXTVIEW";
    }
}
