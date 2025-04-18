package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import com.google.common.primitives.UnsignedBytes;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzghk {
    private final List zza = new ArrayList();
    private final zzgot zzb = zzgot.zza;
    private boolean zzc = false;

    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzghi) it.next()).zza = false;
        }
    }

    public final zzghk zza(zzghi zzghiVar) {
        zzghk zzghkVar;
        boolean z2;
        zzghkVar = zzghiVar.zzf;
        if (zzghkVar != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        z2 = zzghiVar.zza;
        if (z2) {
            zzd();
        }
        zzghiVar.zzf = this;
        this.zza.add(zzghiVar);
        return this;
    }

    public final zzgho zzb() throws GeneralSecurityException {
        zzghj zzghjVar;
        zzghj zzghjVar2;
        zzghj zzghjVar3;
        int i2;
        zzghs zzghsVar;
        zzghs zzghsVar2;
        zzghf zzghfVar;
        boolean z2;
        zzghf zzghfVar2;
        int i3;
        boolean z3;
        zzghf zzghfVar3;
        zzghj zzghjVar4;
        zzghj zzghjVar5;
        zzghj zzghjVar6;
        zzghj zzghjVar7;
        zzghf unused;
        zzghj unused2;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c2 = 1;
        this.zzc = true;
        List list = this.zza;
        zzgwk zzd = zzgwn.zzd();
        ArrayList arrayList = new ArrayList(list.size());
        List list2 = this.zza;
        int i4 = 0;
        int i5 = 0;
        while (i5 < list2.size() - 1) {
            int i6 = i5 + 1;
            zzghjVar4 = ((zzghi) list2.get(i5)).zze;
            zzghjVar5 = zzghj.zza;
            if (zzghjVar4 == zzghjVar5) {
                zzghjVar6 = ((zzghi) list2.get(i6)).zze;
                zzghjVar7 = zzghj.zza;
                if (zzghjVar6 != zzghjVar7) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            i5 = i6;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzghi zzghiVar : this.zza) {
            unused = zzghiVar.zzb;
            zzghjVar = zzghiVar.zze;
            if (zzghjVar == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            zzghjVar2 = zzghiVar.zze;
            zzghjVar3 = zzghj.zza;
            int i7 = 4;
            if (zzghjVar2 == zzghjVar3) {
                i2 = i4;
                while (true) {
                    if (i2 != 0 && !hashSet.contains(Integer.valueOf(i2))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[i7];
                    int i8 = i4;
                    while (i8 == 0) {
                        secureRandom.nextBytes(bArr);
                        i8 = ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i4] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[c2] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[3] & UnsignedBytes.MAX_VALUE);
                        i4 = 0;
                        i7 = 4;
                    }
                    i2 = i8;
                }
            } else {
                unused2 = zzghiVar.zze;
                i2 = 0;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException(d.j("Id ", i2, " is used twice in the keyset"));
            }
            hashSet.add(valueOf);
            zzghi.zza(zzghiVar);
            zzghsVar = zzghiVar.zzd;
            Integer num2 = c2 != zzghsVar.zza() ? null : valueOf;
            zzgpg zzb = zzgpg.zzb();
            zzghsVar2 = zzghiVar.zzd;
            zzghd zza = zzb.zza(zzghsVar2, num2);
            zzghfVar = zzghiVar.zzb;
            z2 = zzghiVar.zza;
            zzghm zzghmVar = new zzghm(zza, zzghfVar, i2, z2, null);
            zzghfVar2 = zzghiVar.zzb;
            zzgqr zzgqrVar = (zzgqr) zzgpq.zzc().zzd(zza, zzgqr.class, zzghw.zza());
            Integer zzf = zzgqrVar.zzf();
            if (zzf != null && zzf.intValue() != i2) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            zzghf zzghfVar4 = zzghf.zza;
            if (zzghfVar4.equals(zzghfVar2)) {
                i3 = 3;
            } else if (zzghf.zzb.equals(zzghfVar2)) {
                i3 = 4;
            } else {
                if (!zzghf.zzc.equals(zzghfVar2)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i3 = 5;
            }
            zzgwl zzd2 = zzgwm.zzd();
            zzgvz zza2 = zzgwb.zza();
            zza2.zzb(zzgqrVar.zzg());
            zza2.zzc(zzgqrVar.zze());
            zza2.zza(zzgqrVar.zzb());
            zzd2.zza(zza2);
            zzd2.zzd(i3);
            zzd2.zzb(i2);
            zzd2.zzc(zzgqrVar.zzc());
            zzd.zza((zzgwm) zzd2.zzbr());
            z3 = zzghiVar.zza;
            if (z3) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                zzghfVar3 = zzghiVar.zzb;
                if (zzghfVar3 != zzghfVar4) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
            arrayList.add(zzghmVar);
            c2 = 1;
            i4 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzd.zzb(num.intValue());
        zzgwn zzgwnVar = (zzgwn) zzd.zzbr();
        zzgho.zzh(zzgwnVar);
        return new zzgho(zzgwnVar, arrayList, this.zzb, null);
    }
}
