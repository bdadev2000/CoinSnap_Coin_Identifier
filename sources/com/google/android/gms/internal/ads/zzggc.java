package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzggc {
    private final List zza = new ArrayList();
    private final zzgnd zzb = zzgnd.zza;
    private boolean zzc = false;

    public static /* bridge */ /* synthetic */ void zzc(zzggc zzggcVar) {
        zzggcVar.zzd();
    }

    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgga) it.next()).zza = false;
        }
    }

    public final zzggc zza(zzgga zzggaVar) {
        zzggc zzggcVar;
        boolean z10;
        zzggcVar = zzggaVar.zzf;
        if (zzggcVar == null) {
            z10 = zzggaVar.zza;
            if (z10) {
                zzd();
            }
            zzggaVar.zzf = this;
            this.zza.add(zzggaVar);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzggf zzb() throws GeneralSecurityException {
        zzggb zzggbVar;
        zzggb zzggbVar2;
        zzggb zzggbVar3;
        zzggj zzggjVar;
        Integer num;
        zzggj zzggjVar2;
        zzgfy zzgfyVar;
        boolean z10;
        zzgfy zzgfyVar2;
        int i10;
        boolean z11;
        zzgfy zzgfyVar3;
        zzggb zzggbVar4;
        zzggb zzggbVar5;
        zzggb zzggbVar6;
        zzggb zzggbVar7;
        zzgfy unused;
        zzggb unused2;
        if (!this.zzc) {
            char c10 = 1;
            this.zzc = true;
            List list = this.zza;
            zzgui zzc = zzgum.zzc();
            ArrayList arrayList = new ArrayList(list.size());
            List list2 = this.zza;
            int i11 = 0;
            int i12 = 0;
            while (i12 < list2.size() - 1) {
                int i13 = i12 + 1;
                zzggbVar4 = ((zzgga) list2.get(i12)).zze;
                zzggbVar5 = zzggb.zza;
                if (zzggbVar4 == zzggbVar5) {
                    zzggbVar6 = ((zzgga) list2.get(i13)).zze;
                    zzggbVar7 = zzggb.zza;
                    if (zzggbVar6 != zzggbVar7) {
                        throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                    }
                }
                i12 = i13;
            }
            HashSet hashSet = new HashSet();
            Integer num2 = null;
            for (zzgga zzggaVar : this.zza) {
                unused = zzggaVar.zzb;
                zzggbVar = zzggaVar.zze;
                if (zzggbVar != null) {
                    zzggbVar2 = zzggaVar.zze;
                    zzggbVar3 = zzggb.zza;
                    int i14 = 4;
                    if (zzggbVar2 == zzggbVar3) {
                        int i15 = i11;
                        while (true) {
                            if (i11 != 0 && !hashSet.contains(Integer.valueOf(i11))) {
                                break;
                            }
                            SecureRandom secureRandom = new SecureRandom();
                            byte[] bArr = new byte[i14];
                            int i16 = i14;
                            int i17 = i15;
                            while (i15 == 0) {
                                secureRandom.nextBytes(bArr);
                                i15 = ((bArr[i17] & UByte.MAX_VALUE) << 24) | ((bArr[c10] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
                                i17 = 0;
                                i16 = 4;
                            }
                            i11 = i15;
                            i15 = i17;
                            i14 = i16;
                        }
                    } else {
                        unused2 = zzggaVar.zze;
                        i11 = 0;
                    }
                    Integer valueOf = Integer.valueOf(i11);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                        zzgga.zza(zzggaVar);
                        zzggjVar = zzggaVar.zzd;
                        if (c10 != zzggjVar.zza()) {
                            num = null;
                        } else {
                            num = valueOf;
                        }
                        zzgnp zzb = zzgnp.zzb();
                        zzggjVar2 = zzggaVar.zzd;
                        zzgfw zza = zzb.zza(zzggjVar2, num);
                        zzgfyVar = zzggaVar.zzb;
                        z10 = zzggaVar.zza;
                        HashSet hashSet2 = hashSet;
                        zzggd zzggdVar = new zzggd(zza, zzgfyVar, i11, z10, null);
                        zzgfyVar2 = zzggaVar.zzb;
                        zzgow zzgowVar = (zzgow) zzgnz.zzc().zzd(zza, zzgow.class, zzggn.zza());
                        Integer zzf = zzgowVar.zzf();
                        if (zzf != null && zzf.intValue() != i11) {
                            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                        }
                        zzgfy zzgfyVar4 = zzgfy.zza;
                        if (zzgfyVar4.equals(zzgfyVar2)) {
                            i10 = 3;
                        } else if (zzgfy.zzb.equals(zzgfyVar2)) {
                            i10 = 4;
                        } else if (zzgfy.zzc.equals(zzgfyVar2)) {
                            i10 = 5;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                        zzguj zzc2 = zzguk.zzc();
                        zzgtx zza2 = zzgua.zza();
                        zza2.zzb(zzgowVar.zzg());
                        zza2.zzc(zzgowVar.zze());
                        zza2.zza(zzgowVar.zzb());
                        zzc2.zza(zza2);
                        zzc2.zzd(i10);
                        zzc2.zzb(i11);
                        zzc2.zzc(zzgowVar.zzc());
                        zzc.zza((zzguk) zzc2.zzbr());
                        z11 = zzggaVar.zza;
                        if (z11) {
                            if (num2 == null) {
                                zzgfyVar3 = zzggaVar.zzb;
                                if (zzgfyVar3 == zzgfyVar4) {
                                    num2 = valueOf;
                                } else {
                                    throw new GeneralSecurityException("Primary key is not enabled");
                                }
                            } else {
                                throw new GeneralSecurityException("Two primaries were set");
                            }
                        }
                        arrayList.add(zzggdVar);
                        c10 = 1;
                        i11 = 0;
                        hashSet = hashSet2;
                    } else {
                        throw new GeneralSecurityException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("Id ", i11, " is used twice in the keyset"));
                    }
                } else {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
            }
            if (num2 != null) {
                zzc.zzb(num2.intValue());
                zzgum zzgumVar = (zzgum) zzc.zzbr();
                zzggf.zzh(zzgumVar);
                return new zzggf(zzgumVar, arrayList, this.zzb, null);
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
