package androidx.compose.material3;

import androidx.compose.material3.internal.DraggableAnchors;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4$1", f = "ModalBottomSheet.kt", l = {Opcodes.MONITORENTER}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ModalBottomSheetKt$ModalBottomSheet$4$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SheetState f9839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheet$4$1(SheetState sheetState, g gVar) {
        super(2, gVar);
        this.f9839b = sheetState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ModalBottomSheetKt$ModalBottomSheet$4$1(this.f9839b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ModalBottomSheetKt$ModalBottomSheet$4$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f9838a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            this.f9838a = 1;
            SheetState sheetState = this.f9839b;
            DraggableAnchors e = sheetState.f11199c.e();
            SheetValue sheetValue = SheetValue.f11208c;
            if (!e.c(sheetValue)) {
                sheetValue = SheetValue.f11207b;
            }
            Object a2 = SheetState.a(sheetState, sheetValue, this);
            if (a2 != aVar) {
                a2 = b0Var;
            }
            if (a2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0Var;
    }
}
