package androidx.compose.foundation.text.input.internal.selection;

import d0.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$4 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f6798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f6800c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$4(TextFieldSelectionState textFieldSelectionState, e0 e0Var, e0 e0Var2) {
        super(0);
        this.f6798a = e0Var;
        this.f6799b = textFieldSelectionState;
        this.f6800c = e0Var2;
    }

    @Override // q0.a
    public final Object invoke() {
        TextFieldSelectionState.j(this.f6799b, this.f6798a, this.f6800c);
        return b0.f30125a;
    }
}
