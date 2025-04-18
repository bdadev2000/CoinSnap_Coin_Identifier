package androidx.compose.foundation.text.selection;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SelectionManager$onSelectionChange$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7254a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$onSelectionChange$1(SelectionManager selectionManager) {
        super(1);
        this.f7254a = selectionManager;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f7254a.m((Selection) obj);
        return b0.f30125a;
    }
}
