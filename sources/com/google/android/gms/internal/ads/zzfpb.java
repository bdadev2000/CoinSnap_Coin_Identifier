package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzfpb implements zzfpe {
    private static final zzfpb zza = new zzfpb(new zzfpf());
    private Date zzb;
    private boolean zzc;
    private final zzfpf zzd;
    private boolean zze;

    private zzfpb(zzfpf zzfpfVar) {
        this.zzd = zzfpfVar;
    }

    public static zzfpb zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final void zzc(boolean z2) {
        if (!this.zze && z2) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    Iterator it = zzfpd.zza().zzb().iterator();
                    while (it.hasNext()) {
                        ((zzfom) it.next()).zzg().zzg(zzb());
                    }
                }
            }
        }
        this.zze = z2;
    }

    public final void zzd(@NonNull Context context) {
        if (this.zzc) {
            return;
        }
        this.zzd.zzd(context);
        this.zzd.zze(this);
        this.zzd.zzf();
        this.zze = this.zzd.zza;
        this.zzc = true;
    }
}
