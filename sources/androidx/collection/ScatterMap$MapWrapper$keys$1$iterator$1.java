package androidx.collection;

import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import q0.p;
import y0.l;

@e(c = "androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1", f = "ScatterMap.kt", l = {728}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ScatterMap$MapWrapper$keys$1$iterator$1 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f1571a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f1572b;

    /* renamed from: c, reason: collision with root package name */
    public int f1573c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f1574f;

    /* renamed from: g, reason: collision with root package name */
    public int f1575g;

    /* renamed from: h, reason: collision with root package name */
    public long f1576h;

    /* renamed from: i, reason: collision with root package name */
    public int f1577i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1578j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ScatterMap f1579k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterMap$MapWrapper$keys$1$iterator$1(ScatterMap scatterMap, g gVar) {
        super(gVar);
        this.f1579k = scatterMap;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ScatterMap$MapWrapper$keys$1$iterator$1 scatterMap$MapWrapper$keys$1$iterator$1 = new ScatterMap$MapWrapper$keys$1$iterator$1(this.f1579k, gVar);
        scatterMap$MapWrapper$keys$1$iterator$1.f1578j = obj;
        return scatterMap$MapWrapper$keys$1$iterator$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ScatterMap$MapWrapper$keys$1$iterator$1) create((l) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0090 -> B:5:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0052 -> B:17:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0054 -> B:7:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x006f -> B:6:0x009a). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
