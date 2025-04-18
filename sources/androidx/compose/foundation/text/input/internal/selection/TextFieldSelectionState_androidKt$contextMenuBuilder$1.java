package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.ui.text.TextRange;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextFieldSelectionState_androidKt$contextMenuBuilder$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f6861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6862b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState_androidKt$contextMenuBuilder$1(ContextMenuState contextMenuState, TextFieldSelectionState textFieldSelectionState) {
        super(1);
        this.f6861a = contextMenuState;
        this.f6862b = textFieldSelectionState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContextMenuScope contextMenuScope = (ContextMenuScope) obj;
        TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
        TextFieldSelectionState textFieldSelectionState = this.f6862b;
        boolean z2 = (TextRange.c(textFieldSelectionState.f6714a.d().f6298b) || !textFieldSelectionState.d || textFieldSelectionState.e || textFieldSelectionState.f6718g) ? false : true;
        ContextMenu_androidKt$TextItem$1 contextMenu_androidKt$TextItem$1 = new ContextMenu_androidKt$TextItem$1(textContextMenuItems);
        ContextMenuState contextMenuState = this.f6861a;
        ContextMenuScope.b(contextMenuScope, contextMenu_androidKt$TextItem$1, z2, new TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1(contextMenuState, textFieldSelectionState));
        TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
        TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.f6714a;
        ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems2), (TextRange.c(transformedTextFieldState.d().f6298b) || textFieldSelectionState.f6718g) ? false : true, new TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2(contextMenuState, textFieldSelectionState));
        ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(TextContextMenuItems.Paste), textFieldSelectionState.d(), new TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3(contextMenuState, textFieldSelectionState));
        ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(TextContextMenuItems.SelectAll), TextRange.d(transformedTextFieldState.d().f6298b) != transformedTextFieldState.d().f6297a.length(), new TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4(contextMenuState, textFieldSelectionState));
        return b0.f30125a;
    }
}
