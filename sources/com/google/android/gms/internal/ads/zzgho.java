package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzgho {
    private final zzgwn zza;
    private final List zzb;
    private final zzgot zzc;

    public /* synthetic */ zzgho(zzgwn zzgwnVar, List list, zzgot zzgotVar, zzghn zzghnVar) {
        this.zza = zzgwnVar;
        this.zzb = list;
        this.zzc = zzgotVar;
    }

    public static final zzgho zza(zzgwn zzgwnVar) throws GeneralSecurityException {
        zzh(zzgwnVar);
        return new zzgho(zzgwnVar, zzg(zzgwnVar));
    }

    public static final zzgho zzb(zzghs zzghsVar) throws GeneralSecurityException {
        zzghk zzghkVar = new zzghk();
        zzghi zzghiVar = new zzghi(zzghsVar, null);
        zzghiVar.zzd();
        zzghiVar.zzc();
        zzghkVar.zza(zzghiVar);
        return zzghkVar.zzb();
    }

    public static /* bridge */ /* synthetic */ void zze(zzgwn zzgwnVar) {
        zzh(zzgwnVar);
    }

    private final Object zzf(zzgod zzgodVar, Class cls, Class cls2) throws GeneralSecurityException {
        int i2 = zzghz.zza;
        zzgwn zzgwnVar = this.zza;
        int zzc = zzgwnVar.zzc();
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = true;
        for (zzgwm zzgwmVar : zzgwnVar.zzh()) {
            if (zzgwmVar.zzk() == 3) {
                if (!zzgwmVar.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgwmVar.zza())));
                }
                if (zzgwmVar.zzf() == zzgxf.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgwmVar.zza())));
                }
                if (zzgwmVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgwmVar.zza())));
                }
                if (zzgwmVar.zza() == zzc) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                z3 &= zzgwmVar.zzc().zzc() == zzgwa.ASYMMETRIC_PUBLIC;
                i3++;
            }
        }
        if (i3 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z2 && !z3) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzgql zzb = zzgqp.zzb(cls2);
        zzb.zzc(this.zzc);
        for (int i4 = 0; i4 < this.zzb.size(); i4++) {
            zzgwm zze = this.zza.zze(i4);
            if (zze.zzk() == 3) {
                zzghm zzghmVar = (zzghm) this.zzb.get(i4);
                if (zzghmVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i4 + " and type_url " + zze.zzc().zzg() + " failed, unable to get primitive");
                }
                zzghd zza = zzghmVar.zza();
                try {
                    Object zzb2 = zzgodVar.zzb(zza, cls2);
                    if (zze.zza() == this.zza.zzc()) {
                        zzb.zzb(zzb2, zza, zze);
                    } else {
                        zzb.zza(zzb2, zza, zze);
                    }
                } catch (GeneralSecurityException e) {
                    throw new GeneralSecurityException(androidx.compose.foundation.text.input.a.m("Unable to get primitive ", cls2.toString(), " for key of type ", zze.zzc().zzg(), ", see https://developers.google.com/tink/faq/registration_errors"), e);
                }
            }
        }
        return zzgodVar.zzc(zzb.zzd(), cls);
    }

    private static List zzg(zzgwn zzgwnVar) {
        zzghf zzghfVar;
        ArrayList arrayList = new ArrayList(zzgwnVar.zza());
        for (zzgwm zzgwmVar : zzgwnVar.zzh()) {
            int zza = zzgwmVar.zza();
            try {
                zzgqr zza2 = zzgqr.zza(zzgwmVar.zzc().zzg(), zzgwmVar.zzc().zzf(), zzgwmVar.zzc().zzc(), zzgwmVar.zzf(), zzgwmVar.zzf() == zzgxf.RAW ? null : Integer.valueOf(zzgwmVar.zza()));
                zzgpq zzc = zzgpq.zzc();
                zzghw zza3 = zzghw.zza();
                zzghd zzgopVar = !zzc.zzj(zza2) ? new zzgop(zza2, zza3) : zzc.zza(zza2, zza3);
                int zzk = zzgwmVar.zzk() - 2;
                if (zzk == 1) {
                    zzghfVar = zzghf.zza;
                } else if (zzk == 2) {
                    zzghfVar = zzghf.zzb;
                } else {
                    if (zzk != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                        break;
                    }
                    zzghfVar = zzghf.zzc;
                }
                arrayList.add(new zzghm(zzgopVar, zzghfVar, zza, zza == zzgwnVar.zzc(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void zzh(zzgwn zzgwnVar) throws GeneralSecurityException {
        if (zzgwnVar == null || zzgwnVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        int i2 = zzghz.zza;
        zzgwp zza = zzgws.zza();
        zzgwn zzgwnVar = this.zza;
        zza.zzb(zzgwnVar.zzc());
        for (zzgwm zzgwmVar : zzgwnVar.zzh()) {
            zzgwq zza2 = zzgwr.zza();
            zza2.zzc(zzgwmVar.zzc().zzg());
            zza2.zzd(zzgwmVar.zzk());
            zza2.zzb(zzgwmVar.zzf());
            zza2.zza(zzgwmVar.zza());
            zza.zza((zzgwr) zza2.zzbr());
        }
        return ((zzgws) zza.zzbr()).toString();
    }

    public final zzgwn zzc() {
        return this.zza;
    }

    public final Object zzd(zzggx zzggxVar, Class cls) throws GeneralSecurityException {
        zzgod zzgodVar = (zzgod) zzggxVar;
        Class zza = zzgodVar.zza(cls);
        if (zza != null) {
            return zzf(zzgodVar, cls, zza);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    private zzgho(zzgwn zzgwnVar, List list) {
        this.zza = zzgwnVar;
        this.zzb = list;
        this.zzc = zzgot.zza;
    }
}
