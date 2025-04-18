package androidx.compose.material3.internal;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AnchoredDraggableState$targetValue$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f12862a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$targetValue$2(AnchoredDraggableState anchoredDraggableState) {
        super(0);
        this.f12862a = anchoredDraggableState;
    }

    @Override // q0.a
    public final Object invoke() {
        AnchoredDraggableState anchoredDraggableState = this.f12862a;
        Object value = anchoredDraggableState.f12830m.getValue();
        if (value != null) {
            return value;
        }
        float c2 = anchoredDraggableState.f12827j.c();
        boolean isNaN = Float.isNaN(c2);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = anchoredDraggableState.f12824g;
        return !isNaN ? anchoredDraggableState.c(c2, 0.0f, parcelableSnapshotMutableState.getValue()) : parcelableSnapshotMutableState.getValue();
    }
}
