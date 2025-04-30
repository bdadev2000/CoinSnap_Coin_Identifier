package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzfpc implements zzfpf {
    private static final zzfpc zzb = new zzfpc(new zzfpg());
    protected final zzfqc zza = new zzfqc();
    private Date zzc;
    private boolean zzd;
    private final zzfpg zze;
    private boolean zzf;

    private zzfpc(zzfpg zzfpgVar) {
        this.zze = zzfpgVar;
    }

    public static zzfpc zza() {
        return zzb;
    }

    public final Date zzb() {
        Date date = this.zzc;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zzc(boolean z8) {
        if (!this.zzf && z8) {
            Date date = new Date();
            Date date2 = this.zzc;
            if (date2 == null || date.after(date2)) {
                this.zzc = date;
                if (this.zzd) {
                    Iterator it = zzfpe.zza().zzb().iterator();
                    while (it.hasNext()) {
                        ((zzfon) it.next()).zzg().zzg(zzb());
                    }
                }
            }
        }
        this.zzf = z8;
    }

    public final void zzd(@NonNull Context context) {
        if (!this.zzd) {
            this.zze.zzd(context);
            this.zze.zze(this);
            this.zze.zzf();
            this.zzf = this.zze.zza;
            this.zzd = true;
        }
    }
}
