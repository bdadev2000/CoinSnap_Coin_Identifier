package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class ModalBottomSheet_androidKt$ModalBottomSheet$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f9935a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$ModalBottomSheet$1(WindowInsets windowInsets) {
        super(2);
        this.f9935a = windowInsets;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        composer.J(-2061903609);
        composer.D();
        return this.f9935a;
    }
}
