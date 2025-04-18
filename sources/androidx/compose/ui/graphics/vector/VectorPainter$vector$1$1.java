package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
final class VectorPainter$vector$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VectorPainter f15472a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainter$vector$1$1(VectorPainter vectorPainter) {
        super(0);
        this.f15472a = vectorPainter;
    }

    @Override // q0.a
    public final Object invoke() {
        VectorPainter vectorPainter = this.f15472a;
        int i2 = vectorPainter.f15471h;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = vectorPainter.d;
        if (i2 == parcelableSnapshotMutableIntState.g()) {
            parcelableSnapshotMutableIntState.b(parcelableSnapshotMutableIntState.g() + 1);
        }
        return b0.f30125a;
    }
}
