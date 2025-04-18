package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class SpanStyleKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f17031a = TextUnitKt.b(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f17032b = TextUnitKt.b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f17033c = Color.f14961h;
    public static final TextForegroundStyle d = TextForegroundStyle.Companion.b(Color.f14957b);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.a(r24, r19.f17018b) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x004d, code lost:
    
        if (androidx.compose.ui.graphics.Color.c(r20, r19.f17017a.b()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0057, code lost:
    
        if (p0.a.g(r6, r19.d) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0061, code lost:
    
        if (p0.a.g(r5, r19.f17019c) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0067, code lost:
    
        if (r29 != r19.f17020f) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0079, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.a(r31, r19.f17022h) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.text.SpanStyle a(androidx.compose.ui.text.SpanStyle r19, long r20, androidx.compose.ui.graphics.Brush r22, float r23, long r24, androidx.compose.ui.text.font.FontWeight r26, androidx.compose.ui.text.font.FontStyle r27, androidx.compose.ui.text.font.FontSynthesis r28, androidx.compose.ui.text.font.FontFamily r29, java.lang.String r30, long r31, androidx.compose.ui.text.style.BaselineShift r33, androidx.compose.ui.text.style.TextGeometricTransform r34, androidx.compose.ui.text.intl.LocaleList r35, long r36, androidx.compose.ui.text.style.TextDecoration r38, androidx.compose.ui.graphics.Shadow r39, androidx.compose.ui.text.PlatformSpanStyle r40, androidx.compose.ui.graphics.drawscope.DrawStyle r41) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SpanStyleKt.a(androidx.compose.ui.text.SpanStyle, long, androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle):androidx.compose.ui.text.SpanStyle");
    }

    public static final Object b(float f2, Object obj, Object obj2) {
        return ((double) f2) < 0.5d ? obj : obj2;
    }

    public static final long c(long j2, long j3, float f2) {
        if (TextUnitKt.c(j2) || TextUnitKt.c(j3)) {
            return ((TextUnit) b(f2, new TextUnit(j2), new TextUnit(j3))).f17500a;
        }
        if (TextUnitKt.c(j2) || TextUnitKt.c(j3)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (TextUnitType.a(TextUnit.b(j2), TextUnit.b(j3))) {
            return TextUnitKt.d(1095216660480L & j2, MathHelpersKt.b(TextUnit.c(j2), TextUnit.c(j3), f2));
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.b(TextUnit.b(j2))) + " and " + ((Object) TextUnitType.b(TextUnit.b(j3)))).toString());
    }
}
