package androidx.room;

import b1.d0;
import b1.f0;
import b1.k;
import d0.b0;
import h0.g;
import h0.h;
import h0.j;
import h0.l;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* loaded from: classes2.dex */
final class RoomDatabaseKt$startTransactionCoroutine$2$1 implements Runnable {

    @j0.e(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", l = {103}, m = "invokeSuspend")
    /* renamed from: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f21356a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21357b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RoomDatabase f21358c;
        public final /* synthetic */ k d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p f21359f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RoomDatabase roomDatabase, k kVar, p pVar, g gVar) {
            super(2, gVar);
            this.f21358c = roomDatabase;
            this.d = kVar;
            this.f21359f = pVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f21358c, this.d, this.f21359f, gVar);
            anonymousClass1.f21357b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f21356a;
            if (i2 == 0) {
                q.m(obj);
                j i3 = ((d0) this.f21357b).getCoroutineContext().i(h.f30725a);
                p0.a.p(i3);
                h0.i iVar = (h0.i) i3;
                TransactionElement transactionElement = new TransactionElement(iVar);
                l u2 = f0.y((h0.a) iVar, transactionElement).u(new g1.d0(Integer.valueOf(System.identityHashCode(transactionElement)), this.f21358c.getSuspendingTransactionId()));
                k kVar = this.d;
                this.f21357b = kVar;
                this.f21356a = 1;
                obj = kotlin.jvm.internal.e.G(this, u2, this.f21359f);
                if (obj == aVar) {
                    return aVar;
                }
                gVar = kVar;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (g) this.f21357b;
                q.m(obj);
            }
            gVar.resumeWith(obj);
            return b0.f30125a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:?, code lost:
    
        throw null;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r1 = this;
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L2
        L2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1.run():void");
    }
}
