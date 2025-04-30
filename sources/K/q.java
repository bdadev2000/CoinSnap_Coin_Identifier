package k;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class q {
    public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static P.l b(Configuration configuration) {
        return P.l.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(P.l lVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(lVar.f2264a.f2265a.toLanguageTags()));
    }

    public static void d(Configuration configuration, P.l lVar) {
        configuration.setLocales(LocaleList.forLanguageTags(lVar.f2264a.f2265a.toLanguageTags()));
    }
}
