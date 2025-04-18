package androidx.room;

import androidx.room.InvalidationTracker;
import b1.a1;
import b1.d0;
import b1.z;
import d0.b0;
import h0.g;
import h0.l;
import j0.i;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@j0.e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CoroutinesRoom$Companion$createFlow$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f21226a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f21228c;
    public final /* synthetic */ RoomDatabase d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String[] f21229f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Callable f21230g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @j0.e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {Opcodes.L2F}, m = "invokeSuspend")
    /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f21231a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21232b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f21233c;
        public final /* synthetic */ RoomDatabase d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e1.i f21234f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String[] f21235g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Callable f21236h;

        /* JADX INFO: Access modifiers changed from: package-private */
        @j0.e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {128, 130}, m = "invokeSuspend")
        /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C00611 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public d1.a f21237a;

            /* renamed from: b, reason: collision with root package name */
            public int f21238b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RoomDatabase f21239c;
            public final /* synthetic */ CoroutinesRoom$Companion$createFlow$1$1$observer$1 d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ d1.f f21240f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Callable f21241g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ d1.f f21242h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00611(RoomDatabase roomDatabase, CoroutinesRoom$Companion$createFlow$1$1$observer$1 coroutinesRoom$Companion$createFlow$1$1$observer$1, d1.f fVar, Callable callable, d1.f fVar2, g gVar) {
                super(2, gVar);
                this.f21239c = roomDatabase;
                this.d = coroutinesRoom$Companion$createFlow$1$1$observer$1;
                this.f21240f = fVar;
                this.f21241g = callable;
                this.f21242h = fVar2;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00611(this.f21239c, this.d, this.f21240f, this.f21241g, this.f21242h, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00611) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #1 {all -> 0x0069, blocks: (B:11:0x003b, B:16:0x0049, B:18:0x0051), top: B:10:0x003b }] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:10:0x003b). Please report as a decompilation issue!!! */
            @Override // j0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    i0.a r0 = i0.a.f30806a
                    int r1 = r7.f21238b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    d1.a r1 = r7.f21237a
                    kotlin.jvm.internal.q.m(r8)     // Catch: java.lang.Throwable -> L13
                    r8 = r1
                    goto L3a
                L13:
                    r8 = move-exception
                    r1 = r7
                    goto L79
                L16:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1e:
                    d1.a r1 = r7.f21237a
                    kotlin.jvm.internal.q.m(r8)     // Catch: java.lang.Throwable -> L13
                    r4 = r1
                    r1 = r7
                    goto L49
                L26:
                    kotlin.jvm.internal.q.m(r8)
                    androidx.room.RoomDatabase r8 = r7.f21239c
                    androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r1 = r7.d
                    r8.a(r1)
                    d1.f r8 = r7.f21240f     // Catch: java.lang.Throwable -> L13
                    d1.a r8 = r8.iterator()     // Catch: java.lang.Throwable -> L13
                L3a:
                    r1 = r7
                L3b:
                    r1.f21237a = r8     // Catch: java.lang.Throwable -> L69
                    r1.f21238b = r3     // Catch: java.lang.Throwable -> L69
                    java.lang.Object r4 = r8.b(r1)     // Catch: java.lang.Throwable -> L69
                    if (r4 != r0) goto L46
                    return r0
                L46:
                    r6 = r4
                    r4 = r8
                    r8 = r6
                L49:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L69
                    boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L69
                    if (r8 == 0) goto L6b
                    r4.c()     // Catch: java.lang.Throwable -> L69
                    java.util.concurrent.Callable r8 = r1.f21241g     // Catch: java.lang.Throwable -> L69
                    java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L69
                    d1.f r5 = r1.f21242h     // Catch: java.lang.Throwable -> L69
                    r1.f21237a = r4     // Catch: java.lang.Throwable -> L69
                    r1.f21238b = r2     // Catch: java.lang.Throwable -> L69
                    java.lang.Object r8 = r5.j(r8, r1)     // Catch: java.lang.Throwable -> L69
                    if (r8 != r0) goto L67
                    return r0
                L67:
                    r8 = r4
                    goto L3b
                L69:
                    r8 = move-exception
                    goto L79
                L6b:
                    androidx.room.RoomDatabase r8 = r1.f21239c
                    androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r0 = r1.d
                    r8.c(r0)
                    d0.b0 r8 = d0.b0.f30125a
                    return r8
                L79:
                    androidx.room.RoomDatabase r0 = r1.f21239c
                    androidx.room.InvalidationTracker r0 = r0.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r1 = r1.d
                    r0.c(r1)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.C00611.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z2, RoomDatabase roomDatabase, e1.i iVar, String[] strArr, Callable callable, g gVar) {
            super(2, gVar);
            this.f21233c = z2;
            this.d = roomDatabase;
            this.f21234f = iVar;
            this.f21235g = strArr;
            this.f21236h = callable;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f21233c, this.d, this.f21234f, this.f21235g, this.f21236h, gVar);
            anonymousClass1.f21232b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Type inference failed for: r8v0, types: [androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1] */
        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            l a2;
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f21231a;
            b0 b0Var = b0.f30125a;
            if (i2 == 0) {
                q.m(obj);
                d0 d0Var = (d0) this.f21232b;
                final d1.b a3 = p0.a.a(-1, 0, 6);
                final String[] strArr = this.f21235g;
                ?? r8 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public final void a(Set set) {
                        a3.b(b0.f30125a);
                    }
                };
                a3.b(b0Var);
                TransactionElement transactionElement = (TransactionElement) d0Var.getCoroutineContext().i(TransactionElement.f21390c);
                if (transactionElement == null || (a2 = transactionElement.f21391a) == null) {
                    boolean z2 = this.f21233c;
                    RoomDatabase roomDatabase = this.d;
                    if (z2) {
                        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
                        Object obj2 = backingFieldMap.get("TransactionDispatcher");
                        if (obj2 == null) {
                            obj2 = new a1(roomDatabase.getTransactionExecutor());
                            backingFieldMap.put("TransactionDispatcher", obj2);
                        }
                        a2 = (z) obj2;
                    } else {
                        a2 = CoroutinesRoomKt.a(roomDatabase);
                    }
                }
                d1.b a4 = p0.a.a(0, 0, 7);
                kotlin.jvm.internal.e.v(d0Var, a2, 0, new C00611(this.d, r8, a3, this.f21236h, a4, null), 2);
                this.f21231a = 1;
                Object N = p0.a.N(this.f21234f, a4, true, this);
                if (N != aVar) {
                    N = b0Var;
                }
                if (N == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$createFlow$1(boolean z2, RoomDatabase roomDatabase, String[] strArr, Callable callable, g gVar) {
        super(2, gVar);
        this.f21228c = z2;
        this.d = roomDatabase;
        this.f21229f = strArr;
        this.f21230g = callable;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.f21228c, this.d, this.f21229f, this.f21230g, gVar);
        coroutinesRoom$Companion$createFlow$1.f21227b = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutinesRoom$Companion$createFlow$1) create((e1.i) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f21226a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f21228c, this.d, (e1.i) this.f21227b, this.f21229f, this.f21230g, null);
            this.f21226a = 1;
            if (p0.a.J(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
