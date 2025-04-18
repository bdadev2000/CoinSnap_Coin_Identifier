package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
final class SheetState$anchoredDraggableState$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Density f11205a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetState$anchoredDraggableState$2(Density density) {
        super(0);
        this.f11205a = density;
    }

    @Override // q0.a
    public final Object invoke() {
        return Float.valueOf(this.f11205a.y1(Opcodes.LUSHR));
    }
}
