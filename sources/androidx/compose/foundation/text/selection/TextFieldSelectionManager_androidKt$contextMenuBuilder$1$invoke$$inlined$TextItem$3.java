package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
public final class TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f7343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f7344b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3(ContextMenuState contextMenuState, TextFieldSelectionManager textFieldSelectionManager) {
        super(0);
        this.f7343a = contextMenuState;
        this.f7344b = textFieldSelectionManager;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f7344b.n();
        ContextMenuState_androidKt.a(this.f7343a);
        return b0.f30125a;
    }
}
