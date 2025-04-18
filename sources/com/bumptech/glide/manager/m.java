package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;
import java.util.Map;
import n4.u;

/* loaded from: classes.dex */
public final class m implements Handler.Callback {

    /* renamed from: j, reason: collision with root package name */
    public static final z1.d f9729j = new z1.d(25);

    /* renamed from: b, reason: collision with root package name */
    public volatile com.bumptech.glide.o f9730b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9731c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f9732d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Handler f9733f;

    /* renamed from: g, reason: collision with root package name */
    public final z1.d f9734g;

    /* renamed from: h, reason: collision with root package name */
    public final f f9735h;

    /* renamed from: i, reason: collision with root package name */
    public final j f9736i;

    public m(z1.d dVar, kc.c cVar) {
        f bVar;
        new Bundle();
        dVar = dVar == null ? f9729j : dVar;
        this.f9734g = dVar;
        this.f9733f = new Handler(Looper.getMainLooper(), this);
        this.f9736i = new j(dVar);
        if (u.f22441h && u.f22440g) {
            if (((Map) cVar.f20640c).containsKey(com.bumptech.glide.e.class)) {
                bVar = new e();
            } else {
                bVar = new com.facebook.b(25);
            }
        } else {
            bVar = new com.facebook.b(24);
        }
        this.f9735h = bVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final com.bumptech.glide.o b(Context context) {
        boolean z10;
        boolean z11;
        if (context != null) {
            char[] cArr = w4.m.a;
            boolean z12 = true;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return c((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        return b(activity.getApplicationContext());
                    }
                    if (activity instanceof FragmentActivity) {
                        return c((FragmentActivity) activity);
                    }
                    if (!activity.isDestroyed()) {
                        this.f9735h.d();
                        FragmentManager fragmentManager = activity.getFragmentManager();
                        Activity a = a(activity);
                        if (a != null && a.isFinishing()) {
                            z12 = false;
                        }
                        l d10 = d(fragmentManager);
                        com.bumptech.glide.o oVar = d10.f9726f;
                        if (oVar == null) {
                            com.bumptech.glide.b a10 = com.bumptech.glide.b.a(activity);
                            fb.c cVar = d10.f9724c;
                            this.f9734g.getClass();
                            com.bumptech.glide.o oVar2 = new com.bumptech.glide.o(a10, d10.f9723b, cVar, activity);
                            if (z12) {
                                oVar2.onStart();
                            }
                            d10.f9726f = oVar2;
                            return oVar2;
                        }
                        return oVar;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f9730b == null) {
                synchronized (this) {
                    if (this.f9730b == null) {
                        com.bumptech.glide.b a11 = com.bumptech.glide.b.a(context.getApplicationContext());
                        z1.d dVar = this.f9734g;
                        com.facebook.b bVar = new com.facebook.b(23);
                        z1.d dVar2 = new z1.d(24);
                        Context applicationContext = context.getApplicationContext();
                        dVar.getClass();
                        this.f9730b = new com.bumptech.glide.o(a11, bVar, dVar2, applicationContext);
                    }
                }
            }
            return this.f9730b;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final com.bumptech.glide.o c(FragmentActivity fragmentActivity) {
        boolean z10;
        boolean z11;
        char[] cArr = w4.m.a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return b(fragmentActivity.getApplicationContext());
        }
        if (!fragmentActivity.isDestroyed()) {
            this.f9735h.d();
            Activity a = a(fragmentActivity);
            if (a != null && a.isFinishing()) {
                z11 = false;
            } else {
                z11 = true;
            }
            return this.f9736i.a(fragmentActivity, com.bumptech.glide.b.a(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), z11);
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final l d(FragmentManager fragmentManager) {
        HashMap hashMap = this.f9731c;
        l lVar = (l) hashMap.get(fragmentManager);
        if (lVar == null) {
            l lVar2 = (l) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (lVar2 == null) {
                lVar2 = new l();
                lVar2.f9728h = null;
                hashMap.put(fragmentManager, lVar2);
                fragmentManager.beginTransaction().add(lVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f9733f.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return lVar2;
        }
        return lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r18) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.m.handleMessage(android.os.Message):boolean");
    }
}
