package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzess implements zzevz {
    private final Context zza;
    private final zzges zzb;

    public zzess(Context context, zzges zzgesVar) {
        this.zza = context;
        this.zzb = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzess.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzesq zzc() throws Exception {
        String string;
        Bundle bundle;
        com.google.android.gms.ads.internal.zzv.zzq();
        String str = "";
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfV)).booleanValue()) {
            string = "";
        } else {
            string = this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfX)).booleanValue()) {
            str = this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "");
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        Context context = this.zza;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfW)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str2 = strArr[i10];
                if (defaultSharedPreferences.contains(str2)) {
                    bundle.putString(str2, defaultSharedPreferences.getString(str2, null));
                }
            }
        }
        return new zzesq(string, str, bundle, null);
    }
}
