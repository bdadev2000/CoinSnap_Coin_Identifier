package androidx.core.os;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* loaded from: classes4.dex */
final class LocaleListCompatWrapper implements LocaleListInterface {

    @RequiresApi
    /* loaded from: classes4.dex */
    public static class Api21Impl {
        @DoNotInline
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        LocaleListCompat localeListCompat = LocaleListCompat.f18612b;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(split[0]);
        }
    }

    @Override // androidx.core.os.LocaleListInterface
    public final String a() {
        return null;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocaleListCompatWrapper)) {
            return false;
        }
        ((LocaleListCompatWrapper) obj).getClass();
        throw null;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Locale get(int i2) {
        if (i2 < 0) {
            return null;
        }
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final boolean isEmpty() {
        throw null;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final int size() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
