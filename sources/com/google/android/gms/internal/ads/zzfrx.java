package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfrx {
    private final Context zza;
    private final Executor zzb;
    private final zzfre zzc;
    private final zzfrg zzd;
    private final zzfrw zze;
    private final zzfrw zzf;
    private Task zzg;
    private Task zzh;

    public zzfrx(Context context, Executor executor, zzfre zzfreVar, zzfrg zzfrgVar, zzfru zzfruVar, zzfrv zzfrvVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfreVar;
        this.zzd = zzfrgVar;
        this.zze = zzfruVar;
        this.zzf = zzfrvVar;
    }

    public static zzfrx zze(@NonNull Context context, @NonNull Executor executor, @NonNull zzfre zzfreVar, @NonNull zzfrg zzfrgVar) {
        final zzfrx zzfrxVar = new zzfrx(context, executor, zzfreVar, zzfrgVar, new zzfru(), new zzfrv());
        if (zzfrxVar.zzd.zzd()) {
            zzfrxVar.zzg = zzfrxVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfrr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzfrx.this.zzc();
                }
            });
        } else {
            zzfrxVar.zzg = Tasks.forResult(zzfrxVar.zze.zza());
        }
        zzfrxVar.zzh = zzfrxVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfrs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfrx.this.zzd();
            }
        });
        return zzfrxVar;
    }

    private static zzaus zzg(@NonNull Task task, @NonNull zzaus zzausVar) {
        if (!task.isSuccessful()) {
            return zzausVar;
        }
        return (zzaus) task.getResult();
    }

    private final Task zzh(@NonNull Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfrt
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzfrx.this.zzf(exc);
            }
        });
    }

    public final zzaus zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzaus zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    public final /* synthetic */ zzaus zzc() throws Exception {
        zzatp zza = zzaus.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zza.zzt(id);
            zza.zzs(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza.zzu(zzatx.DEVICE_IDENTIFIER_ANDROID_AD_ID);
        }
        return (zzaus) zza.zzbr();
    }

    public final /* synthetic */ zzaus zzd() throws Exception {
        Context context = this.zza;
        return zzfrm.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
