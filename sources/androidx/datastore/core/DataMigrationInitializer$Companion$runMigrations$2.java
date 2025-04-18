package androidx.datastore.core;

import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import java.util.Iterator;
import java.util.List;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class DataMigrationInitializer$Companion$runMigrations$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f18960a;

    /* renamed from: b, reason: collision with root package name */
    public DataMigration f18961b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18962c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f18963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f18964g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f18965h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2(List list, List list2, g gVar) {
        super(2, gVar);
        this.f18964g = list;
        this.f18965h = list2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.f18964g, this.f18965h, gVar);
        dataMigrationInitializer$Companion$runMigrations$2.f18963f = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r9.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.util.Iterator r1 = r9.f18960a
            java.lang.Object r4 = r9.f18963f
            java.util.List r4 = (java.util.List) r4
            kotlin.jvm.internal.q.m(r10)
            r7 = r9
            goto L86
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r1 = r9.f18962c
            androidx.datastore.core.DataMigration r4 = r9.f18961b
            java.util.Iterator r5 = r9.f18960a
            java.lang.Object r6 = r9.f18963f
            java.util.List r6 = (java.util.List) r6
            kotlin.jvm.internal.q.m(r10)
            r7 = r9
            r8 = r6
            r6 = r4
            r4 = r8
            goto L64
        L32:
            kotlin.jvm.internal.q.m(r10)
            java.lang.Object r10 = r9.f18963f
            java.util.List r1 = r9.f18964g
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.List r4 = r9.f18965h
            r5 = r9
        L42:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r1.next()
            androidx.datastore.core.DataMigration r6 = (androidx.datastore.core.DataMigration) r6
            r5.f18963f = r4
            r5.f18960a = r1
            r5.f18961b = r6
            r5.f18962c = r10
            r5.d = r3
            java.lang.Boolean r7 = r6.b(r5)
            if (r7 != r0) goto L5f
            return r0
        L5f:
            r8 = r1
            r1 = r10
            r10 = r7
            r7 = r5
            r5 = r8
        L64:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L88
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r10 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r1 = 0
            r10.<init>(r6, r1)
            r4.add(r10)
            r7.f18963f = r4
            r7.f18960a = r5
            r7.f18961b = r1
            r7.f18962c = r1
            r7.d = r2
            java.lang.Object r10 = r6.a()
            if (r10 != r0) goto L89
            return r0
        L86:
            r5 = r7
            goto L42
        L88:
            r10 = r1
        L89:
            r1 = r5
            goto L86
        L8b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
