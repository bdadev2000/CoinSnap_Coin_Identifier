package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class NavigationRailKt$placeIcon$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f10374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Placeable f10375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10376c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Placeable f10377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10378g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10379h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10380i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10381j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$placeIcon$1(int i2, int i3, int i4, int i5, int i6, int i7, Placeable placeable, Placeable placeable2, Placeable placeable3) {
        super(1);
        this.f10374a = placeable;
        this.f10375b = placeable2;
        this.f10376c = i2;
        this.d = i3;
        this.f10377f = placeable3;
        this.f10378g = i4;
        this.f10379h = i5;
        this.f10380i = i6;
        this.f10381j = i7;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable placeable = this.f10374a;
        if (placeable != null) {
            Placeable.PlacementScope.h(placementScope, placeable, (this.f10380i - placeable.f15825a) / 2, (this.f10381j - placeable.f15826b) / 2);
        }
        Placeable.PlacementScope.h(placementScope, this.f10375b, this.f10376c, this.d);
        Placeable.PlacementScope.h(placementScope, this.f10377f, this.f10378g, this.f10379h);
        return b0.f30125a;
    }
}
