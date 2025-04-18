package androidx.compose.runtime;

import b1.d0;
import b1.h1;
import d0.b0;
import h0.g;
import h0.l;
import j0.e;
import j0.i;
import q0.q;

@e(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", l = {890, 910, 911}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends i implements q {

    /* renamed from: a, reason: collision with root package name */
    public h1 f13950a;

    /* renamed from: b, reason: collision with root package name */
    public int f13951b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13952c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f13953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Recomposer f13954g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(l lVar, Recomposer recomposer, g gVar) {
        super(3, gVar);
        this.f13953f = lVar;
        this.f13954g = recomposer;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.f13953f, this.f13954g, (g) obj3);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.f13952c = (d0) obj;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.d = (MonotonicFrameClock) obj2;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
    
        if (r15 == null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /* JADX WARN: Type inference failed for: r10v4, types: [androidx.compose.runtime.ProduceFrameSignal, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x009c -> B:17:0x009f). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
