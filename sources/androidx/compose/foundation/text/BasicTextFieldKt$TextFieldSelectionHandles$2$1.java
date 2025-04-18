package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$2$1", f = "BasicTextField.kt", l = {459}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class BasicTextFieldKt$TextFieldSelectionHandles$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f5629a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$TextFieldSelectionHandles$2$1(TextFieldSelectionState textFieldSelectionState, g gVar) {
        super(2, gVar);
        this.f5631c = textFieldSelectionState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        BasicTextFieldKt$TextFieldSelectionHandles$2$1 basicTextFieldKt$TextFieldSelectionHandles$2$1 = new BasicTextFieldKt$TextFieldSelectionHandles$2$1(this.f5631c, gVar);
        basicTextFieldKt$TextFieldSelectionHandles$2$1.f5630b = obj;
        return basicTextFieldKt$TextFieldSelectionHandles$2$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTextFieldKt$TextFieldSelectionHandles$2$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f5629a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f5630b;
            this.f5629a = 1;
            if (this.f5631c.y(pointerInputScope, true, this) == aVar) {
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
