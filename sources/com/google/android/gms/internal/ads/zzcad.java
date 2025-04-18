package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzcad implements zzazf {
    final zzcaa zza;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final Object zzd = new Object();
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzcab zzf = new zzcab();

    public zzcad(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = new zzcaa(str, zzgVar);
        this.zze = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazf
    public final void zza(boolean z10) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        if (z10) {
            if (currentTimeMillis - this.zze.zzd() > ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzba)).longValue()) {
                this.zza.zzd = -1;
            } else {
                this.zza.zzd = this.zze.zzc();
            }
            this.zzg = true;
            return;
        }
        this.zze.zzr(currentTimeMillis);
        this.zze.zzG(this.zza.zzd);
    }

    public final int zzb() {
        int zza;
        synchronized (this.zzd) {
            zza = this.zza.zza();
        }
        return zza;
    }

    public final zzbzs zzc(Clock clock, String str) {
        return new zzbzs(clock, this, this.zzf.zza(), str);
    }

    public final String zzd() {
        return this.zzf.zzb();
    }

    public final void zze(zzbzs zzbzsVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzbzsVar);
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzm zzmVar, long j3) {
        synchronized (this.zzd) {
            this.zza.zzg(zzmVar, j3);
        }
    }

    public final void zzk() {
        synchronized (this.zzd) {
            this.zza.zzh();
        }
    }

    public final void zzl(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzm() {
        return this.zzg;
    }

    public final Bundle zzn(Context context, zzfgw zzfgwVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.zza.zzb(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zzbzs) it2.next()).zza());
            }
            bundle.putParcelableArrayList(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, arrayList);
            zzfgwVar.zzc(hashSet);
            return bundle;
        }
        throw null;
    }
}
