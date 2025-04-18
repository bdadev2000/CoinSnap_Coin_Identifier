package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {1074}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AbstractClickableNode$onKeyEvent$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractClickableNode f2433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PressInteraction.Press f2434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onKeyEvent$1(AbstractClickableNode abstractClickableNode, PressInteraction.Press press, g gVar) {
        super(2, gVar);
        this.f2433b = abstractClickableNode;
        this.f2434c = press;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new AbstractClickableNode$onKeyEvent$1(this.f2433b, this.f2434c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$onKeyEvent$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2432a;
        if (i2 == 0) {
            q.m(obj);
            MutableInteractionSource mutableInteractionSource = this.f2433b.f2407q;
            if (mutableInteractionSource != null) {
                this.f2432a = 1;
                if (mutableInteractionSource.a(this.f2434c, this) == aVar) {
                    return aVar;
                }
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
