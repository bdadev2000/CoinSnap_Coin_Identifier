package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class kb {

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f24870a;

    /* renamed from: b */
    private final Activity f24871b;

    /* renamed from: c */
    private AlertDialog f24872c;
    private a d;

    /* loaded from: classes.dex */
    public interface a {
        void b();

        void c();
    }

    public kb(Activity activity, com.applovin.impl.sdk.j jVar) {
        this.f24870a = jVar;
        this.f24871b = activity;
    }

    public /* synthetic */ void c() {
        AlertDialog alertDialog = this.f24872c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public /* synthetic */ void d() {
        final int i2 = 0;
        final int i3 = 1;
        this.f24872c = new AlertDialog.Builder(this.f24871b).setTitle((CharSequence) this.f24870a.a(sj.v1)).setMessage((CharSequence) this.f24870a.a(sj.w1)).setCancelable(false).setPositiveButton((CharSequence) this.f24870a.a(sj.y1), new DialogInterface.OnClickListener(this) { // from class: com.applovin.impl.fu

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kb f24035b;

            {
                this.f24035b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                int i5 = i2;
                kb kbVar = this.f24035b;
                switch (i5) {
                    case 0:
                        kbVar.a(dialogInterface, i4);
                        return;
                    default:
                        kbVar.b(dialogInterface, i4);
                        return;
                }
            }
        }).setNegativeButton((CharSequence) this.f24870a.a(sj.x1), new DialogInterface.OnClickListener(this) { // from class: com.applovin.impl.fu

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kb f24035b;

            {
                this.f24035b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                int i5 = i3;
                kb kbVar = this.f24035b;
                switch (i5) {
                    case 0:
                        kbVar.a(dialogInterface, i4);
                        return;
                    default:
                        kbVar.b(dialogInterface, i4);
                        return;
                }
            }
        }).show();
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public boolean b() {
        AlertDialog alertDialog = this.f24872c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    public void e() {
        this.f24871b.runOnUiThread(new eu(this, 0));
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
        this.d.b();
    }

    public void a() {
        this.f24871b.runOnUiThread(new eu(this, 1));
    }

    public static /* synthetic */ void a(Runnable runnable, DialogInterface dialogInterface, int i2) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar, Runnable runnable) {
        this.f24871b.runOnUiThread(new ks(this, 8, bVar, runnable));
    }

    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f24871b);
        builder.setTitle(bVar.b0());
        String Z = bVar.Z();
        if (AppLovinSdkUtils.isValidString(Z)) {
            builder.setMessage(Z);
        }
        builder.setPositiveButton(bVar.a0(), new yt(runnable, 1));
        builder.setCancelable(false);
        this.f24872c = builder.show();
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        this.d.c();
    }
}
