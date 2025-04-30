package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzcag implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private String zzd = "-1";
    private int zze = -1;

    public zzcag(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
    }

    private final void zzb() {
        this.zzc.zzI(true);
        com.google.android.gms.ads.internal.util.zzad.zzc(this.zza);
    }

    private final void zzc(String str, int i9) {
        Context context;
        boolean z8 = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzax)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i9 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z8 = false;
        }
        this.zzc.zzI(z8);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgs)).booleanValue() && z8 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z8;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaz)).booleanValue()) {
                if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i9 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i9 != this.zzc.zzb()) {
                        zzb();
                    }
                    this.zzc.zzF(i9);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    if (!Objects.equals(string, this.zzc.zzp())) {
                        zzb();
                    }
                    this.zzc.zzO(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String valueOf = String.valueOf(str);
            int hashCode = valueOf.hashCode();
            if (hashCode != -2004976699) {
                if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                    z8 = true;
                }
                z8 = -1;
            } else {
                if (valueOf.equals("IABTCF_PurposeConsents")) {
                    z8 = false;
                }
                z8 = -1;
            }
            if (z8) {
                if (z8) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzax)).booleanValue() && i10 != -1 && this.zze != i10) {
                        this.zze = i10;
                        zzc(string2, i10);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!string2.equals("-1") && !this.zzd.equals(string2)) {
                this.zzd = string2;
                zzc(string2, i10);
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            com.google.android.gms.ads.internal.util.zze.zzb("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }

    public final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaz)).booleanValue()) {
            onSharedPreferenceChanged(this.zzb, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
        }
    }
}
