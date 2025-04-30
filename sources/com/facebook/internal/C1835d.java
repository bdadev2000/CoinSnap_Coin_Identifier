package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import b1.AbstractC0550c;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Set;
import java.util.regex.Pattern;
import u0.C2747b;

/* renamed from: com.facebook.internal.d */
/* loaded from: classes.dex */
public final class C1835d extends BroadcastReceiver {

    /* renamed from: c */
    public static C1835d f13610c;

    /* renamed from: a */
    public final /* synthetic */ int f13611a;
    public Object b;

    public static final /* synthetic */ C1835d a() {
        if (O2.a.b(C1835d.class)) {
            return null;
        }
        try {
            return f13610c;
        } catch (Throwable th) {
            O2.a.a(C1835d.class, th);
            return null;
        }
    }

    public void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((U4.B) this.b).f3247f).b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void finalize() {
        switch (this.f13611a) {
            case 0:
                if (!O2.a.b(this)) {
                    try {
                        if (!O2.a.b(this)) {
                            try {
                                C2747b a6 = C2747b.a((Context) this.b);
                                G7.j.d(a6, "getInstance(applicationContext)");
                                a6.d(this);
                                return;
                            } catch (Throwable th) {
                                O2.a.a(this, th);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th2) {
                        O2.a.a(this, th2);
                        return;
                    }
                }
                return;
            default:
                super.finalize();
                return;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        Bundle bundleExtra;
        Set<String> set = null;
        switch (this.f13611a) {
            case 0:
                if (!O2.a.b(this)) {
                    try {
                        com.facebook.appevents.l lVar = new com.facebook.appevents.l(context, (String) null);
                        if (intent == null) {
                            stringExtra = null;
                        } else {
                            stringExtra = intent.getStringExtra("event_name");
                        }
                        String j7 = G7.j.j(stringExtra, "bf_");
                        if (intent == null) {
                            bundleExtra = null;
                        } else {
                            bundleExtra = intent.getBundleExtra("event_args");
                        }
                        Bundle bundle = new Bundle();
                        if (bundleExtra != null) {
                            set = bundleExtra.keySet();
                        }
                        if (set != null) {
                            for (String str : set) {
                                G7.j.d(str, "key");
                                Pattern compile = Pattern.compile("[^0-9a-zA-Z _-]");
                                G7.j.d(compile, "compile(...)");
                                String replaceAll = compile.matcher(str).replaceAll("-");
                                G7.j.d(replaceAll, "replaceAll(...)");
                                Pattern compile2 = Pattern.compile("^[ -]*");
                                G7.j.d(compile2, "compile(...)");
                                String replaceAll2 = compile2.matcher(replaceAll).replaceAll("");
                                G7.j.d(replaceAll2, "replaceAll(...)");
                                Pattern compile3 = Pattern.compile("[ -]*$");
                                G7.j.d(compile3, "compile(...)");
                                String replaceAll3 = compile3.matcher(replaceAll2).replaceAll("");
                                G7.j.d(replaceAll3, "replaceAll(...)");
                                bundle.putString(replaceAll3, (String) bundleExtra.get(str));
                            }
                        }
                        com.facebook.r rVar = com.facebook.r.f13801a;
                        if (com.facebook.N.b()) {
                            lVar.d(bundle, j7);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        O2.a.a(this, th);
                        return;
                    }
                }
                return;
            case 1:
                boolean equals = intent.getAction().equals("android.intent.action.SCREEN_OFF");
                R5.k kVar = (R5.k) this.b;
                if (equals) {
                    kVar.a(true, kVar.f2761c);
                    kVar.b = true;
                    return;
                } else {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        kVar.a(false, kVar.f2761c);
                        kVar.b = false;
                        return;
                    }
                    return;
                }
            case 2:
                U4.B b = (U4.B) this.b;
                if (b != null && b.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    U4.B b8 = (U4.B) this.b;
                    ((FirebaseMessaging) b8.f3247f).getClass();
                    FirebaseMessaging.b(b8, 0L);
                    ((FirebaseMessaging) ((U4.B) this.b).f3247f).b.unregisterReceiver(this);
                    this.b = null;
                    return;
                }
                return;
            case 3:
                if (intent != null) {
                    ((AbstractC0550c) this.b).g(intent);
                    return;
                }
                return;
            case 4:
                G7.j.e(context, "context");
                G7.j.e(intent, "intent");
                ((CustomTabActivity) this.b).finish();
                return;
            case 5:
                G7.j.e(context, "context");
                G7.j.e(intent, "intent");
                CustomTabMainActivity customTabMainActivity = (CustomTabMainActivity) this.b;
                Intent intent2 = new Intent(customTabMainActivity, (Class<?>) CustomTabMainActivity.class);
                intent2.setAction(CustomTabMainActivity.f13397j);
                String str2 = CustomTabMainActivity.f13395h;
                intent2.putExtra(str2, intent.getStringExtra(str2));
                intent2.addFlags(603979776);
                customTabMainActivity.startActivity(intent2);
                return;
            case 6:
                String action = intent.getAction();
                Bundle extras = intent.getExtras();
                if ("com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(action) && extras != null && extras.containsKey("install.status")) {
                    int i9 = extras.getInt("install.status");
                    B3.e eVar = (B3.e) this.b;
                    if (i9 != 1 && i9 != 2 && i9 != 3) {
                        if (i9 != 4) {
                            if (i9 == 6) {
                                eVar.b(com.google.ar.core.F.f14261c);
                                return;
                            }
                            return;
                        }
                        eVar.b(com.google.ar.core.F.f14262d);
                        return;
                    }
                    eVar.b(com.google.ar.core.F.b);
                    return;
                }
                return;
            default:
                ((U1.b) this.b).g();
                return;
        }
    }

    public /* synthetic */ C1835d(Object obj, int i9) {
        this.f13611a = i9;
        this.b = obj;
    }

    public C1835d(Context context) {
        this.f13611a = 0;
        Context applicationContext = context.getApplicationContext();
        G7.j.d(applicationContext, "context.applicationContext");
        this.b = applicationContext;
    }
}
