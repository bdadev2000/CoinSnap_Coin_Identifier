package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2", f = "TextFieldSelectionState.kt", l = {491}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TextFieldSelectionState$detectTextFieldTapGestures$2 extends i implements q {

    /* renamed from: a, reason: collision with root package name */
    public int f6805a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ PressGestureScope f6806b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f6807c;
    public final /* synthetic */ MutableInteractionSource d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6808f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTextFieldTapGestures$2(MutableInteractionSource mutableInteractionSource, TextFieldSelectionState textFieldSelectionState, g gVar) {
        super(3, gVar);
        this.d = mutableInteractionSource;
        this.f6808f = textFieldSelectionState;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j2 = ((Offset) obj2).f14913a;
        TextFieldSelectionState$detectTextFieldTapGestures$2 textFieldSelectionState$detectTextFieldTapGestures$2 = new TextFieldSelectionState$detectTextFieldTapGestures$2(this.d, this.f6808f, (g) obj3);
        textFieldSelectionState$detectTextFieldTapGestures$2.f6806b = (PressGestureScope) obj;
        textFieldSelectionState$detectTextFieldTapGestures$2.f6807c = j2;
        return textFieldSelectionState$detectTextFieldTapGestures$2.invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f6805a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            PressGestureScope pressGestureScope = this.f6806b;
            long j2 = this.f6807c;
            MutableInteractionSource mutableInteractionSource = this.d;
            if (mutableInteractionSource != null) {
                TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 textFieldSelectionState$detectTextFieldTapGestures$2$1$1 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(pressGestureScope, this.f6808f, j2, mutableInteractionSource, null);
                this.f6805a = 1;
                if (p0.a.J(textFieldSelectionState$detectTextFieldTapGestures$2$1$1, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
