package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class IntrinsicSizeModifier$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f4032a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntrinsicSizeModifier$measure$1(Placeable placeable) {
        super(1);
        this.f4032a = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope.i((Placeable.PlacementScope) obj, this.f4032a, 0L);
        return b0.f30125a;
    }
}
