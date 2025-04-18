package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class InsetsPaddingModifier$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f4017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4018b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4019c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsetsPaddingModifier$measure$1(int i2, int i3, Placeable placeable) {
        super(1);
        this.f4017a = placeable;
        this.f4018b = i2;
        this.f4019c = i3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Placeable.PlacementScope) obj).e(this.f4017a, this.f4018b, this.f4019c, 0.0f);
        return b0.f30125a;
    }
}
