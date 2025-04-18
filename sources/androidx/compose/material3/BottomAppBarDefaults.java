package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class BottomAppBarDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7912a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final PaddingValuesImpl f7913b;

    static {
        float f2 = AppBarKt.f7649a;
        f7913b = PaddingKt.b(f2, AppBarKt.f7650b, f2, 0.0f, 8);
    }

    public static WindowInsets a(Composer composer) {
        return WindowInsetsKt.d(SystemBarsDefaultInsets_androidKt.a(composer), WindowInsetsSides.e | 32);
    }
}
