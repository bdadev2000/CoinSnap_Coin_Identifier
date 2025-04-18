package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class MinimumInteractiveModifierNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Placeable f9781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9782c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinimumInteractiveModifierNode$measure$1(int i2, int i3, Placeable placeable) {
        super(1);
        this.f9780a = i2;
        this.f9781b = placeable;
        this.f9782c = i3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).e(this.f9781b, p0.a.t0((this.f9780a - r0.f15825a) / 2.0f), p0.a.t0((this.f9782c - r0.f15826b) / 2.0f), 0.0f);
        return b0.f30125a;
    }
}
