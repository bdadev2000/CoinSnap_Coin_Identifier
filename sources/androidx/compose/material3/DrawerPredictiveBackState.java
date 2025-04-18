package androidx.compose.material3;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;

@Stable
/* loaded from: classes3.dex */
public final class DrawerPredictiveBackState {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f9244a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f9245b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f9246c;

    public DrawerPredictiveBackState() {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(Boolean.TRUE, StructuralEqualityPolicy.f14078a);
        this.f9244a = f2;
        this.f9245b = PrimitiveSnapshotStateKt.a(0.0f);
        this.f9246c = PrimitiveSnapshotStateKt.a(0.0f);
    }

    public final boolean a() {
        return ((Boolean) this.f9244a.getValue()).booleanValue();
    }
}
