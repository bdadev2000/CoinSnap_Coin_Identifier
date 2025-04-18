package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import q0.l;

/* loaded from: classes4.dex */
public final class DrawModifierKt {
    public static final CacheDrawModifierNode a(l lVar) {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), lVar);
    }

    public static final Modifier b(Modifier modifier, l lVar) {
        return modifier.T0(new DrawBehindElement(lVar));
    }

    public static final Modifier c(Modifier modifier, l lVar) {
        return modifier.T0(new DrawWithCacheElement(lVar));
    }

    public static final Modifier d(Modifier modifier, l lVar) {
        return modifier.T0(new DrawWithContentElement(lVar));
    }
}
