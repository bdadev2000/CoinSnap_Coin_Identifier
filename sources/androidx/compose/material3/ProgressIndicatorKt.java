package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import w0.d;

/* loaded from: classes3.dex */
public final class ProgressIndicatorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10609a;

    /* renamed from: b, reason: collision with root package name */
    public static final Modifier f10610b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f10611c = 240;
    public static final float d;
    public static final float e;

    /* renamed from: f, reason: collision with root package name */
    public static final CubicBezierEasing f10612f;

    /* renamed from: g, reason: collision with root package name */
    public static final CubicBezierEasing f10613g;

    /* renamed from: h, reason: collision with root package name */
    public static final CubicBezierEasing f10614h;

    /* renamed from: i, reason: collision with root package name */
    public static final CubicBezierEasing f10615i;

    /* renamed from: j, reason: collision with root package name */
    public static final CubicBezierEasing f10616j;

    static {
        float f2 = 10;
        f10609a = f2;
        f10610b = PaddingKt.h(SemanticsModifierKt.b(LayoutModifierKt.a(Modifier.Companion.f14687a, ProgressIndicatorKt$IncreaseSemanticsBounds$1.f10672a), true, ProgressIndicatorKt$IncreaseSemanticsBounds$2.f10675a), 0.0f, f2, 1);
        float f3 = ProgressIndicatorTokens.f13494c;
        d = f3;
        e = ProgressIndicatorTokens.d - (f3 * 2);
        f10612f = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        f10613g = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        f10614h = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        f10615i = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        f10616j = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(float r25, androidx.compose.ui.Modifier r26, long r27, float r29, long r30, int r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.a(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0208 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(q0.a r29, androidx.compose.ui.Modifier r30, long r31, float r33, long r34, int r36, float r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.b(q0.a, androidx.compose.ui.Modifier, long, float, long, int, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(float r33, int r34, int r35, int r36, long r37, long r39, androidx.compose.runtime.Composer r41, androidx.compose.ui.Modifier r42) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.c(float, int, int, int, long, long, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0227 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(q0.a r35, androidx.compose.ui.Modifier r36, long r37, long r39, int r41, float r42, q0.l r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.d(q0.a, androidx.compose.ui.Modifier, long, long, int, float, q0.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(float r23, int r24, int r25, int r26, long r27, long r29, androidx.compose.runtime.Composer r31, androidx.compose.ui.Modifier r32) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.e(float, int, int, int, long, long, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(float r28, int r29, int r30, int r31, long r32, long r34, androidx.compose.runtime.Composer r36, androidx.compose.ui.Modifier r37) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.f(float, int, int, int, long, long, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier):void");
    }

    public static final void g(DrawScope drawScope, float f2, float f3, long j2, float f4, int i2) {
        float d2 = Size.d(drawScope.b());
        float b2 = Size.b(drawScope.b());
        float f5 = 2;
        float f6 = b2 / f5;
        boolean z2 = drawScope.getLayoutDirection() == LayoutDirection.f17494a;
        float f7 = (z2 ? f2 : 1.0f - f3) * d2;
        float f8 = (z2 ? f3 : 1.0f - f2) * d2;
        if (StrokeCap.a(i2, 0) || b2 > d2) {
            drawScope.b1(j2, OffsetKt.a(f7, f6), OffsetKt.a(f8, f6), (r26 & 8) != 0 ? 0.0f : f4, (r26 & 16) != 0 ? 0 : 0, null, (r26 & 64) != 0 ? 1.0f : 0.0f, null, (r26 & 256) != 0 ? 3 : 0);
            return;
        }
        float f9 = f4 / f5;
        d dVar = new d(f9, d2 - f9);
        float floatValue = ((Number) p0.a.C(Float.valueOf(f7), dVar)).floatValue();
        float floatValue2 = ((Number) p0.a.C(Float.valueOf(f8), dVar)).floatValue();
        if (Math.abs(f3 - f2) > 0.0f) {
            drawScope.b1(j2, OffsetKt.a(floatValue, f6), OffsetKt.a(floatValue2, f6), (r26 & 8) != 0 ? 0.0f : f4, (r26 & 16) != 0 ? 0 : i2, null, (r26 & 64) != 0 ? 1.0f : 0.0f, null, (r26 & 256) != 0 ? 3 : 0);
        }
    }

    public static final void h(DrawScope drawScope, float f2, float f3, long j2, Stroke stroke) {
        float f4 = 2;
        float f5 = stroke.f15147a / f4;
        float d2 = Size.d(drawScope.b()) - (f4 * f5);
        DrawScope.t1(drawScope, j2, f2, f3, OffsetKt.a(f5, f5), SizeKt.a(d2, d2), 0.0f, stroke, 832);
    }
}
