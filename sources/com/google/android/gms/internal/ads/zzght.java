package com.google.android.gms.internal.ads;

import Q7.n0;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzght {
    private final zzgwu zza;
    private final List zzb;
    private final zzgtk zzc;

    public /* synthetic */ zzght(zzgwu zzgwuVar, List list, zzgtk zzgtkVar, zzghs zzghsVar) {
        this.zza = zzgwuVar;
        this.zzb = list;
        this.zzc = zzgtkVar;
    }

    public static final zzght zza(zzgwu zzgwuVar) throws GeneralSecurityException {
        zzh(zzgwuVar);
        return new zzght(zzgwuVar, zzg(zzgwuVar));
    }

    public static final zzght zzb(zzghx zzghxVar) throws GeneralSecurityException {
        zzghp zzghpVar = new zzghp();
        zzghn zzghnVar = new zzghn(zzghxVar, null);
        zzghnVar.zzd();
        zzghnVar.zzc();
        zzghpVar.zza(zzghnVar);
        return zzghpVar.zzb();
    }

    public static /* bridge */ /* synthetic */ void zze(zzgwu zzgwuVar) {
        zzh(zzgwuVar);
    }

    private final Object zzf(zzgoi zzgoiVar, Class cls, Class cls2) throws GeneralSecurityException {
        boolean z8;
        Charset charset = zzgif.zza;
        zzgwu zzgwuVar = this.zza;
        int zzc = zzgwuVar.zzc();
        int i9 = 0;
        boolean z9 = false;
        boolean z10 = true;
        for (zzgwt zzgwtVar : zzgwuVar.zzh()) {
            if (zzgwtVar.zzd() == zzgwj.ENABLED) {
                if (zzgwtVar.zzl()) {
                    if (zzgwtVar.zzg() != zzgxn.UNKNOWN_PREFIX) {
                        if (zzgwtVar.zzd() != zzgwj.UNKNOWN_STATUS) {
                            if (zzgwtVar.zza() == zzc) {
                                if (!z9) {
                                    z9 = true;
                                } else {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                            }
                            if (zzgwtVar.zzc().zzc() != zzgwg.ASYMMETRIC_PUBLIC) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            z10 &= z8;
                            i9++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgwtVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgwtVar.zza())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgwtVar.zza())));
                }
            }
        }
        if (i9 != 0) {
            if (!z9 && !z10) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            zzgqg zza = zzgqk.zza(cls2);
            zza.zzc(this.zzc);
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzgwt zze = this.zza.zze(i10);
                if (zze.zzd().equals(zzgwj.ENABLED)) {
                    zzghr zzghrVar = (zzghr) this.zzb.get(i10);
                    if (zzghrVar != null) {
                        zzghi zza2 = zzghrVar.zza();
                        try {
                            Object zzc2 = zzgpi.zza().zzc(zza2, cls2);
                            if (zze.zza() == this.zza.zzc()) {
                                zza.zzb(zzc2, zza2, zze);
                            } else {
                                zza.zza(zzc2, zza2, zze);
                            }
                        } catch (GeneralSecurityException e4) {
                            throw new GeneralSecurityException(n0.j("Unable to get primitive ", cls2.toString(), " for key of type ", zze.zzc().zzg(), ", see https://developers.google.com/tink/faq/registration_errors"), e4);
                        }
                    } else {
                        throw new GeneralSecurityException("Key parsing of key with index " + i10 + " and type_url " + zze.zzc().zzg() + " failed, unable to get primitive");
                    }
                }
            }
            zzgqk zzd = zza.zzd();
            int i11 = zzgib.zza;
            return zzgpi.zza().zzd(zzd, cls);
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }

    private static List zzg(zzgwu zzgwuVar) {
        Integer valueOf;
        zzghi zza;
        zzghk zzghkVar;
        boolean z8;
        ArrayList arrayList = new ArrayList(zzgwuVar.zza());
        for (zzgwt zzgwtVar : zzgwuVar.zzh()) {
            int zza2 = zzgwtVar.zza();
            try {
                int zza3 = zzgwtVar.zza();
                if (zzgwtVar.zzg() == zzgxn.RAW) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(zza3);
                }
                zzgql zza4 = zzgql.zza(zzgwtVar.zzc().zzg(), zzgwtVar.zzc().zzf(), zzgwtVar.zzc().zzc(), zzgwtVar.zzg(), valueOf);
                zzgpl zzc = zzgpl.zzc();
                zzgic zza5 = zzgic.zza();
                if (!zzc.zzj(zza4)) {
                    zza = new zzgou(zza4, zza5);
                } else {
                    zza = zzc.zza(zza4, zza5);
                }
                zzgwj zzd = zzgwtVar.zzd();
                zzgwj zzgwjVar = zzgwj.UNKNOWN_STATUS;
                int ordinal = zzd.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            zzghkVar = zzghk.zzc;
                        } else {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                    } else {
                        zzghkVar = zzghk.zzb;
                    }
                } else {
                    zzghkVar = zzghk.zza;
                }
                zzghk zzghkVar2 = zzghkVar;
                if (zza2 == zzgwuVar.zzc()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                arrayList.add(new zzghr(zza, zzghkVar2, zza2, z8, null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void zzh(zzgwu zzgwuVar) throws GeneralSecurityException {
        if (zzgwuVar != null && zzgwuVar.zza() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        Charset charset = zzgif.zza;
        zzgww zza = zzgwz.zza();
        zzgwu zzgwuVar = this.zza;
        zza.zzb(zzgwuVar.zzc());
        for (zzgwt zzgwtVar : zzgwuVar.zzh()) {
            zzgwx zza2 = zzgwy.zza();
            zza2.zzd(zzgwtVar.zzc().zzg());
            zza2.zzc(zzgwtVar.zzd());
            zza2.zzb(zzgwtVar.zzg());
            zza2.zza(zzgwtVar.zza());
            zza.zza((zzgwy) zza2.zzbr());
        }
        return ((zzgwz) zza.zzbr()).toString();
    }

    public final zzgwu zzc() {
        return this.zza;
    }

    public final Object zzd(zzghc zzghcVar, Class cls) throws GeneralSecurityException {
        Class zza = zzgib.zza(cls);
        if (zza != null) {
            return zzf((zzgoi) zzghcVar, cls, zza);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    private zzght(zzgwu zzgwuVar, List list) {
        this.zza = zzgwuVar;
        this.zzb = list;
        this.zzc = zzgtk.zza;
    }
}
