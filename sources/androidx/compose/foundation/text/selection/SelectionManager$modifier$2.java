package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SelectionManager$modifier$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7246a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$2(SelectionManager selectionManager) {
        super(1);
        this.f7246a = selectionManager;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        SelectionManager selectionManager = this.f7246a;
        selectionManager.f7223k = layoutCoordinates;
        if (selectionManager.d() && selectionManager.e() != null) {
            Offset offset = layoutCoordinates != null ? new Offset(layoutCoordinates.M(0L)) : null;
            if (!p0.a.g(selectionManager.f7222j, offset)) {
                selectionManager.f7222j = offset;
                selectionManager.o();
                selectionManager.q();
            }
        }
        return b0.f30125a;
    }
}
