package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import org.objectweb.asm.Opcodes;
import q0.l;

/* loaded from: classes3.dex */
public final class ExposedDropdownMenu_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f9345a = 16;

    public static final void a(View view, Density density, q0.a aVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1319522472);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(view) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(density) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(aVar) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            boolean w = ((i3 & 896) == 256) | g2.w(view);
            Object u2 = g2.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1(view, aVar);
                g2.o(u2);
            }
            EffectsKt.b(view, density, (l) u2, g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ExposedDropdownMenu_androidKt$SoftKeyboardListener$2(view, density, aVar, i2);
        }
    }

    public static final int b(int i2, Rect rect, Rect rect2) {
        int t02;
        float f2 = i2;
        float f3 = rect.f14915b;
        float f4 = f3 + f2;
        float f5 = rect.d;
        float f6 = f5 - f2;
        float f7 = rect2.f14915b;
        if (f7 <= f5) {
            float f8 = rect2.d;
            if (f8 >= f3) {
                t02 = p0.a.t0(Math.max(f7 - f4, f6 - f8));
                return Math.max(t02, 0);
            }
        }
        t02 = p0.a.t0(f6 - f4);
        return Math.max(t02, 0);
    }
}
