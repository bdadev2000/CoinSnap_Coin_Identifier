package androidx.compose.material3;

import androidx.compose.material3.internal.DraggableAnchorsConfig;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f9872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f9873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SheetState f9874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1(float f2, long j2, SheetState sheetState) {
        super(1);
        this.f9872a = f2;
        this.f9873b = j2;
        this.f9874c = sheetState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
        SheetValue sheetValue = SheetValue.f11206a;
        float f2 = this.f9872a;
        draggableAnchorsConfig.a(sheetValue, f2);
        int i2 = (int) (this.f9873b & 4294967295L);
        float f3 = i2;
        if (f3 > f2 / 2 && !this.f9874c.f11197a) {
            draggableAnchorsConfig.a(SheetValue.f11208c, f2 / 2.0f);
        }
        if (i2 != 0) {
            draggableAnchorsConfig.a(SheetValue.f11207b, Math.max(0.0f, f2 - f3));
        }
        return b0.f30125a;
    }
}
