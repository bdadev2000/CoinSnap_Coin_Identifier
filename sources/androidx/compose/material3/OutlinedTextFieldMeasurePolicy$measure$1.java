package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class OutlinedTextFieldMeasurePolicy$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Placeable f10592c;
    public final /* synthetic */ Placeable d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Placeable f10593f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Placeable f10594g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Placeable f10595h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Placeable f10596i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Placeable f10597j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Placeable f10598k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Placeable f10599l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ OutlinedTextFieldMeasurePolicy f10600m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f10601n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldMeasurePolicy$measure$1(int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, MeasureScope measureScope) {
        super(1);
        this.f10590a = i2;
        this.f10591b = i3;
        this.f10592c = placeable;
        this.d = placeable2;
        this.f10593f = placeable3;
        this.f10594g = placeable4;
        this.f10595h = placeable5;
        this.f10596i = placeable6;
        this.f10597j = placeable7;
        this.f10598k = placeable8;
        this.f10599l = placeable9;
        this.f10600m = outlinedTextFieldMeasurePolicy;
        this.f10601n = measureScope;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this.f10600m;
        float f2 = outlinedTextFieldMeasurePolicy.f10587c;
        MeasureScope measureScope = this.f10601n;
        float density = measureScope.getDensity();
        LayoutDirection layoutDirection = measureScope.getLayoutDirection();
        float f3 = OutlinedTextFieldKt.f10441a;
        Placeable.PlacementScope.g(placementScope, this.f10598k, 0L);
        Placeable placeable = this.f10599l;
        int h2 = this.f10590a - TextFieldImplKt.h(placeable);
        PaddingValues paddingValues = outlinedTextFieldMeasurePolicy.d;
        int t02 = p0.a.t0(paddingValues.d() * density);
        int t03 = p0.a.t0(PaddingKt.d(paddingValues, layoutDirection) * density);
        float f4 = TextFieldImplKt.f13036c * density;
        BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
        Placeable placeable2 = this.f10592c;
        if (placeable2 != null) {
            Placeable.PlacementScope.h(placementScope, placeable2, 0, vertical.a(placeable2.f15826b, h2));
        }
        boolean z2 = outlinedTextFieldMeasurePolicy.f10586b;
        Placeable placeable3 = this.f10596i;
        if (placeable3 != null) {
            Placeable.PlacementScope.h(placementScope, placeable3, p0.a.t0(placeable2 == null ? 0.0f : (1 - f2) * (TextFieldImplKt.j(placeable2) - f4)) + t03, MathHelpersKt.c(z2 ? vertical.a(placeable3.f15826b, h2) : t02, -(placeable3.f15826b / 2), f2));
        }
        Placeable placeable4 = this.f10593f;
        if (placeable4 != null) {
            Placeable.PlacementScope.h(placementScope, placeable4, TextFieldImplKt.j(placeable2), OutlinedTextFieldKt.f(z2, h2, t02, placeable3, placeable4));
        }
        int j2 = TextFieldImplKt.j(placeable4) + TextFieldImplKt.j(placeable2);
        Placeable placeable5 = this.f10595h;
        Placeable.PlacementScope.h(placementScope, placeable5, j2, OutlinedTextFieldKt.f(z2, h2, t02, placeable3, placeable5));
        Placeable placeable6 = this.f10597j;
        if (placeable6 != null) {
            Placeable.PlacementScope.h(placementScope, placeable6, j2, OutlinedTextFieldKt.f(z2, h2, t02, placeable3, placeable6));
        }
        int i2 = this.f10591b;
        Placeable placeable7 = this.d;
        Placeable placeable8 = this.f10594g;
        if (placeable8 != null) {
            Placeable.PlacementScope.h(placementScope, placeable8, (i2 - TextFieldImplKt.j(placeable7)) - placeable8.f15825a, OutlinedTextFieldKt.f(z2, h2, t02, placeable3, placeable8));
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.h(placementScope, placeable7, i2 - placeable7.f15825a, vertical.a(placeable7.f15826b, h2));
        }
        if (placeable != null) {
            Placeable.PlacementScope.h(placementScope, placeable, 0, h2);
        }
        return b0.f30125a;
    }
}
