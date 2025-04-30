package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzasl;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzccn;
import f4.c;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbq {
    private static zzarh zzb;
    private static final Object zzc = new Object();

    @Deprecated
    public static final zzbl zza = new zzbi();

    public zzbq(Context context) {
        zzarh zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            try {
                if (zzb == null) {
                    zzbep.zza(context);
                    if (!ClientLibraryUtils.isPackageSide()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzew)).booleanValue()) {
                            zza2 = zzaz.zzb(context);
                            zzb = zza2;
                        }
                    }
                    zza2 = zzasl.zza(context, null);
                    zzb = zza2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c zza(String str) {
        zzccn zzccnVar = new zzccn();
        zzb.zza(new zzbp(str, null, zzccnVar));
        return zzccnVar;
    }

    public final c zzb(int i9, String str, @Nullable Map map, @Nullable byte[] bArr) {
        zzbn zzbnVar = new zzbn(null);
        zzbj zzbjVar = new zzbj(this, str, zzbnVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbk zzbkVar = new zzbk(this, i9, str, zzbnVar, zzbjVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            try {
                zzlVar.zzd(str, "GET", zzbkVar.zzl(), zzbkVar.zzx());
            } catch (zzaqm e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj(e4.getMessage());
            }
        }
        zzb.zza(zzbkVar);
        return zzbnVar;
    }
}
