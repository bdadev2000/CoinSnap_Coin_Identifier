package com.google.android.gms.internal.ads;

import a4.j;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzggf {
    private final zzgum zza;
    private final List zzb;
    private final zzgnd zzc;

    public /* synthetic */ zzggf(zzgum zzgumVar, List list, zzgnd zzgndVar, zzgge zzggeVar) {
        this.zza = zzgumVar;
        this.zzb = list;
        this.zzc = zzgndVar;
    }

    public static final zzggf zza(zzgum zzgumVar) throws GeneralSecurityException {
        zzh(zzgumVar);
        return new zzggf(zzgumVar, zzg(zzgumVar));
    }

    public static final zzggf zzb(zzggj zzggjVar) throws GeneralSecurityException {
        zzggc zzggcVar = new zzggc();
        zzgga zzggaVar = new zzgga(zzggjVar, null);
        zzggaVar.zzd();
        zzggaVar.zzc();
        zzggcVar.zza(zzggaVar);
        return zzggcVar.zzb();
    }

    private final Object zzf(zzgmn zzgmnVar, Class cls, Class cls2) throws GeneralSecurityException {
        boolean z10;
        int i10 = zzggq.zza;
        zzgum zzgumVar = this.zza;
        int zzb = zzgumVar.zzb();
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = true;
        for (zzguk zzgukVar : zzgumVar.zzh()) {
            if (zzgukVar.zzk() == 3) {
                if (zzgukVar.zzj()) {
                    if (zzgukVar.zzf() != zzgve.UNKNOWN_PREFIX) {
                        if (zzgukVar.zzk() != 2) {
                            if (zzgukVar.zza() == zzb) {
                                if (!z11) {
                                    z11 = true;
                                } else {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                            }
                            if (zzgukVar.zzb().zzb() != zzgty.ASYMMETRIC_PUBLIC) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            z12 &= z10;
                            i11++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgukVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgukVar.zza())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgukVar.zza())));
                }
            }
        }
        if (i11 != 0) {
            if (!z11 && !z12) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            zzgor zzb2 = zzgou.zzb(cls2);
            zzb2.zzc(this.zzc);
            for (int i12 = 0; i12 < this.zzb.size(); i12++) {
                zzguk zzd = this.zza.zzd(i12);
                if (zzd.zzk() == 3) {
                    zzggd zzggdVar = (zzggd) this.zzb.get(i12);
                    if (zzggdVar != null) {
                        zzgfw zza = zzggdVar.zza();
                        try {
                            Object zzb3 = zzgmnVar.zzb(zza, cls2);
                            if (zzd.zza() == this.zza.zzb()) {
                                zzb2.zzb(zzb3, zza, zzd);
                            } else {
                                zzb2.zza(zzb3, zza, zzd);
                            }
                        } catch (GeneralSecurityException e2) {
                            throw new GeneralSecurityException(j.h("Unable to get primitive ", cls2.toString(), " for key of type ", zzd.zzb().zzg(), ", see https://developers.google.com/tink/faq/registration_errors"), e2);
                        }
                    } else {
                        throw new GeneralSecurityException("Key parsing of key with index " + i12 + " and type_url " + zzd.zzb().zzg() + " failed, unable to get primitive");
                    }
                }
            }
            return zzgmnVar.zzc(zzb2.zzd(), cls);
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }

    private static List zzg(zzgum zzgumVar) {
        Integer valueOf;
        zzgfw zza;
        zzgfy zzgfyVar;
        boolean z10;
        ArrayList arrayList = new ArrayList(zzgumVar.zza());
        for (zzguk zzgukVar : zzgumVar.zzh()) {
            int zza2 = zzgukVar.zza();
            try {
                int zza3 = zzgukVar.zza();
                if (zzgukVar.zzf() == zzgve.RAW) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(zza3);
                }
                zzgow zza4 = zzgow.zza(zzgukVar.zzb().zzg(), zzgukVar.zzb().zzf(), zzgukVar.zzb().zzb(), zzgukVar.zzf(), valueOf);
                zzgnz zzc = zzgnz.zzc();
                zzggn zza5 = zzggn.zza();
                if (!zzc.zzj(zza4)) {
                    zza = new zzgmz(zza4, zza5);
                } else {
                    zza = zzc.zza(zza4, zza5);
                }
                int zzk = zzgukVar.zzk() - 2;
                if (zzk != 1) {
                    if (zzk != 2) {
                        if (zzk == 3) {
                            zzgfyVar = zzgfy.zzc;
                        } else {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                    } else {
                        zzgfyVar = zzgfy.zzb;
                    }
                } else {
                    zzgfyVar = zzgfy.zza;
                }
                zzgfy zzgfyVar2 = zzgfyVar;
                if (zza2 == zzgumVar.zzb()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new zzggd(zza, zzgfyVar2, zza2, z10, null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzh(zzgum zzgumVar) throws GeneralSecurityException {
        if (zzgumVar != null && zzgumVar.zza() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        int i10 = zzggq.zza;
        zzgun zza = zzgur.zza();
        zzgum zzgumVar = this.zza;
        zza.zzb(zzgumVar.zzb());
        for (zzguk zzgukVar : zzgumVar.zzh()) {
            zzguo zza2 = zzgup.zza();
            zza2.zzc(zzgukVar.zzb().zzg());
            zza2.zzd(zzgukVar.zzk());
            zza2.zzb(zzgukVar.zzf());
            zza2.zza(zzgukVar.zza());
            zza.zza((zzgup) zza2.zzbr());
        }
        return ((zzgur) zza.zzbr()).toString();
    }

    public final zzgum zzc() {
        return this.zza;
    }

    public final Object zzd(zzgfq zzgfqVar, Class cls) throws GeneralSecurityException {
        zzgmn zzgmnVar = (zzgmn) zzgfqVar;
        Class zza = zzgmnVar.zza(cls);
        if (zza != null) {
            return zzf(zzgmnVar, cls, zza);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    private zzggf(zzgum zzgumVar, List list) {
        this.zza = zzgumVar;
        this.zzb = list;
        this.zzc = zzgnd.zza;
    }
}
