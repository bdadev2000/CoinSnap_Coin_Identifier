package androidx.compose.material3;

import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import x0.n;

/* loaded from: classes3.dex */
final class ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SheetState f9887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9889c;
    public final /* synthetic */ String d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0.a f9890f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f9891g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1(SheetState sheetState, String str, String str2, String str3, q0.a aVar, d0 d0Var) {
        super(1);
        this.f9887a = sheetState;
        this.f9888b = str;
        this.f9889c = str2;
        this.d = str3;
        this.f9890f = aVar;
        this.f9891g = d0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1 modalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1 = new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1(this.f9890f);
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        semanticsPropertyReceiver.b(SemanticsActions.f16810t, new AccessibilityAction(this.f9888b, modalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1));
        SheetState sheetState = this.f9887a;
        SheetValue b2 = sheetState.b();
        SheetValue sheetValue = SheetValue.f11208c;
        d0 d0Var = this.f9891g;
        if (b2 == sheetValue) {
            semanticsPropertyReceiver.b(SemanticsActions.f16808r, new AccessibilityAction(this.f9889c, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2(sheetState, d0Var, sheetState)));
        } else if (sheetState.f11199c.e().c(sheetValue)) {
            semanticsPropertyReceiver.b(SemanticsActions.f16809s, new AccessibilityAction(this.d, new ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3(sheetState, d0Var)));
        }
        return b0.f30125a;
    }
}
