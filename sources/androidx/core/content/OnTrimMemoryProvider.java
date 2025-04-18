package androidx.core.content;

import androidx.core.util.Consumer;

/* loaded from: classes2.dex */
public interface OnTrimMemoryProvider {
    void addOnTrimMemoryListener(Consumer consumer);

    void removeOnTrimMemoryListener(Consumer consumer);
}
