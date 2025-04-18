package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import org.objectweb.asm.Opcodes;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
public final class TabRowKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f11818a = 90;

    /* renamed from: b, reason: collision with root package name */
    public static final TweenSpec f11819b;

    /* renamed from: c, reason: collision with root package name */
    public static final TweenSpec f11820c;

    static {
        CubicBezierEasing cubicBezierEasing = EasingKt.f2083a;
        f11819b = AnimationSpecKt.d(250, 0, cubicBezierEasing, 2);
        f11820c = AnimationSpecKt.d(250, 0, cubicBezierEasing, 2);
    }

    public static final void a(int i2, Modifier modifier, long j2, long j3, float f2, ScrollState scrollState, q qVar, p pVar, p pVar2, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-1594140035);
        if ((i3 & 6) == 0) {
            i4 = (g2.c(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= g2.I(modifier) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= g2.d(j2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= g2.d(j3) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= g2.b(f2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= g2.I(scrollState) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= g2.w(qVar) ? 1048576 : Opcodes.ASM8;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= g2.w(pVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= g2.w(pVar2) ? 67108864 : 33554432;
        }
        int i5 = i4;
        if ((38347923 & i5) == 38347922 && g2.i()) {
            g2.A();
        } else {
            SurfaceKt.a(ClipKt.b(SelectableGroupKt.a(ScrollKt.a(SizeKt.u(SizeKt.d(modifier, 1.0f), Alignment.Companion.d, 2), scrollState))), null, j2, j3, 0.0f, 0.0f, null, ComposableLambdaKt.c(1556158104, new TabRowKt$ScrollableTabRowImpl$1(f2, i2, scrollState, pVar2, pVar, qVar), g2), g2, (i5 & 896) | 12582912 | (i5 & 7168), Opcodes.FREM);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TabRowKt$ScrollableTabRowImpl$2(i2, modifier, j2, j3, f2, scrollState, qVar, pVar, pVar2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(float r26, int r27, int r28, int r29, long r30, long r32, androidx.compose.foundation.ScrollState r34, androidx.compose.runtime.Composer r35, androidx.compose.ui.Modifier r36, q0.p r37, q0.p r38, q0.q r39) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.b(float, int, int, int, long, long, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, q0.p, q0.p, q0.q):void");
    }

    public static final void c(Modifier modifier, long j2, long j3, q qVar, p pVar, p pVar2, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1757425411);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.d(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.d(j3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(qVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(pVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.w(pVar2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((74899 & i3) == 74898 && g2.i()) {
            g2.A();
        } else {
            int i4 = i3 << 3;
            SurfaceKt.a(SelectableGroupKt.a(modifier), null, j2, j3, 0.0f, 0.0f, null, ComposableLambdaKt.c(-65106680, new TabRowKt$TabRowImpl$1(pVar2, pVar, qVar), g2), g2, (i4 & 896) | 12582912 | (i4 & 7168), Opcodes.FREM);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TabRowKt$TabRowImpl$2(modifier, j2, j3, qVar, pVar, pVar2, i2);
        }
    }

    public static final void d(Modifier modifier, long j2, long j3, q qVar, p pVar, p pVar2, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-160898917);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.d(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.d(j3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(qVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(pVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.w(pVar2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((74899 & i3) == 74898 && g2.i()) {
            g2.A();
        } else {
            int i4 = i3 << 3;
            SurfaceKt.a(SelectableGroupKt.a(modifier), null, j2, j3, 0.0f, 0.0f, null, ComposableLambdaKt.c(-1617702432, new TabRowKt$TabRowWithSubcomposeImpl$1(pVar2, pVar, qVar), g2), g2, (i4 & 896) | 12582912 | (i4 & 7168), Opcodes.FREM);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TabRowKt$TabRowWithSubcomposeImpl$2(modifier, j2, j3, qVar, pVar, pVar2, i2);
        }
    }
}
