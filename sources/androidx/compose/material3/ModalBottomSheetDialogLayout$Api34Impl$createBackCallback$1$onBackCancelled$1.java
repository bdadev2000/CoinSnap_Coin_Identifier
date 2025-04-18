package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1", f = "ModalBottomSheet.android.kt", l = {419}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animatable f9796b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1(Animatable animatable, g gVar) {
        super(2, gVar);
        this.f9796b = animatable;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1(this.f9796b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f9795a;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = this.f9796b;
            Float f2 = new Float(0.0f);
            this.f9795a = 1;
            if (Animatable.c(animatable, f2, null, null, null, this, 14) == aVar) {
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
