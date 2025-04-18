package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class NavigationItemKt$placeLabelAndStartIcon$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f10294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10296c;
    public final /* synthetic */ Placeable d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Placeable f10299h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10300i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10301j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Placeable f10302k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10303l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10304m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationItemKt$placeLabelAndStartIcon$1(Placeable placeable, int i2, int i3, Placeable placeable2, int i4, int i5, Placeable placeable3, int i6, int i7, Placeable placeable4, int i8, int i9) {
        super(1);
        this.f10294a = placeable;
        this.f10295b = i2;
        this.f10296c = i3;
        this.d = placeable2;
        this.f10297f = i4;
        this.f10298g = i5;
        this.f10299h = placeable3;
        this.f10300i = i6;
        this.f10301j = i7;
        this.f10302k = placeable4;
        this.f10303l = i8;
        this.f10304m = i9;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable.PlacementScope.h(placementScope, this.f10294a, this.f10295b, this.f10296c);
        Placeable.PlacementScope.h(placementScope, this.d, this.f10297f, this.f10298g);
        Placeable.PlacementScope.h(placementScope, this.f10299h, this.f10300i, this.f10301j);
        Placeable.PlacementScope.h(placementScope, this.f10302k, this.f10303l, this.f10304m);
        return b0.f30125a;
    }
}
