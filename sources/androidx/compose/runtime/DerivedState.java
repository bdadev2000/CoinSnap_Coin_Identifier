package androidx.compose.runtime;

import androidx.compose.runtime.DerivedSnapshotState;

/* loaded from: classes2.dex */
public interface DerivedState<T> extends State<T> {

    /* loaded from: classes2.dex */
    public interface Record<T> {
    }

    SnapshotMutationPolicy f();

    DerivedSnapshotState.ResultRecord s();
}
