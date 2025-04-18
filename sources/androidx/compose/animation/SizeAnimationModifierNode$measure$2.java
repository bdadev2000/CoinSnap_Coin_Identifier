package androidx.compose.animation;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SizeAnimationModifierNode$measure$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SizeAnimationModifierNode f1955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1957c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f1958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Placeable f1959g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$measure$2(SizeAnimationModifierNode sizeAnimationModifierNode, long j2, int i2, int i3, MeasureScope measureScope, Placeable placeable) {
        super(1);
        this.f1955a = sizeAnimationModifierNode;
        this.f1956b = j2;
        this.f1957c = i2;
        this.d = i3;
        this.f1958f = measureScope;
        this.f1959g = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope.i((Placeable.PlacementScope) obj, this.f1959g, this.f1955a.f1944p.a(this.f1956b, IntSizeKt.a(this.f1957c, this.d), this.f1958f.getLayoutDirection()));
        return b0.f30125a;
    }
}
