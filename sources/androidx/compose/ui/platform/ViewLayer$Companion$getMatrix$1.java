package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class ViewLayer$Companion$getMatrix$1 extends r implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewLayer$Companion$getMatrix$1 f16640a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Matrix) obj2).set(((View) obj).getMatrix());
        return b0.f30125a;
    }
}
