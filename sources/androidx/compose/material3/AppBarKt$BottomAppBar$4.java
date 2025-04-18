package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class AppBarKt$BottomAppBar$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f7677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7679c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f7680f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7681g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f7682h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7683i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7684j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$4(Modifier modifier, long j2, long j3, float f2, PaddingValues paddingValues, WindowInsets windowInsets, q qVar, int i2, int i3) {
        super(2);
        this.f7677a = modifier;
        this.f7678b = j2;
        this.f7679c = j3;
        this.d = f2;
        this.f7680f = paddingValues;
        this.f7681g = windowInsets;
        this.f7682h = qVar;
        this.f7683i = i2;
        this.f7684j = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        Modifier modifier;
        WindowInsets windowInsets;
        float f2;
        PaddingValues paddingValues;
        long j2;
        Modifier modifier2;
        long j3;
        int i3;
        int i4;
        Modifier modifier3;
        long j4;
        WindowInsets windowInsets2;
        long j5;
        float f3;
        PaddingValues paddingValues2;
        ((Number) obj2).intValue();
        q qVar = this.f7682h;
        int a2 = RecomposeScopeImplKt.a(this.f7683i | 1);
        int i5 = this.f7684j;
        float f4 = AppBarKt.f7649a;
        ComposerImpl g2 = ((Composer) obj).g(-1391700845);
        int i6 = i5 & 1;
        Modifier modifier4 = this.f7677a;
        if (i6 != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(modifier4) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i7 = a2 & 48;
        long j6 = this.f7678b;
        if (i7 == 0) {
            i2 |= ((i5 & 2) == 0 && g2.d(j6)) ? 32 : 16;
        }
        int i8 = a2 & 384;
        long j7 = this.f7679c;
        if (i8 == 0) {
            i2 |= ((i5 & 4) == 0 && g2.d(j7)) ? 256 : 128;
        }
        int i9 = i5 & 8;
        float f5 = this.d;
        if (i9 != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.b(f5) ? Opcodes.ACC_STRICT : 1024;
        }
        int i10 = i5 & 16;
        PaddingValues paddingValues3 = this.f7680f;
        if (i10 != 0) {
            i2 |= 24576;
            modifier = modifier4;
        } else {
            modifier = modifier4;
            if ((a2 & 24576) == 0) {
                i2 |= g2.I(paddingValues3) ? 16384 : 8192;
            }
        }
        int i11 = 196608 & a2;
        long j8 = j6;
        WindowInsets windowInsets3 = this.f7681g;
        if (i11 == 0) {
            i2 |= ((i5 & 32) == 0 && g2.I(windowInsets3)) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((i5 & 64) != 0) {
            i2 |= 1572864;
        } else if ((a2 & 1572864) == 0) {
            i2 |= g2.w(qVar) ? 1048576 : Opcodes.ASM8;
        }
        if ((599187 & i2) == 599186 && g2.i()) {
            g2.A();
            modifier3 = modifier;
            i3 = i5;
            i4 = a2;
            j4 = j8;
            windowInsets2 = windowInsets3;
            j5 = j7;
            f3 = f5;
            paddingValues2 = paddingValues3;
        } else {
            g2.u0();
            if ((a2 & 1) == 0 || g2.e0()) {
                Modifier modifier5 = i6 != 0 ? Modifier.Companion.f14687a : modifier;
                if ((i5 & 2) != 0) {
                    float f6 = BottomAppBarDefaults.f7912a;
                    float f7 = BottomAppBarTokens.f13217a;
                    j8 = ColorSchemeKt.f(ColorSchemeKeyTokens.f13284t, g2);
                    i2 &= -113;
                }
                long j9 = j8;
                long j10 = j7;
                if ((i5 & 4) != 0) {
                    j10 = ColorSchemeKt.c(j9, g2);
                    i2 &= -897;
                }
                if (i9 != 0) {
                    f5 = BottomAppBarDefaults.f7912a;
                }
                if (i10 != 0) {
                    paddingValues3 = BottomAppBarDefaults.f7913b;
                }
                if ((i5 & 32) != 0) {
                    windowInsets3 = BottomAppBarDefaults.a(g2);
                    i2 &= -458753;
                }
                windowInsets = windowInsets3;
                f2 = f5;
                paddingValues = paddingValues3;
                j2 = j10;
                modifier2 = modifier5;
                j3 = j9;
            } else {
                g2.A();
                if ((i5 & 2) != 0) {
                    i2 &= -113;
                }
                if ((i5 & 4) != 0) {
                    i2 &= -897;
                }
                if ((i5 & 32) != 0) {
                    i2 &= -458753;
                }
                windowInsets = windowInsets3;
                j2 = j7;
                f2 = f5;
                paddingValues = paddingValues3;
                j3 = j8;
                modifier2 = modifier;
            }
            g2.W();
            i3 = i5;
            i4 = a2;
            AppBarKt.a(modifier2, j3, j2, f2, paddingValues, windowInsets, null, qVar, g2, (i2 & 14) | 1572864 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | ((i2 << 3) & 29360128), 0);
            modifier3 = modifier2;
            j4 = j3;
            windowInsets2 = windowInsets;
            j5 = j2;
            f3 = f2;
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AppBarKt$BottomAppBar$4(modifier3, j4, j5, f3, paddingValues2, windowInsets2, qVar, i4, i3);
        }
        return b0.f30125a;
    }
}
