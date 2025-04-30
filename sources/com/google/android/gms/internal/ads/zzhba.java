package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzhba extends zzhaz {
    @Override // com.google.android.gms.internal.ads.zzhaz
    public final int zza(Map.Entry entry) {
        return ((zzhbl) entry.getKey()).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final zzhbd zzb(Object obj) {
        return ((zzhbk) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final zzhbd zzc(Object obj) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Object zzd(zzhay zzhayVar, zzhde zzhdeVar, int i9) {
        return zzhayVar.zzc(zzhdeVar, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Object zze(Object obj, zzhdr zzhdrVar, Object obj2, zzhay zzhayVar, zzhbd zzhbdVar, Object obj3, zzheq zzheqVar) throws IOException {
        Object valueOf;
        Object zzf;
        List arrayList;
        zzhbm zzhbmVar = (zzhbm) obj2;
        zzhbl zzhblVar = zzhbmVar.zzd;
        boolean z8 = zzhblVar.zzd;
        int i9 = zzhblVar.zzb;
        if (z8 && zzhblVar.zze) {
            zzhfg zzhfgVar = zzhfg.zza;
            switch (zzhblVar.zzc.ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    zzhdrVar.zzz(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    zzhdrVar.zzD(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    zzhdrVar.zzG(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    zzhdrVar.zzO(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    zzhdrVar.zzF(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    zzhdrVar.zzC(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    zzhdrVar.zzB(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    zzhdrVar.zzx(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: ".concat(String.valueOf(zzhbmVar.zzd.zzc)));
                case 12:
                    arrayList = new ArrayList();
                    zzhdrVar.zzN(arrayList);
                    break;
                case 13:
                    ArrayList arrayList2 = new ArrayList();
                    zzhdrVar.zzA(arrayList2);
                    zzhbl zzhblVar2 = zzhbmVar.zzd;
                    int i10 = zzheb.zza;
                    zzhbt zzhbtVar = zzhblVar2.zza;
                    if (zzhbtVar != null) {
                        int size = arrayList2.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            Integer num = (Integer) arrayList2.get(i12);
                            int intValue = num.intValue();
                            if (zzhbtVar.zza(intValue) != null) {
                                if (i12 != i11) {
                                    arrayList2.set(i11, num);
                                }
                                i11++;
                            } else {
                                obj3 = zzheb.zzp(obj, i9, intValue, obj3, zzheqVar);
                            }
                        }
                        if (i11 != size) {
                            arrayList2.subList(i11, size).clear();
                        }
                    }
                    arrayList = arrayList2;
                    break;
                case 14:
                    arrayList = new ArrayList();
                    zzhdrVar.zzI(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    zzhdrVar.zzJ(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    zzhdrVar.zzK(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    zzhdrVar.zzL(arrayList);
                    break;
            }
            zzhbdVar.zzk(zzhbmVar.zzd, arrayList);
        } else {
            zzhfg zzhfgVar2 = zzhblVar.zzc;
            if (zzhfgVar2 == zzhfg.zzn) {
                int zzg = zzhdrVar.zzg();
                if (zzhbmVar.zzd.zza.zza(zzg) == null) {
                    return zzheb.zzp(obj, i9, zzg, obj3, zzheqVar);
                }
                valueOf = Integer.valueOf(zzg);
            } else {
                switch (zzhfgVar2.ordinal()) {
                    case 0:
                        valueOf = Double.valueOf(zzhdrVar.zza());
                        break;
                    case 1:
                        valueOf = Float.valueOf(zzhdrVar.zzb());
                        break;
                    case 2:
                        valueOf = Long.valueOf(zzhdrVar.zzl());
                        break;
                    case 3:
                        valueOf = Long.valueOf(zzhdrVar.zzo());
                        break;
                    case 4:
                        valueOf = Integer.valueOf(zzhdrVar.zzg());
                        break;
                    case 5:
                        valueOf = Long.valueOf(zzhdrVar.zzk());
                        break;
                    case 6:
                        valueOf = Integer.valueOf(zzhdrVar.zzf());
                        break;
                    case 7:
                        valueOf = Boolean.valueOf(zzhdrVar.zzP());
                        break;
                    case 8:
                        valueOf = zzhdrVar.zzt();
                        break;
                    case 9:
                        zzhbl zzhblVar3 = zzhbmVar.zzd;
                        if (!zzhblVar3.zzd) {
                            Object zzf2 = zzhbdVar.zzf(zzhblVar3);
                            if (zzf2 instanceof zzhbo) {
                                zzhdz zzb = zzhdo.zza().zzb(zzf2.getClass());
                                if (!((zzhbo) zzf2).zzce()) {
                                    Object zze = zzb.zze();
                                    zzb.zzg(zze, zzf2);
                                    zzhbdVar.zzk(zzhbmVar.zzd, zze);
                                    zzf2 = zze;
                                }
                                zzhdrVar.zzv(zzf2, zzb, zzhayVar);
                                return obj3;
                            }
                        }
                        valueOf = zzhdrVar.zzr(zzhbmVar.zzc.getClass(), zzhayVar);
                        break;
                    case 10:
                        zzhbl zzhblVar4 = zzhbmVar.zzd;
                        if (!zzhblVar4.zzd) {
                            Object zzf3 = zzhbdVar.zzf(zzhblVar4);
                            if (zzf3 instanceof zzhbo) {
                                zzhdz zzb2 = zzhdo.zza().zzb(zzf3.getClass());
                                if (!((zzhbo) zzf3).zzce()) {
                                    Object zze2 = zzb2.zze();
                                    zzb2.zzg(zze2, zzf3);
                                    zzhbdVar.zzk(zzhbmVar.zzd, zze2);
                                    zzf3 = zze2;
                                }
                                zzhdrVar.zzw(zzf3, zzb2, zzhayVar);
                                return obj3;
                            }
                        }
                        valueOf = zzhdrVar.zzs(zzhbmVar.zzc.getClass(), zzhayVar);
                        break;
                    case 11:
                        valueOf = zzhdrVar.zzp();
                        break;
                    case 12:
                        valueOf = Integer.valueOf(zzhdrVar.zzj());
                        break;
                    case 13:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 14:
                        valueOf = Integer.valueOf(zzhdrVar.zzh());
                        break;
                    case 15:
                        valueOf = Long.valueOf(zzhdrVar.zzm());
                        break;
                    case 16:
                        valueOf = Integer.valueOf(zzhdrVar.zzi());
                        break;
                    case 17:
                        valueOf = Long.valueOf(zzhdrVar.zzn());
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            zzhbl zzhblVar5 = zzhbmVar.zzd;
            if (zzhblVar5.zzd) {
                zzhbdVar.zzh(zzhblVar5, valueOf);
            } else {
                int ordinal = zzhblVar5.zzc.ordinal();
                if ((ordinal == 9 || ordinal == 10) && (zzf = zzhbdVar.zzf(zzhbmVar.zzd)) != null) {
                    byte[] bArr = zzhcb.zzd;
                    valueOf = ((zzhde) zzf).zzcZ().zzaS((zzhde) valueOf).zzbs();
                }
                zzhbdVar.zzk(zzhbmVar.zzd, valueOf);
            }
        }
        return obj3;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzf(Object obj) {
        ((zzhbk) obj).zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzg(zzhdr zzhdrVar, Object obj, zzhay zzhayVar, zzhbd zzhbdVar) throws IOException {
        zzhbm zzhbmVar = (zzhbm) obj;
        zzhbdVar.zzk(zzhbmVar.zzd, zzhdrVar.zzs(zzhbmVar.zzc.getClass(), zzhayVar));
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzh(zzhac zzhacVar, Object obj, zzhay zzhayVar, zzhbd zzhbdVar) throws IOException {
        zzhbm zzhbmVar = (zzhbm) obj;
        zzhdd zzcY = zzhbmVar.zzc.zzcY();
        zzham zzl = zzhacVar.zzl();
        zzcY.zzaW(zzl, zzhayVar);
        zzhbdVar.zzk(zzhbmVar.zzd, zzcY.zzbs());
        zzl.zzz(0);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzi(zzhfi zzhfiVar, Map.Entry entry) throws IOException {
        zzhbl zzhblVar = (zzhbl) entry.getKey();
        if (zzhblVar.zzd) {
            zzhfg zzhfgVar = zzhfg.zza;
            switch (zzhblVar.zzc.ordinal()) {
                case 0:
                    zzheb.zzv(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                case 1:
                    zzheb.zzz(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                case 2:
                    zzheb.zzC(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                case 3:
                    zzheb.zzK(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                case 4:
                    zzheb.zzB(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                case 5:
                    zzheb.zzy(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                case 6:
                    zzheb.zzx(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                case 7:
                    zzheb.zzt(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                case 8:
                    zzheb.zzI(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        zzheb.zzA(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhdo.zza().zzb(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        zzheb.zzD(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhdo.zza().zzb(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    zzheb.zzu(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar);
                    return;
                case 12:
                    zzheb.zzJ(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                case 13:
                    zzheb.zzB(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                case 14:
                    zzheb.zzE(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                case 15:
                    zzheb.zzF(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                case 16:
                    zzheb.zzG(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                case 17:
                    zzheb.zzH(zzhblVar.zzb, (List) entry.getValue(), zzhfiVar, zzhblVar.zze);
                    return;
                default:
                    return;
            }
        }
        zzhfg zzhfgVar2 = zzhfg.zza;
        switch (zzhblVar.zzc.ordinal()) {
            case 0:
                zzhfiVar.zzf(zzhblVar.zzb, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzhfiVar.zzo(zzhblVar.zzb, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzhfiVar.zzt(zzhblVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzhfiVar.zzK(zzhblVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzhfiVar.zzr(zzhblVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzhfiVar.zzm(zzhblVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzhfiVar.zzk(zzhblVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzhfiVar.zzb(zzhblVar.zzb, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzhfiVar.zzG(zzhblVar.zzb, (String) entry.getValue());
                return;
            case 9:
                zzhfiVar.zzq(zzhblVar.zzb, entry.getValue(), zzhdo.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzhfiVar.zzv(zzhblVar.zzb, entry.getValue(), zzhdo.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzhfiVar.zzd(zzhblVar.zzb, (zzhac) entry.getValue());
                return;
            case 12:
                zzhfiVar.zzI(zzhblVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzhfiVar.zzr(zzhblVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzhfiVar.zzx(zzhblVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzhfiVar.zzz(zzhblVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzhfiVar.zzB(zzhblVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzhfiVar.zzD(zzhblVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final boolean zzj(zzhde zzhdeVar) {
        return zzhdeVar instanceof zzhbk;
    }
}
