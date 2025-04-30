package com.google.android.gms.internal.ads;

import Q7.n0;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzghp {
    private final List zza = new ArrayList();
    private final zzgtk zzb = zzgtk.zza;
    private boolean zzc = false;

    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzghn) it.next()).zza = false;
        }
    }

    public final zzghp zza(zzghn zzghnVar) {
        zzghp zzghpVar;
        boolean z8;
        zzghpVar = zzghnVar.zzf;
        if (zzghpVar == null) {
            z8 = zzghnVar.zza;
            if (z8) {
                zzd();
            }
            zzghnVar.zzf = this;
            this.zza.add(zzghnVar);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzght zzb() throws GeneralSecurityException {
        zzgho zzghoVar;
        zzgho zzghoVar2;
        zzgho zzghoVar3;
        int i9;
        zzghx zzghxVar;
        Integer num;
        zzghx zzghxVar2;
        zzghk zzghkVar;
        boolean z8;
        zzghk zzghkVar2;
        zzgwj zzgwjVar;
        boolean z9;
        zzghk zzghkVar3;
        zzgho zzghoVar4;
        zzgho zzghoVar5;
        zzgho zzghoVar6;
        zzgho zzghoVar7;
        zzghk unused;
        zzgho unused2;
        if (!this.zzc) {
            char c9 = 1;
            this.zzc = true;
            List list = this.zza;
            zzgwr zzd = zzgwu.zzd();
            ArrayList arrayList = new ArrayList(list.size());
            List list2 = this.zza;
            int i10 = 0;
            int i11 = 0;
            while (i11 < list2.size() - 1) {
                int i12 = i11 + 1;
                zzghoVar4 = ((zzghn) list2.get(i11)).zze;
                zzghoVar5 = zzgho.zza;
                if (zzghoVar4 == zzghoVar5) {
                    zzghoVar6 = ((zzghn) list2.get(i12)).zze;
                    zzghoVar7 = zzgho.zza;
                    if (zzghoVar6 != zzghoVar7) {
                        throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                    }
                }
                i11 = i12;
            }
            HashSet hashSet = new HashSet();
            Integer num2 = null;
            for (zzghn zzghnVar : this.zza) {
                unused = zzghnVar.zzb;
                zzghoVar = zzghnVar.zze;
                if (zzghoVar != null) {
                    zzghoVar2 = zzghnVar.zze;
                    zzghoVar3 = zzgho.zza;
                    if (zzghoVar2 == zzghoVar3) {
                        i9 = i10;
                        while (true) {
                            if (i9 != 0 && !hashSet.contains(Integer.valueOf(i9))) {
                                break;
                            }
                            SecureRandom secureRandom = new SecureRandom();
                            byte[] bArr = new byte[4];
                            int i13 = i10;
                            while (i13 == 0) {
                                secureRandom.nextBytes(bArr);
                                i13 = ((bArr[i10] & 255) << 24) | ((bArr[c9] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                            }
                            i9 = i13;
                        }
                    } else {
                        unused2 = zzghnVar.zze;
                        i9 = i10;
                    }
                    Integer valueOf = Integer.valueOf(i9);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                        zzghn.zza(zzghnVar);
                        zzghxVar = zzghnVar.zzd;
                        if (c9 != zzghxVar.zza()) {
                            num = null;
                        } else {
                            num = valueOf;
                        }
                        zzgpb zzb = zzgpb.zzb();
                        zzghxVar2 = zzghnVar.zzd;
                        zzghi zza = zzb.zza(zzghxVar2, num);
                        zzghkVar = zzghnVar.zzb;
                        z8 = zzghnVar.zza;
                        zzghr zzghrVar = new zzghr(zza, zzghkVar, i9, z8, null);
                        zzghkVar2 = zzghnVar.zzb;
                        zzgql zzgqlVar = (zzgql) zzgpl.zzc().zzd(zza, zzgql.class, zzgic.zza());
                        Integer zzf = zzgqlVar.zzf();
                        if (zzf != null && zzf.intValue() != i9) {
                            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                        }
                        zzghk zzghkVar4 = zzghk.zza;
                        if (zzghkVar4.equals(zzghkVar2)) {
                            zzgwjVar = zzgwj.ENABLED;
                        } else if (zzghk.zzb.equals(zzghkVar2)) {
                            zzgwjVar = zzgwj.DISABLED;
                        } else if (zzghk.zzc.equals(zzghkVar2)) {
                            zzgwjVar = zzgwj.DESTROYED;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                        zzgws zze = zzgwt.zze();
                        zzgwe zza2 = zzgwh.zza();
                        zza2.zzb(zzgqlVar.zzg());
                        zza2.zzc(zzgqlVar.zze());
                        zza2.zza(zzgqlVar.zzb());
                        zze.zza(zza2);
                        zze.zzd(zzgwjVar);
                        zze.zzb(i9);
                        zze.zzc(zzgqlVar.zzc());
                        zzd.zza((zzgwt) zze.zzbr());
                        z9 = zzghnVar.zza;
                        if (z9) {
                            if (num2 == null) {
                                zzghkVar3 = zzghnVar.zzb;
                                if (zzghkVar3 == zzghkVar4) {
                                    num2 = valueOf;
                                } else {
                                    throw new GeneralSecurityException("Primary key is not enabled");
                                }
                            } else {
                                throw new GeneralSecurityException("Two primaries were set");
                            }
                        }
                        arrayList.add(zzghrVar);
                        c9 = 1;
                        i10 = 0;
                    } else {
                        throw new GeneralSecurityException(n0.f(i9, "Id ", " is used twice in the keyset"));
                    }
                } else {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
            }
            if (num2 != null) {
                zzd.zzb(num2.intValue());
                zzgwu zzgwuVar = (zzgwu) zzd.zzbr();
                zzght.zzh(zzgwuVar);
                return new zzght(zzgwuVar, arrayList, this.zzb, null);
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
