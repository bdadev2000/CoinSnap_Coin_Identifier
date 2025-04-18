package h;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class x {
    public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static j0.k b(Configuration configuration) {
        return j0.k.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(j0.k kVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(((j0.m) kVar.a).a.toLanguageTags()));
    }

    public static void d(Configuration configuration, j0.k kVar) {
        configuration.setLocales(LocaleList.forLanguageTags(((j0.m) kVar.a).a.toLanguageTags()));
    }
}
