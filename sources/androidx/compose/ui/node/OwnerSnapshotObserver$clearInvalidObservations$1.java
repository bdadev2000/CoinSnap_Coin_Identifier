package androidx.compose.ui.node;

import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class OwnerSnapshotObserver$clearInvalidObservations$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final OwnerSnapshotObserver$clearInvalidObservations$1 f16161a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        p0.a.q(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
        return Boolean.valueOf(!((OwnerScope) obj).Y0());
    }
}
