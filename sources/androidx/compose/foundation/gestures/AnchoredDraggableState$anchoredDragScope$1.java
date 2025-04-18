package androidx.compose.foundation.gestures;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import p0.a;

/* loaded from: classes2.dex */
public final class AnchoredDraggableState$anchoredDragScope$1 implements AnchoredDragScope {

    /* renamed from: a, reason: collision with root package name */
    public Object f3091a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3092b;

    /* renamed from: c, reason: collision with root package name */
    public float f3093c = Float.NaN;
    public final /* synthetic */ AnchoredDraggableState d;

    public AnchoredDraggableState$anchoredDragScope$1(AnchoredDraggableState anchoredDraggableState) {
        this.d = anchoredDraggableState;
    }

    @Override // androidx.compose.foundation.gestures.AnchoredDragScope
    public final void a(float f2, float f3) {
        AnchoredDraggableState anchoredDraggableState = this.d;
        float c2 = anchoredDraggableState.f3068j.c();
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = anchoredDraggableState.f3068j;
        parcelableSnapshotMutableFloatState.n(f2);
        anchoredDraggableState.f3070l.n(f3);
        if (Float.isNaN(c2)) {
            return;
        }
        boolean z2 = f2 >= c2;
        DraggableAnchors b2 = anchoredDraggableState.b();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = anchoredDraggableState.f3065g;
        if (parcelableSnapshotMutableFloatState.c() == b2.e(parcelableSnapshotMutableState.getValue())) {
            Object a2 = anchoredDraggableState.b().a(parcelableSnapshotMutableFloatState.c() + (z2 ? 1.0f : -1.0f), z2);
            if (a2 == null) {
                a2 = parcelableSnapshotMutableState.getValue();
            }
            if (z2) {
                this.f3091a = parcelableSnapshotMutableState.getValue();
                this.f3092b = a2;
            } else {
                this.f3091a = a2;
                this.f3092b = parcelableSnapshotMutableState.getValue();
            }
        } else {
            Object a3 = anchoredDraggableState.b().a(parcelableSnapshotMutableFloatState.c(), false);
            if (a3 == null) {
                a3 = parcelableSnapshotMutableState.getValue();
            }
            Object a4 = anchoredDraggableState.b().a(parcelableSnapshotMutableFloatState.c(), true);
            if (a4 == null) {
                a4 = parcelableSnapshotMutableState.getValue();
            }
            this.f3091a = a3;
            this.f3092b = a4;
        }
        DraggableAnchors b3 = anchoredDraggableState.b();
        Object obj = this.f3091a;
        a.p(obj);
        float e = b3.e(obj);
        DraggableAnchors b4 = anchoredDraggableState.b();
        Object obj2 = this.f3092b;
        a.p(obj2);
        this.f3093c = Math.abs(e - b4.e(obj2));
        if (Math.abs(parcelableSnapshotMutableFloatState.c() - anchoredDraggableState.b().e(parcelableSnapshotMutableState.getValue())) >= this.f3093c / 2.0f) {
            Object obj3 = z2 ? this.f3092b : this.f3091a;
            if (obj3 == null) {
                obj3 = parcelableSnapshotMutableState.getValue();
            }
            if (((Boolean) anchoredDraggableState.e.invoke(obj3)).booleanValue()) {
                parcelableSnapshotMutableState.setValue(obj3);
            }
        }
    }
}
