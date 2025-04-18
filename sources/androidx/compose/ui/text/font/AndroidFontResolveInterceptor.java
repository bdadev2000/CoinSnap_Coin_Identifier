package androidx.compose.ui.text.font;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {

    /* renamed from: b, reason: collision with root package name */
    public final int f17190b;

    public AndroidFontResolveInterceptor(int i2) {
        this.f17190b = i2;
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public final FontWeight a(FontWeight fontWeight) {
        int i2 = this.f17190b;
        return (i2 == 0 || i2 == Integer.MAX_VALUE) ? fontWeight : new FontWeight(a.A(fontWeight.f17274a + i2, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidFontResolveInterceptor) && this.f17190b == ((AndroidFontResolveInterceptor) obj).f17190b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17190b);
    }

    public final String toString() {
        return d.o(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f17190b, ')');
    }
}
