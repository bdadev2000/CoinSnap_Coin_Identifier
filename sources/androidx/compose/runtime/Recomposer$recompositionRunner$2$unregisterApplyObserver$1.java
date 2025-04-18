package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import b1.k;
import d0.b0;
import java.util.Set;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Recomposer$recompositionRunner$2$unregisterApplyObserver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Recomposer f13921a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2$unregisterApplyObserver$1(Recomposer recomposer) {
        super(2);
        this.f13921a = recomposer;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        k kVar;
        Set set = (Set) obj;
        Recomposer recomposer = this.f13921a;
        synchronized (recomposer.f13878b) {
            try {
                if (((Recomposer.State) recomposer.f13894t.getValue()).compareTo(Recomposer.State.f13901f) >= 0) {
                    MutableScatterSet mutableScatterSet = recomposer.f13881g;
                    if (set instanceof ScatterSetWrapper) {
                        ScatterSet scatterSet = ((ScatterSetWrapper) set).f14151a;
                        Object[] objArr = scatterSet.f1592b;
                        long[] jArr = scatterSet.f1591a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j2 = jArr[i2];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((255 & j2) < 128) {
                                            Object obj3 = objArr[(i2 << 3) + i4];
                                            if (!(obj3 instanceof StateObjectImpl) || ((StateObjectImpl) obj3).t(1)) {
                                                mutableScatterSet.d(obj3);
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
                        for (Object obj4 : set) {
                            if (!(obj4 instanceof StateObjectImpl) || ((StateObjectImpl) obj4).t(1)) {
                                mutableScatterSet.d(obj4);
                            }
                        }
                    }
                    kVar = recomposer.C();
                } else {
                    kVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kVar != null) {
            kVar.resumeWith(b0.f30125a);
        }
        return b0.f30125a;
    }
}
