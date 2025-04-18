package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class ListItemKt$place$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f9698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Placeable f9699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9700c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Placeable f9702g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Placeable f9703h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Placeable f9704i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9705j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9706k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9707l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$place$1(Placeable placeable, Placeable placeable2, int i2, boolean z2, int i3, Placeable placeable3, Placeable placeable4, Placeable placeable5, int i4, int i5, int i6) {
        super(1);
        this.f9698a = placeable;
        this.f9699b = placeable2;
        this.f9700c = i2;
        this.d = z2;
        this.f9701f = i3;
        this.f9702g = placeable3;
        this.f9703h = placeable4;
        this.f9704i = placeable5;
        this.f9705j = i4;
        this.f9706k = i5;
        this.f9707l = i6;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
        int i2 = this.f9700c;
        int i3 = this.f9705j;
        int i4 = this.f9701f;
        boolean z2 = this.d;
        Placeable placeable = this.f9698a;
        if (placeable != null) {
            Placeable.PlacementScope.h(placementScope, placeable, i2, z2 ? i4 : vertical.a(placeable.f15826b, i3));
        }
        Placeable placeable2 = this.f9699b;
        if (placeable2 != null) {
            Placeable.PlacementScope.h(placementScope, placeable2, (this.f9706k - this.f9707l) - placeable2.f15825a, z2 ? i4 : vertical.a(placeable2.f15826b, i3));
        }
        int j2 = TextFieldImplKt.j(placeable) + i2;
        Placeable placeable3 = this.f9704i;
        Placeable placeable4 = this.f9703h;
        Placeable placeable5 = this.f9702g;
        if (!z2) {
            i4 = vertical.a(TextFieldImplKt.h(placeable3) + TextFieldImplKt.h(placeable4) + TextFieldImplKt.h(placeable5), i3);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.h(placementScope, placeable4, j2, i4);
        }
        int h2 = TextFieldImplKt.h(placeable4) + i4;
        if (placeable5 != null) {
            Placeable.PlacementScope.h(placementScope, placeable5, j2, h2);
        }
        int h3 = TextFieldImplKt.h(placeable5) + h2;
        if (placeable3 != null) {
            Placeable.PlacementScope.h(placementScope, placeable3, j2, h3);
        }
        return b0.f30125a;
    }
}
