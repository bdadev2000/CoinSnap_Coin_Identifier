package androidx.compose.material3;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes2.dex */
final class BottomAppBarStateImpl implements BottomAppBarState {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f7916a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f7917b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f7918c;

    public BottomAppBarStateImpl(float f2, float f3, float f4) {
        this.f7916a = PrimitiveSnapshotStateKt.a(f2);
        this.f7917b = PrimitiveSnapshotStateKt.a(f4);
        this.f7918c = PrimitiveSnapshotStateKt.a(f3);
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float a() {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.f7916a;
        if (parcelableSnapshotMutableFloatState.c() == 0.0f) {
            return 0.0f;
        }
        return this.f7918c.c() / parcelableSnapshotMutableFloatState.c();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float b() {
        return this.f7918c.c();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float c() {
        return this.f7917b.c();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final float d() {
        return this.f7916a.c();
    }

    @Override // androidx.compose.material3.BottomAppBarState
    public final void e(float f2) {
        this.f7918c.n(p0.a.z(f2, this.f7916a.c(), 0.0f));
    }
}
