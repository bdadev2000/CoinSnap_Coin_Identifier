package androidx.savedstate;

import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes4.dex */
public interface SavedStateRegistryOwner extends LifecycleOwner {
    SavedStateRegistry getSavedStateRegistry();
}
