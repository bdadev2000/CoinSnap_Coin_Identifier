package androidx.room;

import b1.d0;
import d0.b0;
import h0.g;
import h0.j;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

@j0.e(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", l = {Opcodes.V18}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RoomDatabaseKt$withTransaction$transactionBlock$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f21360a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RoomDatabase f21362c;
    public final /* synthetic */ l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$withTransaction$transactionBlock$1(RoomDatabase roomDatabase, l lVar, g gVar) {
        super(2, gVar);
        this.f21362c = roomDatabase;
        this.d = lVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(this.f21362c, this.d, gVar);
        roomDatabaseKt$withTransaction$transactionBlock$1.f21361b = obj;
        return roomDatabaseKt$withTransaction$transactionBlock$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((RoomDatabaseKt$withTransaction$transactionBlock$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [i0.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        TransactionElement transactionElement;
        TransactionElement transactionElement2 = i0.a.f30806a;
        int i2 = this.f21360a;
        RoomDatabase roomDatabase = this.f21362c;
        try {
            if (i2 == 0) {
                q.m(obj);
                j i3 = ((d0) this.f21361b).getCoroutineContext().i(TransactionElement.f21390c);
                p0.a.p(i3);
                TransactionElement transactionElement3 = (TransactionElement) i3;
                transactionElement3.f21392b.incrementAndGet();
                try {
                    roomDatabase.beginTransaction();
                    try {
                        l lVar = this.d;
                        this.f21361b = transactionElement3;
                        this.f21360a = 1;
                        Object invoke = lVar.invoke(this);
                        if (invoke == transactionElement2) {
                            return transactionElement2;
                        }
                        transactionElement = transactionElement3;
                        obj = invoke;
                    } catch (Throwable th2) {
                        th = th2;
                        roomDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th3) {
                    transactionElement2 = transactionElement3;
                    th = th3;
                    if (transactionElement2.f21392b.decrementAndGet() >= 0) {
                        throw th;
                    }
                    throw new IllegalStateException("Transaction was never started or was already released.");
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                transactionElement = (TransactionElement) this.f21361b;
                try {
                    q.m(obj);
                } catch (Throwable th4) {
                    th = th4;
                    roomDatabase.endTransaction();
                    throw th;
                }
            }
            roomDatabase.setTransactionSuccessful();
            roomDatabase.endTransaction();
            if (transactionElement.f21392b.decrementAndGet() >= 0) {
                return obj;
            }
            throw new IllegalStateException("Transaction was never started or was already released.");
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
