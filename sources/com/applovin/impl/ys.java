package com.applovin.impl;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final /* synthetic */ class ys implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f9292c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9293d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9294f;

    public /* synthetic */ ys(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        this.f9291b = 2;
        this.f9293d = context;
        this.f9292c = z10;
        this.f9294f = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = this.f9291b;
        boolean z11 = this.f9292c;
        Object obj = this.f9294f;
        Object obj2 = this.f9293d;
        switch (i10) {
            case 0:
                bc.k(z11, (MaxAdRequestListener) obj2, (String) obj);
                return;
            case 1:
                bc.I(z11, (MaxAdRevenueListener) obj2, (MaxAd) obj);
                return;
            default:
                Context context = (Context) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    } else {
                        SharedPreferences.Editor edit = com.facebook.appevents.g.n(context).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z11) {
                            g0.q.r(notificationManager);
                        } else if ("com.google.android.gms".equals(g0.q.n(notificationManager))) {
                            g0.q.B(notificationManager);
                        }
                    }
                    return;
                } finally {
                    taskCompletionSource.trySetResult(null);
                }
        }
    }

    public /* synthetic */ ys(boolean z10, Object obj, Object obj2, int i10) {
        this.f9291b = i10;
        this.f9292c = z10;
        this.f9293d = obj;
        this.f9294f = obj2;
    }
}
