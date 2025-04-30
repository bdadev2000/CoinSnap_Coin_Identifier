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

/* loaded from: classes2.dex */
public final class zzbnm implements zzaqx {
    private volatile zzbmz zza;
    private final Context zzb;

    public zzbnm(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzbnm zzbnmVar) {
        if (zzbnmVar.zza == null) {
            return;
        }
        zzbnmVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    @Nullable
    public final zzara zza(zzare zzareVar) throws zzarn {
        Parcelable.Creator<zzbna> creator = zzbna.CREATOR;
        Map zzl = zzareVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i9 = 0;
        int i10 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i10] = (String) entry.getKey();
            strArr2[i10] = (String) entry.getValue();
            i10++;
        }
        zzbna zzbnaVar = new zzbna(zzareVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        try {
            zzccn zzccnVar = new zzccn();
            this.zza = new zzbmz(this.zzb, com.google.android.gms.ads.internal.zzu.zzt().zzb(), new zzbnk(this, zzccnVar), new zzbnl(this, zzccnVar));
            this.zza.checkAvailabilityAndConnect();
            zzbni zzbniVar = new zzbni(this, zzbnaVar);
            zzgge zzggeVar = zzcci.zza;
            f4.c zzo = zzgft.zzo(zzgft.zzn(zzccnVar, zzbniVar, zzggeVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzey)).intValue(), TimeUnit.MILLISECONDS, zzcci.zzd);
            zzo.addListener(new zzbnj(this), zzggeVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            zzbnc zzbncVar = (zzbnc) new zzbxs(parcelFileDescriptor).zza(zzbnc.CREATOR);
            if (zzbncVar == null) {
                return null;
            }
            if (!zzbncVar.zza) {
                if (zzbncVar.zze.length != zzbncVar.zzf.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbncVar.zze;
                    if (i9 < strArr3.length) {
                        hashMap.put(strArr3[i9], zzbncVar.zzf[i9]);
                        i9++;
                    } else {
                        return new zzara(zzbncVar.zzc, zzbncVar.zzd, hashMap, zzbncVar.zzg, zzbncVar.zzh);
                    }
                }
            } else {
                throw new zzarn(zzbncVar.zzb);
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
