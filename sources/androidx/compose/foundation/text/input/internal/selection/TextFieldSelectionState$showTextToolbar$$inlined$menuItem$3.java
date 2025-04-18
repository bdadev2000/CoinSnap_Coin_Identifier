package androidx.compose.foundation.text.input.internal.selection;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class TextFieldSelectionState$showTextToolbar$$inlined$menuItem$3 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextToolbarState f6740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6741c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$showTextToolbar$$inlined$menuItem$3(TextFieldSelectionState textFieldSelectionState, TextFieldSelectionState textFieldSelectionState2) {
        super(0);
        TextToolbarState textToolbarState = TextToolbarState.f6863a;
        this.f6739a = textFieldSelectionState;
        this.f6740b = textToolbarState;
        this.f6741c = textFieldSelectionState2;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f6741c.h();
        this.f6739a.A(this.f6740b);
        return b0.f30125a;
    }
}
