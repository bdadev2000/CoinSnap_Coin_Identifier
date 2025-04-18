package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.k;
import d0.b0;
import java.util.concurrent.CancellationException;
import w0.e;

@StabilityInferred
/* loaded from: classes3.dex */
public final class BringIntoViewRequestPriorityQueue {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f3097a = new MutableVector(new ContentInViewNode.Request[16]);

    public final void a(CancellationException cancellationException) {
        MutableVector mutableVector = this.f3097a;
        int i2 = mutableVector.f14144c;
        k[] kVarArr = new k[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            kVarArr[i3] = ((ContentInViewNode.Request) mutableVector.f14142a[i3]).f3117b;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            kVarArr[i4].A(cancellationException);
        }
        if (!mutableVector.l()) {
            throw new IllegalStateException("uncancelled requests present".toString());
        }
    }

    public final void b() {
        MutableVector mutableVector = this.f3097a;
        int i2 = 0;
        int i3 = new e(0, mutableVector.f14144c - 1, 1).f31407b;
        if (i3 >= 0) {
            while (true) {
                ((ContentInViewNode.Request) mutableVector.f14142a[i2]).f3117b.resumeWith(b0.f30125a);
                if (i2 == i3) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        mutableVector.g();
    }
}
