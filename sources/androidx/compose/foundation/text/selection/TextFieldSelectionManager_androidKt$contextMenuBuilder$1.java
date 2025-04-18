package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextFieldSelectionManager_androidKt$contextMenuBuilder$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f7347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f7348b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$contextMenuBuilder$1(ContextMenuState contextMenuState, TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.f7347a = textFieldSelectionManager;
        this.f7348b = contextMenuState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ClipboardManager clipboardManager;
        ContextMenuScope contextMenuScope = (ContextMenuScope) obj;
        TextFieldSelectionManager textFieldSelectionManager = this.f7347a;
        boolean z2 = textFieldSelectionManager.f7303f instanceof PasswordVisualTransformation;
        boolean z3 = !TextRange.c(textFieldSelectionManager.l().f17362b);
        TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = textFieldSelectionManager.f7308k;
        boolean z4 = z3 && ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue() && !z2;
        ContextMenu_androidKt$TextItem$1 contextMenu_androidKt$TextItem$1 = new ContextMenu_androidKt$TextItem$1(textContextMenuItems);
        ContextMenuState contextMenuState = this.f7348b;
        ContextMenuScope.b(contextMenuScope, contextMenu_androidKt$TextItem$1, z4, new TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1(contextMenuState, textFieldSelectionManager));
        ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(TextContextMenuItems.Copy), z3 && !z2, new TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2(contextMenuState, textFieldSelectionManager));
        ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(TextContextMenuItems.Paste), ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue() && (clipboardManager = textFieldSelectionManager.f7304g) != null && clipboardManager.c(), new TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3(contextMenuState, textFieldSelectionManager));
        ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(TextContextMenuItems.SelectAll), TextRange.d(textFieldSelectionManager.l().f17362b) != textFieldSelectionManager.l().f17361a.f16880a.length(), new TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4(contextMenuState, textFieldSelectionManager));
        return b0.f30125a;
    }
}
