package androidx.compose.foundation.text.selection;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SelectionManager$onSelectionChange$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f7256b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$onSelectionChange$2(SelectionManager selectionManager, l lVar) {
        super(1);
        this.f7255a = selectionManager;
        this.f7256b = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Selection selection = (Selection) obj;
        this.f7255a.m(selection);
        this.f7256b.invoke(selection);
        return b0.f30125a;
    }
}
