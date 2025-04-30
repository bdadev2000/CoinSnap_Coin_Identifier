package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzayo extends zzazs {
    private final Activity zzi;
    private final View zzj;

    public zzayo(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10, View view, Activity activity) {
        super(zzayeVar, "GC4CZUnPsyUcm5NrWw7C8gSktjb/gtBCDrSKBLlqImuOnQy7zHyo6XlIzkH3EMVH", "Kx8fghNUQq+sA+EfmK6qh0KjuKvw753ECuaCFV8szVM=", zzatpVar, i9, 62);
        this.zzj = view;
        this.zzi = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzj == null) {
            return;
        }
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcC);
        boolean booleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zzf.invoke(null, this.zzj, this.zzi, bool);
        synchronized (this.zze) {
            try {
                this.zze.zzc(((Long) objArr[0]).longValue());
                this.zze.zze(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.zze.zzd((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
