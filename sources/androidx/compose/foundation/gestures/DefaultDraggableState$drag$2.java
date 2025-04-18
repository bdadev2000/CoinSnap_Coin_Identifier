package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {626}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DefaultDraggableState$drag$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultDraggableState f3140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f3141c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDraggableState$drag$2(DefaultDraggableState defaultDraggableState, MutatePriority mutatePriority, p pVar, g gVar) {
        super(2, gVar);
        this.f3140b = defaultDraggableState;
        this.f3141c = mutatePriority;
        this.d = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new DefaultDraggableState$drag$2(this.f3140b, this.f3141c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultDraggableState$drag$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3139a;
        if (i2 == 0) {
            q.m(obj);
            DefaultDraggableState defaultDraggableState = this.f3140b;
            MutatorMutex mutatorMutex = defaultDraggableState.f3138c;
            this.f3139a = 1;
            if (mutatorMutex.c(defaultDraggableState.f3137b, this.f3141c, this.d, this) == aVar) {
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
