package androidx.compose.ui;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class ZIndexNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f14710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ZIndexNode f14711b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZIndexNode$measure$1(Placeable placeable, ZIndexNode zIndexNode) {
        super(1);
        this.f14710a = placeable;
        this.f14711b = zIndexNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).e(this.f14710a, 0, 0, this.f14711b.f14709o);
        return b0.f30125a;
    }
}
