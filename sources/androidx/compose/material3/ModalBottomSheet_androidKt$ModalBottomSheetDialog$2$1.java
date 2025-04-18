package androidx.compose.material3;

import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class ModalBottomSheet_androidKt$ModalBottomSheetDialog$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetDialogWrapper f9952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f9953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetProperties f9954c;
    public final /* synthetic */ LayoutDirection d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$ModalBottomSheetDialog$2$1(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper, q0.a aVar, ModalBottomSheetProperties modalBottomSheetProperties, LayoutDirection layoutDirection) {
        super(0);
        this.f9952a = modalBottomSheetDialogWrapper;
        this.f9953b = aVar;
        this.f9954c = modalBottomSheetProperties;
        this.d = layoutDirection;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f9952a.c(this.f9953b, this.f9954c, this.d);
        return b0.f30125a;
    }
}
