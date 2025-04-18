package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class EnterExitTransitionModifierNode$measure$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f1862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1864c;
    public final /* synthetic */ l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$measure$2(Placeable placeable, long j2, long j3, l lVar) {
        super(1);
        this.f1862a = placeable;
        this.f1863b = j2;
        this.f1864c = j3;
        this.d = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        long j2 = this.f1863b;
        long j3 = this.f1864c;
        placementScope.getClass();
        long a2 = IntOffsetKt.a(((int) (j2 >> 32)) + ((int) (j3 >> 32)), ((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L)));
        Placeable placeable = this.f1862a;
        Placeable.PlacementScope.a(placementScope, placeable);
        placeable.n0(IntOffset.d(a2, placeable.f15828f), 0.0f, this.d);
        return b0.f30125a;
    }
}
