package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class gb {

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f7820a;
    private final Activity b;

    /* renamed from: c */
    private AlertDialog f7821c;

    /* renamed from: d */
    private a f7822d;

    /* loaded from: classes.dex */
    public interface a {
        void b();

        void c();
    }

    public gb(Activity activity, com.applovin.impl.sdk.k kVar) {
        this.f7820a = kVar;
        this.b = activity;
    }

    public void a() {
        this.b.runOnUiThread(new L0(this, 0));
    }

    public static /* synthetic */ void a(Runnable runnable, DialogInterface dialogInterface, int i9) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ void c() {
        AlertDialog alertDialog = this.f7821c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public /* synthetic */ void d() {
        final int i9 = 0;
        final int i10 = 1;
        this.f7821c = new AlertDialog.Builder(this.b).setTitle((CharSequence) this.f7820a.a(oj.t1)).setMessage((CharSequence) this.f7820a.a(oj.f9860u1)).setCancelable(false).setPositiveButton((CharSequence) this.f7820a.a(oj.w1), new DialogInterface.OnClickListener(this) { // from class: com.applovin.impl.M0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ gb f6433c;

            {
                this.f6433c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                switch (i9) {
                    case 0:
                        this.f6433c.a(dialogInterface, i11);
                        return;
                    default:
                        this.f6433c.b(dialogInterface, i11);
                        return;
                }
            }
        }).setNegativeButton((CharSequence) this.f7820a.a(oj.f9868v1), new DialogInterface.OnClickListener(this) { // from class: com.applovin.impl.M0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ gb f6433c;

            {
                this.f6433c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                switch (i10) {
                    case 0:
                        this.f6433c.a(dialogInterface, i11);
                        return;
                    default:
                        this.f6433c.b(dialogInterface, i11);
                        return;
                }
            }
        }).show();
    }

    public boolean b() {
        AlertDialog alertDialog = this.f7821c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    public void e() {
        this.b.runOnUiThread(new L0(this, 1));
    }

    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
        builder.setTitle(bVar.a0());
        String Y8 = bVar.Y();
        if (AppLovinSdkUtils.isValidString(Y8)) {
            builder.setMessage(Y8);
        }
        builder.setPositiveButton(bVar.Z(), new J0(runnable, 1));
        builder.setCancelable(false);
        this.f7821c = builder.show();
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i9) {
        this.f7822d.b();
    }

    public void b(com.applovin.impl.sdk.ad.b bVar, Runnable runnable) {
        this.b.runOnUiThread(new O2(this, bVar, runnable, 6));
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i9) {
        this.f7822d.c();
    }

    public void a(a aVar) {
        this.f7822d = aVar;
    }
}
