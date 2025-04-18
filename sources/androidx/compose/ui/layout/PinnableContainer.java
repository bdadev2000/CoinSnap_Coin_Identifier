package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes3.dex */
public interface PinnableContainer {

    /* loaded from: classes3.dex */
    public interface PinnedHandle {
        void release();
    }

    PinnedHandle a();
}
