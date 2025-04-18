package androidx.compose.runtime.collection;

import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import q0.p;
import y0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ScatterSetWrapper$iterator$1 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f14152a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f14153b;

    /* renamed from: c, reason: collision with root package name */
    public int f14154c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f14155f;

    /* renamed from: g, reason: collision with root package name */
    public int f14156g;

    /* renamed from: h, reason: collision with root package name */
    public long f14157h;

    /* renamed from: i, reason: collision with root package name */
    public int f14158i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f14159j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ScatterSetWrapper f14160k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterSetWrapper$iterator$1(ScatterSetWrapper scatterSetWrapper, g gVar) {
        super(gVar);
        this.f14160k = scatterSetWrapper;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ScatterSetWrapper$iterator$1 scatterSetWrapper$iterator$1 = new ScatterSetWrapper$iterator$1(this.f14160k, gVar);
        scatterSetWrapper$iterator$1.f14159j = obj;
        return scatterSetWrapper$iterator$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ScatterSetWrapper$iterator$1) create((l) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0092 -> B:5:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0054 -> B:17:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0056 -> B:7:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0071 -> B:6:0x009c). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
