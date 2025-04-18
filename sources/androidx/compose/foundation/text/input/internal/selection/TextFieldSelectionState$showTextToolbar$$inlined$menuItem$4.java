package androidx.compose.foundation.text.input.internal.selection;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class TextFieldSelectionState$showTextToolbar$$inlined$menuItem$4 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextToolbarState f6743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6744c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$showTextToolbar$$inlined$menuItem$4(TextFieldSelectionState textFieldSelectionState, TextFieldSelectionState textFieldSelectionState2) {
        super(0);
        TextToolbarState textToolbarState = TextToolbarState.f6865c;
        this.f6742a = textFieldSelectionState;
        this.f6743b = textToolbarState;
        this.f6744c = textFieldSelectionState2;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f6744c.x();
        this.f6742a.A(this.f6743b);
        return b0.f30125a;
    }
}
