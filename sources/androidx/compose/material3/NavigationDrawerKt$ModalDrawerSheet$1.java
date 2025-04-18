package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;
import q0.q;

/* loaded from: classes2.dex */
final class NavigationDrawerKt$ModalDrawerSheet$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f10101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Shape f10102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10103c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f10104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10105g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f10106h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10107i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10108j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalDrawerSheet$1(Modifier modifier, Shape shape, long j2, long j3, float f2, WindowInsets windowInsets, q qVar, int i2, int i3) {
        super(2);
        this.f10101a = modifier;
        this.f10102b = shape;
        this.f10103c = j2;
        this.d = j3;
        this.f10104f = f2;
        this.f10105g = windowInsets;
        this.f10106h = qVar;
        this.f10107i = i2;
        this.f10108j = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        Modifier modifier;
        int i3;
        int i4;
        Modifier modifier2;
        WindowInsets windowInsets;
        Shape shape;
        long j2;
        long j3;
        float f2;
        ((Number) obj2).intValue();
        q qVar = this.f10106h;
        int a2 = RecomposeScopeImplKt.a(this.f10107i | 1);
        int i5 = this.f10108j;
        float f3 = NavigationDrawerKt.f10042a;
        ComposerImpl g2 = ((Composer) obj).g(1001163336);
        int i6 = i5 & 1;
        Modifier modifier3 = this.f10101a;
        if (i6 != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(modifier3) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i7 = a2 & 48;
        Shape shape2 = this.f10102b;
        if (i7 == 0) {
            i2 |= ((i5 & 2) == 0 && g2.I(shape2)) ? 32 : 16;
        }
        int i8 = a2 & 384;
        long j4 = this.f10103c;
        if (i8 == 0) {
            i2 |= ((i5 & 4) == 0 && g2.d(j4)) ? 256 : 128;
        }
        int i9 = a2 & 3072;
        long j5 = this.d;
        if (i9 == 0) {
            i2 |= ((i5 & 8) == 0 && g2.d(j5)) ? Opcodes.ACC_STRICT : 1024;
        }
        int i10 = i5 & 16;
        float f4 = this.f10104f;
        if (i10 != 0) {
            i2 |= 24576;
        } else if ((a2 & 24576) == 0) {
            i2 |= g2.b(f4) ? 16384 : 8192;
        }
        int i11 = 196608 & a2;
        WindowInsets windowInsets2 = this.f10105g;
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
            shape = shape2;
            j2 = j4;
            j3 = j5;
            f2 = f4;
            i3 = i5;
            i4 = a2;
            windowInsets = windowInsets2;
            modifier2 = modifier3;
        } else {
            g2.u0();
            if ((a2 & 1) == 0 || g2.e0()) {
                modifier = i6 != 0 ? Modifier.Companion.f14687a : modifier3;
                if ((i5 & 2) != 0) {
                    float f5 = DrawerDefaults.f9241a;
                    float f6 = NavigationDrawerTokens.f13445a;
                    shape2 = ShapesKt.a(ShapeKeyTokens.f13514h, g2);
                    i2 &= -113;
                }
                if ((i5 & 4) != 0) {
                    float f7 = DrawerDefaults.f9241a;
                    float f8 = NavigationDrawerTokens.f13445a;
                    j4 = ColorSchemeKt.f(ColorSchemeKeyTokens.w, g2);
                    i2 &= -897;
                }
                if ((i5 & 8) != 0) {
                    j5 = ColorSchemeKt.c(j4, g2);
                    i2 &= -7169;
                }
                if (i10 != 0) {
                    f4 = DrawerDefaults.f9241a;
                }
                if ((i5 & 32) != 0) {
                    windowInsets2 = DrawerDefaults.a(g2);
                    i2 &= -458753;
                }
            } else {
                g2.A();
                if ((i5 & 2) != 0) {
                    i2 &= -113;
                }
                if ((i5 & 4) != 0) {
                    i2 &= -897;
                }
                if ((i5 & 8) != 0) {
                    i2 &= -7169;
                }
                if ((i5 & 32) != 0) {
                    i2 &= -458753;
                }
                modifier = modifier3;
            }
            WindowInsets windowInsets3 = windowInsets2;
            Shape shape3 = shape2;
            long j6 = j4;
            long j7 = j5;
            float f9 = f4;
            g2.W();
            int i12 = i2 << 6;
            i3 = i5;
            i4 = a2;
            NavigationDrawerKt.a(null, windowInsets3, modifier, shape3, j6, j7, f9, qVar, g2, ((i2 >> 12) & 112) | 6 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | ((i2 << 3) & 29360128), 0);
            modifier2 = modifier;
            windowInsets = windowInsets3;
            shape = shape3;
            j2 = j6;
            j3 = j7;
            f2 = f9;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new NavigationDrawerKt$ModalDrawerSheet$1(modifier2, shape, j2, j3, f2, windowInsets, qVar, i4, i3);
        }
        return b0.f30125a;
    }
}
