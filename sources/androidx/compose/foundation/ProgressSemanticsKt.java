package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import w0.d;

/* loaded from: classes3.dex */
public final class ProgressSemanticsKt {
    public static final Modifier a(Modifier modifier) {
        return SemanticsModifierKt.b(modifier, true, ProgressSemanticsKt$progressSemantics$2.f2846a);
    }

    public static final Modifier b(Modifier modifier, float f2, d dVar, int i2) {
        return SemanticsModifierKt.b(modifier, true, new ProgressSemanticsKt$progressSemantics$1(f2, dVar, i2));
    }
}
