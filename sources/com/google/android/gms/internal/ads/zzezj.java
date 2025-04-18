package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzezj implements zzhfx {
    public static zzewc zza(Context context, zzbzn zzbznVar, zzbzo zzbzoVar, Object obj, zzexf zzexfVar, zzeym zzeymVar, zzhfr zzhfrVar, zzhfr zzhfrVar2, zzhfr zzhfrVar3, zzhfr zzhfrVar4, zzhfr zzhfrVar5, zzhfr zzhfrVar6, zzhfr zzhfrVar7, Executor executor, zzfkl zzfklVar, zzdsm zzdsmVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzeyf) obj);
        hashSet.add(zzexfVar);
        hashSet.add(zzeymVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfI)).booleanValue()) {
            hashSet.add((zzevz) zzhfrVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfJ)).booleanValue()) {
            hashSet.add((zzevz) zzhfrVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfL)).booleanValue()) {
            hashSet.add((zzevz) zzhfrVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfM)).booleanValue()) {
            hashSet.add((zzevz) zzhfrVar5.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdc)).booleanValue()) {
            hashSet.add((zzevz) zzhfrVar7.zzb());
        }
        return new zzewc(context, executor, hashSet, zzfklVar, zzdsmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
