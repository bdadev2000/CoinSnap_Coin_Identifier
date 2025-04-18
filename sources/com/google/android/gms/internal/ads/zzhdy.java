package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzhdy {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i2, int i3);

    public abstract void zze(Object obj, int i2, long j2);

    public abstract void zzf(Object obj, int i2, Object obj2);

    public abstract void zzg(Object obj, int i2, zzgzs zzgzsVar);

    public abstract void zzh(Object obj, int i2, long j2);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzhdc zzhdcVar, int i2) throws IOException {
        int zzd = zzhdcVar.zzd();
        int i3 = zzd >>> 3;
        int i4 = zzd & 7;
        if (i4 == 0) {
            zzh(obj, i3, zzhdcVar.zzl());
            return true;
        }
        if (i4 == 1) {
            zze(obj, i3, zzhdcVar.zzk());
            return true;
        }
        if (i4 == 2) {
            zzg(obj, i3, zzhdcVar.zzp());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw new zzhbs("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i3, zzhdcVar.zzf());
            return true;
        }
        Object zzb = zzb();
        int i5 = i3 << 3;
        int i6 = i2 + 1;
        if (i6 >= zza) {
            throw new zzhbt("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzhdcVar.zzc() != Integer.MAX_VALUE && zzk(zzb, zzhdcVar, i6)) {
        }
        if ((i5 | 4) != zzhdcVar.zzd()) {
            throw new zzhbt("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i3, zzc(zzb));
        return true;
    }
}
