package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzfnp implements zzfns {
    private static final zzfnp zza = new zzfnp(new zzfnt());
    private Date zzb;
    private boolean zzc;
    private final zzfnt zzd;
    private boolean zze;

    private zzfnp(zzfnt zzfntVar) {
        this.zzd = zzfntVar;
    }

    public static zzfnp zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfns
    public final void zzc(boolean z10) {
        if (!this.zze && z10) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    Iterator it = zzfnr.zza().zzb().iterator();
                    while (it.hasNext()) {
                        ((zzfna) it.next()).zzg().zzg(zzb());
                    }
                }
            }
        }
        this.zze = z10;
    }

    public final void zzd(@NonNull Context context) {
        if (!this.zzc) {
            this.zzd.zzd(context);
            this.zzd.zze(this);
            this.zzd.zzf();
            this.zze = this.zzd.zza;
            this.zzc = true;
        }
    }
}
