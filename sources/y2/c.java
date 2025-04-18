package y2;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.applovin.impl.mediation.ads.e;
import eb.j;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Locale;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public abstract class c {
    public static Application a;

    /* renamed from: b, reason: collision with root package name */
    public static final a3.a f27889b = new a3.a();

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f27890c;

    static {
        new ArrayDeque(50);
        f27890c = new WeakReference(null);
    }

    public static String a(String str) {
        if (str != null && str.length() != 0) {
            char charAt = str.charAt(0);
            if (Character.isUpperCase(charAt)) {
                return str;
            }
            return Character.toUpperCase(charAt) + str.substring(1);
        }
        return "";
    }

    public static String b(DefaultErrorActivity defaultErrorActivity, Intent intent) {
        long j3;
        String str;
        String str2;
        String str3;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        try {
            ZipFile zipFile = new ZipFile(defaultErrorActivity.getPackageManager().getApplicationInfo(defaultErrorActivity.getPackageName(), 0).sourceDir);
            j3 = zipFile.getEntry("classes.dex").getTime();
            zipFile.close();
        } catch (Exception unused) {
            j3 = 0;
        }
        if (j3 > 631152000000L) {
            str = simpleDateFormat.format(new Date(j3));
        } else {
            str = null;
        }
        try {
            str2 = defaultErrorActivity.getPackageManager().getPackageInfo(defaultErrorActivity.getPackageName(), 0).versionName;
        } catch (Exception unused2) {
            str2 = "Unknown";
        }
        String f10 = e.f("Build version: ", str2, " \n");
        if (str != null) {
            f10 = f10 + "Build date: " + str + " \n";
        }
        StringBuilder n10 = j.n(f10, "Current date: ");
        n10.append(simpleDateFormat.format(date));
        n10.append(" \n");
        StringBuilder n11 = j.n(n10.toString(), "Device: ");
        String str4 = Build.MANUFACTURER;
        String str5 = Build.MODEL;
        if (str5.startsWith(str4)) {
            str3 = a(str5);
        } else {
            str3 = a(str4) + " " + str5;
        }
        StringBuilder n12 = j.n(vd.e.h(n11, str3, " \n"), "OS version: Android ");
        n12.append(Build.VERSION.RELEASE);
        n12.append(" (SDK ");
        StringBuilder m10 = j.m(j.k(vd.e.g(n12, Build.VERSION.SDK_INT, ") \n \n"), "Stack trace:  \n"));
        m10.append(intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"));
        String sb2 = m10.toString();
        String stringExtra = intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_ACTIVITY_LOG");
        if (stringExtra != null) {
            sb2 = j.k(j.k(sb2, "\nUser actions: \n"), stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_CUSTOM_CRASH_DATA");
        if (stringExtra2 != null) {
            return j.k(j.k(sb2, "\nAdditional data: \n"), stringExtra2);
        }
        return sb2;
    }
}
