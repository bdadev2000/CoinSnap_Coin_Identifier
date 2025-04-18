package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import d0.b0;
import e0.x;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AppBarKt$BottomAppBar$5$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBarScrollBehavior f7685a;

    /* renamed from: androidx.compose.material3.AppBarKt$BottomAppBar$5$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Placeable f7686a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Placeable placeable) {
            super(1);
            this.f7686a = placeable;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((Placeable.PlacementScope) obj).e(this.f7686a, 0, 0, 0.0f);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$5$1(BottomAppBarScrollBehavior bottomAppBarScrollBehavior) {
        super(3);
        this.f7685a = bottomAppBarScrollBehavior;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureScope measureScope = (MeasureScope) obj;
        Measurable measurable = (Measurable) obj2;
        long j2 = ((Constraints) obj3).f17480a;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior = this.f7685a;
        if (bottomAppBarScrollBehavior != null) {
            bottomAppBarScrollBehavior.getState();
        }
        Placeable V = measurable.V(j2);
        float f2 = V.f15826b;
        if (bottomAppBarScrollBehavior != null) {
            bottomAppBarScrollBehavior.getState();
        }
        return measureScope.T(V.f15825a, p0.a.t0(f2 + 0.0f), x.f30219a, new AnonymousClass1(V));
    }
}
