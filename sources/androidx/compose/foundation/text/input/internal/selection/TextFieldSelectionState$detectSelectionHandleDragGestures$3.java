package androidx.compose.foundation.text.input.internal.selection;

import d0.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$3 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f6795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f6797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$3(TextFieldSelectionState textFieldSelectionState, e0 e0Var, e0 e0Var2) {
        super(0);
        this.f6795a = e0Var;
        this.f6796b = textFieldSelectionState;
        this.f6797c = e0Var2;
    }

    @Override // q0.a
    public final Object invoke() {
        TextFieldSelectionState.j(this.f6796b, this.f6795a, this.f6797c);
        return b0.f30125a;
    }
}
