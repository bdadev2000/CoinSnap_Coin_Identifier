package androidx.compose.animation;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$SizeModifier$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl f1675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Placeable f1676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1677c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifier$measure$1(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, Placeable placeable, long j2) {
        super(1);
        this.f1675a = animatedContentTransitionScopeImpl;
        this.f1676b = placeable;
        this.f1677c = j2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Alignment alignment = this.f1675a.f1669b;
        Placeable placeable = this.f1676b;
        Placeable.PlacementScope.g((Placeable.PlacementScope) obj, placeable, alignment.a(IntSizeKt.a(placeable.f15825a, placeable.f15826b), this.f1677c, LayoutDirection.f17494a));
        return b0.f30125a;
    }
}
