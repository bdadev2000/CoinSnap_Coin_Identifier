package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzblo implements zzapi {
    private volatile zzblb zza;
    private final Context zzb;

    public zzblo(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzblo zzbloVar) {
        if (zzbloVar.zza == null) {
            return;
        }
        zzbloVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzapi
    @Nullable
    public final zzapl zza(zzapp zzappVar) throws zzapy {
        Parcelable.Creator<zzblc> creator = zzblc.CREATOR;
        Map zzl = zzappVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i11] = (String) entry.getKey();
            strArr2[i11] = (String) entry.getValue();
            i11++;
        }
        zzblc zzblcVar = new zzblc(zzappVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        try {
            zzcao zzcaoVar = new zzcao();
            this.zza = new zzblb(this.zzb, com.google.android.gms.ads.internal.zzv.zzu().zzb(), new zzblm(this, zzcaoVar), new zzbln(this, zzcaoVar));
            this.zza.checkAvailabilityAndConnect();
            zzblk zzblkVar = new zzblk(this, zzblcVar);
            zzges zzgesVar = zzcaj.zza;
            ua.b zzo = zzgei.zzo(zzgei.zzn(zzcaoVar, zzblkVar, zzgesVar), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzex)).intValue(), TimeUnit.MILLISECONDS, zzcaj.zzd);
            zzo.addListener(new zzbll(this), zzgesVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - elapsedRealtime) + "ms");
            zzble zzbleVar = (zzble) new zzbvv(parcelFileDescriptor).zza(zzble.CREATOR);
            if (zzbleVar == null) {
                return null;
            }
            if (!zzbleVar.zza) {
                if (zzbleVar.zze.length != zzbleVar.zzf.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbleVar.zze;
                    if (i10 < strArr3.length) {
                        hashMap.put(strArr3[i10], zzbleVar.zzf[i10]);
                        i10++;
                    } else {
                        return new zzapl(zzbleVar.zzc, zzbleVar.zzd, hashMap, zzbleVar.zzg, zzbleVar.zzh);
                    }
                }
            } else {
                throw new zzapy(zzbleVar.zzb);
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th2;
        }
    }
}
