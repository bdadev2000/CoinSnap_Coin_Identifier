package androidx.collection;

import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import q0.p;
import y0.l;

@e(c = "androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1", f = "ScatterMap.kt", l = {703}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScatterMap$MapWrapper$entries$1$iterator$1 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public ScatterMap f1561a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f1562b;

    /* renamed from: c, reason: collision with root package name */
    public int f1563c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f1564f;

    /* renamed from: g, reason: collision with root package name */
    public int f1565g;

    /* renamed from: h, reason: collision with root package name */
    public long f1566h;

    /* renamed from: i, reason: collision with root package name */
    public int f1567i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1568j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ScatterMap f1569k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterMap$MapWrapper$entries$1$iterator$1(ScatterMap scatterMap, g gVar) {
        super(gVar);
        this.f1569k = scatterMap;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ScatterMap$MapWrapper$entries$1$iterator$1 scatterMap$MapWrapper$entries$1$iterator$1 = new ScatterMap$MapWrapper$entries$1$iterator$1(this.f1569k, gVar);
        scatterMap$MapWrapper$entries$1$iterator$1.f1568j = obj;
        return scatterMap$MapWrapper$entries$1$iterator$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ScatterMap$MapWrapper$entries$1$iterator$1) create((l) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x009a -> B:5:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00a5 -> B:6:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004f -> B:7:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b3 -> B:19:0x00b4). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
