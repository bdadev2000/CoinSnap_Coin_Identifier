package com.google.android.gms.internal.measurement;

import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbe {
    private static zzaf zza(zzaf zzafVar, zzh zzhVar, zzal zzalVar, Boolean bool, Boolean bool2) {
        zzaf zzafVar2 = new zzaf();
        Iterator<Integer> zzg = zzafVar.zzg();
        while (zzg.hasNext()) {
            int intValue = zzg.next().intValue();
            if (zzafVar.zzc(intValue)) {
                zzaq zza = zzalVar.zza(zzhVar, Arrays.asList(zzafVar.zza(intValue), new zzai(Double.valueOf(intValue)), zzafVar));
                if (zza.zzd().equals(bool)) {
                    return zzafVar2;
                }
                if (bool2 == null || zza.zzd().equals(bool2)) {
                    zzafVar2.zzb(intValue, zza);
                }
            }
        }
        return zzafVar2;
    }

    private static zzaf zza(zzaf zzafVar, zzh zzhVar, zzal zzalVar) {
        return zza(zzafVar, zzhVar, zzalVar, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaq zza(String str, zzaf zzafVar, zzh zzhVar, List<zzaq> list) {
        String str2;
        char c9;
        double d2;
        double zza;
        String str3;
        zzal zzalVar;
        double min;
        int i9;
        zzh zzhVar2;
        Double d9;
        double d10;
        str.getClass();
        Double valueOf = Double.valueOf(-1.0d);
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c9 = 1;
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    c9 = 2;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    str2 = "toString";
                    c9 = 3;
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c9 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c9 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c9 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c9 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c9 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c9 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c9 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case 3452698:
                if (str.equals(Constants.PUSH)) {
                    c9 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c9 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c9 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    c9 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c9 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c9 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c9 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c9 = 18;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c9 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c9 = 65535;
                break;
            default:
                str2 = "toString";
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                zzg.zza(str2, 0, list);
                return new zzas(zzafVar.toString());
            case 1:
                zzaf zzafVar2 = (zzaf) zzafVar.zzc();
                if (!list.isEmpty()) {
                    Iterator<zzaq> it = list.iterator();
                    while (it.hasNext()) {
                        zzaq zza2 = zzhVar.zza(it.next());
                        if (!(zza2 instanceof zzaj)) {
                            int zzb = zzafVar2.zzb();
                            if (zza2 instanceof zzaf) {
                                zzaf zzafVar3 = (zzaf) zza2;
                                Iterator<Integer> zzg = zzafVar3.zzg();
                                while (zzg.hasNext()) {
                                    Integer next = zzg.next();
                                    zzafVar2.zzb(next.intValue() + zzb, zzafVar3.zza(next.intValue()));
                                }
                            } else {
                                zzafVar2.zzb(zzb, zza2);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return zzafVar2;
            case 2:
                zzg.zza("filter", 1, list);
                zzaq zza3 = zzhVar.zza(list.get(0));
                if (zza3 instanceof zzar) {
                    if (zzafVar.zza() == 0) {
                        return new zzaf();
                    }
                    zzaf zzafVar4 = (zzaf) zzafVar.zzc();
                    zzaf zza4 = zza(zzafVar, zzhVar, (zzar) zza3, null, Boolean.TRUE);
                    zzaf zzafVar5 = new zzaf();
                    Iterator<Integer> zzg2 = zza4.zzg();
                    while (zzg2.hasNext()) {
                        zzafVar5.zza(zzafVar4.zza(zzg2.next().intValue()));
                    }
                    return zzafVar5;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                return zza(zzafVar, zzhVar, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new zzaf();
                }
                int zza5 = (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                if (zza5 < 0) {
                    zza5 = Math.max(0, zzafVar.zzb() + zza5);
                } else if (zza5 > zzafVar.zzb()) {
                    zza5 = zzafVar.zzb();
                }
                int zzb2 = zzafVar.zzb();
                zzaf zzafVar6 = new zzaf();
                if (list.size() <= 1) {
                    while (zza5 < zzb2) {
                        zzafVar6.zza(zzafVar.zza(zza5));
                        zzafVar.zzb(zza5, null);
                        zza5++;
                    }
                    return zzafVar6;
                }
                int max = Math.max(0, (int) zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue()));
                if (max > 0) {
                    for (int i10 = zza5; i10 < Math.min(zzb2, zza5 + max); i10++) {
                        zzafVar6.zza(zzafVar.zza(zza5));
                        zzafVar.zzb(zza5);
                    }
                }
                if (list.size() > 2) {
                    for (int i11 = 2; i11 < list.size(); i11++) {
                        zzaq zza6 = zzhVar.zza(list.get(i11));
                        if (!(zza6 instanceof zzaj)) {
                            zzafVar.zza((zza5 + i11) - 2, zza6);
                        } else {
                            throw new IllegalArgumentException("Failed to parse elements to add");
                        }
                    }
                }
                return zzafVar6;
            case 5:
                zzg.zza("forEach", 1, list);
                zzaq zza7 = zzhVar.zza(list.get(0));
                if (zza7 instanceof zzar) {
                    if (zzafVar.zza() == 0) {
                        return zzaq.zzc;
                    }
                    zza(zzafVar, zzhVar, (zzar) zza7);
                    return zzaq.zzc;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 6:
                zzg.zzc("lastIndexOf", 2, list);
                zzaq zzaqVar = zzaq.zzc;
                if (!list.isEmpty()) {
                    zzaqVar = zzhVar.zza(list.get(0));
                }
                double zzb3 = zzafVar.zzb() - 1;
                if (list.size() > 1) {
                    zzaq zza8 = zzhVar.zza(list.get(1));
                    if (Double.isNaN(zza8.zze().doubleValue())) {
                        zza = zzafVar.zzb() - 1;
                    } else {
                        zza = zzg.zza(zza8.zze().doubleValue());
                    }
                    zzb3 = zza;
                    d2 = 0.0d;
                    if (zzb3 < 0.0d) {
                        zzb3 += zzafVar.zzb();
                    }
                } else {
                    d2 = 0.0d;
                }
                if (zzb3 < d2) {
                    return new zzai(valueOf);
                }
                for (int min2 = (int) Math.min(zzafVar.zzb(), zzb3); min2 >= 0; min2--) {
                    if (zzafVar.zzc(min2) && zzg.zza(zzafVar.zza(min2), zzaqVar)) {
                        return new zzai(Double.valueOf(min2));
                    }
                }
                return new zzai(valueOf);
            case 7:
                if (!list.isEmpty()) {
                    zzaf zzafVar7 = new zzaf();
                    Iterator<zzaq> it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzaq zza9 = zzhVar.zza(it2.next());
                        if (!(zza9 instanceof zzaj)) {
                            zzafVar7.zza(zza9);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int zzb4 = zzafVar7.zzb();
                    Iterator<Integer> zzg3 = zzafVar.zzg();
                    while (zzg3.hasNext()) {
                        Integer next2 = zzg3.next();
                        zzafVar7.zzb(next2.intValue() + zzb4, zzafVar.zza(next2.intValue()));
                    }
                    zzafVar.zzj();
                    Iterator<Integer> zzg4 = zzafVar7.zzg();
                    while (zzg4.hasNext()) {
                        Integer next3 = zzg4.next();
                        zzafVar.zzb(next3.intValue(), zzafVar7.zza(next3.intValue()));
                    }
                }
                return new zzai(Double.valueOf(zzafVar.zzb()));
            case '\b':
                zzg.zza("map", 1, list);
                zzaq zza10 = zzhVar.zza(list.get(0));
                if (zza10 instanceof zzar) {
                    if (zzafVar.zzb() == 0) {
                        return new zzaf();
                    }
                    return zza(zzafVar, zzhVar, (zzar) zza10);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\t':
                zzg.zza("pop", 0, list);
                int zzb5 = zzafVar.zzb();
                if (zzb5 == 0) {
                    return zzaq.zzc;
                }
                int i12 = zzb5 - 1;
                zzaq zza11 = zzafVar.zza(i12);
                zzafVar.zzb(i12);
                return zza11;
            case '\n':
                zzg.zzc("join", 1, list);
                if (zzafVar.zzb() == 0) {
                    return zzaq.zzj;
                }
                if (!list.isEmpty()) {
                    zzaq zza12 = zzhVar.zza(list.get(0));
                    if (!(zza12 instanceof zzao) && !(zza12 instanceof zzax)) {
                        str3 = zza12.zzf();
                    } else {
                        str3 = "";
                    }
                } else {
                    str3 = ",";
                }
                return new zzas(zzafVar.zzb(str3));
            case 11:
                if (!list.isEmpty()) {
                    Iterator<zzaq> it3 = list.iterator();
                    while (it3.hasNext()) {
                        zzafVar.zza(zzhVar.zza(it3.next()));
                    }
                }
                return new zzai(Double.valueOf(zzafVar.zzb()));
            case '\f':
                zzg.zza("some", 1, list);
                zzaq zza13 = zzhVar.zza(list.get(0));
                if (zza13 instanceof zzal) {
                    if (zzafVar.zzb() != 0) {
                        zzal zzalVar2 = (zzal) zza13;
                        Iterator<Integer> zzg5 = zzafVar.zzg();
                        while (zzg5.hasNext()) {
                            int intValue = zzg5.next().intValue();
                            if (zzafVar.zzc(intValue) && zzalVar2.zza(zzhVar, Arrays.asList(zzafVar.zza(intValue), new zzai(Double.valueOf(intValue)), zzafVar)).zzd().booleanValue()) {
                                return zzaq.zzh;
                            }
                        }
                    }
                    return zzaq.zzi;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\r':
                zzg.zzc("sort", 1, list);
                if (zzafVar.zzb() >= 2) {
                    List<zzaq> zzi = zzafVar.zzi();
                    if (list.isEmpty()) {
                        zzalVar = null;
                    } else {
                        zzaq zza14 = zzhVar.zza(list.get(0));
                        if (zza14 instanceof zzal) {
                            zzalVar = (zzal) zza14;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    }
                    Collections.sort(zzi, new zzbh(zzalVar, zzhVar));
                    zzafVar.zzj();
                    Iterator<zzaq> it4 = zzi.iterator();
                    int i13 = 0;
                    while (it4.hasNext()) {
                        zzafVar.zzb(i13, it4.next());
                        i13++;
                    }
                }
                return zzafVar;
            case 14:
                zzg.zza("every", 1, list);
                zzaq zza15 = zzhVar.zza(list.get(0));
                if (zza15 instanceof zzar) {
                    if (zzafVar.zzb() != 0 && zza(zzafVar, zzhVar, (zzar) zza15, Boolean.FALSE, Boolean.TRUE).zzb() != zzafVar.zzb()) {
                        return zzaq.zzi;
                    }
                    return zzaq.zzh;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                zzg.zza("shift", 0, list);
                if (zzafVar.zzb() == 0) {
                    return zzaq.zzc;
                }
                zzaq zza16 = zzafVar.zza(0);
                zzafVar.zzb(0);
                return zza16;
            case 16:
                zzg.zzc("slice", 2, list);
                if (list.isEmpty()) {
                    return zzafVar.zzc();
                }
                double zzb6 = zzafVar.zzb();
                double zza17 = zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                if (zza17 < 0.0d) {
                    min = Math.max(zza17 + zzb6, 0.0d);
                } else {
                    min = Math.min(zza17, zzb6);
                }
                if (list.size() == 2) {
                    double zza18 = zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue());
                    if (zza18 < 0.0d) {
                        zzb6 = Math.max(zzb6 + zza18, 0.0d);
                    } else {
                        zzb6 = Math.min(zzb6, zza18);
                    }
                }
                zzaf zzafVar8 = new zzaf();
                for (int i14 = (int) min; i14 < zzb6; i14++) {
                    zzafVar8.zza(zzafVar.zza(i14));
                }
                return zzafVar8;
            case 17:
                return zza(zzafVar, zzhVar, list, false);
            case 18:
                zzg.zza("reverse", 0, list);
                int zzb7 = zzafVar.zzb();
                if (zzb7 != 0) {
                    int i15 = 0;
                    while (i15 < zzb7 / 2) {
                        if (zzafVar.zzc(i15)) {
                            zzaq zza19 = zzafVar.zza(i15);
                            zzafVar.zzb(i15, null);
                            i9 = 1;
                            int i16 = (zzb7 - 1) - i15;
                            if (zzafVar.zzc(i16)) {
                                zzafVar.zzb(i15, zzafVar.zza(i16));
                            }
                            zzafVar.zzb(i16, zza19);
                        } else {
                            i9 = 1;
                        }
                        i15 += i9;
                    }
                }
                return zzafVar;
            case 19:
                zzg.zzc("indexOf", 2, list);
                zzaq zzaqVar2 = zzaq.zzc;
                if (list.isEmpty()) {
                    zzhVar2 = zzhVar;
                } else {
                    zzhVar2 = zzhVar;
                    zzaqVar2 = zzhVar2.zza(list.get(0));
                }
                if (list.size() > 1) {
                    d10 = zzg.zza(zzhVar2.zza(list.get(1)).zze().doubleValue());
                    if (d10 >= zzafVar.zzb()) {
                        return new zzai(valueOf);
                    }
                    d9 = valueOf;
                    if (d10 < 0.0d) {
                        d10 += zzafVar.zzb();
                    }
                } else {
                    d9 = valueOf;
                    d10 = 0.0d;
                }
                Iterator<Integer> zzg6 = zzafVar.zzg();
                while (zzg6.hasNext()) {
                    int intValue2 = zzg6.next().intValue();
                    double d11 = intValue2;
                    if (d11 >= d10 && zzg.zza(zzafVar.zza(intValue2), zzaqVar2)) {
                        return new zzai(Double.valueOf(d11));
                    }
                }
                return new zzai(d9);
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static zzaq zza(zzaf zzafVar, zzh zzhVar, List<zzaq> list, boolean z8) {
        zzaq zzaqVar;
        zzg.zzb("reduce", 1, list);
        zzg.zzc("reduce", 2, list);
        zzaq zza = zzhVar.zza(list.get(0));
        if (zza instanceof zzal) {
            if (list.size() == 2) {
                zzaqVar = zzhVar.zza(list.get(1));
                if (zzaqVar instanceof zzaj) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else {
                if (zzafVar.zzb() == 0) {
                    throw new IllegalStateException("Empty array with no initial value error");
                }
                zzaqVar = null;
            }
            zzal zzalVar = (zzal) zza;
            int zzb = zzafVar.zzb();
            int i9 = z8 ? 0 : zzb - 1;
            int i10 = z8 ? zzb - 1 : 0;
            int i11 = z8 ? 1 : -1;
            if (zzaqVar == null) {
                zzaqVar = zzafVar.zza(i9);
                i9 += i11;
            }
            while ((i10 - i9) * i11 >= 0) {
                if (zzafVar.zzc(i9)) {
                    zzaqVar = zzalVar.zza(zzhVar, Arrays.asList(zzaqVar, zzafVar.zza(i9), new zzai(Double.valueOf(i9)), zzafVar));
                    if (zzaqVar instanceof zzaj) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i9 += i11;
                } else {
                    i9 += i11;
                }
            }
            return zzaqVar;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
