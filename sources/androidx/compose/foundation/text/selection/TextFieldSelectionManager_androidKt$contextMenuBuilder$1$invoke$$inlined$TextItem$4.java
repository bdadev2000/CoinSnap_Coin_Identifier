package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
public final class TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f7345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f7346b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4(ContextMenuState contextMenuState, TextFieldSelectionManager textFieldSelectionManager) {
        super(0);
        this.f7345a = contextMenuState;
        this.f7346b = textFieldSelectionManager;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f7346b.o();
        ContextMenuState_androidKt.a(this.f7345a);
        return b0.f30125a;
    }
}
