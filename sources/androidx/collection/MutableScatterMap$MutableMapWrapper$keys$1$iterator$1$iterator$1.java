package androidx.collection;

import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import q0.p;
import y0.l;

@e(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1", f = "ScatterMap.kt", l = {1515}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public long[] f1507a;

    /* renamed from: b, reason: collision with root package name */
    public int f1508b;

    /* renamed from: c, reason: collision with root package name */
    public int f1509c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f1510f;

    /* renamed from: g, reason: collision with root package name */
    public long f1511g;

    /* renamed from: h, reason: collision with root package name */
    public int f1512h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1513i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MutableScatterMap f1514j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(MutableScatterMap mutableScatterMap, g gVar) {
        super(gVar);
        this.f1514j = mutableScatterMap;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 = new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(this.f1514j, gVar);
        mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.f1513i = obj;
        return mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1) create((l) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0090 -> B:5:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004e -> B:17:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0050 -> B:7:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x006e -> B:6:0x009a). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f1512h
            r3 = 1
            r4 = 0
            r5 = 8
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L26
            int r2 = r0.f1510f
            int r6 = r0.d
            long r7 = r0.f1511g
            int r9 = r0.f1509c
            int r10 = r0.f1508b
            long[] r11 = r0.f1507a
            java.lang.Object r12 = r0.f1513i
            y0.l r12 = (y0.l) r12
            kotlin.jvm.internal.q.m(r22)
            r13 = r12
            r12 = r11
            r11 = r0
            goto L95
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2e:
            kotlin.jvm.internal.q.m(r22)
            java.lang.Object r2 = r0.f1513i
            y0.l r2 = (y0.l) r2
            androidx.collection.MutableScatterMap r6 = r0.f1514j
            long[] r6 = r6.f1557a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La9
            r9 = r0
            r8 = r4
        L40:
            r10 = r6[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La4
            int r12 = r8 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r4
            r18 = r12
            r12 = r6
            r6 = r18
            r19 = r10
            r11 = r7
            r10 = r9
            r9 = r8
            r7 = r19
        L65:
            if (r2 >= r6) goto L9d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L9a
            int r14 = r9 << 3
            int r14 = r14 + r2
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r14)
            r10.f1513i = r13
            r10.f1507a = r12
            r10.f1508b = r11
            r10.f1509c = r9
            r10.f1511g = r7
            r10.d = r6
            r10.f1510f = r2
            r10.f1512h = r3
            r13.b(r15, r10)
            i0.a r14 = i0.a.f30806a
            if (r14 != r1) goto L90
            return r1
        L90:
            r18 = r11
            r11 = r10
            r10 = r18
        L95:
            r18 = r11
            r11 = r10
            r10 = r18
        L9a:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L65
        L9d:
            if (r6 != r5) goto La9
            r8 = r9
            r9 = r10
            r7 = r11
            r6 = r12
            r2 = r13
        La4:
            if (r8 == r7) goto La9
            int r8 = r8 + 1
            goto L40
        La9:
            d0.b0 r1 = d0.b0.f30125a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
