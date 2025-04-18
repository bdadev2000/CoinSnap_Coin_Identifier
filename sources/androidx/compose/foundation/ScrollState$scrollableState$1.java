package androidx.compose.foundation;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ScrollState$scrollableState$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollState f2875a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollState$scrollableState$1(ScrollState scrollState) {
        super(1);
        this.f2875a = scrollState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        ScrollState scrollState = this.f2875a;
        float g2 = scrollState.f2865a.g() + floatValue + scrollState.e;
        float z2 = a.z(g2, 0.0f, scrollState.d.g());
        boolean z3 = !(g2 == z2);
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = scrollState.f2865a;
        float g3 = z2 - parcelableSnapshotMutableIntState.g();
        int round = Math.round(g3);
        parcelableSnapshotMutableIntState.b(parcelableSnapshotMutableIntState.g() + round);
        scrollState.e = g3 - round;
        if (z3) {
            floatValue = g3;
        }
        return Float.valueOf(floatValue);
    }
}
