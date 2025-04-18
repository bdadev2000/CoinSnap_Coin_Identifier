package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class NavigationItemKt$placeIcon$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f10286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10288c;
    public final /* synthetic */ Placeable d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10290g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Placeable f10291h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10292i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10293j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationItemKt$placeIcon$1(int i2, int i3, int i4, int i5, int i6, int i7, Placeable placeable, Placeable placeable2, Placeable placeable3) {
        super(1);
        this.f10286a = placeable;
        this.f10287b = i2;
        this.f10288c = i3;
        this.d = placeable2;
        this.f10289f = i4;
        this.f10290g = i5;
        this.f10291h = placeable3;
        this.f10292i = i6;
        this.f10293j = i7;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable.PlacementScope.h(placementScope, this.f10286a, this.f10287b, this.f10288c);
        Placeable.PlacementScope.h(placementScope, this.d, this.f10289f, this.f10290g);
        Placeable.PlacementScope.h(placementScope, this.f10291h, this.f10292i, this.f10293j);
        return b0.f30125a;
    }
}
