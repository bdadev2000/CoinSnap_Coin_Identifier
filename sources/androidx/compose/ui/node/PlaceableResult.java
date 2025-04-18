package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PlaceableResult implements OwnerScope {

    /* renamed from: a, reason: collision with root package name */
    public final MeasureResult f16169a;

    /* renamed from: b, reason: collision with root package name */
    public final LookaheadCapablePlaceable f16170b;

    public PlaceableResult(MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.f16169a = measureResult;
        this.f16170b = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean Y0() {
        return this.f16170b.x0().B();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceableResult)) {
            return false;
        }
        PlaceableResult placeableResult = (PlaceableResult) obj;
        return p0.a.g(this.f16169a, placeableResult.f16169a) && p0.a.g(this.f16170b, placeableResult.f16170b);
    }

    public final int hashCode() {
        return this.f16170b.hashCode() + (this.f16169a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f16169a + ", placeable=" + this.f16170b + ')';
    }
}
