package androidx.compose.foundation;

import androidx.compose.foundation.relocation.ScrollIntoView;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", f = "Focusable.kt", l = {224}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FocusableNode$onFocusEvent$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusableNode f2715b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$onFocusEvent$1(FocusableNode focusableNode, g gVar) {
        super(2, gVar);
        this.f2715b = focusableNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new FocusableNode$onFocusEvent$1(this.f2715b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((FocusableNode$onFocusEvent$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2714a;
        if (i2 == 0) {
            q.m(obj);
            this.f2714a = 1;
            if (ScrollIntoView.a(this.f2715b, null, this) == aVar) {
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
