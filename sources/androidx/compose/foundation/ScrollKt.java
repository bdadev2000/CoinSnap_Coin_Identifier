package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import q0.a;

/* loaded from: classes3.dex */
public final class ScrollKt {
    public static Modifier a(Modifier modifier, ScrollState scrollState) {
        return ComposedModifierKt.a(modifier, new ScrollKt$scroll$2(scrollState, false, null, true, false));
    }

    public static final ScrollState b(Composer composer) {
        Object[] objArr = new Object[0];
        SaverKt$Saver$1 saverKt$Saver$1 = ScrollState.f2864i;
        boolean c2 = composer.c(0);
        Object u2 = composer.u();
        if (c2 || u2 == Composer.Companion.f13690a) {
            u2 = new ScrollKt$rememberScrollState$1$1(0);
            composer.o(u2);
        }
        return (ScrollState) RememberSaveableKt.c(objArr, saverKt$Saver$1, null, (a) u2, composer, 0, 4);
    }

    public static Modifier c(Modifier modifier, ScrollState scrollState) {
        return ComposedModifierKt.a(modifier, new ScrollKt$scroll$2(scrollState, false, null, true, true));
    }
}
