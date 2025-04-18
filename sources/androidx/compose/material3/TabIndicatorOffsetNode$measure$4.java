package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TabIndicatorOffsetNode$measure$4 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f11725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f11726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f11727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabIndicatorOffsetNode$measure$4(Placeable placeable, MeasureScope measureScope, float f2) {
        super(1);
        this.f11725a = placeable;
        this.f11726b = measureScope;
        this.f11727c = f2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).e(this.f11725a, this.f11726b.F0(this.f11727c), 0, 0.0f);
        return b0.f30125a;
    }
}
