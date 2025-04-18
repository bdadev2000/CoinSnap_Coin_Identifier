package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class ModalBottomSheetKt$ModalBottomSheetContent$5$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9877a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetContent$5$1(String str) {
        super(1);
        this.f9877a = str;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        SemanticsPropertiesKt.o(semanticsPropertyReceiver, this.f9877a);
        SemanticsPropertiesKt.u(semanticsPropertyReceiver, 0.0f);
        return b0.f30125a;
    }
}
