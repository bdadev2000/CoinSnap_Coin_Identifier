package androidx.lifecycle;

import b1.d0;
import b1.o0;
import b1.w1;
import d0.b0;
import g1.u;
import h0.g;
import h0.l;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {107, 112, Opcodes.LREM, Opcodes.DREM}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FlowLiveDataConversions$asFlow$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f19970a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LiveData f19972c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LiveData f19973a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Observer f19974b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LiveData liveData, Observer observer, g gVar) {
            super(2, gVar);
            this.f19973a = liveData;
            this.f19974b = observer;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f19973a, this.f19974b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((d0) obj, (g) obj2);
            b0 b0Var = b0.f30125a;
            anonymousClass1.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            q.m(obj);
            this.f19973a.d(this.f19974b);
            return b0.f30125a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LiveData f19975a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Observer f19976b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LiveData liveData, Observer observer, g gVar) {
            super(2, gVar);
            this.f19975a = liveData;
            this.f19976b = observer;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass2(this.f19975a, this.f19976b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((d0) obj, (g) obj2);
            b0 b0Var = b0.f30125a;
            anonymousClass2.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            q.m(obj);
            this.f19975a.d(this.f19976b);
            return b0.f30125a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass3 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LiveData f19977a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Observer f19978b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LiveData liveData, Observer observer, g gVar) {
            super(2, gVar);
            this.f19977a = liveData;
            this.f19978b = observer;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass3(this.f19977a, this.f19978b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((d0) obj, (g) obj2);
            b0 b0Var = b0.f30125a;
            anonymousClass3.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            q.m(obj);
            this.f19977a.g(this.f19978b);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(LiveData liveData, g gVar) {
        super(2, gVar);
        this.f19972c = liveData;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.f19972c, gVar);
        flowLiveDataConversions$asFlow$1.f19971b = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((FlowLiveDataConversions$asFlow$1) create((d1.q) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        return i0.a.f30806a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, androidx.lifecycle.Observer] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        Observer observer;
        i0.a aVar = i0.a.f30806a;
        ?? r1 = this.f19970a;
        LiveData liveData = this.f19972c;
        try {
            if (r1 == 0) {
                q.m(obj);
                final d1.q qVar = (d1.q) this.f19971b;
                observer = new Observer() { // from class: androidx.lifecycle.a
                    @Override // androidx.lifecycle.Observer
                    public final void a(Object obj2) {
                        ((d1.p) d1.q.this).b(obj2);
                    }
                };
                h1.d dVar = o0.f22355a;
                c1.e eVar = ((c1.e) u.f30639a).f22411g;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(liveData, observer, null);
                this.f19971b = observer;
                this.f19970a = 1;
                if (kotlin.jvm.internal.e.G(this, eVar, anonymousClass1) == aVar) {
                    return aVar;
                }
            } else {
                if (r1 != 1) {
                    if (r1 == 2) {
                        observer = (Observer) this.f19971b;
                        q.m(obj);
                        this.f19971b = observer;
                        this.f19970a = 3;
                        p0.a.i(this);
                        return aVar;
                    }
                    if (r1 == 3) {
                        q.m(obj);
                        throw new RuntimeException();
                    }
                    if (r1 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) this.f19971b;
                    q.m(obj);
                    throw th;
                }
                observer = (Observer) this.f19971b;
                q.m(obj);
            }
            h1.d dVar2 = o0.f22355a;
            c1.e eVar2 = ((c1.e) u.f30639a).f22411g;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(liveData, observer, null);
            this.f19971b = observer;
            this.f19970a = 2;
            if (kotlin.jvm.internal.e.G(this, eVar2, anonymousClass2) == aVar) {
                return aVar;
            }
            this.f19971b = observer;
            this.f19970a = 3;
            p0.a.i(this);
            return aVar;
        } catch (Throwable th2) {
            h1.d dVar3 = o0.f22355a;
            l u2 = ((c1.e) u.f30639a).f22411g.u(w1.f22388b);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(liveData, r1, null);
            this.f19971b = th2;
            this.f19970a = 4;
            if (kotlin.jvm.internal.e.G(this, u2, anonymousClass3) == aVar) {
                return aVar;
            }
            throw th2;
        }
    }
}
