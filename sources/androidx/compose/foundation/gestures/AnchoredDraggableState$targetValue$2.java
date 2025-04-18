package androidx.compose.foundation.gestures;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
final class AnchoredDraggableState$targetValue$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f3095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$targetValue$2(AnchoredDraggableState anchoredDraggableState) {
        super(0);
        this.f3095a = anchoredDraggableState;
    }

    @Override // q0.a
    public final Object invoke() {
        Object value;
        AnchoredDraggableState anchoredDraggableState = this.f3095a;
        Object value2 = anchoredDraggableState.f3071m.getValue();
        if (value2 != null) {
            return value2;
        }
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = anchoredDraggableState.f3068j;
        boolean isNaN = Float.isNaN(parcelableSnapshotMutableFloatState.c());
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = anchoredDraggableState.f3065g;
        if (isNaN) {
            value = parcelableSnapshotMutableState.getValue();
        } else {
            value = anchoredDraggableState.b().b(parcelableSnapshotMutableFloatState.c());
            if (value == null) {
                value = parcelableSnapshotMutableState.getValue();
            }
        }
        return value;
    }
}
