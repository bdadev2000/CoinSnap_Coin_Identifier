package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextFieldMeasurePolicy$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f12189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12191c;
    public final /* synthetic */ Placeable d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Placeable f12192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Placeable f12193g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Placeable f12194h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Placeable f12195i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Placeable f12196j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Placeable f12197k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Placeable f12198l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TextFieldMeasurePolicy f12199m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f12200n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f12201o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMeasurePolicy$measure$1(Placeable placeable, int i2, int i3, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, TextFieldMeasurePolicy textFieldMeasurePolicy, int i4, MeasureScope measureScope) {
        super(1);
        this.f12189a = placeable;
        this.f12190b = i2;
        this.f12191c = i3;
        this.d = placeable2;
        this.f12192f = placeable3;
        this.f12193g = placeable4;
        this.f12194h = placeable5;
        this.f12195i = placeable6;
        this.f12196j = placeable7;
        this.f12197k = placeable8;
        this.f12198l = placeable9;
        this.f12199m = textFieldMeasurePolicy;
        this.f12200n = i4;
        this.f12201o = measureScope;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable placeable;
        int i2;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
        Placeable placeable2 = this.f12197k;
        Placeable placeable3 = this.d;
        MeasureScope measureScope = this.f12201o;
        Placeable placeable4 = this.f12198l;
        Placeable placeable5 = this.f12196j;
        Placeable placeable6 = this.f12195i;
        Placeable placeable7 = this.f12194h;
        Placeable placeable8 = this.f12193g;
        Placeable placeable9 = this.f12192f;
        int i3 = this.f12191c;
        int i4 = this.f12190b;
        TextFieldMeasurePolicy textFieldMeasurePolicy = this.f12199m;
        Placeable placeable10 = this.f12189a;
        if (placeable10 != null) {
            boolean z2 = textFieldMeasurePolicy.f12184a;
            int i5 = placeable10.f15826b + this.f12200n;
            float density = measureScope.getDensity();
            float f2 = TextFieldKt.f12056a;
            Placeable.PlacementScope.g(placementScope, placeable2, 0L);
            int h2 = i3 - TextFieldImplKt.h(placeable4);
            if (placeable8 != null) {
                Placeable.PlacementScope.h(placementScope, placeable8, 0, vertical.a(placeable8.f15826b, h2));
            }
            Placeable.PlacementScope.h(placementScope, placeable10, TextFieldImplKt.j(placeable8), (z2 ? vertical.a(placeable10.f15826b, h2) : p0.a.t0(TextFieldImplKt.f13035b * density)) - p0.a.t0((r5 - r10) * textFieldMeasurePolicy.f12185b));
            if (placeable6 != null) {
                placeable = placeable6;
                i2 = i5;
                Placeable.PlacementScope.h(placementScope, placeable, TextFieldImplKt.j(placeable8), i2);
            } else {
                placeable = placeable6;
                i2 = i5;
            }
            int j2 = TextFieldImplKt.j(placeable) + TextFieldImplKt.j(placeable8);
            Placeable.PlacementScope.h(placementScope, placeable3, j2, i2);
            if (placeable9 != null) {
                Placeable.PlacementScope.h(placementScope, placeable9, j2, i2);
            }
            if (placeable5 != null) {
                Placeable.PlacementScope.h(placementScope, placeable5, (i4 - TextFieldImplKt.j(placeable7)) - placeable5.f15825a, i2);
            }
            if (placeable7 != null) {
                Placeable.PlacementScope.h(placementScope, placeable7, i4 - placeable7.f15825a, vertical.a(placeable7.f15826b, h2));
            }
            if (placeable4 != null) {
                Placeable.PlacementScope.h(placementScope, placeable4, 0, h2);
            }
        } else {
            boolean z3 = textFieldMeasurePolicy.f12184a;
            float density2 = measureScope.getDensity();
            float f3 = TextFieldKt.f12056a;
            Placeable.PlacementScope.g(placementScope, placeable2, 0L);
            int h3 = i3 - TextFieldImplKt.h(placeable4);
            int t02 = p0.a.t0(textFieldMeasurePolicy.f12186c.d() * density2);
            if (placeable8 != null) {
                Placeable.PlacementScope.h(placementScope, placeable8, 0, vertical.a(placeable8.f15826b, h3));
            }
            if (placeable6 != null) {
                Placeable.PlacementScope.h(placementScope, placeable6, TextFieldImplKt.j(placeable8), TextFieldKt.c(z3, h3, t02, placeable6));
            }
            int j3 = TextFieldImplKt.j(placeable6) + TextFieldImplKt.j(placeable8);
            Placeable.PlacementScope.h(placementScope, placeable3, j3, TextFieldKt.c(z3, h3, t02, placeable3));
            if (placeable9 != null) {
                Placeable.PlacementScope.h(placementScope, placeable9, j3, TextFieldKt.c(z3, h3, t02, placeable9));
            }
            if (placeable5 != null) {
                Placeable.PlacementScope.h(placementScope, placeable5, (i4 - TextFieldImplKt.j(placeable7)) - placeable5.f15825a, TextFieldKt.c(z3, h3, t02, placeable5));
            }
            if (placeable7 != null) {
                Placeable.PlacementScope.h(placementScope, placeable7, i4 - placeable7.f15825a, vertical.a(placeable7.f15826b, h3));
            }
            if (placeable4 != null) {
                Placeable.PlacementScope.h(placementScope, placeable4, 0, h3);
            }
        }
        return b0.f30125a;
    }
}
