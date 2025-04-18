package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlignmentLine f3750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f3751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3752c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3753f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Placeable f3754g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3755h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$alignmentLineOffsetMeasure$1(AlignmentLine alignmentLine, float f2, int i2, int i3, int i4, Placeable placeable, int i5) {
        super(1);
        this.f3750a = alignmentLine;
        this.f3751b = f2;
        this.f3752c = i2;
        this.d = i3;
        this.f3753f = i4;
        this.f3754g = placeable;
        this.f3755h = i5;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        boolean z2 = this.f3750a instanceof HorizontalAlignmentLine;
        Placeable placeable = this.f3754g;
        int i2 = this.f3753f;
        int i3 = this.f3752c;
        float f2 = this.f3751b;
        int i4 = z2 ? 0 : !Dp.a(f2, Float.NaN) ? i3 : (this.d - i2) - placeable.f15825a;
        if (!z2) {
            i3 = 0;
        } else if (Dp.a(f2, Float.NaN)) {
            i3 = (this.f3755h - i2) - placeable.f15826b;
        }
        Placeable.PlacementScope.h(placementScope, placeable, i4, i3);
        return b0.f30125a;
    }
}
