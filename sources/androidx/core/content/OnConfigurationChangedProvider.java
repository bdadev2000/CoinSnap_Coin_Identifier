package androidx.core.content;

import androidx.core.util.Consumer;

/* loaded from: classes4.dex */
public interface OnConfigurationChangedProvider {
    void addOnConfigurationChangedListener(Consumer consumer);

    void removeOnConfigurationChangedListener(Consumer consumer);
}
