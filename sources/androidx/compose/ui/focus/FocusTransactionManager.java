package androidx.compose.ui.focus;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import q0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class FocusTransactionManager {

    /* renamed from: a, reason: collision with root package name */
    public final MutableScatterMap f14896a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableVector f14897b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14898c;

    public FocusTransactionManager() {
        long[] jArr = ScatterMapKt.f1590a;
        this.f14896a = new MutableScatterMap();
        this.f14897b = new MutableVector(new a[16]);
    }

    public static final void a(FocusTransactionManager focusTransactionManager) {
        focusTransactionManager.f14896a.e();
        int i2 = 0;
        focusTransactionManager.f14898c = false;
        MutableVector mutableVector = focusTransactionManager.f14897b;
        int i3 = mutableVector.f14144c;
        if (i3 > 0) {
            Object[] objArr = mutableVector.f14142a;
            do {
                ((a) objArr[i2]).invoke();
                i2++;
            } while (i2 < i3);
        }
        mutableVector.g();
    }

    public static final void b(FocusTransactionManager focusTransactionManager) {
        MutableScatterMap mutableScatterMap = focusTransactionManager.f14896a;
        Object[] objArr = mutableScatterMap.f1558b;
        long[] jArr = mutableScatterMap.f1557a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) objArr[(i2 << 3) + i4];
                            focusTargetNode.getClass();
                            FocusStateImpl focusStateImpl = (FocusStateImpl) DelegatableNodeKt.g(focusTargetNode).getFocusOwner().c().f14896a.c(focusTargetNode);
                            if (focusStateImpl == null) {
                                InlineClassHelperKt.c("committing a node that was not updated in the current transaction");
                                throw null;
                            }
                            focusTargetNode.f14891q = focusStateImpl;
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        mutableScatterMap.e();
        focusTransactionManager.f14898c = false;
        focusTransactionManager.f14897b.g();
    }
}
