package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes3.dex */
final class TabRowDefaults$Indicator$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TabRowDefaults f11799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f11800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f11801c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11802f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$Indicator$1(TabRowDefaults tabRowDefaults, Modifier modifier, float f2, long j2, int i2, int i3) {
        super(2);
        this.f11799a = tabRowDefaults;
        this.f11800b = modifier;
        this.f11801c = f2;
        this.d = j2;
        this.f11802f = i2;
        this.f11803g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f11802f | 1);
        int i3 = this.f11803g;
        TabRowDefaults tabRowDefaults = this.f11799a;
        tabRowDefaults.getClass();
        ComposerImpl g2 = ((Composer) obj).g(1454716052);
        int i4 = i3 & 1;
        Modifier modifier = this.f11800b;
        if (i4 != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(modifier) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i5 = i3 & 2;
        float f2 = this.f11801c;
        if (i5 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.b(f2) ? 32 : 16;
        }
        int i6 = a2 & 384;
        long j2 = this.d;
        if (i6 == 0) {
            i2 |= ((i3 & 4) == 0 && g2.d(j2)) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            g2.u0();
            if ((a2 & 1) == 0 || g2.e0()) {
                if (i4 != 0) {
                    modifier = Modifier.Companion.f14687a;
                }
                if (i5 != 0) {
                    f2 = PrimaryNavigationTabTokens.f13488a;
                }
                if ((i3 & 4) != 0) {
                    ColorScheme a3 = MaterialTheme.a(g2);
                    float f3 = PrimaryNavigationTabTokens.f13488a;
                    j2 = ColorSchemeKt.e(a3, ColorSchemeKeyTokens.f13278n);
                }
            } else {
                g2.A();
            }
            g2.W();
            BoxKt.a(BackgroundKt.a(SizeKt.e(SizeKt.d(modifier, 1.0f), f2), j2, RectangleShapeKt.f15014a), g2, 0);
        }
        Modifier modifier2 = modifier;
        float f4 = f2;
        long j3 = j2;
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TabRowDefaults$Indicator$1(tabRowDefaults, modifier2, f4, j3, a2, i3);
        }
        return b0.f30125a;
    }
}
