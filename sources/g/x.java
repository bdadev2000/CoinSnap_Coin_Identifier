package g;

import androidx.compose.ui.layout.Placeable;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f30581a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Placeable placeable) {
        super(1);
        this.f30581a = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).e(this.f30581a, 0, 0, 0.0f);
        return d0.b0.f30125a;
    }
}
