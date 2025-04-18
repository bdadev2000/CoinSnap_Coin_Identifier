package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class zzdef extends zzdcc implements zzaym {
    private final Map zzb;
    private final Context zzc;
    private final zzfet zzd;

    public zzdef(Context context, Set set, zzfet zzfetVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfetVar;
    }

    public final synchronized void zza(View view) {
        zzayn zzaynVar = (zzayn) this.zzb.get(view);
        if (zzaynVar == null) {
            zzayn zzaynVar2 = new zzayn(this.zzc, view);
            zzaynVar2.zzc(this);
            this.zzb.put(view, zzaynVar2);
            zzaynVar = zzaynVar2;
        }
        if (this.zzd.zzX) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbv)).booleanValue()) {
                zzaynVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbu)).longValue());
                return;
            }
        }
        zzaynVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzayn) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final synchronized void zzdp(final zzayl zzaylVar) {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdee
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzaym) obj).zzdp(zzayl.this);
            }
        });
    }
}
