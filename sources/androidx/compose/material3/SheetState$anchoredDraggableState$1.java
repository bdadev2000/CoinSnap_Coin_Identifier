package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class SheetState$anchoredDraggableState$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Density f11204a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetState$anchoredDraggableState$1(Density density) {
        super(1);
        this.f11204a = density;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Number) obj).floatValue();
        return Float.valueOf(this.f11204a.y1(56));
    }
}
