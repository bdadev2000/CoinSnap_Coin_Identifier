package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeui implements zzexw {
    private final Context zza;
    private final zzgge zzb;

    public zzeui(Context context, zzgge zzggeVar) {
        this.zza = context;
        this.zzb = zzggeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeui.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeuh zzc() throws Exception {
        String string;
        Bundle bundle;
        com.google.android.gms.ads.internal.zzu.zzp();
        String str = "";
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgl)).booleanValue()) {
            string = "";
        } else {
            string = this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgn)).booleanValue()) {
            str = this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "");
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        Context context = this.zza;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgm)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i9 = 0; i9 < 4; i9++) {
                String str2 = strArr[i9];
                if (defaultSharedPreferences.contains(str2)) {
                    bundle.putString(str2, defaultSharedPreferences.getString(str2, null));
                }
            }
        }
        return new zzeuh(string, str, bundle, null);
    }
}
