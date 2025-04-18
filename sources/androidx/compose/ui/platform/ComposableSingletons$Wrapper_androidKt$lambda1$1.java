package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;

/* renamed from: androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$Wrapper_androidKt$lambda1$1 extends r implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public static final ComposableSingletons$Wrapper_androidKt$lambda1$1 f16426a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        }
        return b0.f30125a;
    }
}
