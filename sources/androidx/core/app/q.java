package androidx.core.app;

import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class q {
    public static LocaleList a(Object obj) {
        LocaleList applicationLocales;
        applicationLocales = androidx.activity.j.c(obj).getApplicationLocales();
        return applicationLocales;
    }

    public static LocaleList b(Object obj) {
        LocaleList systemLocales;
        systemLocales = androidx.activity.j.c(obj).getSystemLocales();
        return systemLocales;
    }
}
