package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes.dex */
final class DividerKt$Divider$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f9225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f9226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9227c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9228f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DividerKt$Divider$1(float f2, int i2, int i3, long j2, Modifier modifier) {
        super(2);
        this.f9225a = modifier;
        this.f9226b = f2;
        this.f9227c = j2;
        this.d = i2;
        this.f9228f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        int i3 = this.f9228f;
        ComposerImpl g2 = ((Composer) obj).g(1562471785);
        int i4 = i3 & 1;
        Modifier modifier = this.f9225a;
        if (i4 != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(modifier) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i5 = i3 & 2;
        float f2 = this.f9226b;
        if (i5 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.b(f2) ? 32 : 16;
        }
        int i6 = a2 & 384;
        long j2 = this.f9227c;
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
                    f2 = DividerDefaults.f9224a;
                }
                if ((i3 & 4) != 0) {
                    float f3 = DividerDefaults.f9224a;
                    float f4 = DividerTokens.f13315a;
                    j2 = ColorSchemeKt.f(ColorSchemeKeyTokens.f13277m, g2);
                }
            } else {
                g2.A();
            }
            g2.W();
            g2.J(-433645095);
            float density = Dp.a(f2, 0.0f) ? 1.0f / ((Density) g2.K(CompositionLocalsKt.f16434f)).getDensity() : f2;
            g2.V(false);
            BoxKt.a(BackgroundKt.a(SizeKt.e(SizeKt.d(modifier, 1.0f), density), j2, RectangleShapeKt.f15014a), g2, 0);
        }
        Modifier modifier2 = modifier;
        float f5 = f2;
        long j3 = j2;
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DividerKt$Divider$1(f5, a2, i3, j3, modifier2);
        }
        return b0.f30125a;
    }
}
