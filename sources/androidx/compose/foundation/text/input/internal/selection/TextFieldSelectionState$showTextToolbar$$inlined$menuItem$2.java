package androidx.compose.foundation.text.input.internal.selection;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class TextFieldSelectionState$showTextToolbar$$inlined$menuItem$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextToolbarState f6737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6738c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$showTextToolbar$$inlined$menuItem$2(TextFieldSelectionState textFieldSelectionState, TextFieldSelectionState textFieldSelectionState2) {
        super(0);
        TextToolbarState textToolbarState = TextToolbarState.f6863a;
        this.f6736a = textFieldSelectionState;
        this.f6737b = textToolbarState;
        this.f6738c = textFieldSelectionState2;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f6738c.w();
        this.f6736a.A(this.f6737b);
        return b0.f30125a;
    }
}
