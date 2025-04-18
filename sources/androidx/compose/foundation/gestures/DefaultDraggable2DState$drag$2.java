package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2", f = "Draggable2D.kt", l = {497}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DefaultDraggable2DState$drag$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultDraggable2DState f3134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f3135c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDraggable2DState$drag$2(DefaultDraggable2DState defaultDraggable2DState, MutatePriority mutatePriority, p pVar, g gVar) {
        super(2, gVar);
        this.f3134b = defaultDraggable2DState;
        this.f3135c = mutatePriority;
        this.d = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new DefaultDraggable2DState$drag$2(this.f3134b, this.f3135c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        DefaultDraggable2DState$drag$2 defaultDraggable2DState$drag$2 = (DefaultDraggable2DState$drag$2) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        defaultDraggable2DState$drag$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f3133a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            return b0.f30125a;
        }
        q.m(obj);
        DefaultDraggable2DState defaultDraggable2DState = this.f3134b;
        defaultDraggable2DState.getClass();
        defaultDraggable2DState.getClass();
        this.f3133a = 1;
        throw null;
    }
}
