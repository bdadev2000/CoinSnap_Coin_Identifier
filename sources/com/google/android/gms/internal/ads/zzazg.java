package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzazg extends zzazs {
    public zzazg(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10) {
        super(zzayeVar, "WfvM4SeNDVyFarUKUVpVTE2MRQkjnaN4GpgwC5lMrmyQkCennlTSSkgCAZvzOVXK", "Kq6mcF8LH4HqXGyg5/DR3VvLtDExNTPXoCRIPhkdOGM=", zzatpVar, i9, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcI);
        bool.booleanValue();
        zzaxk zzaxkVar = new zzaxk((String) this.zzf.invoke(null, this.zzb.zzb(), bool));
        synchronized (this.zze) {
            this.zze.zzk(zzaxkVar.zza);
            this.zze.zzH(zzaxkVar.zzb);
        }
    }
}
