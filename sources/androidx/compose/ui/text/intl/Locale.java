package androidx.compose.ui.text.intl;

import androidx.compose.runtime.Immutable;
import p0.a;

@Immutable
/* loaded from: classes3.dex */
public final class Locale {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Locale f17400a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public Locale(java.util.Locale locale) {
        this.f17400a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return a.g(this.f17400a.toLanguageTag(), ((Locale) obj).f17400a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f17400a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f17400a.toLanguageTag();
    }
}
