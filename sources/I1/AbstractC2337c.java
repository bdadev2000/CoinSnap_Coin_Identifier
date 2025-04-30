package i1;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.mbridge.msdk.foundation.entity.o;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Locale;
import java.util.zip.ZipFile;
import k1.C2428a;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2337c {

    /* renamed from: a, reason: collision with root package name */
    public static Application f20638a;
    public static final C2428a b;

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f20639c;

    /* JADX WARN: Type inference failed for: r0v0, types: [k1.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.b = null;
        b = obj;
        new ArrayDeque(50);
        f20639c = new WeakReference(null);
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

    public static String b(Context context, Intent intent) {
        long j7;
        String str;
        String str2;
        String str3;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        try {
            ZipFile zipFile = new ZipFile(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir);
            j7 = zipFile.getEntry("classes.dex").getTime();
            zipFile.close();
        } catch (Exception unused) {
            j7 = 0;
        }
        if (j7 > 631152000000L) {
            str = simpleDateFormat.format(new Date(j7));
        } else {
            str = null;
        }
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused2) {
            str2 = "Unknown";
        }
        String e4 = AbstractC2914a.e("Build version: ", str2, " \n");
        if (str != null) {
            e4 = AbstractC2914a.f(e4, "Build date: ", str, " \n");
        }
        StringBuilder c9 = AbstractC2965e.c(e4, "Current date: ");
        c9.append(simpleDateFormat.format(date));
        c9.append(" \n");
        StringBuilder c10 = AbstractC2965e.c(c9.toString(), "Device: ");
        String str4 = Build.MANUFACTURER;
        String str5 = Build.MODEL;
        if (str5.startsWith(str4)) {
            str3 = a(str5);
        } else {
            str3 = a(str4) + " " + str5;
        }
        StringBuilder c11 = AbstractC2965e.c(AbstractC2914a.h(c10, str3, " \n"), "OS version: Android ");
        c11.append(Build.VERSION.RELEASE);
        c11.append(" (SDK ");
        StringBuilder b8 = AbstractC2965e.b(o.j(AbstractC2914a.g(c11, Build.VERSION.SDK_INT, ") \n \n"), "Stack trace:  \n"));
        b8.append(intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"));
        String sb = b8.toString();
        String stringExtra = intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_ACTIVITY_LOG");
        if (stringExtra != null) {
            sb = o.j(o.j(sb, "\nUser actions: \n"), stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_CUSTOM_CRASH_DATA");
        if (stringExtra2 != null) {
            return o.j(o.j(sb, "\nAdditional data: \n"), stringExtra2);
        }
        return sb;
    }
}
