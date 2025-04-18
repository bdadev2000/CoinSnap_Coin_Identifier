package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;

/* loaded from: classes2.dex */
public final class NestedScrollModifierKt {
    public static final Modifier a(Modifier modifier, NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        return modifier.T0(new NestedScrollElement(nestedScrollConnection, nestedScrollDispatcher));
    }
}
