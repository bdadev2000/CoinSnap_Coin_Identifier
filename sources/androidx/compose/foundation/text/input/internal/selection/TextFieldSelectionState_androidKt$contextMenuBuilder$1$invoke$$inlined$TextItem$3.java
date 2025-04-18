package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
public final class TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f6857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3(ContextMenuState contextMenuState, TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.f6857a = contextMenuState;
        this.f6858b = textFieldSelectionState;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f6858b.w();
        ContextMenuState_androidKt.a(this.f6857a);
        return b0.f30125a;
    }
}
