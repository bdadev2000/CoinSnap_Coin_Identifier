package j0;

import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class i {
    public static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(@NonNull Locale locale, @NonNull Locale locale2) {
        boolean z10;
        boolean z11;
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = a;
        int length = localeArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (localeArr[i10].equals(locale)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            int length2 = localeArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length2) {
                    if (localeArr[i11].equals(locale2)) {
                        z11 = true;
                        break;
                    }
                    i11++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                String c10 = l0.c.c(l0.c.a(l0.c.b(locale)));
                if (c10.isEmpty()) {
                    String country = locale.getCountry();
                    if (country.isEmpty() || country.equals(locale2.getCountry())) {
                        return true;
                    }
                    return false;
                }
                return c10.equals(l0.c.c(l0.c.a(l0.c.b(locale2))));
            }
        }
        return false;
    }
}
