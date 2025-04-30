package k;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2420i {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
