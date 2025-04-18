package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes4.dex */
final class ProgressIndicatorKt$LinearProgressIndicator$6 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f10713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10715c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10717g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$6(Modifier modifier, long j2, long j3, int i2, int i3, int i4) {
        super(2);
        this.f10713a = modifier;
        this.f10714b = j2;
        this.f10715c = j3;
        this.d = i2;
        this.f10716f = i3;
        this.f10717g = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        Modifier modifier;
        long j2;
        long j3;
        int i3;
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f10716f | 1);
        int i4 = this.f10717g;
        float f2 = ProgressIndicatorKt.f10609a;
        ComposerImpl g2 = ((Composer) obj).g(-476865359);
        int i5 = i4 & 1;
        Modifier modifier2 = this.f10713a;
        if (i5 != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(modifier2) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i6 = a2 & 48;
        long j4 = this.f10714b;
        if (i6 == 0) {
            i2 |= ((i4 & 2) == 0 && g2.d(j4)) ? 32 : 16;
        }
        int i7 = a2 & 384;
        long j5 = this.f10715c;
        if (i7 == 0) {
            i2 |= ((i4 & 4) == 0 && g2.d(j5)) ? 256 : 128;
        }
        int i8 = i4 & 8;
        int i9 = this.d;
        if (i8 != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.c(i9) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 1171) == 1170 && g2.i()) {
            g2.A();
            modifier = modifier2;
            j2 = j4;
            j3 = j5;
            i3 = i9;
        } else {
            g2.u0();
            if ((a2 & 1) == 0 || g2.e0()) {
                if (i5 != 0) {
                    modifier2 = Modifier.Companion.f14687a;
                }
                if ((i4 & 2) != 0) {
                    j4 = ProgressIndicatorDefaults.b(g2);
                    i2 &= -113;
                }
                if ((i4 & 4) != 0) {
                    j5 = ProgressIndicatorDefaults.c(g2);
                    i2 &= -897;
                }
                if (i8 != 0) {
                    i9 = ProgressIndicatorDefaults.f10605b;
                }
            } else {
                g2.A();
                if ((i4 & 2) != 0) {
                    i2 &= -113;
                }
                if ((i4 & 4) != 0) {
                    i2 &= -897;
                }
            }
            int i10 = i9;
            g2.W();
            ProgressIndicatorKt.f(ProgressIndicatorDefaults.f10607f, i10, (i2 & 14) | 24576 | (i2 & 112) | (i2 & 896) | (i2 & 7168), 0, j4, j5, g2, modifier2);
            modifier = modifier2;
            j2 = j4;
            j3 = j5;
            i3 = i10;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ProgressIndicatorKt$LinearProgressIndicator$6(modifier, j2, j3, i3, a2, i4);
        }
        return b0.f30125a;
    }
}
