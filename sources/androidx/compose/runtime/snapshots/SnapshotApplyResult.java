package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes.dex */
public abstract class SnapshotApplyResult {

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Failure extends SnapshotApplyResult {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Success extends SnapshotApplyResult {

        /* renamed from: a, reason: collision with root package name */
        public static final Success f14556a = new Object();
    }
}
