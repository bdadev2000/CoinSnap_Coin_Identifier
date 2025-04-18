package androidx.compose.ui.res;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public final class StringResources_androidKt {
    public static final String a(int i2, Composer composer) {
        composer.K(AndroidCompositionLocals_androidKt.f16324a);
        return ((Context) composer.K(AndroidCompositionLocals_androidKt.f16325b)).getResources().getString(i2);
    }
}
