package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ComposerKt;
import b1.f0;
import d0.b0;
import e0.u;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SnapshotStateObserver$applyObserver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateObserver f14617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$applyObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(2);
        this.f14617a = snapshotStateObserver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Collection P0;
        Collection collection = (Set) obj;
        while (true) {
            SnapshotStateObserver snapshotStateObserver = this.f14617a;
            AtomicReference atomicReference = snapshotStateObserver.f14599b;
            Object obj3 = atomicReference.get();
            if (obj3 == null) {
                P0 = collection;
            } else if (obj3 instanceof Set) {
                P0 = f0.v(obj3, collection);
            } else {
                if (!(obj3 instanceof List)) {
                    ComposerKt.d("Unexpected notification");
                    throw null;
                }
                P0 = u.P0(f0.u(collection), (Collection) obj3);
            }
            while (!atomicReference.compareAndSet(obj3, P0)) {
                if (atomicReference.get() != obj3) {
                    break;
                }
            }
            if (SnapshotStateObserver.a(snapshotStateObserver)) {
                snapshotStateObserver.f14598a.invoke(new SnapshotStateObserver$sendNotifications$1(snapshotStateObserver));
            }
            return b0.f30125a;
        }
    }
}
