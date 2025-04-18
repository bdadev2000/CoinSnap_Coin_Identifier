package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1", f = "TextFieldSelectionManager.kt", l = {1012}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7332a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f7334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1(TextDragObserver textDragObserver, g gVar) {
        super(2, gVar);
        this.f7334c = textDragObserver;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1 textFieldSelectionManagerKt$TextFieldSelectionHandle$2$1 = new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1(this.f7334c, gVar);
        textFieldSelectionManagerKt$TextFieldSelectionHandle$2$1.f7333b = obj;
        return textFieldSelectionManagerKt$TextFieldSelectionHandle$2$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7332a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f7333b;
            this.f7332a = 1;
            if (LongPressTextDragObserverKt.a(pointerInputScope, this.f7334c, this) == aVar) {
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
