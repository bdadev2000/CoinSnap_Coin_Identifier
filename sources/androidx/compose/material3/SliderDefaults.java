package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;

@Stable
/* loaded from: classes2.dex */
public final class SliderDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final SliderDefaults f11221a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final float f11222b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f11223c;
    public static final AndroidPath d;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.SliderDefaults, java.lang.Object] */
    static {
        float f2 = SliderTokens.e;
        f11222b = f2;
        f11223c = f2;
        d = AndroidPath_androidKt.a();
    }

    public static final void d(DrawScope drawScope, long j2, float f2, long j3) {
        drawScope.j1(j3, (r19 & 2) != 0 ? Size.c(drawScope.b()) / 2.0f : drawScope.y1(f2) / 2.0f, (r19 & 4) != 0 ? drawScope.F1() : j2, (r19 & 8) != 0 ? 1.0f : 0.0f, (r19 & 16) != 0 ? Fill.f15146a : null, null, (r19 & 64) != 0 ? 3 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01fb, code lost:
    
        if (r8 <= r6.f31405b) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.ui.graphics.drawscope.DrawScope r29, float[] r30, float r31, float r32, long r33, long r35, long r37, long r39, float r41, float r42, float r43, float r44, float r45, q0.p r46, q0.q r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.e(androidx.compose.ui.graphics.drawscope.DrawScope, float[], float, float, long, long, long, long, float, float, float, float, float, q0.p, q0.q, boolean):void");
    }

    public static SliderColors f(Composer composer) {
        ColorScheme a2 = MaterialTheme.a(composer);
        SliderColors sliderColors = a2.f8541s0;
        if (sliderColors != null) {
            return sliderColors;
        }
        float f2 = SliderTokens.f13525a;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.f13278n;
        long e = ColorSchemeKt.e(a2, colorSchemeKeyTokens);
        long e2 = ColorSchemeKt.e(a2, colorSchemeKeyTokens);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.f13282r;
        long e3 = ColorSchemeKt.e(a2, colorSchemeKeyTokens2);
        long e4 = ColorSchemeKt.e(a2, colorSchemeKeyTokens2);
        long e5 = ColorSchemeKt.e(a2, colorSchemeKeyTokens);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.f13273i;
        SliderColors sliderColors2 = new SliderColors(e, e2, e3, e4, e5, ColorKt.g(Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens3), 0.38f), a2.f8534p), Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens3), 0.38f), Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens3), 0.12f), Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens3), 0.12f), Color.b(ColorSchemeKt.e(a2, colorSchemeKeyTokens3), 0.38f));
        a2.f8541s0 = sliderColors2;
        return sliderColors2;
    }

    public static void g(DrawScope drawScope, long j2, long j3, long j4, float f2, float f3) {
        long a2 = CornerRadiusKt.a(f2, f2);
        long a3 = CornerRadiusKt.a(f3, f3);
        Rect a4 = RectKt.a(OffsetKt.a(Offset.g(j2), 0.0f), SizeKt.a(Size.d(j3), Size.b(j3)));
        RoundRect roundRect = new RoundRect(a4.f14914a, a4.f14915b, a4.f14916c, a4.d, a2, a3, a3, a2);
        AndroidPath androidPath = d;
        androidPath.v(roundRect, Path.Direction.f15004a);
        DrawScope.N(drawScope, androidPath, j4, 0.0f, null, 60);
        androidPath.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.foundation.interaction.MutableInteractionSource r18, androidx.compose.ui.Modifier r19, androidx.compose.material3.SliderColors r20, boolean r21, long r22, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.a(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.compose.material3.RangeSliderState r26, androidx.compose.ui.Modifier r27, boolean r28, androidx.compose.material3.SliderColors r29, q0.p r30, q0.q r31, float r32, float r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.b(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, q0.p, q0.q, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.compose.material3.SliderState r26, androidx.compose.ui.Modifier r27, boolean r28, androidx.compose.material3.SliderColors r29, q0.p r30, q0.q r31, float r32, float r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.c(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, q0.p, q0.q, float, float, androidx.compose.runtime.Composer, int, int):void");
    }
}
