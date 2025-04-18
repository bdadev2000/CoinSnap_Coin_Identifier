package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
final class WrapContentNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WrapContentNode f4234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Placeable f4236c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f4237f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentNode$measure$1(WrapContentNode wrapContentNode, int i2, Placeable placeable, int i3, MeasureScope measureScope) {
        super(1);
        this.f4234a = wrapContentNode;
        this.f4235b = i2;
        this.f4236c = placeable;
        this.d = i3;
        this.f4237f = measureScope;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        p pVar = this.f4234a.f4233q;
        Placeable placeable = this.f4236c;
        Placeable.PlacementScope.g((Placeable.PlacementScope) obj, placeable, ((IntOffset) pVar.invoke(new IntSize(IntSizeKt.a(this.f4235b - placeable.f15825a, this.d - placeable.f15826b)), this.f4237f.getLayoutDirection())).f17489a);
        return b0.f30125a;
    }
}
