package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbbs;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzbbl {
    private final zzbbr zza;
    private final zzbbs.zzt.zza zzb;
    private final boolean zzc;

    private zzbbl() {
        this.zzb = zzbbs.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbbr();
    }

    public static zzbbl zza() {
        return new zzbbl();
    }

    private final synchronized String zzd(int i10) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzah(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime()), Integer.valueOf(i10 - 1), Base64.encodeToString(this.zzb.zzbr().zzaV(), 3));
    }

    private final synchronized void zze(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfsc.zza(zzfsb.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzd(i10).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
                throw th2;
            }
        } catch (FileNotFoundException unused5) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i10) {
        zzbbs.zzt.zza zzaVar = this.zzb;
        zzaVar.zzq();
        zzaVar.zzj(com.google.android.gms.ads.internal.util.zzs.zzd());
        zzbbp zzbbpVar = new zzbbp(this.zza, this.zzb.zzbr().zzaV(), null);
        int i11 = i10 - 1;
        zzbbpVar.zza(i11);
        zzbbpVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    public final synchronized void zzb(zzbbk zzbbkVar) {
        if (this.zzc) {
            try {
                zzbbkVar.zza(this.zzb);
            } catch (NullPointerException e2) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i10) {
        if (!this.zzc) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeW)).booleanValue()) {
            zze(i10);
        } else {
            zzf(i10);
        }
    }

    public zzbbl(zzbbr zzbbrVar) {
        this.zzb = zzbbs.zzt.zzj();
        this.zza = zzbbrVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeV)).booleanValue();
    }
}
