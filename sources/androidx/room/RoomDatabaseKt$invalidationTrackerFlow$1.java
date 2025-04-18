package androidx.room;

import androidx.room.InvalidationTracker;
import b1.a2;
import b1.h1;
import d0.b0;
import d1.q;
import h0.g;
import h0.l;
import j0.i;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.r;
import q0.p;

@j0.e(c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1", f = "RoomDatabaseExt.kt", l = {235}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RoomDatabaseKt$invalidationTrackerFlow$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f21343a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f21345c;
    public final /* synthetic */ RoomDatabase d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String[] f21346f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1 f21347a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a2 a2Var) {
            super(0);
            this.f21347a = a2Var;
        }

        @Override // q0.a
        public final Object invoke() {
            this.f21347a.a(null);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$invalidationTrackerFlow$1(boolean z2, RoomDatabase roomDatabase, String[] strArr, g gVar) {
        super(2, gVar);
        this.f21345c = z2;
        this.d = roomDatabase;
        this.f21346f = strArr;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        RoomDatabaseKt$invalidationTrackerFlow$1 roomDatabaseKt$invalidationTrackerFlow$1 = new RoomDatabaseKt$invalidationTrackerFlow$1(this.f21345c, this.d, this.f21346f, gVar);
        roomDatabaseKt$invalidationTrackerFlow$1.f21344b = obj;
        return roomDatabaseKt$invalidationTrackerFlow$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((RoomDatabaseKt$invalidationTrackerFlow$1) create((q) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$observer$1] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        l a2;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f21343a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            final q qVar = (q) this.f21344b;
            final AtomicBoolean atomicBoolean = new AtomicBoolean(this.f21345c);
            final String[] strArr = this.f21346f;
            ?? r5 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$observer$1
                @Override // androidx.room.InvalidationTracker.Observer
                public final void a(Set set) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    ((d1.p) qVar).b(set);
                }
            };
            TransactionElement transactionElement = (TransactionElement) ((b1.a) qVar).f22283c.i(TransactionElement.f21390c);
            if (transactionElement == null || (a2 = transactionElement.f21391a) == null) {
                a2 = CoroutinesRoomKt.a(this.d);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(kotlin.jvm.internal.e.v(qVar, a2, 0, new RoomDatabaseKt$invalidationTrackerFlow$1$job$1(this.d, r5, this.f21345c, qVar, this.f21346f, atomicBoolean, null), 2));
            this.f21343a = 1;
            if (p0.a.j(qVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
