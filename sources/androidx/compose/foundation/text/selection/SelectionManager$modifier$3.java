package androidx.compose.foundation.text.selection;

import androidx.compose.ui.focus.FocusState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SelectionManager$modifier$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7247a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$3(SelectionManager selectionManager) {
        super(1);
        this.f7247a = selectionManager;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        FocusState focusState = (FocusState) obj;
        boolean a2 = focusState.a();
        SelectionManager selectionManager = this.f7247a;
        if (!a2 && selectionManager.d()) {
            selectionManager.i();
        }
        selectionManager.f7221i.setValue(Boolean.valueOf(focusState.a()));
        return b0.f30125a;
    }
}
