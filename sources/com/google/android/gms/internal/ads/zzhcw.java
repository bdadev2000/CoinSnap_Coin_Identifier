package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhcw implements zzhea {
    private static final zzhdc zza = new zzhcu();
    private final zzhdc zzb;

    public zzhcw() {
        zzhdc zzhdcVar;
        zzhbh zza2 = zzhbh.zza();
        try {
            zzhdcVar = (zzhdc) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzhdcVar = zza;
        }
        zzhcv zzhcvVar = new zzhcv(zza2, zzhdcVar);
        byte[] bArr = zzhcb.zzd;
        this.zzb = zzhcvVar;
    }

    private static boolean zzb(zzhdb zzhdbVar) {
        if (zzhdbVar.zzc() - 1 != 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhea
    public final zzhdz zza(Class cls) {
        zzheb.zzs(cls);
        zzhdb zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzhbo.class.isAssignableFrom(cls)) {
                return zzhdi.zzc(zzheb.zzn(), zzhbb.zzb(), zzb.zza());
            }
            return zzhdi.zzc(zzheb.zzm(), zzhbb.zza(), zzb.zza());
        }
        if (zzhbo.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzhdh.zzm(cls, zzb, zzhdl.zzb(), zzhcs.zze(), zzheb.zzn(), zzhbb.zzb(), zzhda.zzb());
            }
            return zzhdh.zzm(cls, zzb, zzhdl.zzb(), zzhcs.zze(), zzheb.zzn(), null, zzhda.zzb());
        }
        if (zzb(zzb)) {
            return zzhdh.zzm(cls, zzb, zzhdl.zza(), zzhcs.zzd(), zzheb.zzm(), zzhbb.zza(), zzhda.zza());
        }
        return zzhdh.zzm(cls, zzb, zzhdl.zza(), zzhcs.zzd(), zzheb.zzm(), null, zzhda.zza());
    }
}
