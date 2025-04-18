package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import d0.b0;
import e1.j;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {756}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f1695a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Transition f1697c;
    public final /* synthetic */ State d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Transition f1698a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Transition transition) {
            super(0);
            this.f1698a = transition;
        }

        @Override // q0.a
        public final Object invoke() {
            Transition transition = this.f1698a;
            Object a2 = transition.f2267a.a();
            EnterExitState enterExitState = EnterExitState.f1808c;
            return Boolean.valueOf(a2 == enterExitState && transition.d.getValue() == enterExitState);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(Transition transition, State state, g gVar) {
        super(2, gVar);
        this.f1697c = transition;
        this.d = state;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.f1697c, this.d, gVar);
        animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.f1696b = obj;
        return animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1) create((ProduceStateScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f1695a;
        if (i2 == 0) {
            q.m(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.f1696b;
            final Transition transition = this.f1697c;
            j l2 = SnapshotStateKt.l(new AnonymousClass1(transition));
            final State state = this.d;
            e1.i iVar = new e1.i() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.2
                @Override // e1.i
                public final Object emit(Object obj2, g gVar) {
                    boolean z2;
                    if (((Boolean) obj2).booleanValue()) {
                        p pVar = (p) state.getValue();
                        Transition transition2 = transition;
                        z2 = ((Boolean) pVar.invoke(transition2.f2267a.a(), transition2.d.getValue())).booleanValue();
                    } else {
                        z2 = false;
                    }
                    ProduceStateScope.this.setValue(Boolean.valueOf(z2));
                    return b0.f30125a;
                }
            };
            this.f1695a = 1;
            if (l2.collect(iVar, this) == aVar) {
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
