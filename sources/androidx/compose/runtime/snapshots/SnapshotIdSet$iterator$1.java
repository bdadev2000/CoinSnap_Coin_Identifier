package androidx.compose.runtime.snapshots;

import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import okhttp3.internal.http.StatusLine;
import q0.p;
import y0.l;

@e(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SnapshotIdSet$iterator$1 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public int[] f14565a;

    /* renamed from: b, reason: collision with root package name */
    public int f14566b;

    /* renamed from: c, reason: collision with root package name */
    public int f14567c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f14568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SnapshotIdSet f14569g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(SnapshotIdSet snapshotIdSet, g gVar) {
        super(gVar);
        this.f14569g = snapshotIdSet;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.f14569g, gVar);
        snapshotIdSet$iterator$1.f14568f = obj;
        return snapshotIdSet$iterator$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapshotIdSet$iterator$1) create((l) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00e4 -> B:7:0x00e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00e7 -> B:7:0x00e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ad -> B:21:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b0 -> B:21:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0075 -> B:34:0x0078). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
