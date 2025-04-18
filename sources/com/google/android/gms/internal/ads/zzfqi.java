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

/* loaded from: classes3.dex */
public final class zzfqi {
    private final Context zza;
    private final Executor zzb;
    private final zzfpp zzc;
    private final zzfpr zzd;
    private final zzfqh zze;
    private final zzfqh zzf;
    private Task zzg;
    private Task zzh;

    public zzfqi(Context context, Executor executor, zzfpp zzfppVar, zzfpr zzfprVar, zzfqf zzfqfVar, zzfqg zzfqgVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfppVar;
        this.zzd = zzfprVar;
        this.zze = zzfqfVar;
        this.zzf = zzfqgVar;
    }

    public static zzfqi zze(@NonNull Context context, @NonNull Executor executor, @NonNull zzfpp zzfppVar, @NonNull zzfpr zzfprVar) {
        final zzfqi zzfqiVar = new zzfqi(context, executor, zzfppVar, zzfprVar, new zzfqf(), new zzfqg());
        if (zzfqiVar.zzd.zzh()) {
            zzfqiVar.zzg = zzfqiVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfqc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzfqi.this.zzc();
                }
            });
        } else {
            zzfqiVar.zzg = Tasks.forResult(zzfqiVar.zze.zza());
        }
        zzfqiVar.zzh = zzfqiVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfqd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfqi.this.zzd();
            }
        });
        return zzfqiVar;
    }

    private static zzata zzg(@NonNull Task task, @NonNull zzata zzataVar) {
        if (!task.isSuccessful()) {
            return zzataVar;
        }
        return (zzata) task.getResult();
    }

    private final Task zzh(@NonNull Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfqe
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzfqi.this.zzf(exc);
            }
        });
    }

    public final zzata zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzata zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    public final /* synthetic */ zzata zzc() throws Exception {
        zzasf zza = zzata.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
        String id2 = advertisingIdInfo.getId();
        if (id2 != null && id2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id2);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id2 = Base64.encodeToString(bArr, 11);
        }
        if (id2 != null) {
            zza.zzs(id2);
            zza.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza.zzab(6);
        }
        return (zzata) zza.zzbr();
    }

    public final /* synthetic */ zzata zzd() throws Exception {
        Context context = this.zza;
        return zzfpx.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
