package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes4.dex */
final class ExpressiveNavigationBarKt$ExpressiveNavigationBar$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f9396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f9397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9398c;
    public final /* synthetic */ WindowInsets d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f9400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9401h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9402i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressiveNavigationBarKt$ExpressiveNavigationBar$2(Modifier modifier, long j2, long j3, WindowInsets windowInsets, int i2, p pVar, int i3, int i4) {
        super(2);
        this.f9396a = modifier;
        this.f9397b = j2;
        this.f9398c = j3;
        this.d = windowInsets;
        this.f9399f = i2;
        this.f9400g = pVar;
        this.f9401h = i3;
        this.f9402i = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        Modifier modifier;
        WindowInsets windowInsets;
        int i3;
        long j2;
        long j3;
        ((Number) obj2).intValue();
        p pVar = this.f9400g;
        int a2 = RecomposeScopeImplKt.a(this.f9401h | 1);
        int i4 = this.f9402i;
        float f2 = ExpressiveNavigationBarKt.f9386a;
        ComposerImpl g2 = ((Composer) obj).g(-1171105467);
        int i5 = i4 & 1;
        Modifier modifier2 = this.f9396a;
        if (i5 != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(modifier2) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i6 = a2 & 48;
        long j4 = this.f9397b;
        if (i6 == 0) {
            i2 |= ((i4 & 2) == 0 && g2.d(j4)) ? 32 : 16;
        }
        int i7 = a2 & 384;
        long j5 = this.f9398c;
        if (i7 == 0) {
            i2 |= ((i4 & 4) == 0 && g2.d(j5)) ? 256 : 128;
        }
        int i8 = a2 & 3072;
        WindowInsets windowInsets2 = this.d;
        if (i8 == 0) {
            i2 |= ((i4 & 8) == 0 && g2.I(windowInsets2)) ? Opcodes.ACC_STRICT : 1024;
        }
        int i9 = a2 & 24576;
        int i10 = this.f9399f;
        if (i9 == 0) {
            i2 |= ((i4 & 16) == 0 && g2.c(i10)) ? 16384 : 8192;
        }
        if ((i4 & 32) != 0) {
            i2 |= 196608;
        } else if ((a2 & 196608) == 0) {
            i2 |= g2.w(pVar) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((74899 & i2) == 74898 && g2.i()) {
            g2.A();
            modifier = modifier2;
            j2 = j4;
            j3 = j5;
            windowInsets = windowInsets2;
            i3 = i10;
        } else {
            g2.u0();
            if ((a2 & 1) == 0 || g2.e0()) {
                if (i5 != 0) {
                    modifier2 = Modifier.Companion.f14687a;
                }
                if ((i4 & 2) != 0) {
                    j4 = ColorSchemeKt.f(ColorSchemeKeyTokens.f13284t, g2);
                    i2 &= -113;
                }
                if ((i4 & 4) != 0) {
                    j5 = ColorSchemeKt.f(ColorSchemeKeyTokens.f13274j, g2);
                    i2 &= -897;
                }
                if ((i4 & 8) != 0) {
                    windowInsets2 = WindowInsetsKt.d(SystemBarsDefaultInsets_androidKt.a(g2), WindowInsetsSides.e | 32);
                    i2 &= -7169;
                }
                if ((i4 & 16) != 0) {
                    i2 &= -57345;
                    i10 = 0;
                }
            } else {
                g2.A();
                if ((i4 & 2) != 0) {
                    i2 &= -113;
                }
                if ((i4 & 4) != 0) {
                    i2 &= -897;
                }
                if ((i4 & 8) != 0) {
                    i2 &= -7169;
                }
                if ((i4 & 16) != 0) {
                    i2 &= -57345;
                }
            }
            WindowInsets windowInsets3 = windowInsets2;
            int i11 = i10;
            g2.W();
            int i12 = i2 << 3;
            SurfaceKt.a(null, null, j4, j5, 0.0f, 0.0f, null, ComposableLambdaKt.c(1573697866, new ExpressiveNavigationBarKt$ExpressiveNavigationBar$1(modifier2, windowInsets3, i11, pVar), g2), g2, (i12 & 896) | 12582912 | (i12 & 7168), Opcodes.DREM);
            modifier = modifier2;
            long j6 = j5;
            windowInsets = windowInsets3;
            i3 = i11;
            j2 = j4;
            j3 = j6;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ExpressiveNavigationBarKt$ExpressiveNavigationBar$2(modifier, j2, j3, windowInsets, i3, pVar, a2, i4);
        }
        return b0.f30125a;
    }
}
