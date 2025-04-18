package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class x {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f1257b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1258c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1259d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1260e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1261f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f1262g;

    /* renamed from: h, reason: collision with root package name */
    public final AudioAttributes f1263h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1264i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1265j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1266k;

    /* renamed from: l, reason: collision with root package name */
    public final long[] f1267l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1268m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1269n;

    public x(NotificationChannel notificationChannel) {
        String i10 = t.i(notificationChannel);
        int j3 = t.j(notificationChannel);
        this.f1261f = true;
        this.f1262g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f1265j = 0;
        i10.getClass();
        this.a = i10;
        this.f1258c = j3;
        this.f1263h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        this.f1257b = t.m(notificationChannel);
        this.f1259d = t.g(notificationChannel);
        this.f1260e = t.h(notificationChannel);
        this.f1261f = t.b(notificationChannel);
        this.f1262g = t.n(notificationChannel);
        this.f1263h = t.f(notificationChannel);
        this.f1264i = t.v(notificationChannel);
        this.f1265j = t.k(notificationChannel);
        this.f1266k = t.w(notificationChannel);
        this.f1267l = t.o(notificationChannel);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            this.f1268m = w.b(notificationChannel);
            this.f1269n = w.a(notificationChannel);
        }
        t.a(notificationChannel);
        t.l(notificationChannel);
        if (i11 >= 29) {
            u.a(notificationChannel);
        }
        if (i11 >= 30) {
            w.c(notificationChannel);
        }
    }

    public final NotificationChannel a() {
        String str;
        String str2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        NotificationChannel c10 = t.c(this.a, this.f1257b, this.f1258c);
        t.p(c10, this.f1259d);
        t.q(c10, this.f1260e);
        t.s(c10, this.f1261f);
        t.t(c10, this.f1262g, this.f1263h);
        t.d(c10, this.f1264i);
        t.r(c10, this.f1265j);
        t.u(c10, this.f1267l);
        t.e(c10, this.f1266k);
        if (i10 >= 30 && (str = this.f1268m) != null && (str2 = this.f1269n) != null) {
            w.d(c10, str, str2);
        }
        return c10;
    }
}
