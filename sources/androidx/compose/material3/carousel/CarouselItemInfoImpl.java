package androidx.compose.material3.carousel;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;

@StabilityInferred
/* loaded from: classes3.dex */
public final class CarouselItemInfoImpl implements CarouselItemInfo {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f12647a = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f12648b = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f12649c = PrimitiveSnapshotStateKt.a(0.0f);
    public final ParcelableSnapshotMutableState d;

    public CarouselItemInfoImpl() {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(Rect.e, StructuralEqualityPolicy.f14078a);
        this.d = f2;
    }
}
