package androidx.compose.foundation;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
final class ScrollingLayoutNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollingLayoutNode f2882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Placeable f2884c;

    /* renamed from: androidx.compose.foundation.ScrollingLayoutNode$measure$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Placeable f2885a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2886b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f2887c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i2, int i3, Placeable placeable) {
            super(1);
            this.f2885a = placeable;
            this.f2886b = i2;
            this.f2887c = i3;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Placeable.PlacementScope.j((Placeable.PlacementScope) obj, this.f2885a, this.f2886b, this.f2887c);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLayoutNode$measure$1(ScrollingLayoutNode scrollingLayoutNode, int i2, Placeable placeable) {
        super(1);
        this.f2882a = scrollingLayoutNode;
        this.f2883b = i2;
        this.f2884c = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        ScrollingLayoutNode scrollingLayoutNode = this.f2882a;
        int g2 = scrollingLayoutNode.f2879o.f2865a.g();
        int i2 = this.f2883b;
        int A = a.A(g2, 0, i2);
        int i3 = scrollingLayoutNode.f2880p ? A - i2 : -A;
        boolean z2 = scrollingLayoutNode.f2881q;
        int i4 = z2 ? 0 : i3;
        if (!z2) {
            i3 = 0;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i4, i3, this.f2884c);
        placementScope.f15829a = true;
        anonymousClass1.invoke(placementScope);
        placementScope.f15829a = false;
        return b0.f30125a;
    }
}
