package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class NavigationRailKt$placeLabelAndIcon$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f10382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f10384c;
    public final /* synthetic */ Placeable d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10385f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f10386g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f10387h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Placeable f10388i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10389j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f10390k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Placeable f10391l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10392m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f10393n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10394o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f10395p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$placeLabelAndIcon$1(Placeable placeable, boolean z2, float f2, Placeable placeable2, int i2, float f3, float f4, Placeable placeable3, int i3, float f5, Placeable placeable4, int i4, float f6, int i5, MeasureScope measureScope) {
        super(1);
        this.f10382a = placeable;
        this.f10383b = z2;
        this.f10384c = f2;
        this.d = placeable2;
        this.f10385f = i2;
        this.f10386g = f3;
        this.f10387h = f4;
        this.f10388i = placeable3;
        this.f10389j = i3;
        this.f10390k = f5;
        this.f10391l = placeable4;
        this.f10392m = i4;
        this.f10393n = f6;
        this.f10394o = i5;
        this.f10395p = measureScope;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        float f2 = this.f10390k;
        float f3 = this.f10387h;
        Placeable placeable = this.f10382a;
        if (placeable != null) {
            Placeable.PlacementScope.h(placementScope, placeable, (this.f10394o - placeable.f15825a) / 2, p0.a.t0((f2 - this.f10395p.y1(NavigationRailKt.f10325g)) + f3));
        }
        if (this.f10383b || this.f10384c != 0.0f) {
            Placeable.PlacementScope.h(placementScope, this.d, this.f10385f, p0.a.t0(this.f10386g + f3));
        }
        Placeable.PlacementScope.h(placementScope, this.f10388i, this.f10389j, p0.a.t0(f2 + f3));
        Placeable.PlacementScope.h(placementScope, this.f10391l, this.f10392m, p0.a.t0(this.f10393n + f3));
        return b0.f30125a;
    }
}
