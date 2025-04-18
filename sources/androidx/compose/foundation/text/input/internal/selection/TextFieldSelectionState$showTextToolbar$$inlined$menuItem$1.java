package androidx.compose.foundation.text.input.internal.selection;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class TextFieldSelectionState$showTextToolbar$$inlined$menuItem$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextToolbarState f6734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6735c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$showTextToolbar$$inlined$menuItem$1(TextFieldSelectionState textFieldSelectionState, TextFieldSelectionState textFieldSelectionState2) {
        super(0);
        TextToolbarState textToolbarState = TextToolbarState.f6863a;
        this.f6733a = textFieldSelectionState;
        this.f6734b = textToolbarState;
        this.f6735c = textFieldSelectionState2;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f6735c.f(true);
        this.f6733a.A(this.f6734b);
        return b0.f30125a;
    }
}
