package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import org.objectweb.asm.Opcodes;
import q0.l;

/* loaded from: classes.dex */
public final class AndroidCursorHandle_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f5393a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5394b;

    static {
        float f2 = 25;
        f5393a = f2;
        f5394b = (f2 * 2.0f) / 2.4142137f;
    }

    public static final void a(OffsetProvider offsetProvider, Modifier modifier, long j2, Composer composer, int i2, int i3) {
        int i4;
        long j3;
        int i5;
        ComposerImpl g2 = composer.g(1776202187);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? g2.I(offsetProvider) : g2.w(offsetProvider) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= g2.I(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                j3 = j2;
                if (g2.d(j2)) {
                    i5 = 256;
                    i4 |= i5;
                }
            } else {
                j3 = j2;
            }
            i5 = 128;
            i4 |= i5;
        } else {
            j3 = j2;
        }
        if ((i4 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            g2.u0();
            if ((i2 & 1) != 0 && !g2.e0()) {
                g2.A();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
            } else if ((i3 & 4) != 0) {
                i4 &= -897;
                j3 = 9205357640488583168L;
            }
            g2.W();
            int i6 = i4 & 14;
            boolean z2 = i6 == 4 || ((i4 & 8) != 0 && g2.w(offsetProvider));
            Object u2 = g2.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                u2 = new AndroidCursorHandle_androidKt$CursorHandle$finalModifier$1$1(offsetProvider);
                g2.o(u2);
            }
            AndroidSelectionHandles_androidKt.a(offsetProvider, Alignment.Companion.f14660b, ComposableLambdaKt.c(-1653527038, new AndroidCursorHandle_androidKt$CursorHandle$1(j3, SemanticsModifierKt.b(modifier, false, (l) u2)), g2), g2, i6 | 432);
        }
        long j4 = j3;
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AndroidCursorHandle_androidKt$CursorHandle$2(offsetProvider, modifier, j4, i2, i3);
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(694251107);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.f14687a;
            }
            SpacerKt.a(ComposedModifierKt.a(SizeKt.o(modifier, f5394b, f5393a), AndroidCursorHandle_androidKt$drawCursorHandle$1.f5405a), g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AndroidCursorHandle_androidKt$DefaultCursorHandle$1(modifier, i2, i3);
        }
    }
}
