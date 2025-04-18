package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.foundation.text.TextContextMenuItems;
import b1.f0;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SelectionManager_androidKt$contextMenuBuilder$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f7263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7264b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager_androidKt$contextMenuBuilder$1(ContextMenuState contextMenuState, SelectionManager selectionManager) {
        super(1);
        this.f7263a = contextMenuState;
        this.f7264b = selectionManager;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContextMenuScope contextMenuScope = (ContextMenuScope) obj;
        TextContextMenuItems textContextMenuItems = TextContextMenuItems.Copy;
        SelectionManager selectionManager = this.f7264b;
        boolean h2 = selectionManager.h();
        ContextMenu_androidKt$TextItem$1 contextMenu_androidKt$TextItem$1 = new ContextMenu_androidKt$TextItem$1(textContextMenuItems);
        ContextMenuState contextMenuState = this.f7263a;
        ContextMenuScope.b(contextMenuScope, contextMenu_androidKt$TextItem$1, h2, new SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1(contextMenuState, selectionManager));
        b0 b0Var = b0.f30125a;
        ContextMenuScope.b(contextMenuScope, new ContextMenu_androidKt$TextItem$1(TextContextMenuItems.SelectAll), !selectionManager.f(), new SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2(contextMenuState, selectionManager));
        f0.v(b0Var, b0Var);
        return b0Var;
    }
}
