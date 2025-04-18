package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s0 {
    public final Context a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1228e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f1229f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f1230g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f1231h;

    /* renamed from: i, reason: collision with root package name */
    public int f1232i;

    /* renamed from: j, reason: collision with root package name */
    public int f1233j;

    /* renamed from: l, reason: collision with root package name */
    public t0 f1235l;

    /* renamed from: n, reason: collision with root package name */
    public Bundle f1237n;

    /* renamed from: q, reason: collision with root package name */
    public String f1240q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1241r;

    /* renamed from: s, reason: collision with root package name */
    public final Notification f1242s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f1243t;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1225b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1226c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1227d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f1234k = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1236m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f1238o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f1239p = 0;

    public s0(Context context, String str) {
        Notification notification = new Notification();
        this.f1242s = notification;
        this.a = context;
        this.f1240q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f1233j = 0;
        this.f1243t = new ArrayList();
        this.f1241r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final Notification a() {
        Notification build;
        Bundle extras;
        c1 c1Var = new c1(this);
        s0 s0Var = c1Var.f1186c;
        t0 t0Var = s0Var.f1235l;
        if (t0Var != null) {
            t0Var.b(c1Var);
        }
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builder = c1Var.f1185b;
        if (i10 >= 26) {
            build = builder.build();
        } else {
            build = builder.build();
        }
        if (t0Var != null) {
            s0Var.f1235l.getClass();
        }
        if (t0Var != null && (extras = NotificationCompat.getExtras(build)) != null) {
            t0Var.a(extras);
        }
        return build;
    }

    public final void c(boolean z10) {
        Notification notification = this.f1242s;
        if (z10) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(String str) {
        this.f1228e = b(str);
    }

    public final void e(Uri uri) {
        Notification notification = this.f1242s;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = r0.a(r0.e(r0.c(r0.b(), 4), 5));
    }

    public final void f(t0 t0Var) {
        if (this.f1235l != t0Var) {
            this.f1235l = t0Var;
            if (((s0) t0Var.f1249b) != this) {
                t0Var.f1249b = this;
                f(t0Var);
            }
        }
    }
}
