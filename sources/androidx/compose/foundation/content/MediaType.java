package androidx.compose.foundation.content;

import android.support.v4.media.d;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class MediaType {

    /* renamed from: b, reason: collision with root package name */
    public static final MediaType f2888b = new MediaType("text/*");

    /* renamed from: c, reason: collision with root package name */
    public static final MediaType f2889c = new MediaType("*/*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2890a;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public MediaType(String str) {
        this.f2890a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaType)) {
            return false;
        }
        return a.g(this.f2890a, ((MediaType) obj).f2890a);
    }

    public final int hashCode() {
        return this.f2890a.hashCode();
    }

    public final String toString() {
        return d.r(new StringBuilder("MediaType(representation='"), this.f2890a, "')");
    }
}
