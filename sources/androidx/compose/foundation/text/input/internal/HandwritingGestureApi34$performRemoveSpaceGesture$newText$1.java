package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class HandwritingGestureApi34$performRemoveSpaceGesture$newText$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f6409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f6410b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandwritingGestureApi34$performRemoveSpaceGesture$newText$1(d0 d0Var, d0 d0Var2) {
        super(1);
        this.f6409a = d0Var;
        this.f6410b = d0Var2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        z0.f fVar = (z0.f) obj;
        d0 d0Var = this.f6409a;
        if (d0Var.f30925a == -1) {
            d0Var.f30925a = fVar.b().f31406a;
        }
        this.f6410b.f30925a = fVar.b().f31407b + 1;
        return "";
    }
}
