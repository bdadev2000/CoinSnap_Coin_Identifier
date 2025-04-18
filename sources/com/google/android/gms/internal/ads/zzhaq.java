package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzhaq extends zzhap {
    @Override // com.google.android.gms.internal.ads.zzhap
    public final void zza(Object obj) {
        ((zzhba) obj).zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    public final void zzb(zzhen zzhenVar, Map.Entry entry) throws IOException {
        zzhbb zzhbbVar = (zzhbb) entry.getKey();
        if (!zzhbbVar.zzc) {
            zzhel zzhelVar = zzhel.zza;
            switch (zzhbbVar.zzb.ordinal()) {
                case 0:
                    zzhenVar.zzf(zzhbbVar.zza, ((Double) entry.getValue()).doubleValue());
                    return;
                case 1:
                    zzhenVar.zzo(zzhbbVar.zza, ((Float) entry.getValue()).floatValue());
                    return;
                case 2:
                    zzhenVar.zzt(zzhbbVar.zza, ((Long) entry.getValue()).longValue());
                    return;
                case 3:
                    zzhenVar.zzK(zzhbbVar.zza, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    zzhenVar.zzr(zzhbbVar.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 5:
                    zzhenVar.zzm(zzhbbVar.zza, ((Long) entry.getValue()).longValue());
                    return;
                case 6:
                    zzhenVar.zzk(zzhbbVar.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 7:
                    zzhenVar.zzb(zzhbbVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 8:
                    zzhenVar.zzG(zzhbbVar.zza, (String) entry.getValue());
                    return;
                case 9:
                    zzhenVar.zzq(zzhbbVar.zza, entry.getValue(), zzhcz.zza().zzb(entry.getValue().getClass()));
                    return;
                case 10:
                    zzhenVar.zzv(zzhbbVar.zza, entry.getValue(), zzhcz.zza().zzb(entry.getValue().getClass()));
                    return;
                case 11:
                    zzhenVar.zzd(zzhbbVar.zza, (zzgzs) entry.getValue());
                    return;
                case 12:
                    zzhenVar.zzI(zzhbbVar.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    zzhenVar.zzr(zzhbbVar.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 14:
                    zzhenVar.zzx(zzhbbVar.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    zzhenVar.zzz(zzhbbVar.zza, ((Long) entry.getValue()).longValue());
                    return;
                case 16:
                    zzhenVar.zzB(zzhbbVar.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 17:
                    zzhenVar.zzD(zzhbbVar.zza, ((Long) entry.getValue()).longValue());
                    return;
                default:
                    return;
            }
        }
        zzhel zzhelVar2 = zzhel.zza;
        switch (zzhbbVar.zzb.ordinal()) {
            case 0:
                zzhdm.zzt(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            case 1:
                zzhdm.zzx(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            case 2:
                zzhdm.zzA(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            case 3:
                zzhdm.zzI(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            case 4:
                zzhdm.zzz(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            case 5:
                zzhdm.zzw(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            case 6:
                zzhdm.zzv(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            case 7:
                zzhdm.zzr(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            case 8:
                zzhdm.zzG(zzhbbVar.zza, (List) entry.getValue(), zzhenVar);
                return;
            case 9:
                List list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    return;
                }
                zzhdm.zzy(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhcz.zza().zzb(list.get(0).getClass()));
                return;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                zzhdm.zzB(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhcz.zza().zzb(list2.get(0).getClass()));
                return;
            case 11:
                zzhdm.zzs(zzhbbVar.zza, (List) entry.getValue(), zzhenVar);
                return;
            case 12:
                zzhdm.zzH(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            case 13:
                zzhdm.zzz(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            case 14:
                zzhdm.zzC(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            case 15:
                zzhdm.zzD(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            case 16:
                zzhdm.zzE(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            case 17:
                zzhdm.zzF(zzhbbVar.zza, (List) entry.getValue(), zzhenVar, zzhbbVar.zzd);
                return;
            default:
                return;
        }
    }
}
