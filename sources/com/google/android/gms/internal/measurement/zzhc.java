package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import com.bumptech.glide.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhc implements zzhb {
    private static zzhc zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzhc() {
        this.zzb = null;
        this.zzc = null;
    }

    public static zzhc zza(Context context) {
        zzhc zzhcVar;
        synchronized (zzhc.class) {
            if (zza == null) {
                zza = e.n(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzhc(context) : new zzhc();
            }
            zzhcVar = zza;
        }
        return zzhcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzhb
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zza(final String str) {
        Context context = this.zzb;
        if (context != null && !zzgs.zza(context)) {
            try {
                return (String) zzha.zza(new zzhd() { // from class: com.google.android.gms.internal.measurement.zzhf
                    @Override // com.google.android.gms.internal.measurement.zzhd
                    public final Object zza() {
                        return zzhc.this.zzb(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e2) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e2);
            }
        }
        return null;
    }

    public final /* synthetic */ String zzb(String str) {
        return zzgj.zza(this.zzb.getContentResolver(), str, null);
    }

    private zzhc(Context context) {
        this.zzb = context;
        zzhe zzheVar = new zzhe(this, null);
        this.zzc = zzheVar;
        context.getContentResolver().registerContentObserver(zzgi.zza, true, zzheVar);
    }

    public static synchronized void zza() {
        Context context;
        synchronized (zzhc.class) {
            zzhc zzhcVar = zza;
            if (zzhcVar != null && (context = zzhcVar.zzb) != null && zzhcVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }
}
