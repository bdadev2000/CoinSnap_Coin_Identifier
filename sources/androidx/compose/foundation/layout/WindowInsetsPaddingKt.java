package androidx.compose.foundation.layout;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import q0.l;

/* loaded from: classes.dex */
public final class WindowInsetsPaddingKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ProvidableModifierLocal f4216a = new ModifierLocal(WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1.f4217a);

    public static final Modifier a(Modifier modifier, WindowInsets windowInsets) {
        return ComposedModifierKt.a(modifier, new WindowInsetsPaddingKt$consumeWindowInsets$2(windowInsets));
    }

    public static final Modifier b(Modifier modifier, l lVar) {
        return ComposedModifierKt.a(modifier, new WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2(lVar));
    }

    public static final Modifier c(Modifier modifier, WindowInsets windowInsets) {
        return ComposedModifierKt.a(modifier, new WindowInsetsPaddingKt$windowInsetsPadding$2(windowInsets));
    }
}
