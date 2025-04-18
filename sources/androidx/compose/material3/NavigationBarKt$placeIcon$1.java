package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class NavigationBarKt$placeIcon$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f10019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Placeable f10020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10021c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Placeable f10022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10023g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10024h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10025i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10026j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$placeIcon$1(int i2, int i3, int i4, int i5, int i6, int i7, Placeable placeable, Placeable placeable2, Placeable placeable3) {
        super(1);
        this.f10019a = placeable;
        this.f10020b = placeable2;
        this.f10021c = i2;
        this.d = i3;
        this.f10022f = placeable3;
        this.f10023g = i4;
        this.f10024h = i5;
        this.f10025i = i6;
        this.f10026j = i7;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable placeable = this.f10019a;
        if (placeable != null) {
            Placeable.PlacementScope.h(placementScope, placeable, (this.f10025i - placeable.f15825a) / 2, (this.f10026j - placeable.f15826b) / 2);
        }
        Placeable.PlacementScope.h(placementScope, this.f10020b, this.f10021c, this.d);
        Placeable.PlacementScope.h(placementScope, this.f10022f, this.f10023g, this.f10024h);
        return b0.f30125a;
    }
}
