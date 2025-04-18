package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.ObserverHandle;
import d0.b0;
import d1.f;
import h0.g;
import j0.e;
import j0.i;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {Opcodes.LCMP, Opcodes.DCMPG, Opcodes.FRETURN}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public MutableScatterSet f14057a;

    /* renamed from: b, reason: collision with root package name */
    public l f14058b;

    /* renamed from: c, reason: collision with root package name */
    public f f14059c;
    public ObserverHandle d;

    /* renamed from: f, reason: collision with root package name */
    public Object f14060f;

    /* renamed from: g, reason: collision with root package name */
    public int f14061g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14062h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q0.a f14063i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(q0.a aVar, g gVar) {
        super(2, gVar);
        this.f14063i = aVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.f14063i, gVar);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.f14062h = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create((e1.i) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0194 A[LOOP:0: B:17:0x00c4->B:25:0x0194, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0139 A[EDGE_INSN: B:26:0x0139->B:27:0x0139 BREAK  A[LOOP:0: B:17:0x00c4->B:25:0x0194], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013b A[Catch: all -> 0x017d, TRY_LEAVE, TryCatch #6 {all -> 0x017d, blocks: (B:64:0x00d0, B:66:0x00e5, B:68:0x00f1, B:70:0x00fb, B:20:0x012a, B:23:0x0134, B:28:0x013b, B:34:0x0153, B:36:0x015c, B:75:0x0108, B:83:0x0118), top: B:63:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [d1.f, d1.r] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [d1.f] */
    /* JADX WARN: Type inference failed for: r8v7, types: [d1.f] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0174 -> B:10:0x0175). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
