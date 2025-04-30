package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import z2.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgs implements zzgn {
    private static zzgs zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzgs() {
        this.zzb = null;
        this.zzc = null;
    }

    public static zzgs zza(Context context) {
        zzgs zzgsVar;
        synchronized (zzgs.class) {
            try {
                if (zza == null) {
                    zza = i.e(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzgs(context) : new zzgs();
                }
                zzgsVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzgn
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zza(final String str) {
        Context context = this.zzb;
        if (context != null && !zzgi.zza(context)) {
            try {
                return (String) zzgq.zza(new zzgp() { // from class: com.google.android.gms.internal.measurement.zzgr
                    @Override // com.google.android.gms.internal.measurement.zzgp
                    public final Object zza() {
                        return zzgs.this.zzb(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e4) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e4);
            }
        }
        return null;
    }

    public final /* synthetic */ String zzb(String str) {
        return zzfv.zza(this.zzb.getContentResolver(), str, null);
    }

    private zzgs(Context context) {
        this.zzb = context;
        zzgu zzguVar = new zzgu(this, null);
        this.zzc = zzguVar;
        context.getContentResolver().registerContentObserver(zzfy.zza, true, zzguVar);
    }

    public static synchronized void zza() {
        Context context;
        synchronized (zzgs.class) {
            try {
                zzgs zzgsVar = zza;
                if (zzgsVar != null && (context = zzgsVar.zzb) != null && zzgsVar.zzc != null) {
                    context.getContentResolver().unregisterContentObserver(zza.zzc);
                }
                zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
