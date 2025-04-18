package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
public final class TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f6859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4(ContextMenuState contextMenuState, TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.f6859a = contextMenuState;
        this.f6860b = textFieldSelectionState;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f6860b.x();
        ContextMenuState_androidKt.a(this.f6859a);
        return b0.f30125a;
    }
}
