package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import q0.q;

@e(c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", f = "Clickable.kt", l = {636}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ClickableNode$clickPointerInput$2 extends i implements q {

    /* renamed from: a, reason: collision with root package name */
    public int f2643a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ PressGestureScope f2644b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f2645c;
    public final /* synthetic */ ClickableNode d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableNode$clickPointerInput$2(ClickableNode clickableNode, g gVar) {
        super(3, gVar);
        this.d = clickableNode;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j2 = ((Offset) obj2).f14913a;
        ClickableNode$clickPointerInput$2 clickableNode$clickPointerInput$2 = new ClickableNode$clickPointerInput$2(this.d, (g) obj3);
        clickableNode$clickPointerInput$2.f2644b = (PressGestureScope) obj;
        clickableNode$clickPointerInput$2.f2645c = j2;
        return clickableNode$clickPointerInput$2.invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.f30806a;
        int i2 = this.f2643a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            PressGestureScope pressGestureScope = this.f2644b;
            long j2 = this.f2645c;
            ClickableNode clickableNode = this.d;
            if (clickableNode.f2411u) {
                this.f2643a = 1;
                MutableInteractionSource mutableInteractionSource = clickableNode.f2407q;
                if (mutableInteractionSource == null || (obj2 = p0.a.J(new AbstractClickableNode$handlePressInteraction$2$1(pressGestureScope, j2, mutableInteractionSource, clickableNode, null), this)) != aVar) {
                    obj2 = b0Var;
                }
                if (obj2 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0Var;
    }
}
