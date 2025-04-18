package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SimpleGraphicsLayerModifier$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f15053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SimpleGraphicsLayerModifier f15054b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleGraphicsLayerModifier$measure$1(Placeable placeable, SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.f15053a = placeable;
        this.f15054b = simpleGraphicsLayerModifier;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope.m((Placeable.PlacementScope) obj, this.f15053a, 0, 0, this.f15054b.F, 4);
        return b0.f30125a;
    }
}
