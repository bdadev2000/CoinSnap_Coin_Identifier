package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class gb {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private final Activity f4881b;

    /* renamed from: c */
    private AlertDialog f4882c;

    /* renamed from: d */
    private a f4883d;

    /* loaded from: classes.dex */
    public interface a {
        void b();

        void c();
    }

    public gb(Activity activity, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f4881b = activity;
    }

    public /* synthetic */ void c() {
        AlertDialog alertDialog = this.f4882c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public /* synthetic */ void d() {
        final int i10 = 0;
        final int i11 = 1;
        this.f4882c = new AlertDialog.Builder(this.f4881b).setTitle((CharSequence) this.a.a(oj.f6759t1)).setMessage((CharSequence) this.a.a(oj.f6765u1)).setCancelable(false).setPositiveButton((CharSequence) this.a.a(oj.f6780w1), new DialogInterface.OnClickListener(this) { // from class: com.applovin.impl.ut

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ gb f8439c;

            {
                this.f8439c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                int i13 = i10;
                gb gbVar = this.f8439c;
                switch (i13) {
                    case 0:
                        gbVar.a(dialogInterface, i12);
                        return;
                    default:
                        gbVar.b(dialogInterface, i12);
                        return;
                }
            }
        }).setNegativeButton((CharSequence) this.a.a(oj.f6772v1), new DialogInterface.OnClickListener(this) { // from class: com.applovin.impl.ut

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ gb f8439c;

            {
                this.f8439c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                int i13 = i11;
                gb gbVar = this.f8439c;
                switch (i13) {
                    case 0:
                        gbVar.a(dialogInterface, i12);
                        return;
                    default:
                        gbVar.b(dialogInterface, i12);
                        return;
                }
            }
        }).show();
    }

    public void a() {
        this.f4881b.runOnUiThread(new tt(this, 0));
    }

    public boolean b() {
        AlertDialog alertDialog = this.f4882c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    public void e() {
        this.f4881b.runOnUiThread(new tt(this, 1));
    }

    public static /* synthetic */ void a(Runnable runnable, DialogInterface dialogInterface, int i10) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f4881b);
        builder.setTitle(bVar.a0());
        String Y = bVar.Y();
        if (AppLovinSdkUtils.isValidString(Y)) {
            builder.setMessage(Y);
        }
        builder.setPositiveButton(bVar.Z(), new rt(runnable, 1));
        builder.setCancelable(false);
        this.f4882c = builder.show();
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i10) {
        this.f4883d.b();
    }

    public void b(com.applovin.impl.sdk.ad.b bVar, Runnable runnable) {
        this.f4881b.runOnUiThread(new yv(6, this, bVar, runnable));
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i10) {
        this.f4883d.c();
    }

    public void a(a aVar) {
        this.f4883d = aVar;
    }
}
