package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class ThumbNode$measure$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f12303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThumbNode f12304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f12305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbNode$measure$3(Placeable placeable, ThumbNode thumbNode, float f2) {
        super(1);
        this.f12303a = placeable;
        this.f12304b = thumbNode;
        this.f12305c = f2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Animatable animatable = this.f12304b.f12293r;
        Placeable.PlacementScope.h(placementScope, this.f12303a, (int) (animatable != null ? ((Number) animatable.d()).floatValue() : this.f12305c), 0);
        return b0.f30125a;
    }
}
