package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import x0.n;

/* loaded from: classes2.dex */
final class BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SheetState f7997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7999c;
    public final /* synthetic */ String d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f8000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f8001g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1(SheetState sheetState, boolean z2, String str, String str2, String str3, d0 d0Var) {
        super(1);
        this.f7997a = sheetState;
        this.f7998b = z2;
        this.f7999c = str;
        this.d = str2;
        this.f8000f = str3;
        this.f8001g = d0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        SheetState sheetState = this.f7997a;
        if (sheetState.f11199c.e().getSize() > 1 && this.f7998b) {
            SheetValue b2 = sheetState.b();
            SheetValue sheetValue = SheetValue.f11208c;
            AnchoredDraggableState anchoredDraggableState = sheetState.f11199c;
            d0 d0Var = this.f8001g;
            if (b2 == sheetValue) {
                if (((Boolean) anchoredDraggableState.d.invoke(SheetValue.f11207b)).booleanValue()) {
                    BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1 bottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1 = new BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1(sheetState, d0Var);
                    n[] nVarArr = SemanticsPropertiesKt.f16865a;
                    semanticsPropertyReceiver.b(SemanticsActions.f16808r, new AccessibilityAction(this.f7999c, bottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1));
                }
            } else if (((Boolean) anchoredDraggableState.d.invoke(sheetValue)).booleanValue()) {
                BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2 bottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2 = new BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2(sheetState, d0Var);
                n[] nVarArr2 = SemanticsPropertiesKt.f16865a;
                semanticsPropertyReceiver.b(SemanticsActions.f16809s, new AccessibilityAction(this.d, bottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2));
            }
            if (!sheetState.f11198b) {
                BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3 bottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3 = new BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3(sheetState, d0Var);
                n[] nVarArr3 = SemanticsPropertiesKt.f16865a;
                semanticsPropertyReceiver.b(SemanticsActions.f16810t, new AccessibilityAction(this.f8000f, bottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3));
            }
        }
        return b0.f30125a;
    }
}
