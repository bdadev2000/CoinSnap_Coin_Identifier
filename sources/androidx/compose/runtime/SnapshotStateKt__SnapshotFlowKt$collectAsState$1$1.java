package androidx.compose.runtime;

import b1.d0;
import d0.b0;
import e1.h;
import h0.g;
import h0.l;
import h0.m;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.TypeReference;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {TypeReference.NEW, TypeReference.CONSTRUCTOR_REFERENCE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f14049a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f14051c;
    public final /* synthetic */ h d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {TypeReference.METHOD_REFERENCE}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f14053a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f14054b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ProduceStateScope f14055c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(h hVar, ProduceStateScope produceStateScope, g gVar) {
            super(2, gVar);
            this.f14054b = hVar;
            this.f14055c = produceStateScope;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass2(this.f14054b, this.f14055c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f14053a;
            if (i2 == 0) {
                q.m(obj);
                final ProduceStateScope produceStateScope = this.f14055c;
                e1.i iVar = new e1.i() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.1.2.1
                    @Override // e1.i
                    public final Object emit(Object obj2, g gVar) {
                        ProduceStateScope.this.setValue(obj2);
                        return b0.f30125a;
                    }
                };
                this.f14053a = 1;
                if (this.f14054b.collect(iVar, this) == aVar) {
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
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(l lVar, h hVar, g gVar) {
        super(2, gVar);
        this.f14051c = lVar;
        this.d = hVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(this.f14051c, this.d, gVar);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1$1.f14050b = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1) create((ProduceStateScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f14049a;
        if (i2 == 0) {
            q.m(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.f14050b;
            m mVar = m.f30726a;
            l lVar = this.f14051c;
            boolean g2 = p0.a.g(lVar, mVar);
            h hVar = this.d;
            if (g2) {
                e1.i iVar = new e1.i() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1.1
                    @Override // e1.i
                    public final Object emit(Object obj2, g gVar) {
                        ProduceStateScope.this.setValue(obj2);
                        return b0.f30125a;
                    }
                };
                this.f14049a = 1;
                if (hVar.collect(iVar, this) == aVar) {
                    return aVar;
                }
            } else {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(hVar, produceStateScope, null);
                this.f14049a = 2;
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
