package androidx.compose.foundation.text.input.internal.selection;

import d0.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldSelectionState$detectCursorHandleDragGestures$3 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f6776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f6777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6778c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectCursorHandleDragGestures$3(TextFieldSelectionState textFieldSelectionState, e0 e0Var, e0 e0Var2) {
        super(0);
        this.f6776a = e0Var;
        this.f6777b = e0Var2;
        this.f6778c = textFieldSelectionState;
    }

    @Override // q0.a
    public final Object invoke() {
        TextFieldSelectionState.i(this.f6778c, this.f6776a, this.f6777b);
        return b0.f30125a;
    }
}
