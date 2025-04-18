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

@e(c = "androidx.compose.foundation.CombinedClickableNodeImpl$clickPointerInput$4", f = "Clickable.kt", l = {787}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CombinedClickableNodeImpl$clickPointerInput$4 extends i implements q {

    /* renamed from: a, reason: collision with root package name */
    public int f2671a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ PressGestureScope f2672b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f2673c;
    public final /* synthetic */ CombinedClickableNodeImpl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNodeImpl$clickPointerInput$4(CombinedClickableNodeImpl combinedClickableNodeImpl, g gVar) {
        super(3, gVar);
        this.d = combinedClickableNodeImpl;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j2 = ((Offset) obj2).f14913a;
        CombinedClickableNodeImpl$clickPointerInput$4 combinedClickableNodeImpl$clickPointerInput$4 = new CombinedClickableNodeImpl$clickPointerInput$4(this.d, (g) obj3);
        combinedClickableNodeImpl$clickPointerInput$4.f2672b = (PressGestureScope) obj;
        combinedClickableNodeImpl$clickPointerInput$4.f2673c = j2;
        return combinedClickableNodeImpl$clickPointerInput$4.invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.f30806a;
        int i2 = this.f2671a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            PressGestureScope pressGestureScope = this.f2672b;
            long j2 = this.f2673c;
            CombinedClickableNodeImpl combinedClickableNodeImpl = this.d;
            if (combinedClickableNodeImpl.f2411u) {
                this.f2671a = 1;
                MutableInteractionSource mutableInteractionSource = combinedClickableNodeImpl.f2407q;
                if (mutableInteractionSource == null || (obj2 = p0.a.J(new AbstractClickableNode$handlePressInteraction$2$1(pressGestureScope, j2, mutableInteractionSource, combinedClickableNodeImpl, null), this)) != aVar) {
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
