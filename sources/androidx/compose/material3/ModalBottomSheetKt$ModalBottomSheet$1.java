package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class ModalBottomSheetKt$ModalBottomSheet$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final ModalBottomSheetKt$ModalBottomSheet$1 f9812a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        composer.J(58488196);
        BottomSheetDefaults bottomSheetDefaults = BottomSheetDefaults.f7919a;
        WindowInsets b2 = BottomSheetDefaults.b(composer);
        composer.D();
        return b2;
    }
}
