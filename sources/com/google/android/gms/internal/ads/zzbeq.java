package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbeq {
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbfv.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbgh.zza);
        zzc(arrayList, zzbgh.zzb);
        zzc(arrayList, zzbgh.zzc);
        zzc(arrayList, zzbgh.zzd);
        zzc(arrayList, zzbgh.zze);
        zzc(arrayList, zzbgh.zzu);
        zzc(arrayList, zzbgh.zzf);
        zzc(arrayList, zzbgh.zzm);
        zzc(arrayList, zzbgh.zzn);
        zzc(arrayList, zzbgh.zzo);
        zzc(arrayList, zzbgh.zzp);
        zzc(arrayList, zzbgh.zzq);
        zzc(arrayList, zzbgh.zzr);
        zzc(arrayList, zzbgh.zzs);
        zzc(arrayList, zzbgh.zzt);
        zzc(arrayList, zzbgh.zzg);
        zzc(arrayList, zzbgh.zzh);
        zzc(arrayList, zzbgh.zzi);
        zzc(arrayList, zzbgh.zzj);
        zzc(arrayList, zzbgh.zzk);
        zzc(arrayList, zzbgh.zzl);
        return arrayList;
    }

    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbgv.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbfv zzbfvVar) {
        String str = (String) zzbfvVar.zze();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
