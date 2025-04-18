package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
public final class SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f7261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2(ContextMenuState contextMenuState, SelectionManager selectionManager) {
        super(0);
        this.f7261a = contextMenuState;
        this.f7262b = selectionManager;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f7262b.k();
        ContextMenuState_androidKt.a(this.f7261a);
        return b0.f30125a;
    }
}
