package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* renamed from: androidx.core.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419u {

    /* renamed from: a, reason: collision with root package name */
    public final String f4430a;
    public final CharSequence b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4431c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4432d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4433e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4434f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f4435g;

    /* renamed from: h, reason: collision with root package name */
    public final AudioAttributes f4436h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4437i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4438j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4439k;
    public final long[] l;
    public final String m;

    /* renamed from: n, reason: collision with root package name */
    public final String f4440n;

    public C0419u(NotificationChannel notificationChannel) {
        String i9 = r.i(notificationChannel);
        int j7 = r.j(notificationChannel);
        this.f4434f = true;
        this.f4435g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f4438j = 0;
        i9.getClass();
        this.f4430a = i9;
        this.f4431c = j7;
        this.f4436h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        this.b = r.m(notificationChannel);
        this.f4432d = r.g(notificationChannel);
        this.f4433e = r.h(notificationChannel);
        this.f4434f = r.b(notificationChannel);
        this.f4435g = r.n(notificationChannel);
        this.f4436h = r.f(notificationChannel);
        this.f4437i = r.v(notificationChannel);
        this.f4438j = r.k(notificationChannel);
        this.f4439k = r.w(notificationChannel);
        this.l = r.o(notificationChannel);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.m = AbstractC0418t.b(notificationChannel);
            this.f4440n = AbstractC0418t.a(notificationChannel);
        }
        r.a(notificationChannel);
        r.l(notificationChannel);
        if (i10 >= 29) {
            AbstractC0417s.a(notificationChannel);
        }
        if (i10 >= 30) {
            AbstractC0418t.c(notificationChannel);
        }
    }

    public final NotificationChannel a() {
        String str;
        String str2;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 26) {
            return null;
        }
        NotificationChannel c9 = r.c(this.f4430a, this.b, this.f4431c);
        r.p(c9, this.f4432d);
        r.q(c9, this.f4433e);
        r.s(c9, this.f4434f);
        r.t(c9, this.f4435g, this.f4436h);
        r.d(c9, this.f4437i);
        r.r(c9, this.f4438j);
        r.u(c9, this.l);
        r.e(c9, this.f4439k);
        if (i9 >= 30 && (str = this.m) != null && (str2 = this.f4440n) != null) {
            AbstractC0418t.d(c9, str, str2);
        }
        return c9;
    }
}
