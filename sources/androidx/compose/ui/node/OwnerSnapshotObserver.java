package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class OwnerSnapshotObserver {

    /* renamed from: a, reason: collision with root package name */
    public final SnapshotStateObserver f16155a;

    /* renamed from: b, reason: collision with root package name */
    public final l f16156b = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.f16166a;

    /* renamed from: c, reason: collision with root package name */
    public final l f16157c = OwnerSnapshotObserver$onCommitAffectingMeasure$1.f16167a;
    public final l d = OwnerSnapshotObserver$onCommitAffectingSemantics$1.f16168a;
    public final l e = OwnerSnapshotObserver$onCommitAffectingLayout$1.f16162a;

    /* renamed from: f, reason: collision with root package name */
    public final l f16158f = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.f16163a;

    /* renamed from: g, reason: collision with root package name */
    public final l f16159g = OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1.f16164a;

    /* renamed from: h, reason: collision with root package name */
    public final l f16160h = OwnerSnapshotObserver$onCommitAffectingLookahead$1.f16165a;

    public OwnerSnapshotObserver(l lVar) {
        this.f16155a = new SnapshotStateObserver(lVar);
    }

    public final void a() {
        this.f16155a.d(OwnerSnapshotObserver$clearInvalidObservations$1.f16161a);
    }

    public final void b(OwnerScope ownerScope, l lVar, q0.a aVar) {
        this.f16155a.e(ownerScope, lVar, aVar);
    }
}
