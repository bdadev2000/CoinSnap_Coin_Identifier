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

/* loaded from: classes3.dex */
final class SliderDefaults$Track$8 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SliderDefaults f11289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f11290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f11291c;
    public final /* synthetic */ SliderColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f11292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11293g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11294h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$8(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, Modifier modifier, SliderColors sliderColors, boolean z2, int i2, int i3) {
        super(2);
        this.f11289a = sliderDefaults;
        this.f11290b = rangeSliderState;
        this.f11291c = modifier;
        this.d = sliderColors;
        this.f11292f = z2;
        this.f11293g = i2;
        this.f11294h = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        boolean z2;
        Modifier modifier;
        SliderColors sliderColors;
        SliderDefaults sliderDefaults;
        int i3;
        boolean z3;
        SliderColors sliderColors2;
        ((Number) obj2).intValue();
        RangeSliderState rangeSliderState = this.f11290b;
        int a2 = RecomposeScopeImplKt.a(this.f11293g | 1);
        int i4 = this.f11294h;
        SliderDefaults sliderDefaults2 = this.f11289a;
        sliderDefaults2.getClass();
        ComposerImpl g2 = ((Composer) obj).g(-1617869097);
        if ((i4 & 1) != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.w(rangeSliderState) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i5 = i4 & 2;
        Modifier modifier2 = this.f11291c;
        if (i5 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.I(modifier2) ? 32 : 16;
        }
        int i6 = a2 & 384;
        SliderColors sliderColors3 = this.d;
        if (i6 == 0) {
            i2 |= ((i4 & 4) == 0 && g2.I(sliderColors3)) ? 256 : 128;
        }
        int i7 = i4 & 8;
        boolean z4 = this.f11292f;
        if (i7 != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.a(z4) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i4 & 16) != 0) {
            i2 |= 24576;
        } else if ((a2 & 24576) == 0) {
            i2 |= g2.I(sliderDefaults2) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && g2.i()) {
            g2.A();
            sliderColors2 = sliderColors3;
            z3 = z4;
            sliderDefaults = sliderDefaults2;
            i3 = i4;
        } else {
            g2.u0();
            if ((a2 & 1) == 0 || g2.e0()) {
                if (i5 != 0) {
                    modifier2 = Modifier.Companion.f14687a;
                }
                if ((i4 & 4) != 0) {
                    sliderColors3 = SliderDefaults.f(g2);
                    i2 &= -897;
                }
                if (i7 != 0) {
                    z2 = true;
                    modifier = modifier2;
                    sliderColors = sliderColors3;
                    g2.W();
                    sliderDefaults = sliderDefaults2;
                    i3 = i4;
                    sliderDefaults2.b(rangeSliderState, modifier, z2, sliderColors, null, null, SliderKt.d, SliderKt.e, g2, (i2 & 14) | 14155776 | (i2 & 112) | ((i2 >> 3) & 896) | ((i2 << 3) & 7168) | ((i2 << 12) & 234881024), 48);
                    z3 = z2;
                    modifier2 = modifier;
                    sliderColors2 = sliderColors;
                }
            } else {
                g2.A();
                if ((i4 & 4) != 0) {
                    i2 &= -897;
                }
            }
            modifier = modifier2;
            sliderColors = sliderColors3;
            z2 = z4;
            g2.W();
            sliderDefaults = sliderDefaults2;
            i3 = i4;
            sliderDefaults2.b(rangeSliderState, modifier, z2, sliderColors, null, null, SliderKt.d, SliderKt.e, g2, (i2 & 14) | 14155776 | (i2 & 112) | ((i2 >> 3) & 896) | ((i2 << 3) & 7168) | ((i2 << 12) & 234881024), 48);
            z3 = z2;
            modifier2 = modifier;
            sliderColors2 = sliderColors;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SliderDefaults$Track$8(sliderDefaults, rangeSliderState, modifier2, sliderColors2, z3, a2, i3);
        }
        return b0.f30125a;
    }
}
