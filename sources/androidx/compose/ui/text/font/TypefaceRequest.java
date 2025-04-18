package androidx.compose.ui.text.font;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class TypefaceRequest {

    /* renamed from: a, reason: collision with root package name */
    public final FontFamily f17286a;

    /* renamed from: b, reason: collision with root package name */
    public final FontWeight f17287b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17288c;
    public final int d;
    public final Object e;

    public TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, Object obj) {
        this.f17286a = fontFamily;
        this.f17287b = fontWeight;
        this.f17288c = i2;
        this.d = i3;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return a.g(this.f17286a, typefaceRequest.f17286a) && a.g(this.f17287b, typefaceRequest.f17287b) && FontStyle.a(this.f17288c, typefaceRequest.f17288c) && FontSynthesis.a(this.d, typefaceRequest.d) && a.g(this.e, typefaceRequest.e);
    }

    public final int hashCode() {
        FontFamily fontFamily = this.f17286a;
        int c2 = d.c(this.d, d.c(this.f17288c, (((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.f17287b.f17274a) * 31, 31), 31);
        Object obj = this.e;
        return c2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.f17286a + ", fontWeight=" + this.f17287b + ", fontStyle=" + ((Object) FontStyle.b(this.f17288c)) + ", fontSynthesis=" + ((Object) FontSynthesis.b(this.d)) + ", resourceLoaderCacheKey=" + this.e + ')';
    }
}
