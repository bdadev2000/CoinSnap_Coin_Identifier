package androidx.compose.material3.internal;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AnchoredDraggableState$closestValue$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f12854a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$closestValue$2(AnchoredDraggableState anchoredDraggableState) {
        super(0);
        this.f12854a = anchoredDraggableState;
    }

    @Override // q0.a
    public final Object invoke() {
        Object a2;
        AnchoredDraggableState anchoredDraggableState = this.f12854a;
        Object value = anchoredDraggableState.f12830m.getValue();
        if (value != null) {
            return value;
        }
        float c2 = anchoredDraggableState.f12827j.c();
        boolean isNaN = Float.isNaN(c2);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = anchoredDraggableState.f12824g;
        if (isNaN) {
            return parcelableSnapshotMutableState.getValue();
        }
        Object value2 = parcelableSnapshotMutableState.getValue();
        DraggableAnchors e = anchoredDraggableState.e();
        float e2 = e.e(value2);
        if (e2 != c2 && !Float.isNaN(e2) && (e2 >= c2 ? (a2 = e.a(c2, false)) != null : (a2 = e.a(c2, true)) != null)) {
            value2 = a2;
        }
        return value2;
    }
}
