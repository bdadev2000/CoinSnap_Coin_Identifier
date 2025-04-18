package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class SelectionContainerKt$SelectionContainer$4$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7120a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$4$1(SelectionManager selectionManager) {
        super(1);
        this.f7120a = selectionManager;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final SelectionManager selectionManager = this.f7120a;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                SelectionManager selectionManager2 = SelectionManager.this;
                selectionManager2.i();
                selectionManager2.f7221i.setValue(Boolean.FALSE);
            }
        };
    }
}
