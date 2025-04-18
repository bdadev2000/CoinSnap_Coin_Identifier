package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class BlockGraphicsLayerModifier$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f14947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BlockGraphicsLayerModifier f14948b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockGraphicsLayerModifier$measure$1(Placeable placeable, BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        super(1);
        this.f14947a = placeable;
        this.f14948b = blockGraphicsLayerModifier;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope.m((Placeable.PlacementScope) obj, this.f14947a, 0, 0, this.f14948b.f14946o, 4);
        return b0.f30125a;
    }
}
