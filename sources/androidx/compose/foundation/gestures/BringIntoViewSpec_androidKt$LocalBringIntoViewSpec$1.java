package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
public final class BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1 f3106a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        if (((Context) ((CompositionLocalAccessorScope) obj).a(AndroidCompositionLocals_androidKt.f16325b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
            return BringIntoViewSpec_androidKt.f3105b;
        }
        BringIntoViewSpec.f3100a.getClass();
        return BringIntoViewSpec.Companion.f3103c;
    }
}
