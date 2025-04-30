package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkh implements zzlk {
    private static final zzkq zza = new zzkg();
    private final zzkq zzb;

    public zzkh() {
        this(new zzki(zzjl.zza(), zza));
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final <T> zzll<T> zza(Class<T> cls) {
        zziz<?> zzizVar;
        zzln.zza((Class<?>) cls);
        zzkr zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzkz.zza(zzln.zza(), zzja.zza(), zza2.zza());
        }
        zzlb zza3 = zzld.zza();
        zzkd zza4 = zzkf.zza();
        zzmf<?, ?> zza5 = zzln.zza();
        if (zzkj.zza[zza2.zzb().ordinal()] != 1) {
            zzizVar = zzja.zza();
        } else {
            zzizVar = null;
        }
        return zzkx.zza(cls, zza2, zza3, zza4, zza5, zzizVar, zzko.zza());
    }

    private zzkh(zzkq zzkqVar) {
        this.zzb = (zzkq) zzjm.zza(zzkqVar, "messageInfoFactory");
    }
}
