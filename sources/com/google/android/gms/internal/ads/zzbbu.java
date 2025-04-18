package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbcb;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class zzbbu {
    private final zzbca zza;
    private final zzbcb.zzt.zza zzb;
    private final boolean zzc;

    private zzbbu() {
        this.zzb = zzbcb.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbca();
    }

    public static zzbbu zza() {
        return new zzbbu();
    }

    private final synchronized String zzd(int i2) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzah(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime()), Integer.valueOf(i2 - 1), Base64.encodeToString(this.zzb.zzbr().zzaV(), 3));
    }

    private final synchronized void zze(int i2) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzftm.zza(zzftl.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzd(i2).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                    throw th;
                }
            } catch (IOException unused3) {
                com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused5) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i2) {
        zzbcb.zzt.zza zzaVar = this.zzb;
        zzaVar.zzq();
        zzaVar.zzj(com.google.android.gms.ads.internal.util.zzt.zzd());
        zzbbz zzbbzVar = new zzbbz(this.zza, this.zzb.zzbr().zzaV(), null);
        int i3 = i2 - 1;
        zzbbzVar.zza(i3);
        zzbbzVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i3, 10))));
    }

    public final synchronized void zzb(zzbbt zzbbtVar) {
        if (this.zzc) {
            try {
                zzbbtVar.zza(this.zzb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i2) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeP)).booleanValue()) {
                zze(i2);
            } else {
                zzf(i2);
            }
        }
    }

    public zzbbu(zzbca zzbcaVar) {
        this.zzb = zzbcb.zzt.zzj();
        this.zza = zzbcaVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeO)).booleanValue();
    }
}
