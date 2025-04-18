package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.snapshots.Snapshot;
import com.google.android.gms.common.api.Api;
import d0.b0;
import h0.g;
import i0.a;
import q0.l;
import q0.p;

@Stable
/* loaded from: classes.dex */
public final class ScrollState implements ScrollableState {

    /* renamed from: i, reason: collision with root package name */
    public static final SaverKt$Saver$1 f2864i;

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f2865a;
    public float e;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f2866b = SnapshotIntStateKt.a(0);

    /* renamed from: c, reason: collision with root package name */
    public final MutableInteractionSource f2867c = InteractionSourceKt.a();
    public final ParcelableSnapshotMutableIntState d = SnapshotIntStateKt.a(Api.BaseClientBuilder.API_PRIORITY_OTHER);

    /* renamed from: f, reason: collision with root package name */
    public final ScrollableState f2868f = ScrollableStateKt.a(new ScrollState$scrollableState$1(this));

    /* renamed from: g, reason: collision with root package name */
    public final State f2869g = SnapshotStateKt.e(new ScrollState$canScrollForward$2(this));

    /* renamed from: h, reason: collision with root package name */
    public final State f2870h = SnapshotStateKt.e(new ScrollState$canScrollBackward$2(this));

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    static {
        ScrollState$Companion$Saver$1 scrollState$Companion$Saver$1 = ScrollState$Companion$Saver$1.f2871a;
        ScrollState$Companion$Saver$2 scrollState$Companion$Saver$2 = ScrollState$Companion$Saver$2.f2872a;
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f14531a;
        f2864i = new SaverKt$Saver$1(scrollState$Companion$Saver$2, scrollState$Companion$Saver$1);
    }

    public ScrollState(int i2) {
        this.f2865a = SnapshotIntStateKt.a(i2);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return this.f2868f.a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object b(MutatePriority mutatePriority, p pVar, g gVar) {
        Object b2 = this.f2868f.b(mutatePriority, pVar, gVar);
        return b2 == a.f30806a ? b2 : b0.f30125a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean c() {
        return ((Boolean) this.f2870h.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean d() {
        return ((Boolean) this.f2869g.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float e(float f2) {
        return this.f2868f.e(f2);
    }

    public final void f(int i2) {
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.f2865a;
        this.d.b(i2);
        Snapshot a2 = Snapshot.Companion.a();
        l f2 = a2 != null ? a2.f() : null;
        Snapshot c2 = Snapshot.Companion.c(a2);
        try {
            if (parcelableSnapshotMutableIntState.g() > i2) {
                parcelableSnapshotMutableIntState.b(i2);
            }
        } finally {
            Snapshot.Companion.f(a2, c2, f2);
        }
    }
}
