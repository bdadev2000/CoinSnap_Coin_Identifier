package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhch implements zzhdl {
    private static final zzhcn zza = new zzhcf();
    private final zzhcn zzb;

    public zzhch() {
        zzhcn zzhcnVar = zza;
        int i2 = zzhcz.zza;
        zzhcg zzhcgVar = new zzhcg(zzhax.zza(), zzhcnVar);
        byte[] bArr = zzhbr.zzb;
        this.zzb = zzhcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhdl
    public final zzhdk zza(Class cls) {
        int i2 = zzhdm.zza;
        if (!zzhbe.class.isAssignableFrom(cls)) {
            int i3 = zzhcz.zza;
        }
        zzhcm zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i4 = zzhcz.zza;
            return zzhct.zzc(zzhdm.zzm(), zzhar.zza(), zzb.zza());
        }
        int i5 = zzhcz.zza;
        return zzhcs.zzm(cls, zzb, zzhcw.zza(), zzhcd.zza(), zzhdm.zzm(), zzb.zzc() + (-1) != 1 ? zzhar.zza() : null, zzhcl.zza());
    }
}
