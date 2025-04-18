package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzaxq extends zzaxt {
    private final View zzh;

    public zzaxq(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11, View view) {
        super(zzawfVar, "gU8TtHMsoUkPWKRp4pchlMiybbWQk/XZmErfUYdY8xYZMhv+DT5EJrcXuMdR9TAB", "MCymTm++OZPusG19DHbi/CZ9AvqE5ZBPeRnjpDHc8+4=", zzasfVar, i10, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdx);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkE);
            zzawj zzawjVar = new zzawj((String) this.zze.invoke(null, this.zzh, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzasy zza = zzasz.zza();
            zza.zzb(zzawjVar.zza.longValue());
            zza.zzd(zzawjVar.zzb.longValue());
            zza.zze(zzawjVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzawjVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzawjVar.zzd.longValue());
            }
            this.zzd.zzY((zzasz) zza.zzbr());
        }
    }
}
