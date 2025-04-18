package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.text.ICUCompat;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class LocaleListCompat {

    /* renamed from: b, reason: collision with root package name */
    public static final LocaleListCompat f18612b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final LocaleListInterface f18613a;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api21Impl {

        /* renamed from: a, reason: collision with root package name */
        public static final Locale[] f18614a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        @DoNotInline
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        @DoNotInline
        public static boolean b(@NonNull Locale locale, @NonNull Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f18614a;
            int length = localeArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (Locale locale3 : localeArr) {
                        if (!locale3.equals(locale2)) {
                        }
                    }
                    String a2 = ICUCompat.a(locale);
                    if (!a2.isEmpty()) {
                        return a2.equals(ICUCompat.a(locale2));
                    }
                    String country = locale.getCountry();
                    return country.isEmpty() || country.equals(locale2.getCountry());
                }
                if (localeArr[i2].equals(locale)) {
                    break;
                }
                i2++;
            }
            return false;
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api24Impl {
        @DoNotInline
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @DoNotInline
        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        @DoNotInline
        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public LocaleListCompat(LocaleListPlatformWrapper localeListPlatformWrapper) {
        this.f18613a = localeListPlatformWrapper;
    }

    public static LocaleListCompat a(Locale... localeArr) {
        return g(Api24Impl.a(localeArr));
    }

    public static LocaleListCompat b(String str) {
        if (str == null || str.isEmpty()) {
            return f18612b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            localeArr[i2] = Api21Impl.a(split[i2]);
        }
        return a(localeArr);
    }

    public static LocaleListCompat g(LocaleList localeList) {
        return new LocaleListCompat(new LocaleListPlatformWrapper(localeList));
    }

    public final Locale c(int i2) {
        return this.f18613a.get(i2);
    }

    public final boolean d() {
        return this.f18613a.isEmpty();
    }

    public final int e() {
        return this.f18613a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocaleListCompat) {
            if (this.f18613a.equals(((LocaleListCompat) obj).f18613a)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.f18613a.a();
    }

    public final int hashCode() {
        return this.f18613a.hashCode();
    }

    public final String toString() {
        return this.f18613a.toString();
    }
}
