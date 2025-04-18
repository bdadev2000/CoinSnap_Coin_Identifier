package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class NavigationDrawerKt$PermanentDrawerSheet$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f10175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Shape f10176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10177c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f10178f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10179g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f10180h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10181i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10182j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$PermanentDrawerSheet$2(Modifier modifier, Shape shape, long j2, long j3, float f2, WindowInsets windowInsets, q qVar, int i2, int i3) {
        super(2);
        this.f10175a = modifier;
        this.f10176b = shape;
        this.f10177c = j2;
        this.d = j3;
        this.f10178f = f2;
        this.f10179g = windowInsets;
        this.f10180h = qVar;
        this.f10181i = i2;
        this.f10182j = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        Modifier modifier;
        Modifier modifier2;
        Shape shape;
        int i3;
        int i4;
        Modifier modifier3;
        WindowInsets windowInsets;
        Shape shape2;
        long j2;
        long j3;
        float f2;
        ((Number) obj2).intValue();
        q qVar = this.f10180h;
        int a2 = RecomposeScopeImplKt.a(this.f10181i | 1);
        int i5 = this.f10182j;
        float f3 = NavigationDrawerKt.f10042a;
        ComposerImpl g2 = ((Composer) obj).g(-1733353241);
        int i6 = i5 & 1;
        Modifier modifier4 = this.f10175a;
        if (i6 != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(modifier4) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i7 = i5 & 2;
        Shape shape3 = this.f10176b;
        if (i7 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.I(shape3) ? 32 : 16;
        }
        int i8 = a2 & 384;
        long j4 = this.f10177c;
        if (i8 == 0) {
            i2 |= ((i5 & 4) == 0 && g2.d(j4)) ? 256 : 128;
        }
        int i9 = a2 & 3072;
        long j5 = this.d;
        if (i9 == 0) {
            i2 |= ((i5 & 8) == 0 && g2.d(j5)) ? Opcodes.ACC_STRICT : 1024;
        }
        int i10 = i5 & 16;
        float f4 = this.f10178f;
        if (i10 != 0) {
            i2 |= 24576;
            modifier = modifier4;
        } else {
            modifier = modifier4;
            if ((a2 & 24576) == 0) {
                i2 |= g2.b(f4) ? 16384 : 8192;
            }
        }
        int i11 = 196608 & a2;
        WindowInsets windowInsets2 = this.f10179g;
        if (i11 == 0) {
            i2 |= ((i5 & 32) == 0 && g2.I(windowInsets2)) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((i5 & 64) != 0) {
            i2 |= 1572864;
        } else if ((a2 & 1572864) == 0) {
            i2 |= g2.w(qVar) ? 1048576 : Opcodes.ASM8;
        }
        if ((599187 & i2) == 599186 && g2.i()) {
            g2.A();
            modifier3 = modifier;
            shape2 = shape3;
            i3 = i5;
            i4 = a2;
            windowInsets = windowInsets2;
            j2 = j4;
            j3 = j5;
            f2 = f4;
        } else {
            g2.u0();
            if ((a2 & 1) == 0 || g2.e0()) {
                modifier2 = i6 != 0 ? Modifier.Companion.f14687a : modifier;
                Shape shape4 = i7 != 0 ? RectangleShapeKt.f15014a : shape3;
                if ((i5 & 4) != 0) {
                    float f5 = DrawerDefaults.f9241a;
                    j4 = ColorSchemeKt.f(NavigationDrawerTokens.f13447c, g2);
                    i2 &= -897;
                }
                if ((i5 & 8) != 0) {
                    j5 = ColorSchemeKt.c(j4, g2);
                    i2 &= -7169;
                }
                if (i10 != 0) {
                    f4 = DrawerDefaults.f9242b;
                }
                if ((i5 & 32) != 0) {
                    windowInsets2 = DrawerDefaults.a(g2);
                    i2 &= -458753;
                }
                shape = shape4;
            } else {
                g2.A();
                if ((i5 & 4) != 0) {
                    i2 &= -897;
                }
                if ((i5 & 8) != 0) {
                    i2 &= -7169;
                }
                if ((i5 & 32) != 0) {
                    i2 &= -458753;
                }
                modifier2 = modifier;
                shape = shape3;
            }
            WindowInsets windowInsets3 = windowInsets2;
            long j6 = j4;
            long j7 = j5;
            float f6 = f4;
            g2.W();
            String a3 = Strings_androidKt.a(com.cooldev.gba.emulator.gameboy.R.string.navigation_menu, g2);
            boolean I = g2.I(a3);
            Object u2 = g2.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new NavigationDrawerKt$PermanentDrawerSheet$1$1(a3);
                g2.o(u2);
            }
            Modifier b2 = SemanticsModifierKt.b(modifier2, false, (l) u2);
            int i12 = i2 << 6;
            i3 = i5;
            i4 = a2;
            NavigationDrawerKt.a(null, windowInsets3, b2, shape, j6, j7, f6, qVar, g2, ((i2 >> 12) & 112) | 6 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | ((i2 << 3) & 29360128), 0);
            modifier3 = modifier2;
            windowInsets = windowInsets3;
            shape2 = shape;
            j2 = j6;
            j3 = j7;
            f2 = f6;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new NavigationDrawerKt$PermanentDrawerSheet$2(modifier3, shape2, j2, j3, f2, windowInsets, qVar, i4, i3);
        }
        return b0.f30125a;
    }
}
