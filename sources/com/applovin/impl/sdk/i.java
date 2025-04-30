package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.L;
import com.applovin.impl.c4;
import com.applovin.impl.ho;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.i;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import y.AbstractC2933a;

/* loaded from: classes.dex */
public class i implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c */
    private static AlertDialog f10819c;

    /* renamed from: d */
    private static final AtomicBoolean f10820d = new AtomicBoolean();

    /* renamed from: a */
    private final j f10821a;
    private ho b;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public i(j jVar, k kVar) {
        this.f10821a = jVar;
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a(long j7, k kVar, a aVar) {
        if (j7 <= 0) {
            return;
        }
        AlertDialog alertDialog = f10819c;
        if (alertDialog == null || !alertDialog.isShowing()) {
            if (f10820d.getAndSet(true)) {
                if (j7 < this.b.c()) {
                    kVar.L();
                    if (t.a()) {
                        t L8 = kVar.L();
                        StringBuilder a6 = AbstractC2933a.a("Scheduling consent alert earlier (", j7, "ms) than remaining scheduled time (");
                        a6.append(this.b.c());
                        a6.append("ms)");
                        L8.a("ConsentAlertManager", a6.toString());
                    }
                    this.b.a();
                } else {
                    kVar.L();
                    if (t.a()) {
                        kVar.L().k("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.b.c() + " milliseconds");
                        return;
                    }
                    return;
                }
            }
            kVar.L();
            if (t.a()) {
                kVar.L().a("ConsentAlertManager", L.j("Scheduling consent alert for ", j7, " milliseconds"));
            }
            this.b = ho.a(j7, kVar, new B(this, kVar, aVar, 0));
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        if (this.b == null) {
            return;
        }
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.b.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.b.e();
        }
    }

    public /* synthetic */ void b(k kVar, a aVar) {
        if (this.f10821a.f()) {
            kVar.L();
            if (t.a()) {
                kVar.L().b("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                return;
            }
            return;
        }
        Activity b = kVar.e().b();
        if (b != null && c4.a(k.k())) {
            AppLovinSdkUtils.runOnUiThread(new B(this, kVar, aVar, 1));
            return;
        }
        if (b == null) {
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
        f10820d.set(false);
        a(((Long) kVar.a(oj.f9852t0)).longValue(), kVar, aVar);
    }

    public /* synthetic */ void a(final k kVar, final a aVar) {
        AlertDialog create = new AlertDialog.Builder(kVar.e().b()).setTitle((CharSequence) kVar.a(oj.f9859u0)).setMessage((CharSequence) kVar.a(oj.f9867v0)).setCancelable(false).setPositiveButton((CharSequence) kVar.a(oj.f9874w0), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.C
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                i.a(i.a.this, dialogInterface, i9);
            }
        }).setNegativeButton((CharSequence) kVar.a(oj.f9880x0), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.D
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.a(aVar, kVar, dialogInterface, i9);
            }
        }).create();
        f10819c = create;
        create.show();
    }

    public static /* synthetic */ void a(a aVar, DialogInterface dialogInterface, int i9) {
        aVar.b();
        dialogInterface.dismiss();
        f10820d.set(false);
    }

    public /* synthetic */ void a(a aVar, k kVar, DialogInterface dialogInterface, int i9) {
        aVar.a();
        dialogInterface.dismiss();
        f10820d.set(false);
        a(((Long) kVar.a(oj.f9846s0)).longValue(), kVar, aVar);
    }
}
