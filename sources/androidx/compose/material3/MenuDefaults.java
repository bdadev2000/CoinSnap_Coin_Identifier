package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class MenuDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final float f9730a = ElevationTokens.f13332a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f9731b = MenuTokens.f13435a;

    /* renamed from: c, reason: collision with root package name */
    public static final PaddingValuesImpl f9732c;

    static {
        float f2 = MenuKt.f9739c;
        float f3 = 0;
        f9732c = new PaddingValuesImpl(f2, f3, f2, f3);
    }
}
