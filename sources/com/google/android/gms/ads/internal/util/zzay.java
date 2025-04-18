package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzaps;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzaql;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzfsb;
import com.google.android.gms.internal.ads.zzfsc;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzay extends zzaqe {
    private final Context zzb;

    private zzay(Context context, zzaqd zzaqdVar) {
        super(zzaqdVar);
        this.zzb = context;
    }

    public static zzaps zzb(Context context) {
        zzaps zzapsVar = new zzaps(new zzaql(new File(zzfsc.zza(zzfsb.zza(), context.getCacheDir(), "admob_volley")), 20971520), new zzay(context, new zzaqq(null, null)), 4);
        zzapsVar.zzd();
        return zzapsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqe, com.google.android.gms.internal.ads.zzapi
    public final zzapl zza(zzapp zzappVar) throws zzapy {
        if (zzappVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzew), zzappVar.zzk())) {
                Context context = this.zzb;
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzt(context, 13400000)) {
                    zzapl zza = new zzblo(this.zzb).zza(zzappVar);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzappVar.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzappVar.zzk())));
                }
            }
        }
        return super.zza(zzappVar);
    }
}
