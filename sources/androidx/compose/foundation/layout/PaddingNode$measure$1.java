package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class PaddingNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PaddingNode f4071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Placeable f4072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f4073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingNode$measure$1(PaddingNode paddingNode, Placeable placeable, MeasureScope measureScope) {
        super(1);
        this.f4071a = paddingNode;
        this.f4072b = placeable;
        this.f4073c = measureScope;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        PaddingNode paddingNode = this.f4071a;
        boolean z2 = paddingNode.f4070s;
        Placeable placeable = this.f4072b;
        MeasureScope measureScope = this.f4073c;
        if (z2) {
            Placeable.PlacementScope.h(placementScope, placeable, measureScope.F0(paddingNode.f4066o), measureScope.F0(paddingNode.f4067p));
        } else {
            placementScope.e(placeable, measureScope.F0(paddingNode.f4066o), measureScope.F0(paddingNode.f4067p), 0.0f);
        }
        return b0.f30125a;
    }
}
