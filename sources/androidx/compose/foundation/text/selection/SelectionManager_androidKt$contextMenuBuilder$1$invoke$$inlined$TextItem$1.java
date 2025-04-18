package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
public final class SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f7259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7260b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1(ContextMenuState contextMenuState, SelectionManager selectionManager) {
        super(0);
        this.f7259a = contextMenuState;
        this.f7260b = selectionManager;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f7260b.b();
        ContextMenuState_androidKt.a(this.f7259a);
        return b0.f30125a;
    }
}
