package androidx.compose.material3;

import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import q0.l;
import q0.q;

@e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ModalBottomSheetKt$ModalBottomSheetContent$4$1 extends i implements q {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ float f9875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f9876b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetContent$4$1(l lVar, g gVar) {
        super(3, gVar);
        this.f9876b = lVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        ModalBottomSheetKt$ModalBottomSheetContent$4$1 modalBottomSheetKt$ModalBottomSheetContent$4$1 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(this.f9876b, (g) obj3);
        modalBottomSheetKt$ModalBottomSheetContent$4$1.f9875a = floatValue;
        b0 b0Var = b0.f30125a;
        modalBottomSheetKt$ModalBottomSheetContent$4$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        kotlin.jvm.internal.q.m(obj);
        this.f9876b.invoke(new Float(this.f9875a));
        return b0.f30125a;
    }
}
