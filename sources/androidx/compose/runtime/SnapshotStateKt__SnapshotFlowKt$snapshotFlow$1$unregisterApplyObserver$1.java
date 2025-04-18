package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import d0.b0;
import d1.b;
import d1.f;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f14065a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1(b bVar) {
        super(2);
        this.f14065a = bVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Set set = (Set) obj;
        if (set instanceof ScatterSetWrapper) {
            ScatterSet scatterSet = ((ScatterSetWrapper) set).f14151a;
            Object[] objArr = scatterSet.f1592b;
            long[] jArr = scatterSet.f1591a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                loop0: while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                Object obj3 = objArr[(i2 << 3) + i4];
                                if (!(obj3 instanceof StateObjectImpl) || ((StateObjectImpl) obj3).t(4)) {
                                    break loop0;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                for (Object obj4 : set2) {
                    if ((obj4 instanceof StateObjectImpl) && !((StateObjectImpl) obj4).t(4)) {
                    }
                    this.f14065a.b(set);
                }
            }
        }
        return b0.f30125a;
    }
}
