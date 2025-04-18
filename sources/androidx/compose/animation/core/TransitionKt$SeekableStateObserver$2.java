package androidx.compose.animation.core;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class TransitionKt$SeekableStateObserver$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final TransitionKt$SeekableStateObserver$2 f2320a = new r(0);

    /* renamed from: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f2321a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((q0.a) obj).invoke();
            return b0.f30125a;
        }
    }

    @Override // q0.a
    public final Object invoke() {
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(AnonymousClass1.f2321a);
        snapshotStateObserver.f14602g = Snapshot.Companion.e(snapshotStateObserver.d);
        return snapshotStateObserver;
    }
}
