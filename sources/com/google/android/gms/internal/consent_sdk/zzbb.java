package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.bumptech.glide.e;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzbb implements ConsentForm {
    private final Application zzb;
    private final zzbw zzc;
    private final zzap zzd;
    private final zzbp zze;
    private final zzds zzf;
    private Dialog zzg;
    private zzbu zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    boolean zza = false;

    public zzbb(Application application, zzab zzabVar, zzbw zzbwVar, zzap zzapVar, zzbp zzbpVar, zzds zzdsVar) {
        this.zzb = application;
        this.zzc = zzbwVar;
        this.zzd = zzapVar;
        this.zze = zzbpVar;
        this.zzf = zzdsVar;
    }

    private final void zzk() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzay zzayVar = (zzay) this.zzl.getAndSet(null);
        if (zzayVar != null) {
            zzay.zza(zzayVar);
        }
    }

    @Override // com.google.android.ump.ConsentForm
    public final void show(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        String str;
        zzcr.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            if (true != this.zza) {
                str = "ConsentForm#show can only be invoked once.";
            } else {
                str = "Privacy options form is being loading. Please try again later.";
            }
            onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, str).zza());
            return;
        }
        this.zzh.zzc();
        zzay zzayVar = new zzay(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzayVar);
        this.zzl.set(zzayVar);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        e.R(window, false);
        this.zzk.set(onConsentFormDismissedListener);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    public final zzbu zzc() {
        return this.zzh;
    }

    public final void zzf(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzbu zza = ((zzbv) this.zzf).zza();
        this.zzh = zza;
        zza.setBackgroundColor(0);
        zza.getSettings().setJavaScriptEnabled(true);
        zza.setWebViewClient(new zzbt(zza, null));
        this.zzj.set(new zzba(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, 0 == true ? 1 : 0));
        zzbu zzbuVar = this.zzh;
        zzbp zzbpVar = this.zze;
        zzbuVar.loadDataWithBaseURL(zzbpVar.zza(), zzbpVar.zzb(), "text/html", "UTF-8", null);
        zzcr.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzax
            @Override // java.lang.Runnable
            public final void run() {
                zzbb.this.zzj(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void zzg(int i10) {
        zzk();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzk.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        this.zzd.zzg(3);
        onConsentFormDismissedListener.onConsentFormDismissed(null);
    }

    public final void zzh(zzg zzgVar) {
        zzk();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzk.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        onConsentFormDismissedListener.onConsentFormDismissed(zzgVar.zza());
    }

    public final void zzi() {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadSuccess(this);
    }

    public final void zzj(zzg zzgVar) {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
