package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;

@Stable
/* loaded from: classes2.dex */
public interface ModifierLocalProvider<T> extends Modifier.Element {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    ProvidableModifierLocal getKey();

    Object getValue();
}
