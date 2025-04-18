package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class ConfigurationCompat {

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api24Impl {
        @DoNotInline
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        @DoNotInline
        public static void b(@NonNull Configuration configuration, @NonNull LocaleListCompat localeListCompat) {
            configuration.setLocales((LocaleList) localeListCompat.f18613a.b());
        }
    }

    public static LocaleListCompat a(Configuration configuration) {
        return LocaleListCompat.g(Api24Impl.a(configuration));
    }

    public static void b(Configuration configuration, LocaleListCompat localeListCompat) {
        Api24Impl.b(configuration, localeListCompat);
    }
}
