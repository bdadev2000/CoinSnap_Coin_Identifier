package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class SnapshotStateObserver$sendNotifications$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateObserver f14619a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$sendNotifications$1(SnapshotStateObserver snapshotStateObserver) {
        super(0);
        this.f14619a = snapshotStateObserver;
    }

    /* JADX WARN: Finally extract failed */
    @Override // q0.a
    public final Object invoke() {
        Object[] objArr;
        int i2;
        Object[] objArr2;
        int i3;
        do {
            SnapshotStateObserver snapshotStateObserver = this.f14619a;
            synchronized (snapshotStateObserver.f14601f) {
                if (!snapshotStateObserver.f14600c) {
                    snapshotStateObserver.f14600c = true;
                    try {
                        MutableVector mutableVector = snapshotStateObserver.f14601f;
                        int i4 = mutableVector.f14144c;
                        if (i4 > 0) {
                            Object[] objArr3 = mutableVector.f14142a;
                            int i5 = 0;
                            while (true) {
                                SnapshotStateObserver.ObservedScopeMap observedScopeMap = (SnapshotStateObserver.ObservedScopeMap) objArr3[i5];
                                MutableScatterSet mutableScatterSet = observedScopeMap.f14610g;
                                Object[] objArr4 = mutableScatterSet.f1592b;
                                long[] jArr = mutableScatterSet.f1591a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i6 = 0;
                                    while (true) {
                                        long j2 = jArr[i6];
                                        i2 = i4;
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i7 = 8;
                                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                                            int i9 = 0;
                                            while (i9 < i8) {
                                                if ((j2 & 255) < 128) {
                                                    objArr2 = objArr3;
                                                    observedScopeMap.f14606a.invoke(objArr4[(i6 << 3) + i9]);
                                                    i3 = 8;
                                                } else {
                                                    objArr2 = objArr3;
                                                    i3 = i7;
                                                }
                                                j2 >>= i3;
                                                i9++;
                                                i7 = i3;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i8 != i7) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i6 == length) {
                                            break;
                                        }
                                        i6++;
                                        i4 = i2;
                                        objArr3 = objArr;
                                    }
                                } else {
                                    objArr = objArr3;
                                    i2 = i4;
                                }
                                mutableScatterSet.f();
                                i5++;
                                int i10 = i2;
                                if (i5 >= i10) {
                                    break;
                                }
                                i4 = i10;
                                objArr3 = objArr;
                            }
                        }
                        snapshotStateObserver.f14600c = false;
                    } catch (Throwable th) {
                        snapshotStateObserver.f14600c = false;
                        throw th;
                    }
                }
            }
        } while (SnapshotStateObserver.a(this.f14619a));
        return b0.f30125a;
    }
}
