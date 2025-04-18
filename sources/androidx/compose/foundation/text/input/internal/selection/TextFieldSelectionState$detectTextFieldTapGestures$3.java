package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.ui.geometry.Offset;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TextFieldSelectionState$detectTextFieldTapGestures$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f6818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f6820c;

    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements a {
        @Override // q0.a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return "onTapTextField";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTextFieldTapGestures$3(a aVar, TextFieldSelectionState textFieldSelectionState, a aVar2) {
        super(1);
        this.f6818a = aVar;
        this.f6819b = textFieldSelectionState;
        this.f6820c = aVar2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((Offset) obj).f14913a;
        this.f6818a.invoke();
        TextFieldSelectionState textFieldSelectionState = this.f6819b;
        if (textFieldSelectionState.d && textFieldSelectionState.f6717f) {
            if (!textFieldSelectionState.e) {
                this.f6820c.invoke();
                if (textFieldSelectionState.f6714a.d().length() > 0) {
                    textFieldSelectionState.z(true);
                }
            }
            textFieldSelectionState.A(TextToolbarState.f6863a);
            TextLayoutState textLayoutState = textFieldSelectionState.f6715b;
            TextFieldSelectionState.c(textFieldSelectionState, TextLayoutStateKt.b(textLayoutState, textLayoutState.a(j2)));
        }
        return b0.f30125a;
    }
}
