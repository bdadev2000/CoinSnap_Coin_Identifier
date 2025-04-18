package h;

import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class q {
    public static LocaleList a(Object obj) {
        LocaleList applicationLocales;
        applicationLocales = androidx.activity.j.c(obj).getApplicationLocales();
        return applicationLocales;
    }

    public static void b(Object obj, LocaleList localeList) {
        androidx.activity.j.c(obj).setApplicationLocales(localeList);
    }
}
