package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes2.dex */
public final class zzcbz {
    final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzk;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzj = new Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;

    public zzcbz(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzk = zzgVar;
    }

    private final void zzi() {
        if (((Boolean) zzbgr.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final int zza() {
        int i9;
        synchronized (this.zzj) {
            i9 = this.zzi;
        }
        return i9;
    }

    public final Bundle zzb(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                bundle = new Bundle();
                if (!this.zzk.zzS()) {
                    bundle.putString("session_id", this.zzf);
                }
                bundle.putLong("basets", this.zzb);
                bundle.putLong("currts", this.zza);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.zzc);
                bundle.putInt("preqs_in_session", this.zzd);
                bundle.putLong("time_in_session", this.zze);
                bundle.putInt("pclick", this.zzg);
                bundle.putInt("pimp", this.zzh);
                Context zza = zzbyf.zza(context);
                int identifier = zza.getResources().getIdentifier("Theme.Translucent", TtmlNode.TAG_STYLE, "android");
                boolean z8 = false;
                if (identifier == 0) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == zza.getPackageManager().getActivityInfo(new ComponentName(zza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                            z8 = true;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Fail to fetch AdActivity theme");
                        com.google.android.gms.ads.internal.util.client.zzm.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z8);
                bundle.putInt("consent_form_action_identifier", zza());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzd() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zze() {
        zzi();
    }

    public final void zzf() {
        zzi();
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, long j7) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                long zzd = this.zzk.zzd();
                long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                if (this.zzb == -1) {
                    if (currentTimeMillis - zzd > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaU)).longValue()) {
                        this.zzd = -1;
                    } else {
                        this.zzd = this.zzk.zzc();
                    }
                    this.zzb = j7;
                    this.zza = j7;
                } else {
                    this.zza = j7;
                }
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdB)).booleanValue() && (bundle = zzlVar.zzc) != null && bundle.getInt("gw", 2) == 1) {
                    return;
                }
                this.zzc++;
                int i9 = this.zzd + 1;
                this.zzd = i9;
                if (i9 == 0) {
                    this.zze = 0L;
                    this.zzk.zzE(currentTimeMillis);
                } else {
                    this.zze = currentTimeMillis - this.zzk.zze();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzh() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }
}
