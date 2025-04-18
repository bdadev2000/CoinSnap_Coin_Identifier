package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;

/* loaded from: classes2.dex */
public final class BringIntoViewRequesterKt {
    public static final BringIntoViewRequester a() {
        return new BringIntoViewRequesterImpl();
    }

    public static final Modifier b(Modifier modifier, BringIntoViewRequester bringIntoViewRequester) {
        return modifier.T0(new BringIntoViewRequesterElement(bringIntoViewRequester));
    }
}
