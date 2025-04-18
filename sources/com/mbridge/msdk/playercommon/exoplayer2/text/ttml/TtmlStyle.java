package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

import android.text.Layout;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
final class TtmlStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;
    private static final int ON = 1;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    private int backgroundColor;
    private int fontColor;
    private String fontFamily;
    private float fontSize;
    private boolean hasBackgroundColor;
    private boolean hasFontColor;

    /* renamed from: id, reason: collision with root package name */
    private String f14740id;
    private TtmlStyle inheritableStyle;
    private Layout.Alignment textAlign;
    private int linethrough = -1;
    private int underline = -1;
    private int bold = -1;
    private int italic = -1;
    private int fontSizeUnit = -1;

    /* loaded from: classes4.dex */
    public @interface FontSizeUnit {
    }

    /* loaded from: classes4.dex */
    public @interface OptionalBoolean {
    }

    /* loaded from: classes4.dex */
    public @interface StyleFlags {
    }

    public final TtmlStyle chain(TtmlStyle ttmlStyle) {
        return inherit(ttmlStyle, true);
    }

    public final int getBackgroundColor() {
        if (this.hasBackgroundColor) {
            return this.backgroundColor;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int getFontColor() {
        if (this.hasFontColor) {
            return this.fontColor;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final int getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    public final String getId() {
        return this.f14740id;
    }

    public final int getStyle() {
        int i10;
        int i11 = this.bold;
        if (i11 == -1 && this.italic == -1) {
            return -1;
        }
        int i12 = 0;
        if (i11 == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.italic == 1) {
            i12 = 2;
        }
        return i10 | i12;
    }

    public final Layout.Alignment getTextAlign() {
        return this.textAlign;
    }

    public final boolean hasBackgroundColor() {
        return this.hasBackgroundColor;
    }

    public final boolean hasFontColor() {
        return this.hasFontColor;
    }

    public final TtmlStyle inherit(TtmlStyle ttmlStyle) {
        return inherit(ttmlStyle, false);
    }

    public final boolean isLinethrough() {
        return this.linethrough == 1;
    }

    public final boolean isUnderline() {
        return this.underline == 1;
    }

    public final TtmlStyle setBackgroundColor(int i10) {
        this.backgroundColor = i10;
        this.hasBackgroundColor = true;
        return this;
    }

    public final TtmlStyle setBold(boolean z10) {
        boolean z11;
        if (this.inheritableStyle == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkState(z11);
        this.bold = z10 ? 1 : 0;
        return this;
    }

    public final TtmlStyle setFontColor(int i10) {
        boolean z10;
        if (this.inheritableStyle == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        this.fontColor = i10;
        this.hasFontColor = true;
        return this;
    }

    public final TtmlStyle setFontFamily(String str) {
        boolean z10;
        if (this.inheritableStyle == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkState(z10);
        this.fontFamily = str;
        return this;
    }

    public final TtmlStyle setFontSize(float f10) {
        this.fontSize = f10;
        return this;
    }

    public final TtmlStyle setFontSizeUnit(int i10) {
        this.fontSizeUnit = i10;
        return this;
    }

    public final TtmlStyle setId(String str) {
        this.f14740id = str;
        return this;
    }

    public final TtmlStyle setItalic(boolean z10) {
        boolean z11;
        if (this.inheritableStyle == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkState(z11);
        this.italic = z10 ? 1 : 0;
        return this;
    }

    public final TtmlStyle setLinethrough(boolean z10) {
        boolean z11;
        if (this.inheritableStyle == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkState(z11);
        this.linethrough = z10 ? 1 : 0;
        return this;
    }

    public final TtmlStyle setTextAlign(Layout.Alignment alignment) {
        this.textAlign = alignment;
        return this;
    }

    public final TtmlStyle setUnderline(boolean z10) {
        boolean z11;
        if (this.inheritableStyle == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkState(z11);
        this.underline = z10 ? 1 : 0;
        return this;
    }

    private TtmlStyle inherit(TtmlStyle ttmlStyle, boolean z10) {
        if (ttmlStyle != null) {
            if (!this.hasFontColor && ttmlStyle.hasFontColor) {
                setFontColor(ttmlStyle.fontColor);
            }
            if (this.bold == -1) {
                this.bold = ttmlStyle.bold;
            }
            if (this.italic == -1) {
                this.italic = ttmlStyle.italic;
            }
            if (this.fontFamily == null) {
                this.fontFamily = ttmlStyle.fontFamily;
            }
            if (this.linethrough == -1) {
                this.linethrough = ttmlStyle.linethrough;
            }
            if (this.underline == -1) {
                this.underline = ttmlStyle.underline;
            }
            if (this.textAlign == null) {
                this.textAlign = ttmlStyle.textAlign;
            }
            if (this.fontSizeUnit == -1) {
                this.fontSizeUnit = ttmlStyle.fontSizeUnit;
                this.fontSize = ttmlStyle.fontSize;
            }
            if (z10 && !this.hasBackgroundColor && ttmlStyle.hasBackgroundColor) {
                setBackgroundColor(ttmlStyle.backgroundColor);
            }
        }
        return this;
    }
}
