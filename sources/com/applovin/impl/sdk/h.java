package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.e4;
import com.applovin.impl.go;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.h;
import com.applovin.impl.sj;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class h implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c */
    private static AlertDialog f26623c;
    private static final AtomicBoolean d = new AtomicBoolean();

    /* renamed from: a */
    private final i f26624a;

    /* renamed from: b */
    private go f26625b;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    public h(i iVar, j jVar) {
        this.f26624a = iVar;
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a(long j2, j jVar, a aVar) {
        if (j2 <= 0) {
            return;
        }
        AlertDialog alertDialog = f26623c;
        if (alertDialog == null || !alertDialog.isShowing()) {
            if (d.getAndSet(true)) {
                if (j2 < this.f26625b.c()) {
                    jVar.J();
                    if (n.a()) {
                        n J = jVar.J();
                        StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Scheduling consent alert earlier (", j2, "ms) than remaining scheduled time (");
                        r2.append(this.f26625b.c());
                        r2.append("ms)");
                        J.a("ConsentAlertManager", r2.toString());
                    }
                    this.f26625b.a();
                } else {
                    jVar.J();
                    if (n.a()) {
                        jVar.J().k("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.f26625b.c() + " milliseconds");
                        return;
                    }
                    return;
                }
            }
            jVar.J();
            if (n.a()) {
                jVar.J().a("ConsentAlertManager", "Scheduling consent alert for " + j2 + " milliseconds");
            }
            this.f26625b = go.a(j2, jVar, new t(this, jVar, aVar, 1));
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        if (this.f26625b == null) {
            return;
        }
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f26625b.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f26625b.e();
        }
    }

    public /* synthetic */ void b(j jVar, a aVar) {
        if (this.f26624a.f()) {
            jVar.J();
            if (n.a()) {
                jVar.J().b("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                return;
            }
            return;
        }
        Activity b2 = jVar.e().b();
        if (b2 != null && e4.a(j.l())) {
            AppLovinSdkUtils.runOnUiThread(new t(this, jVar, aVar, 0));
            return;
        }
        if (b2 == null) {
            jVar.J();
            if (n.a()) {
                jVar.J().b("ConsentAlertManager", "No parent Activity found - rescheduling consent alert...");
            }
        } else {
            jVar.J();
            if (n.a()) {
                jVar.J().b("ConsentAlertManager", "No internet available - rescheduling consent alert...");
            }
        }
        d.set(false);
        a(((Long) jVar.a(sj.f26958w0)).longValue(), jVar, aVar);
    }

    public /* synthetic */ void a(final j jVar, final a aVar) {
        AlertDialog create = new AlertDialog.Builder(jVar.e().b()).setTitle((CharSequence) jVar.a(sj.f26959x0)).setMessage((CharSequence) jVar.a(sj.f26961y0)).setCancelable(false).setPositiveButton((CharSequence) jVar.a(sj.f26963z0), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.u
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                h.a(h.a.this, dialogInterface, i2);
            }
        }).setNegativeButton((CharSequence) jVar.a(sj.A0), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a(aVar, jVar, dialogInterface, i2);
            }
        }).create();
        f26623c = create;
        create.show();
    }

    public static /* synthetic */ void a(a aVar, DialogInterface dialogInterface, int i2) {
        aVar.b();
        dialogInterface.dismiss();
        d.set(false);
    }

    public /* synthetic */ void a(a aVar, j jVar, DialogInterface dialogInterface, int i2) {
        aVar.a();
        dialogInterface.dismiss();
        d.set(false);
        a(((Long) jVar.a(sj.f26957v0)).longValue(), jVar, aVar);
    }
}
