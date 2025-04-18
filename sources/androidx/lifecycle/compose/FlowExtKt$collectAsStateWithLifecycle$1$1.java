package androidx.lifecycle.compose;

import androidx.compose.runtime.ProduceStateScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import b1.d0;
import d0.b0;
import e1.h;
import h0.g;
import h0.l;
import h0.m;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {Opcodes.IRETURN}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FlowExtKt$collectAsStateWithLifecycle$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20138a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f20140c;
    public final /* synthetic */ Lifecycle.State d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f20141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f20142g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {Opcodes.FRETURN, Opcodes.DRETURN}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f20143a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f20144b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f20145c;
        public final /* synthetic */ ProduceStateScope d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", l = {Opcodes.ARETURN}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public final class AnonymousClass2 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f20147a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f20148b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ProduceStateScope f20149c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(h hVar, ProduceStateScope produceStateScope, g gVar) {
                super(2, gVar);
                this.f20148b = hVar;
                this.f20149c = produceStateScope;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new AnonymousClass2(this.f20148b, this.f20149c, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f20147a;
                if (i2 == 0) {
                    q.m(obj);
                    final ProduceStateScope produceStateScope = this.f20149c;
                    e1.i iVar = new e1.i() { // from class: androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle.1.1.1.2.1
                        @Override // e1.i
                        public final Object emit(Object obj2, g gVar) {
                            ProduceStateScope.this.setValue(obj2);
                            return b0.f30125a;
                        }
                    };
                    this.f20147a = 1;
                    if (this.f20148b.collect(iVar, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, h hVar, ProduceStateScope produceStateScope, g gVar) {
            super(2, gVar);
            this.f20144b = lVar;
            this.f20145c = hVar;
            this.d = produceStateScope;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f20144b, this.f20145c, this.d, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f20143a;
            if (i2 == 0) {
                q.m(obj);
                m mVar = m.f30726a;
                l lVar = this.f20144b;
                boolean g2 = p0.a.g(lVar, mVar);
                final ProduceStateScope produceStateScope = this.d;
                h hVar = this.f20145c;
                if (g2) {
                    e1.i iVar = new e1.i() { // from class: androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle.1.1.1.1
                        @Override // e1.i
                        public final Object emit(Object obj2, g gVar) {
                            ProduceStateScope.this.setValue(obj2);
                            return b0.f30125a;
                        }
                    };
                    this.f20143a = 1;
                    if (hVar.collect(iVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(hVar, produceStateScope, null);
                    this.f20143a = 2;
                    if (kotlin.jvm.internal.e.G(this, lVar, anonymousClass2) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$collectAsStateWithLifecycle$1$1(Lifecycle lifecycle, Lifecycle.State state, l lVar, h hVar, g gVar) {
        super(2, gVar);
        this.f20140c = lifecycle;
        this.d = state;
        this.f20141f = lVar;
        this.f20142g = hVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.f20140c, this.d, this.f20141f, this.f20142g, gVar);
        flowExtKt$collectAsStateWithLifecycle$1$1.f20139b = obj;
        return flowExtKt$collectAsStateWithLifecycle$1$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$collectAsStateWithLifecycle$1$1) create((ProduceStateScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f20138a;
        if (i2 == 0) {
            q.m(obj);
            ProduceStateScope produceStateScope = (ProduceStateScope) this.f20139b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f20141f, this.f20142g, produceStateScope, null);
            this.f20138a = 1;
            if (RepeatOnLifecycleKt.a(this.f20140c, this.d, anonymousClass1, this) == aVar) {
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
