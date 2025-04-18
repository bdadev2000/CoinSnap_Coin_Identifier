package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import p0.a;

/* loaded from: classes.dex */
public final class BuildCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18605a = 0;

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class Api30Impl {

        /* renamed from: a, reason: collision with root package name */
        public static final Api30Impl f18606a = new Object();

        @DoNotInline
        public final int a(int i2) {
            return SdkExtensions.getExtensionVersion(i2);
        }
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface PrereleaseSdkCheck {
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        Api30Impl api30Impl = Api30Impl.f18606a;
        if (i2 >= 30) {
            api30Impl.a(30);
        }
        if (i2 >= 30) {
            api30Impl.a(31);
        }
        if (i2 >= 30) {
            api30Impl.a(33);
        }
        if (i2 >= 30) {
            api30Impl.a(1000000);
        }
    }

    public static final boolean a(String str, String str2) {
        if (a.g("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        a.r(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        a.r(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31) {
            if (i2 >= 30) {
                String str = Build.VERSION.CODENAME;
                a.r(str, "CODENAME");
                if (a("S", str)) {
                }
            }
            return false;
        }
        return true;
    }
}
