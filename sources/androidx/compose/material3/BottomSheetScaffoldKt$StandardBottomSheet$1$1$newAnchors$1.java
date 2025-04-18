package androidx.compose.material3;

import androidx.compose.material3.internal.DraggableAnchorsConfig;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$StandardBottomSheet$1$1$newAnchors$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SheetState f7990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f7991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7992c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$1$1$newAnchors$1(SheetState sheetState, float f2, float f3, float f4) {
        super(1);
        this.f7990a = sheetState;
        this.f7991b = f2;
        this.f7992c = f3;
        this.d = f4;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
        SheetState sheetState = this.f7990a;
        boolean z2 = sheetState.f11197a;
        float f2 = this.f7992c;
        float f3 = this.f7991b;
        if (!z2) {
            draggableAnchorsConfig.a(SheetValue.f11208c, f3 - f2);
        }
        float f4 = this.d;
        if (f4 != f2) {
            draggableAnchorsConfig.a(SheetValue.f11207b, Math.max(f3 - f4, 0.0f));
        }
        if (!sheetState.f11198b) {
            draggableAnchorsConfig.a(SheetValue.f11206a, f3);
        }
        return b0.f30125a;
    }
}
