package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import d0.a;

@StabilityInferred
@ExperimentalTextApi
@a
/* loaded from: classes3.dex */
public final class UrlAnnotation {

    /* renamed from: a, reason: collision with root package name */
    public final String f17062a;

    public UrlAnnotation(String str) {
        this.f17062a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UrlAnnotation) {
            return p0.a.g(this.f17062a, ((UrlAnnotation) obj).f17062a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17062a.hashCode();
    }

    public final String toString() {
        return d.q(new StringBuilder("UrlAnnotation(url="), this.f17062a, ')');
    }
}
