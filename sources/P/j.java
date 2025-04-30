package P;

import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Locale[] f2263a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(@NonNull Locale locale, @NonNull Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f2263a;
        int length = localeArr.length;
        int i9 = 0;
        while (true) {
            if (i9 < length) {
                if (localeArr[i9].equals(locale)) {
                    break;
                }
                i9++;
            } else {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String c9 = R.c.c(R.c.a(R.c.b(locale)));
                if (c9.isEmpty()) {
                    String country = locale.getCountry();
                    if (country.isEmpty() || country.equals(locale2.getCountry())) {
                        return true;
                    }
                    return false;
                }
                return c9.equals(R.c.c(R.c.a(R.c.b(locale2))));
            }
        }
        return false;
    }
}
