package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public abstract class StateRecord {

    /* renamed from: a, reason: collision with root package name */
    public int f14634a = SnapshotKt.k().d();

    /* renamed from: b, reason: collision with root package name */
    public StateRecord f14635b;

    public abstract void a(StateRecord stateRecord);

    public abstract StateRecord b();
}
