package androidx.core.app;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: androidx.core.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0415p {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList b(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }
}
