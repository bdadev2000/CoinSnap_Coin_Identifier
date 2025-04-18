package androidx.compose.ui.platform;

import b1.d0;
import d0.b0;
import d1.r;
import org.objectweb.asm.TypeReference;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {TypeReference.INSTANCEOF}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GlobalSnapshotManager$ensureStarted$1 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public r f16490a;

    /* renamed from: b, reason: collision with root package name */
    public d1.a f16491b;

    /* renamed from: c, reason: collision with root package name */
    public int f16492c;
    public final /* synthetic */ d1.f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(d1.f fVar, h0.g gVar) {
        super(2, gVar);
        this.d = fVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new GlobalSnapshotManager$ensureStarted$1(this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((GlobalSnapshotManager$ensureStarted$1) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #2 {all -> 0x0059, blocks: (B:9:0x003d, B:11:0x0045), top: B:8:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0037 -> B:8:0x003d). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r7.f16492c
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            d1.a r1 = r7.f16491b
            d1.r r3 = r7.f16490a
            kotlin.jvm.internal.q.m(r8)     // Catch: java.lang.Throwable -> L15
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r7
            goto L3d
        L15:
            r8 = move-exception
            goto L63
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.jvm.internal.q.m(r8)
            d1.f r3 = r7.d
            d1.a r8 = r3.iterator()     // Catch: java.lang.Throwable -> L15
            r1 = r8
            r8 = r7
        L2a:
            r8.f16490a = r3     // Catch: java.lang.Throwable -> L15
            r8.f16491b = r1     // Catch: java.lang.Throwable -> L15
            r8.f16492c = r2     // Catch: java.lang.Throwable -> L15
            java.lang.Object r4 = r1.b(r8)     // Catch: java.lang.Throwable -> L15
            if (r4 != r0) goto L37
            return r0
        L37:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L3d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L59
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r3.c()     // Catch: java.lang.Throwable -> L59
            d0.b0 r8 = (d0.b0) r8     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicBoolean r8 = androidx.compose.ui.platform.GlobalSnapshotManager.f16489b     // Catch: java.lang.Throwable -> L59
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Throwable -> L59
            androidx.compose.runtime.snapshots.Snapshot.Companion.g()     // Catch: java.lang.Throwable -> L59
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L2a
        L59:
            r8 = move-exception
            r3 = r4
            goto L63
        L5c:
            r8 = 0
            kotlin.jvm.internal.e.j(r4, r8)
            d0.b0 r8 = d0.b0.f30125a
            return r8
        L63:
            throw r8     // Catch: java.lang.Throwable -> L64
        L64:
            r0 = move-exception
            kotlin.jvm.internal.e.j(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
