package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes3.dex */
final class ProgressIndicatorKt$CircularProgressIndicator$10 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f10624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10625b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f10626c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10627f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$10(float f2, int i2, int i3, long j2, Modifier modifier) {
        super(2);
        this.f10624a = modifier;
        this.f10625b = j2;
        this.f10626c = f2;
        this.d = i2;
        this.f10627f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        float f2;
        Modifier modifier;
        long j2;
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        int i3 = this.f10627f;
        float f3 = ProgressIndicatorKt.f10609a;
        ComposerImpl g2 = ((Composer) obj).g(947193756);
        int i4 = i3 & 1;
        Modifier modifier2 = this.f10624a;
        if (i4 != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(modifier2) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i5 = a2 & 48;
        long j3 = this.f10625b;
        if (i5 == 0) {
            i2 |= ((i3 & 2) == 0 && g2.d(j3)) ? 32 : 16;
        }
        int i6 = i3 & 4;
        float f4 = this.f10626c;
        if (i6 != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.b(f4) ? 256 : 128;
        }
        if ((i2 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
            j2 = j3;
            f2 = f4;
            modifier = modifier2;
        } else {
            g2.u0();
            if ((a2 & 1) == 0 || g2.e0()) {
                if (i4 != 0) {
                    modifier2 = Modifier.Companion.f14687a;
                }
                if ((i3 & 2) != 0) {
                    j3 = ProgressIndicatorDefaults.a(g2);
                    i2 &= -113;
                }
                if (i6 != 0) {
                    f4 = ProgressIndicatorDefaults.f10604a;
                }
            } else {
                g2.A();
                if ((i3 & 2) != 0) {
                    i2 &= -113;
                }
            }
            long j4 = j3;
            float f5 = f4;
            g2.W();
            float f6 = ProgressIndicatorDefaults.f10604a;
            ProgressIndicatorKt.c(f5, ProgressIndicatorDefaults.d, (i2 & 14) | 24576 | (i2 & 112) | (i2 & 896), 0, j4, Color.f14961h, g2, modifier2);
            f2 = f5;
            modifier = modifier2;
            j2 = j4;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ProgressIndicatorKt$CircularProgressIndicator$10(f2, a2, i3, j2, modifier);
        }
        return b0.f30125a;
    }
}
