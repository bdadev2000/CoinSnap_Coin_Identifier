package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzbyi implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private String zzd = "-1";
    private int zze = -1;

    public zzbyi(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
    }

    private final void zzb() {
        this.zzc.zzD(true);
        com.google.android.gms.ads.internal.util.zzac.zzc(this.zza);
    }

    private final void zzc(String str, int i10) {
        Context context;
        boolean z10 = false;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaG)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z10 = true;
        }
        this.zzc.zzD(z10);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgc)).booleanValue() && z10 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z10;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaI)).booleanValue()) {
                if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i10 != this.zzc.zzb()) {
                        zzb();
                    }
                    this.zzc.zzA(i10);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    if (!Objects.equals(string, this.zzc.zzm())) {
                        zzb();
                    }
                    this.zzc.zzJ(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i11 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String valueOf = String.valueOf(str);
            int hashCode = valueOf.hashCode();
            if (hashCode != -2004976699) {
                if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                    z10 = true;
                }
                z10 = -1;
            } else {
                if (valueOf.equals("IABTCF_PurposeConsents")) {
                    z10 = false;
                }
                z10 = -1;
            }
            if (z10) {
                if (z10) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaG)).booleanValue() && i11 != -1 && this.zze != i11) {
                        this.zze = i11;
                        zzc(string2, i11);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!string2.equals("-1") && !this.zzd.equals(string2)) {
                this.zzd = string2;
                zzc(string2, i11);
            }
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            com.google.android.gms.ads.internal.util.zze.zzb("onSharedPreferenceChanged, errorMessage = ", th2);
        }
    }

    public final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaI)).booleanValue()) {
            onSharedPreferenceChanged(this.zzb, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
        }
    }
}
