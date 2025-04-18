package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SnapshotStateObserver$readObserver$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateObserver f14618a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$readObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(1);
        this.f14618a = snapshotStateObserver;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SnapshotStateObserver snapshotStateObserver = this.f14618a;
        if (!snapshotStateObserver.f14603h) {
            synchronized (snapshotStateObserver.f14601f) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.f14604i;
                p0.a.p(observedScopeMap);
                Object obj2 = observedScopeMap.f14607b;
                p0.a.p(obj2);
                int i2 = observedScopeMap.d;
                MutableObjectIntMap mutableObjectIntMap = observedScopeMap.f14608c;
                if (mutableObjectIntMap == null) {
                    mutableObjectIntMap = new MutableObjectIntMap();
                    observedScopeMap.f14608c = mutableObjectIntMap;
                    observedScopeMap.f14609f.k(obj2, mutableObjectIntMap);
                }
                observedScopeMap.c(obj, i2, obj2, mutableObjectIntMap);
            }
        }
        return b0.f30125a;
    }
}
