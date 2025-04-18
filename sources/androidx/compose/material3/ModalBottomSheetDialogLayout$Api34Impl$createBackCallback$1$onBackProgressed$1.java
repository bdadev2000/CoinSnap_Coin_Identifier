package androidx.compose.material3;

import android.window.BackEvent;
import androidx.compose.animation.core.Animatable;
import androidx.compose.material3.internal.PredictiveBack_androidKt;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1", f = "ModalBottomSheet.android.kt", l = {410}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animatable f9798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BackEvent f9799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1(Animatable animatable, BackEvent backEvent, g gVar) {
        super(2, gVar);
        this.f9798b = animatable;
        this.f9799c = backEvent;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1(this.f9798b, this.f9799c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f9797a;
        if (i2 == 0) {
            q.m(obj);
            Float f2 = new Float(PredictiveBack_androidKt.f13030a.b(this.f9799c.getProgress()));
            this.f9797a = 1;
            if (this.f9798b.e(f2, this) == aVar) {
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
