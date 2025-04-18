package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import b1.d0;
import d0.b0;
import d1.q;
import e1.h;
import h0.g;
import j0.e;
import j0.i;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {Opcodes.DUP_X2}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FlowExtKt$flowWithLifecycle$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f19962a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f19964c;
    public final /* synthetic */ Lifecycle.State d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f19965f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {Opcodes.DUP2}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f19966a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f19967b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f19968c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, q qVar, g gVar) {
            super(2, gVar);
            this.f19967b = hVar;
            this.f19968c = qVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f19967b, this.f19968c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f19966a;
            if (i2 == 0) {
                kotlin.jvm.internal.q.m(obj);
                final q qVar = this.f19968c;
                e1.i iVar = new e1.i() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                    @Override // e1.i
                    public final Object emit(Object obj2, g gVar) {
                        Object j2 = ((d1.p) q.this).d.j(obj2, gVar);
                        return j2 == i0.a.f30806a ? j2 : b0.f30125a;
                    }
                };
                this.f19966a = 1;
                if (this.f19967b.collect(iVar, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, h hVar, g gVar) {
        super(2, gVar);
        this.f19964c = lifecycle;
        this.d = state;
        this.f19965f = hVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.f19964c, this.d, this.f19965f, gVar);
        flowExtKt$flowWithLifecycle$1.f19963b = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$flowWithLifecycle$1) create((q) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        q qVar;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f19962a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            q qVar2 = (q) this.f19963b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f19965f, qVar2, null);
            this.f19963b = qVar2;
            this.f19962a = 1;
            if (RepeatOnLifecycleKt.a(this.f19964c, this.d, anonymousClass1, this) == aVar) {
                return aVar;
            }
            qVar = qVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) this.f19963b;
            kotlin.jvm.internal.q.m(obj);
        }
        ((d1.p) qVar).f(null);
        return b0.f30125a;
    }
}
