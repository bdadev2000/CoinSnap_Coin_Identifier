package androidx.compose.animation;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
public final class SharedTransitionScopeKt$SharedTransitionObserver$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final SharedTransitionScopeKt$SharedTransitionObserver$2 f1932a = new r(0);

    /* renamed from: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionObserver$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f1933a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((q0.a) obj).invoke();
            return b0.f30125a;
        }
    }

    @Override // q0.a
    public final Object invoke() {
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(AnonymousClass1.f1933a);
        snapshotStateObserver.f14602g = Snapshot.Companion.e(snapshotStateObserver.d);
        return snapshotStateObserver;
    }
}
