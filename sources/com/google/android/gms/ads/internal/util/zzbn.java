package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzaox;
import com.google.android.gms.internal.ads.zzaps;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcao;
import java.util.Map;
import ua.b;

/* loaded from: classes3.dex */
public final class zzbn {
    private static zzaps zza;
    private static final Object zzb = new Object();

    public zzbn(Context context) {
        zzaps zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            if (zza == null) {
                zzbcn.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzev)).booleanValue()) {
                        zza2 = zzay.zzb(context);
                        zza = zza2;
                    }
                }
                zza2 = zzaqw.zza(context, null);
                zza = zza2;
            }
        }
    }

    public final b zza(String str) {
        zzcao zzcaoVar = new zzcao();
        zza.zza(new zzbl(str, null, zzcaoVar));
        return zzcaoVar;
    }

    public final b zzb(int i10, String str, @Nullable Map map, @Nullable byte[] bArr) {
        zzbj zzbjVar = new zzbj(null);
        zzbh zzbhVar = new zzbh(this, str, zzbjVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbi zzbiVar = new zzbi(this, i10, str, zzbjVar, zzbhVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            try {
                zzlVar.zzd(str, "GET", zzbiVar.zzl(), zzbiVar.zzx());
            } catch (zzaox e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj(e2.getMessage());
            }
        }
        zza.zza(zzbiVar);
        return zzbjVar;
    }
}
