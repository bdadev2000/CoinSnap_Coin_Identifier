package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfbj implements zzhkp {
    public static zzexz zza(Context context, zzcbm zzcbmVar, zzcbn zzcbnVar, Object obj, zzeyy zzeyyVar, zzfap zzfapVar, zzhkj zzhkjVar, zzhkj zzhkjVar2, zzhkj zzhkjVar3, zzhkj zzhkjVar4, zzhkj zzhkjVar5, zzhkj zzhkjVar6, zzhkj zzhkjVar7, zzhkj zzhkjVar8, zzhkj zzhkjVar9, Executor executor, zzfmn zzfmnVar, zzdvc zzdvcVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzfai) obj);
        hashSet.add(zzeyyVar);
        hashSet.add(zzfapVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfS)).booleanValue()) {
            hashSet.add((zzexw) zzhkjVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfT)).booleanValue()) {
            hashSet.add((zzexw) zzhkjVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfU)).booleanValue()) {
            hashSet.add((zzexw) zzhkjVar3.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfV)).booleanValue()) {
            hashSet.add((zzexw) zzhkjVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfZ)).booleanValue()) {
            hashSet.add((zzexw) zzhkjVar6.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzga)).booleanValue()) {
            hashSet.add((zzexw) zzhkjVar7.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcQ)).booleanValue()) {
            hashSet.add((zzexw) zzhkjVar9.zzb());
        }
        return new zzexz(context, executor, hashSet, zzfmnVar, zzdvcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
