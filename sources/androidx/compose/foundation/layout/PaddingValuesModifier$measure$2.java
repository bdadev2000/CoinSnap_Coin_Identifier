package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class PaddingValuesModifier$measure$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f4081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f4082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PaddingValuesModifier f4083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier$measure$2(Placeable placeable, MeasureScope measureScope, PaddingValuesModifier paddingValuesModifier) {
        super(1);
        this.f4081a = placeable;
        this.f4082b = measureScope;
        this.f4083c = paddingValuesModifier;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        PaddingValuesModifier paddingValuesModifier = this.f4083c;
        PaddingValues paddingValues = paddingValuesModifier.f4080o;
        MeasureScope measureScope = this.f4082b;
        ((Placeable.PlacementScope) obj).e(this.f4081a, measureScope.F0(paddingValues.b(measureScope.getLayoutDirection())), measureScope.F0(paddingValuesModifier.f4080o.d()), 0.0f);
        return b0.f30125a;
    }
}
