package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.c4;
import com.applovin.impl.ho;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.i;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class i implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c */
    private static AlertDialog f7691c;

    /* renamed from: d */
    private static final AtomicBoolean f7692d = new AtomicBoolean();
    private final j a;

    /* renamed from: b */
    private ho f7693b;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public i(j jVar, k kVar) {
        this.a = jVar;
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        if (this.f7693b == null) {
            return;
        }
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f7693b.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f7693b.e();
        }
    }

    public /* synthetic */ void b(k kVar, a aVar) {
        if (this.a.f()) {
            kVar.L();
            if (t.a()) {
                kVar.L().b("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                return;
            }
            return;
        }
        Activity b3 = kVar.e().b();
        if (b3 != null && c4.a(k.k())) {
            AppLovinSdkUtils.runOnUiThread(new b0(this, kVar, aVar, 1));
            return;
        }
        if (b3 == null) {
            kVar.L();
            if (t.a()) {
                kVar.L().b("ConsentAlertManager", "No parent Activity found - rescheduling consent alert...");
            }
        } else {
            kVar.L();
            if (t.a()) {
                kVar.L().b("ConsentAlertManager", "No internet available - rescheduling consent alert...");
            }
        }
        f7692d.set(false);
        a(((Long) kVar.a(oj.f6758t0)).longValue(), kVar, aVar);
    }

    public void a(long j3, k kVar, a aVar) {
        if (j3 <= 0) {
            return;
        }
        AlertDialog alertDialog = f7691c;
        if (alertDialog == null || !alertDialog.isShowing()) {
            if (f7692d.getAndSet(true)) {
                if (j3 < this.f7693b.c()) {
                    kVar.L();
                    if (t.a()) {
                        t L = kVar.L();
                        StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Scheduling consent alert earlier (", j3, "ms) than remaining scheduled time (");
                        o10.append(this.f7693b.c());
                        o10.append("ms)");
                        L.a("ConsentAlertManager", o10.toString());
                    }
                    this.f7693b.a();
                } else {
                    kVar.L();
                    if (t.a()) {
                        kVar.L().k("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.f7693b.c() + " milliseconds");
                        return;
                    }
                    return;
                }
            }
            kVar.L();
            if (t.a()) {
                kVar.L().a("ConsentAlertManager", a4.j.f("Scheduling consent alert for ", j3, " milliseconds"));
            }
            this.f7693b = ho.a(j3, kVar, new b0(this, kVar, aVar, 0));
        }
    }

    public /* synthetic */ void a(final k kVar, final a aVar) {
        AlertDialog create = new AlertDialog.Builder(kVar.e().b()).setTitle((CharSequence) kVar.a(oj.f6764u0)).setMessage((CharSequence) kVar.a(oj.f6771v0)).setCancelable(false).setPositiveButton((CharSequence) kVar.a(oj.f6779w0), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.c0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                i.a(i.a.this, dialogInterface, i10);
            }
        }).setNegativeButton((CharSequence) kVar.a(oj.f6787x0), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.d0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.a(aVar, kVar, dialogInterface, i10);
            }
        }).create();
        f7691c = create;
        create.show();
    }

    public static /* synthetic */ void a(a aVar, DialogInterface dialogInterface, int i10) {
        aVar.b();
        dialogInterface.dismiss();
        f7692d.set(false);
    }

    public /* synthetic */ void a(a aVar, k kVar, DialogInterface dialogInterface, int i10) {
        aVar.a();
        dialogInterface.dismiss();
        f7692d.set(false);
        a(((Long) kVar.a(oj.f6751s0)).longValue(), kVar, aVar);
    }
}
