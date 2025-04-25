package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Color.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0017\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a5\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00192\b\b\u0001\u0010\u0012\u001a\u00020\u00192\b\b\u0001\u0010\u0013\u001a\u00020\u00192\b\b\u0003\u0010\u0014\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001b\u001a\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001a1\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011H\u0082\b\u001a,\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0001\u0010(\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u001e\u0010+\u001a\u00020\u0007*\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0016\u0010/\u001a\u000200*\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0016\u00103\u001a\u00020\u0011*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a%\u00106\u001a\u00020\u0007*\u00020\u00072\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000708H\u0086\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u0016\u0010;\u001a\u00020\u0019*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=\"\u0018\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\n\n\u0002\u0010\u0004\u0012\u0004\b\u0002\u0010\u0003\"\u001f\u0010\u0005\u001a\u00020\u0006*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001f\u0010\f\u001a\u00020\u0006*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"UnspecifiedColor", "Lkotlin/ULong;", "getUnspecifiedColor$annotations", "()V", "J", "isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "color", "", "(I)J", "(IIII)J", "", "(J)J", "UncheckedColor", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return ((f * f3) + ((f2 * f4) * (1.0f - f3))) / f5;
    }

    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m4562isSpecified8_81llA(long j) {
        return j != 16;
    }

    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m4563isSpecified8_81llA$annotations(long j) {
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m4564isUnspecified8_81llA(long j) {
        return j == 16;
    }

    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m4565isUnspecified8_81llA$annotations(long j) {
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long Color(float r20, float r21, float r22, float r23, androidx.compose.ui.graphics.colorspace.ColorSpace r24) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long UncheckedColor$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return UncheckedColor(f, f2, f3, f4, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long UncheckedColor(float r17, float r18, float r19, float r20, androidx.compose.ui.graphics.colorspace.ColorSpace r21) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.UncheckedColor(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static final long Color(int i) {
        return Color.m4511constructorimpl(ULong.m8448constructorimpl(ULong.m8448constructorimpl(i) << 32));
    }

    public static final long Color(long j) {
        return Color.m4511constructorimpl(ULong.m8448constructorimpl(j << 32));
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m4566lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long m4512convertvNxB06k = Color.m4512convertvNxB06k(j, oklab);
        long m4512convertvNxB06k2 = Color.m4512convertvNxB06k(j2, oklab);
        float m4517getAlphaimpl = Color.m4517getAlphaimpl(m4512convertvNxB06k);
        float m4521getRedimpl = Color.m4521getRedimpl(m4512convertvNxB06k);
        float m4520getGreenimpl = Color.m4520getGreenimpl(m4512convertvNxB06k);
        float m4518getBlueimpl = Color.m4518getBlueimpl(m4512convertvNxB06k);
        float m4517getAlphaimpl2 = Color.m4517getAlphaimpl(m4512convertvNxB06k2);
        float m4521getRedimpl2 = Color.m4521getRedimpl(m4512convertvNxB06k2);
        float m4520getGreenimpl2 = Color.m4520getGreenimpl(m4512convertvNxB06k2);
        float m4518getBlueimpl2 = Color.m4518getBlueimpl(m4512convertvNxB06k2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.m4512convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(m4521getRedimpl, m4521getRedimpl2, f), MathHelpersKt.lerp(m4520getGreenimpl, m4520getGreenimpl2, f), MathHelpersKt.lerp(m4518getBlueimpl, m4518getBlueimpl2, f), MathHelpersKt.lerp(m4517getAlphaimpl, m4517getAlphaimpl2, f), oklab), Color.m4519getColorSpaceimpl(j2));
    }

    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m4560compositeOverOWjLjI(long j, long j2) {
        long m4512convertvNxB06k = Color.m4512convertvNxB06k(j, Color.m4519getColorSpaceimpl(j2));
        float m4517getAlphaimpl = Color.m4517getAlphaimpl(j2);
        float m4517getAlphaimpl2 = Color.m4517getAlphaimpl(m4512convertvNxB06k);
        float f = 1.0f - m4517getAlphaimpl2;
        float f2 = (m4517getAlphaimpl * f) + m4517getAlphaimpl2;
        return UncheckedColor(f2 == 0.0f ? 0.0f : ((Color.m4521getRedimpl(m4512convertvNxB06k) * m4517getAlphaimpl2) + ((Color.m4521getRedimpl(j2) * m4517getAlphaimpl) * f)) / f2, f2 == 0.0f ? 0.0f : ((Color.m4520getGreenimpl(m4512convertvNxB06k) * m4517getAlphaimpl2) + ((Color.m4520getGreenimpl(j2) * m4517getAlphaimpl) * f)) / f2, f2 != 0.0f ? ((Color.m4518getBlueimpl(m4512convertvNxB06k) * m4517getAlphaimpl2) + ((Color.m4518getBlueimpl(j2) * m4517getAlphaimpl) * f)) / f2 : 0.0f, f2, Color.m4519getColorSpaceimpl(j2));
    }

    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m4561getComponents8_81llA(long j) {
        return new float[]{Color.m4521getRedimpl(j), Color.m4520getGreenimpl(j), Color.m4518getBlueimpl(j), Color.m4517getAlphaimpl(j)};
    }

    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m4567luminance8_81llA(long j) {
        ColorSpace m4519getColorSpaceimpl = Color.m4519getColorSpaceimpl(j);
        if (!ColorModel.m4922equalsimpl0(m4519getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m4929getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m4925toStringimpl(m4519getColorSpaceimpl.getModel())));
        }
        Intrinsics.checkNotNull(m4519getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc = ((Rgb) m4519getColorSpaceimpl).getEotfFunc();
        float invoke = (float) ((eotfFunc.invoke(Color.m4521getRedimpl(j)) * 0.2126d) + (eotfFunc.invoke(Color.m4520getGreenimpl(j)) * 0.7152d) + (eotfFunc.invoke(Color.m4518getBlueimpl(j)) * 0.0722d));
        if (invoke < 0.0f) {
            invoke = 0.0f;
        }
        if (invoke > 1.0f) {
            return 1.0f;
        }
        return invoke;
    }

    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m4569toArgb8_81llA(long j) {
        return (int) ULong.m8448constructorimpl(Color.m4512convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m4568takeOrElseDxMtmZc(long j, Function0<Color> function0) {
        return j != 16 ? j : function0.invoke().m4525unboximpl();
    }
}
