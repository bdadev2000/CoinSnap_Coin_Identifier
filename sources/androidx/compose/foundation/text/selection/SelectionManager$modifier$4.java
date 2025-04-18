package androidx.compose.foundation.text.selection;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SelectionManager$modifier$4 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7248a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$4(SelectionManager selectionManager) {
        super(1);
        this.f7248a = selectionManager;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f7248a.l(((Boolean) obj).booleanValue());
        return b0.f30125a;
    }
}
