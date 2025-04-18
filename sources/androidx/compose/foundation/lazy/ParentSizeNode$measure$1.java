package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class ParentSizeNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f4442a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParentSizeNode$measure$1(Placeable placeable) {
        super(1);
        this.f4442a = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).e(this.f4442a, 0, 0, 0.0f);
        return b0.f30125a;
    }
}
