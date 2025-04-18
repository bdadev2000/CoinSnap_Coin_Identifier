package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class zzfrl {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfqs zze;
    private boolean zzf;

    public zzfrl(@NonNull Context context, @NonNull int i10, @NonNull zzfqs zzfqsVar, boolean z10) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i10 - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfqsVar;
        this.zzf = z10;
    }

    private final File zze(@NonNull String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(@NonNull zzaxy zzaxyVar) {
        zzaxz zzd = zzayb.zzd();
        zzd.zze(zzaxyVar.zzc().zzk());
        zzd.zza(zzaxyVar.zzc().zzj());
        zzd.zzb(zzaxyVar.zzc().zza());
        zzd.zzd(zzaxyVar.zzc().zzc());
        zzd.zzc(zzaxyVar.zzc().zzb());
        return Hex.bytesToStringLowercase(((zzayb) zzd.zzbr()).zzaV());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i10, long j3) {
        this.zze.zza(i10, j3);
    }

    private final void zzj(int i10, long j3, String str) {
        this.zze.zzb(i10, j3, str);
    }

    @Nullable
    private final zzayb zzk(int i10) {
        String string;
        zzgyh zzb;
        if (i10 == 1) {
            string = this.zzc.getString(zzh(), null);
        } else {
            string = this.zzc.getString(zzg(), null);
        }
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzgxp zzgxpVar = zzgxp.zzb;
            zzgxp zzv = zzgxp.zzv(stringToBytes, 0, stringToBytes.length);
            if (this.zzf) {
                zzb = zzgyh.zza();
            } else {
                zzb = zzgyh.zzb();
            }
            return zzayb.zzi(zzv, zzb);
        } catch (zzgzm unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(@NonNull zzaxy zzaxyVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            if (!zzfrf.zze(new File(zze(zzaxyVar.zzc().zzk()), "pcbc"), zzaxyVar.zzd().zzA())) {
                zzi(4020, currentTimeMillis);
                return false;
            }
            String zzf = zzf(zzaxyVar);
            SharedPreferences.Editor edit = this.zzc.edit();
            edit.putString(zzh(), zzf);
            boolean commit = edit.commit();
            if (commit) {
                zzi(5015, currentTimeMillis);
            } else {
                zzi(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final boolean zzb(@NonNull zzaxy zzaxyVar, @Nullable zzfrk zzfrkVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzayb zzk = zzk(1);
            String zzk2 = zzaxyVar.zzc().zzk();
            if (zzk != null && zzk.zzk().equals(zzk2)) {
                zzi(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File zze = zze(zzk2);
            if (zze.exists()) {
                String str = "1";
                if (true != zze.isDirectory()) {
                    str = "0";
                }
                String str2 = "1";
                if (true != zze.isFile()) {
                    str2 = "0";
                }
                zzj(4023, currentTimeMillis2, "d:" + str + ",f:" + str2);
                zzi(4015, currentTimeMillis2);
            } else if (!zze.mkdirs()) {
                String str3 = "1";
                if (true != zze.canWrite()) {
                    str3 = "0";
                }
                zzj(4024, currentTimeMillis2, "cw:".concat(str3));
                zzi(4015, currentTimeMillis2);
                return false;
            }
            File zze2 = zze(zzk2);
            File file = new File(zze2, "pcam.jar");
            File file2 = new File(zze2, "pcbc");
            if (!zzfrf.zze(file, zzaxyVar.zzf().zzA())) {
                zzi(4016, currentTimeMillis);
                return false;
            }
            if (!zzfrf.zze(file2, zzaxyVar.zzd().zzA())) {
                zzi(4017, currentTimeMillis);
                return false;
            }
            if (zzfrkVar != null && !zzfrkVar.zza(file)) {
                zzi(4018, currentTimeMillis);
                zzfrf.zzd(zze2);
                return false;
            }
            String zzf = zzf(zzaxyVar);
            long currentTimeMillis3 = System.currentTimeMillis();
            String string = this.zzc.getString(zzh(), null);
            SharedPreferences.Editor edit = this.zzc.edit();
            edit.putString(zzh(), zzf);
            if (string != null) {
                edit.putString(zzg(), string);
            }
            if (!edit.commit()) {
                zzi(4019, currentTimeMillis3);
                return false;
            }
            HashSet hashSet = new HashSet();
            zzayb zzk3 = zzk(1);
            if (zzk3 != null) {
                hashSet.add(zzk3.zzk());
            }
            zzayb zzk4 = zzk(2);
            if (zzk4 != null) {
                hashSet.add(zzk4.zzk());
            }
            for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    zzfrf.zzd(file3);
                }
            }
            zzi(5014, currentTimeMillis);
            return true;
        }
    }

    @Nullable
    public final zzfrd zzc(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzayb zzk = zzk(1);
            if (zzk == null) {
                zzi(4022, currentTimeMillis);
                return null;
            }
            File zze = zze(zzk.zzk());
            File file = new File(zze, "pcam.jar");
            if (!file.exists()) {
                file = new File(zze, "pcam");
            }
            File file2 = new File(zze, "pcbc");
            File file3 = new File(zze, "pcopt");
            zzi(5016, currentTimeMillis);
            return new zzfrd(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzayb zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            File zze = zze(zzk.zzk());
            if (!new File(zze, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            }
            if (!new File(zze, "pcbc").exists()) {
                zzi(4027, currentTimeMillis);
                return false;
            }
            zzi(5019, currentTimeMillis);
            return true;
        }
    }
}
