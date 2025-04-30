package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzfte {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfsl zze;
    private boolean zzf;

    public zzfte(@NonNull Context context, @NonNull zzazw zzazwVar, @NonNull zzfsl zzfslVar, boolean z8) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(zzazwVar.zza());
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfslVar;
        this.zzf = z8;
    }

    private final File zze(@NonNull String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(@NonNull zzazz zzazzVar) {
        zzbab zze = zzbac.zze();
        zze.zze(zzazzVar.zzd().zzk());
        zze.zza(zzazzVar.zzd().zzj());
        zze.zzb(zzazzVar.zzd().zza());
        zze.zzd(zzazzVar.zzd().zzd());
        zze.zzc(zzazzVar.zzd().zzc());
        return Hex.bytesToStringLowercase(((zzbac) zze.zzbr()).zzaV());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i9, long j7) {
        this.zze.zza(i9, j7);
    }

    private final void zzj(int i9, long j7, String str) {
        this.zze.zzb(i9, j7, str);
    }

    @Nullable
    private final zzbac zzk(int i9) {
        String string;
        zzhay zzb;
        if (i9 == 1) {
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
            zzhac zzhacVar = zzhac.zzb;
            zzhac zzv = zzhac.zzv(stringToBytes, 0, stringToBytes.length);
            if (this.zzf) {
                zzb = zzhay.zza();
            } else {
                zzb = zzhay.zzb();
            }
            return zzbac.zzi(zzv, zzb);
        } catch (zzhcd unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(@NonNull zzazz zzazzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                if (!zzfsy.zze(new File(zze(zzazzVar.zzd().zzk()), "pcbc"), zzazzVar.zze().zzB())) {
                    zzi(4020, currentTimeMillis);
                    return false;
                }
                String zzf = zzf(zzazzVar);
                SharedPreferences.Editor edit = this.zzc.edit();
                edit.putString(zzh(), zzf);
                boolean commit = edit.commit();
                if (commit) {
                    zzi(5015, currentTimeMillis);
                } else {
                    zzi(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(@NonNull zzazz zzazzVar, @Nullable zzftd zzftdVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzbac zzk = zzk(1);
                String zzk2 = zzazzVar.zzd().zzk();
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
                if (!zzfsy.zze(file, zzazzVar.zzf().zzB())) {
                    zzi(4016, currentTimeMillis);
                    return false;
                }
                if (!zzfsy.zze(file2, zzazzVar.zze().zzB())) {
                    zzi(4017, currentTimeMillis);
                    return false;
                }
                if (zzftdVar != null && !zzftdVar.zza(file)) {
                    zzi(4018, currentTimeMillis);
                    zzfsy.zzd(zze2);
                    return false;
                }
                String zzf = zzf(zzazzVar);
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
                zzbac zzk3 = zzk(1);
                if (zzk3 != null) {
                    hashSet.add(zzk3.zzk());
                }
                zzbac zzk4 = zzk(2);
                if (zzk4 != null) {
                    hashSet.add(zzk4.zzk());
                }
                for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzfsy.zzd(file3);
                    }
                }
                zzi(5014, currentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final zzfsw zzc(int i9) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzbac zzk = zzk(1);
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
                return new zzfsw(zzk, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(int i9) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzbac zzk = zzk(1);
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
