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
final class ProgressIndicatorKt$CircularProgressIndicator$9 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f10664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f10665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10666c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10668g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$9(float f2, Modifier modifier, long j2, float f3, int i2, int i3) {
        super(2);
        this.f10664a = f2;
        this.f10665b = modifier;
        this.f10666c = j2;
        this.d = f3;
        this.f10667f = i2;
        this.f10668g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        long j2;
        float f2;
        ((Number) obj2).intValue();
        float f3 = this.f10664a;
        int a2 = RecomposeScopeImplKt.a(this.f10667f | 1);
        int i3 = this.f10668g;
        float f4 = ProgressIndicatorKt.f10609a;
        ComposerImpl g2 = ((Composer) obj).g(402841196);
        if ((i3 & 1) != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.b(f3) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i4 = i3 & 2;
        Modifier modifier = this.f10665b;
        if (i4 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.I(modifier) ? 32 : 16;
        }
        int i5 = a2 & 384;
        long j3 = this.f10666c;
        if (i5 == 0) {
            i2 |= ((i3 & 4) == 0 && g2.d(j3)) ? 256 : 128;
        }
        int i6 = i3 & 8;
        float f5 = this.d;
        if (i6 != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.b(f5) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 1171) == 1170 && g2.i()) {
            g2.A();
            j2 = j3;
            f2 = f5;
        } else {
            g2.u0();
            if ((a2 & 1) == 0 || g2.e0()) {
                if (i4 != 0) {
                    modifier = Modifier.Companion.f14687a;
                }
                if ((i3 & 4) != 0) {
                    j3 = ProgressIndicatorDefaults.a(g2);
                    i2 &= -897;
                }
                if (i6 != 0) {
                    f5 = ProgressIndicatorDefaults.f10604a;
                }
            } else {
                g2.A();
                if ((i3 & 4) != 0) {
                    i2 &= -897;
                }
            }
            Modifier modifier2 = modifier;
            long j4 = j3;
            float f6 = f5;
            g2.W();
            float f7 = ProgressIndicatorDefaults.f10604a;
            ProgressIndicatorKt.a(f3, modifier2, j4, f6, Color.f14961h, ProgressIndicatorDefaults.f10606c, g2, (i2 & 14) | 196608 | (i2 & 112) | (i2 & 896) | (i2 & 7168), 0);
            modifier = modifier2;
            j2 = j4;
            f2 = f6;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ProgressIndicatorKt$CircularProgressIndicator$9(f3, modifier, j2, f2, a2, i3);
        }
        return b0.f30125a;
    }
}
