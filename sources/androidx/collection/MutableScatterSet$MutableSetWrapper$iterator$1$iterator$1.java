package androidx.collection;

import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import q0.p;
import y0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1057}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public MutableScatterSet$MutableSetWrapper$iterator$1 f1531a;

    /* renamed from: b, reason: collision with root package name */
    public MutableScatterSet f1532b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f1533c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f1534f;

    /* renamed from: g, reason: collision with root package name */
    public int f1535g;

    /* renamed from: h, reason: collision with root package name */
    public int f1536h;

    /* renamed from: i, reason: collision with root package name */
    public long f1537i;

    /* renamed from: j, reason: collision with root package name */
    public int f1538j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1539k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet f1540l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet$MutableSetWrapper$iterator$1 f1541m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(MutableScatterSet mutableScatterSet, MutableScatterSet$MutableSetWrapper$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1, g gVar) {
        super(gVar);
        this.f1540l = mutableScatterSet;
        this.f1541m = mutableScatterSet$MutableSetWrapper$iterator$1;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 = new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(this.f1540l, this.f1541m, gVar);
        mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.f1539k = obj;
        return mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1) create((l) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x009c -> B:5:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00a7 -> B:6:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0056 -> B:7:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b7 -> B:19:0x00b8). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
