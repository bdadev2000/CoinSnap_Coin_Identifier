package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkq implements zzlt {
    private static final zzkz zza = new zzkp();
    private final zzkz zzb;

    public zzkq() {
        this(new zzkr(zzju.zza(), zza));
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final <T> zzlu<T> zza(Class<T> cls) {
        zzji<?> zzjiVar;
        zzlw.zza((Class<?>) cls);
        zzla zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzli.zza(zzlw.zza(), zzjj.zza(), zza2.zza());
        }
        zzlk zza3 = zzlm.zza();
        zzkm zza4 = zzko.zza();
        zzmk<?, ?> zza5 = zzlw.zza();
        boolean z10 = true;
        if (zzks.zza[zza2.zzb().ordinal()] == 1) {
            z10 = false;
        }
        if (z10) {
            zzjiVar = zzjj.zza();
        } else {
            zzjiVar = null;
        }
        return zzlg.zza(cls, zza2, zza3, zza4, zza5, zzjiVar, zzkx.zza());
    }

    private zzkq(zzkz zzkzVar) {
        this.zzb = (zzkz) zzjv.zza(zzkzVar, "messageInfoFactory");
    }
}
