package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import kotlin.Metadata;

/* compiled from: AndroidClipboardManager.android.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b\"\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b-\u0010\nJ\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "()V", "parcel", "Landroid/os/Parcel;", "encode", "", "color", "Landroidx/compose/ui/graphics/Color;", "encode-8_81llA", "(J)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", "encode-nzbMABs", "(I)V", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "encode-6p3vJLY", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "encode-4Dl_Bck", "(F)V", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textUnit", "Landroidx/compose/ui/unit/TextUnit;", "encode--R2X_6o", "byte", "", TypedValues.Custom.S_FLOAT, "", "int", "", TypedValues.Custom.S_STRING, "", "uLong", "Lkotlin/ULong;", "encode-VKZWuLQ", "encodedString", "reset", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class EncodeHelper {
    public static final int $stable = 8;
    private Parcel parcel = Parcel.obtain();

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void encode(SpanStyle spanStyle) {
        if (!Color.m4516equalsimpl0(spanStyle.m6410getColor0d7_KjU(), Color.INSTANCE.m4551getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m6211encode8_81llA(spanStyle.m6410getColor0d7_KjU());
        }
        if (!TextUnit.m7187equalsimpl0(spanStyle.getFontSize(), TextUnit.INSTANCE.m7201getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m6208encodeR2X_6o(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int m6573unboximpl = fontStyle.m6573unboximpl();
            encode((byte) 4);
            m6213encodenzbMABs(m6573unboximpl);
        }
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value = fontSynthesis.getValue();
            encode((byte) 5);
            m6210encode6p3vJLY(value);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m7187equalsimpl0(spanStyle.getLetterSpacing(), TextUnit.INSTANCE.m7201getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m6208encodeR2X_6o(spanStyle.getLetterSpacing());
        }
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float m6754unboximpl = baselineShift.m6754unboximpl();
            encode((byte) 8);
            m6209encode4Dl_Bck(m6754unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m4516equalsimpl0(spanStyle.getBackground(), Color.INSTANCE.m4551getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m6211encode8_81llA(spanStyle.getBackground());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode(Ascii.VT);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode(Ascii.FF);
            encode(shadow);
        }
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m6211encode8_81llA(long color) {
        m6212encodeVKZWuLQ(color);
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m6208encodeR2X_6o(long textUnit) {
        long m7189getTypeUIouoOA = TextUnit.m7189getTypeUIouoOA(textUnit);
        byte b = 0;
        if (!TextUnitType.m7218equalsimpl0(m7189getTypeUIouoOA, TextUnitType.INSTANCE.m7224getUnspecifiedUIouoOA())) {
            if (TextUnitType.m7218equalsimpl0(m7189getTypeUIouoOA, TextUnitType.INSTANCE.m7223getSpUIouoOA())) {
                b = 1;
            } else if (TextUnitType.m7218equalsimpl0(m7189getTypeUIouoOA, TextUnitType.INSTANCE.m7222getEmUIouoOA())) {
                b = 2;
            }
        }
        encode(b);
        if (TextUnitType.m7218equalsimpl0(TextUnit.m7189getTypeUIouoOA(textUnit), TextUnitType.INSTANCE.m7224getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m7190getValueimpl(textUnit));
    }

    public final void encode(FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m6213encodenzbMABs(int fontStyle) {
        byte b = 0;
        if (!FontStyle.m6570equalsimpl0(fontStyle, FontStyle.INSTANCE.m6577getNormal_LCdwA()) && FontStyle.m6570equalsimpl0(fontStyle, FontStyle.INSTANCE.m6576getItalic_LCdwA())) {
            b = 1;
        }
        encode(b);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m6210encode6p3vJLY(int fontSynthesis) {
        byte b = 0;
        if (!FontSynthesis.m6581equalsimpl0(fontSynthesis, FontSynthesis.INSTANCE.m6588getNoneGVVA2EU())) {
            if (FontSynthesis.m6581equalsimpl0(fontSynthesis, FontSynthesis.INSTANCE.m6587getAllGVVA2EU())) {
                b = 1;
            } else if (FontSynthesis.m6581equalsimpl0(fontSynthesis, FontSynthesis.INSTANCE.m6590getWeightGVVA2EU())) {
                b = 2;
            } else if (FontSynthesis.m6581equalsimpl0(fontSynthesis, FontSynthesis.INSTANCE.m6589getStyleGVVA2EU())) {
                b = 3;
            }
        }
        encode(b);
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m6209encode4Dl_Bck(float baselineShift) {
        encode(baselineShift);
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        m6211encode8_81llA(shadow.getColor());
        encode(Offset.m4274getXimpl(shadow.getOffset()));
        encode(Offset.m4275getYimpl(shadow.getOffset()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte r2) {
        this.parcel.writeByte(r2);
    }

    public final void encode(int r2) {
        this.parcel.writeInt(r2);
    }

    public final void encode(float r2) {
        this.parcel.writeFloat(r2);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m6212encodeVKZWuLQ(long uLong) {
        this.parcel.writeLong(uLong);
    }

    public final void encode(String string) {
        this.parcel.writeString(string);
    }
}
