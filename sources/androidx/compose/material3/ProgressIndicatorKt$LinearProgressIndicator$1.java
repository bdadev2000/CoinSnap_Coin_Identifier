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
final class ProgressIndicatorKt$LinearProgressIndicator$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f10676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f10677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10678c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10679f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10680g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10681h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$1(q0.a aVar, Modifier modifier, long j2, long j3, int i2, int i3, int i4) {
        super(2);
        this.f10676a = aVar;
        this.f10677b = modifier;
        this.f10678c = j2;
        this.d = j3;
        this.f10679f = i2;
        this.f10680g = i3;
        this.f10681h = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        int i3;
        long j2;
        long j3;
        int i4;
        ((Number) obj2).intValue();
        q0.a aVar = this.f10676a;
        int a2 = RecomposeScopeImplKt.a(this.f10680g | 1);
        int i5 = this.f10681h;
        float f2 = ProgressIndicatorKt.f10609a;
        ComposerImpl g2 = ((Composer) obj).g(-1796992155);
        if ((i5 & 1) != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.w(aVar) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i6 = i5 & 2;
        Modifier modifier = this.f10677b;
        if (i6 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.I(modifier) ? 32 : 16;
        }
        int i7 = a2 & 384;
        long j4 = this.f10678c;
        if (i7 == 0) {
            i2 |= ((i5 & 4) == 0 && g2.d(j4)) ? 256 : 128;
        }
        int i8 = a2 & 3072;
        long j5 = this.d;
        if (i8 == 0) {
            i2 |= ((i5 & 8) == 0 && g2.d(j5)) ? Opcodes.ACC_STRICT : 1024;
        }
        int i9 = i5 & 16;
        int i10 = this.f10679f;
        if (i9 != 0) {
            i2 |= 24576;
        } else if ((a2 & 24576) == 0) {
            i2 |= g2.c(i10) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && g2.i()) {
            g2.A();
            j2 = j4;
            j3 = j5;
            i4 = i10;
            i3 = i5;
        } else {
            g2.u0();
            if ((a2 & 1) == 0 || g2.e0()) {
                if (i6 != 0) {
                    modifier = Modifier.Companion.f14687a;
                }
                if ((i5 & 4) != 0) {
                    j4 = ProgressIndicatorDefaults.b(g2);
                    i2 &= -897;
                }
                if ((i5 & 8) != 0) {
                    j5 = ProgressIndicatorDefaults.c(g2);
                    i2 &= -7169;
                }
                if (i9 != 0) {
                    i10 = ProgressIndicatorDefaults.f10605b;
                }
            } else {
                g2.A();
                if ((i5 & 4) != 0) {
                    i2 &= -897;
                }
                if ((i5 & 8) != 0) {
                    i2 &= -7169;
                }
            }
            Modifier modifier2 = modifier;
            long j6 = j4;
            long j7 = j5;
            int i11 = i10;
            g2.W();
            i3 = i5;
            ProgressIndicatorKt.d(aVar, modifier2, j6, j7, i11, ProgressIndicatorDefaults.f10607f, null, g2, (i2 & 14) | 196608 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (i2 & 57344), 64);
            modifier = modifier2;
            j2 = j6;
            j3 = j7;
            i4 = i11;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ProgressIndicatorKt$LinearProgressIndicator$1(aVar, modifier, j2, j3, i4, a2, i3);
        }
        return b0.f30125a;
    }
}
