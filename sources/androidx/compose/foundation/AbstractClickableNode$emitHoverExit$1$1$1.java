package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverExit$1$1$1", f = "Clickable.kt", l = {1186}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AbstractClickableNode$emitHoverExit$1$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f2420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HoverInteraction.Exit f2421c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$emitHoverExit$1$1$1(MutableInteractionSource mutableInteractionSource, HoverInteraction.Exit exit, g gVar) {
        super(2, gVar);
        this.f2420b = mutableInteractionSource;
        this.f2421c = exit;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new AbstractClickableNode$emitHoverExit$1$1$1(this.f2420b, this.f2421c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$emitHoverExit$1$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2419a;
        if (i2 == 0) {
            q.m(obj);
            this.f2419a = 1;
            if (this.f2420b.a(this.f2421c, this) == aVar) {
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
