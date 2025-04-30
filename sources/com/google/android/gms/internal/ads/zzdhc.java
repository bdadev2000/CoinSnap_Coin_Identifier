package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zzdhc extends zzdez implements zzban {
    private final Map zzb;
    private final Context zzc;
    private final zzfgt zzd;

    public zzdhc(Context context, Set set, zzfgt zzfgtVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfgtVar;
    }

    public final synchronized void zza(View view) {
        try {
            zzbao zzbaoVar = (zzbao) this.zzb.get(view);
            if (zzbaoVar == null) {
                zzbao zzbaoVar2 = new zzbao(this.zzc, view);
                zzbaoVar2.zzc(this);
                this.zzb.put(view, zzbaoVar2);
                zzbaoVar = zzbaoVar2;
            }
            if (this.zzd.zzY) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbp)).booleanValue()) {
                    zzbaoVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbo)).longValue());
                    return;
                }
            }
            zzbaoVar.zzf();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzbao) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final synchronized void zzdp(final zzbam zzbamVar) {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdhb
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzban) obj).zzdp(zzbam.this);
            }
        });
    }
}
