package androidx.compose.material3;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class ModalBottomSheet_androidKt$ModalBottomSheetDialog$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetDialogWrapper f9951a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$ModalBottomSheetDialog$1$1(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper) {
        super(1);
        this.f9951a = modalBottomSheetDialogWrapper;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = this.f9951a;
        modalBottomSheetDialogWrapper.show();
        return new DisposableEffectResult() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper2 = ModalBottomSheetDialogWrapper.this;
                modalBottomSheetDialogWrapper2.dismiss();
                modalBottomSheetDialogWrapper2.d.d();
            }
        };
    }
}
