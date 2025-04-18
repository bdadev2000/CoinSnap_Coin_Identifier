package androidx.compose.ui.graphics.vector;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class GroupComponent$wrappedListener$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GroupComponent f15302a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupComponent$wrappedListener$1(GroupComponent groupComponent) {
        super(1);
        this.f15302a = groupComponent;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        VNode vNode = (VNode) obj;
        GroupComponent groupComponent = this.f15302a;
        groupComponent.g(vNode);
        l lVar = groupComponent.f15291i;
        if (lVar != null) {
            lVar.invoke(vNode);
        }
        return b0.f30125a;
    }
}
