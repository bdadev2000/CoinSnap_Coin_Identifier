package P;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class k {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static LocaleList b() {
        return LocaleList.getAdjustedDefault();
    }

    public static LocaleList c() {
        return LocaleList.getDefault();
    }
}
