package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class UnspecifiedConstraintsNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f4128a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnspecifiedConstraintsNode$measure$1(Placeable placeable) {
        super(1);
        this.f4128a = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope.h((Placeable.PlacementScope) obj, this.f4128a, 0, 0);
        return b0.f30125a;
    }
}
