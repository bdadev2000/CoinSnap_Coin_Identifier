package androidx.compose.ui.platform;

import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GlobalSnapshotManager$ensureStarted$2 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1.f f16493a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$2(d1.b bVar) {
        super(1);
        this.f16493a = bVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        boolean compareAndSet = GlobalSnapshotManager.f16489b.compareAndSet(false, true);
        b0 b0Var = b0.f30125a;
        if (compareAndSet) {
            this.f16493a.b(b0Var);
        }
        return b0Var;
    }
}
