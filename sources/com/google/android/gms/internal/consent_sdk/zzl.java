package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzl {
    private final Application zza;
    private final zzap zzb;

    public zzl(Application application, zzap zzapVar) {
        this.zza = application;
        this.zzb = zzapVar;
    }

    public final zzci zzc(Activity activity, ConsentRequestParameters consentRequestParameters) throws zzg {
        ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
        if (consentDebugSettings == null) {
            consentDebugSettings = new ConsentDebugSettings.Builder(this.zza).build();
        }
        return zzn.zza(new zzn(this, activity, consentDebugSettings, consentRequestParameters, null));
    }
}
