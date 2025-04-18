package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class NavigationBarKt$placeLabelAndIcon$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f10027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f10029c;
    public final /* synthetic */ Placeable d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f10031g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f10032h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Placeable f10033i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10034j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f10035k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Placeable f10036l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10037m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f10038n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10039o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f10040p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$placeLabelAndIcon$1(Placeable placeable, boolean z2, float f2, Placeable placeable2, int i2, float f3, float f4, Placeable placeable3, int i3, float f5, Placeable placeable4, int i4, float f6, int i5, MeasureScope measureScope) {
        super(1);
        this.f10027a = placeable;
        this.f10028b = z2;
        this.f10029c = f2;
        this.d = placeable2;
        this.f10030f = i2;
        this.f10031g = f3;
        this.f10032h = f4;
        this.f10033i = placeable3;
        this.f10034j = i3;
        this.f10035k = f5;
        this.f10036l = placeable4;
        this.f10037m = i4;
        this.f10038n = f6;
        this.f10039o = i5;
        this.f10040p = measureScope;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        float f2 = this.f10035k;
        float f3 = this.f10032h;
        Placeable placeable = this.f10027a;
        if (placeable != null) {
            Placeable.PlacementScope.h(placementScope, placeable, (this.f10039o - placeable.f15825a) / 2, p0.a.t0((f2 - this.f10040p.F0(NavigationBarKt.e)) + f3));
        }
        if (this.f10028b || this.f10029c != 0.0f) {
            Placeable.PlacementScope.h(placementScope, this.d, this.f10030f, p0.a.t0(this.f10031g + f3));
        }
        Placeable.PlacementScope.h(placementScope, this.f10033i, this.f10034j, p0.a.t0(f2 + f3));
        Placeable.PlacementScope.h(placementScope, this.f10036l, this.f10037m, p0.a.t0(this.f10038n + f3));
        return b0.f30125a;
    }
}
