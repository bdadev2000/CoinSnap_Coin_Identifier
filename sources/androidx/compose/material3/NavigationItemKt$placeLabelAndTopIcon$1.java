package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class NavigationItemKt$placeLabelAndTopIcon$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f10305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10307c;
    public final /* synthetic */ Placeable d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10309g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Placeable f10310h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10311i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10312j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Placeable f10313k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10314l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10315m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationItemKt$placeLabelAndTopIcon$1(Placeable placeable, int i2, int i3, Placeable placeable2, int i4, int i5, Placeable placeable3, int i6, int i7, Placeable placeable4, int i8, int i9) {
        super(1);
        this.f10305a = placeable;
        this.f10306b = i2;
        this.f10307c = i3;
        this.d = placeable2;
        this.f10308f = i4;
        this.f10309g = i5;
        this.f10310h = placeable3;
        this.f10311i = i6;
        this.f10312j = i7;
        this.f10313k = placeable4;
        this.f10314l = i8;
        this.f10315m = i9;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable.PlacementScope.h(placementScope, this.f10305a, this.f10306b, this.f10307c);
        Placeable.PlacementScope.h(placementScope, this.d, this.f10308f, this.f10309g);
        Placeable.PlacementScope.h(placementScope, this.f10310h, this.f10311i, this.f10312j);
        Placeable.PlacementScope.h(placementScope, this.f10313k, this.f10314l, this.f10315m);
        return b0.f30125a;
    }
}
