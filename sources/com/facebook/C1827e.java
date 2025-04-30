package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.facebook.internal.AbstractC1839h;
import j5.C2400c;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import u0.C2747b;

/* renamed from: com.facebook.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1827e {

    /* renamed from: f, reason: collision with root package name */
    public static final R3.e f13531f = new R3.e(19);

    /* renamed from: g, reason: collision with root package name */
    public static C1827e f13532g;

    /* renamed from: a, reason: collision with root package name */
    public final C2747b f13533a;
    public final C2400c b;

    /* renamed from: c, reason: collision with root package name */
    public C0785a f13534c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f13535d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public Date f13536e = new Date(0);

    public C1827e(C2747b c2747b, C2400c c2400c) {
        this.f13533a = c2747b;
        this.b = c2400c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.facebook.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [U4.r, java.lang.Object] */
    public final void a() {
        ?? r13;
        C0785a c0785a = this.f13534c;
        if (c0785a == null || !this.f13535d.compareAndSet(false, true)) {
            return;
        }
        this.f13536e = new Date();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? obj = new Object();
        C1824b c1824b = new C1824b(atomicBoolean, hashSet, hashSet2, hashSet3, 0);
        G g9 = G.b;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "permission,status");
        String str = C.f13380j;
        C w2 = R3.e.w(c0785a, "me/permissions", c1824b);
        w2.f13384d = bundle;
        w2.f13388h = g9;
        L2.a aVar = new L2.a(obj, 2);
        String str2 = c0785a.m;
        if (str2 == null) {
            str2 = "facebook";
        }
        if (str2.equals("instagram")) {
            r13 = new Object();
        } else {
            r13 = new Object();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("grant_type", r13.e());
        bundle2.putString("client_id", c0785a.f13448j);
        bundle2.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
        C w9 = R3.e.w(c0785a, r13.l(), aVar);
        w9.f13384d = bundle2;
        w9.f13388h = g9;
        E e4 = new E(w2, w9);
        C1825c c1825c = new C1825c(obj, c0785a, atomicBoolean, hashSet, hashSet2, hashSet3, this);
        ArrayList arrayList = e4.f13404f;
        if (!arrayList.contains(c1825c)) {
            arrayList.add(c1825c);
        }
        AbstractC1839h.i(e4);
        new D(e4).executeOnExecutor(r.c(), new Void[0]);
    }

    public final void b(C0785a c0785a, C0785a c0785a2) {
        Intent intent = new Intent(r.a(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", c0785a);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", c0785a2);
        this.f13533a.c(intent);
    }

    public final void c(C0785a c0785a, boolean z8) {
        boolean equals;
        Date date;
        C0785a c0785a2 = this.f13534c;
        this.f13534c = c0785a;
        this.f13535d.set(false);
        this.f13536e = new Date(0L);
        if (z8) {
            C2400c c2400c = this.b;
            if (c0785a != null) {
                c2400c.getClass();
                try {
                    ((SharedPreferences) c2400c.f21107c).edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", c0785a.d().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                ((SharedPreferences) c2400c.f21107c).edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                com.facebook.internal.H.c(r.a());
            }
        }
        if (c0785a2 == null) {
            if (c0785a == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = c0785a2.equals(c0785a);
        }
        if (!equals) {
            b(c0785a2, c0785a);
            Context a6 = r.a();
            Date date2 = C0785a.f13439n;
            C0785a m = com.facebook.appevents.g.m();
            AlarmManager alarmManager = (AlarmManager) a6.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (com.facebook.appevents.g.q()) {
                if (m == null) {
                    date = null;
                } else {
                    date = m.b;
                }
                if (date != null && alarmManager != null) {
                    Intent intent = new Intent(a6, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
                    intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                    try {
                        alarmManager.set(1, m.b.getTime(), PendingIntent.getBroadcast(a6, 0, intent, 67108864));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }
}
