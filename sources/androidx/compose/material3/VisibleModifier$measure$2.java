package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class VisibleModifier$measure$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f12635a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VisibleModifier$measure$2(Placeable placeable) {
        super(1);
        this.f12635a = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).e(this.f12635a, 0, 0, 0.0f);
        return b0.f30125a;
    }
}
