package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: f, reason: collision with root package name */
    public static final b f11145f = new b(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static j f11146g;
    public final m1.b a;

    /* renamed from: b, reason: collision with root package name */
    public final d f11147b;

    /* renamed from: c, reason: collision with root package name */
    public a f11148c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f11149d;

    /* renamed from: e, reason: collision with root package name */
    public Date f11150e;

    public j(m1.b localBroadcastManager, d accessTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(accessTokenCache, "accessTokenCache");
        this.a = localBroadcastManager;
        this.f11147b = accessTokenCache;
        this.f11149d = new AtomicBoolean(false);
        this.f11150e = new Date(0L);
    }

    public final void a() {
        h hVar;
        a aVar = this.f11148c;
        if (aVar == null) {
            return;
        }
        int i10 = 0;
        if (!this.f11149d.compareAndSet(false, true)) {
            return;
        }
        this.f11150e = new Date();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        i iVar = new i();
        g0[] g0VarArr = new g0[2];
        e eVar = new e(0, atomicBoolean, hashSet, hashSet2, hashSet3);
        Bundle bundle = new Bundle();
        bundle.putString("fields", "permission,status");
        String str = g0.f11000j;
        g0 y4 = c.y(aVar, "me/permissions", eVar);
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        y4.f11006d = bundle;
        l0 l0Var = l0.GET;
        y4.k(l0Var);
        g0VarArr[0] = y4;
        f fVar = new f(iVar, i10);
        String str2 = aVar.f10893m;
        if (str2 == null) {
            str2 = "facebook";
        }
        if (Intrinsics.areEqual(str2, "instagram")) {
            hVar = new h(1);
        } else {
            hVar = new h(i10);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("grant_type", hVar.f11012b);
        bundle2.putString("client_id", aVar.f10890j);
        bundle2.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
        g0 y10 = c.y(aVar, hVar.a, fVar);
        Intrinsics.checkNotNullParameter(bundle2, "<set-?>");
        y10.f11006d = bundle2;
        y10.k(l0Var);
        g0VarArr[1] = y10;
        j0 requests = new j0(g0VarArr);
        g callback = new g(iVar, aVar, atomicBoolean, hashSet, hashSet2, hashSet3, this);
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = requests.f11155f;
        if (!arrayList.contains(callback)) {
            arrayList.add(callback);
        }
        Intrinsics.checkNotNullParameter(requests, "requests");
        x5.i.n(requests);
        new h0(requests).executeOnExecutor(x.c(), new Void[0]);
    }

    public final void b(a aVar, a aVar2) {
        Intent intent = new Intent(x.a(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.a.c(intent);
    }

    public final void c(a accessToken, boolean z10) {
        Date date;
        a aVar = this.f11148c;
        this.f11148c = accessToken;
        this.f11149d.set(false);
        this.f11150e = new Date(0L);
        if (z10) {
            d dVar = this.f11147b;
            if (accessToken != null) {
                dVar.getClass();
                Intrinsics.checkNotNullParameter(accessToken, "accessToken");
                try {
                    dVar.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.e().toString()).apply();
                } catch (JSONException | Exception unused) {
                }
            } else {
                dVar.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                Context context = x.a();
                Intrinsics.checkNotNullParameter(context, "context");
                com.facebook.internal.m0.c(context, "facebook.com");
                com.facebook.internal.m0.c(context, ".facebook.com");
                com.facebook.internal.m0.c(context, "https://facebook.com");
                com.facebook.internal.m0.c(context, "https://.facebook.com");
            }
        }
        if (!com.facebook.internal.m0.a(aVar, accessToken)) {
            b(aVar, accessToken);
            Context a = x.a();
            Date date2 = a.f10880n;
            a n10 = z1.d.n();
            AlarmManager alarmManager = (AlarmManager) a.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (z1.d.p()) {
                if (n10 == null) {
                    date = null;
                } else {
                    date = n10.f10883b;
                }
                if (date != null && alarmManager != null) {
                    Intent intent = new Intent(a, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
                    intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                    try {
                        alarmManager.set(1, n10.f10883b.getTime(), PendingIntent.getBroadcast(a, 0, intent, 67108864));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }
}
