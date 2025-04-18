package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzblt implements zzapv {
    private volatile zzblg zza;
    private final Context zzb;

    public zzblt(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzblt zzbltVar) {
        if (zzbltVar.zza == null) {
            return;
        }
        zzbltVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzapv
    @Nullable
    public final zzapy zza(zzaqc zzaqcVar) throws zzaql {
        Parcelable.Creator<zzblh> creator = zzblh.CREATOR;
        Map zzl = zzaqcVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i3] = (String) entry.getKey();
            strArr2[i3] = (String) entry.getValue();
            i3++;
        }
        zzblh zzblhVar = new zzblh(zzaqcVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        try {
            zzcas zzcasVar = new zzcas();
            this.zza = new zzblg(this.zzb, com.google.android.gms.ads.internal.zzu.zzt().zzb(), new zzblr(this, zzcasVar), new zzbls(this, zzcasVar));
            this.zza.checkAvailabilityAndConnect();
            zzblp zzblpVar = new zzblp(this, zzblhVar);
            zzgfz zzgfzVar = zzcan.zza;
            ListenableFuture zzo = zzgfo.zzo(zzgfo.zzn(zzcasVar, zzblpVar, zzgfzVar), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeq)).intValue(), TimeUnit.MILLISECONDS, zzcan.zzd);
            zzo.addListener(new zzblq(this), zzgfzVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            zzblj zzbljVar = (zzblj) new zzbvy(parcelFileDescriptor).zza(zzblj.CREATOR);
            if (zzbljVar == null) {
                return null;
            }
            if (zzbljVar.zza) {
                throw new zzaql(zzbljVar.zzb);
            }
            if (zzbljVar.zze.length != zzbljVar.zzf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbljVar.zze;
                if (i2 >= strArr3.length) {
                    return new zzapy(zzbljVar.zzc, zzbljVar.zzd, hashMap, zzbljVar.zzg, zzbljVar.zzh);
                }
                hashMap.put(strArr3[i2], zzbljVar.zzf[i2]);
                i2++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
