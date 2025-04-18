package androidx.compose.animation;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class SingleValueAnimationKt {
    public static final State a(long j2, FiniteAnimationSpec finiteAnimationSpec, Composer composer, int i2) {
        boolean I = composer.I(Color.f(j2));
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = (TwoWayConverter) ColorVectorConverterKt$ColorToVector$1.f1776a.invoke(Color.f(j2));
            composer.o(u2);
        }
        int i3 = i2 << 6;
        return AnimateAsStateKt.c(new Color(j2), (TwoWayConverter) u2, finiteAnimationSpec, null, "ColorAnimation", null, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i3) | (i3 & Opcodes.ASM7), 8);
    }
}
