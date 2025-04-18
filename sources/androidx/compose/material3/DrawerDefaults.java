package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class DrawerDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final float f9241a = ElevationTokens.f13332a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f9242b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f9243c;
    public static final float d;

    static {
        float f2 = NavigationDrawerTokens.d;
        f9242b = f2;
        f9243c = f2;
        d = NavigationDrawerTokens.f13446b;
    }

    public static WindowInsets a(Composer composer) {
        return WindowInsetsKt.d(SystemBarsDefaultInsets_androidKt.a(composer), WindowInsetsSides.f4224f | WindowInsetsSides.f4221a);
    }
}
