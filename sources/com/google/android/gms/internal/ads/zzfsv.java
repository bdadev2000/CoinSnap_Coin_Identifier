package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class zzfsv {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfsc zze;
    private boolean zzf;

    public zzfsv(@NonNull Context context, @NonNull int i2, @NonNull zzfsc zzfscVar, boolean z2) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i2 - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfscVar;
        this.zzf = z2;
    }

    private final File zze(@NonNull String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(@NonNull zzayh zzayhVar) {
        zzayj zze = zzayk.zze();
        zze.zze(zzayhVar.zzd().zzk());
        zze.zza(zzayhVar.zzd().zzj());
        zze.zzb(zzayhVar.zzd().zza());
        zze.zzd(zzayhVar.zzd().zzd());
        zze.zzc(zzayhVar.zzd().zzc());
        return Hex.bytesToStringLowercase(((zzayk) zze.zzbr()).zzaV());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i2, long j2) {
        this.zze.zza(i2, j2);
    }

    private final void zzj(int i2, long j2, String str) {
        this.zze.zzb(i2, j2, str);
    }

    @Nullable
    private final zzayk zzk(int i2) {
        String string = i2 == 1 ? this.zzc.getString(zzh(), null) : this.zzc.getString(zzg(), null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzgzs zzgzsVar = zzgzs.zzb;
            return zzayk.zzi(zzgzs.zzv(stringToBytes, 0, stringToBytes.length), this.zzf ? zzhao.zza() : zzhao.zzb());
        } catch (zzhbt unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(@NonNull zzayh zzayhVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                if (!zzfsp.zze(new File(zze(zzayhVar.zzd().zzk()), "pcbc"), zzayhVar.zze().zzA())) {
                    zzi(4020, currentTimeMillis);
                    return false;
                }
                String zzf = zzf(zzayhVar);
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

    public final boolean zzb(@NonNull zzayh zzayhVar, @Nullable zzfsu zzfsuVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzayk zzk = zzk(1);
                String zzk2 = zzayhVar.zzd().zzk();
                if (zzk != null && zzk.zzk().equals(zzk2)) {
                    zzi(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File zze = zze(zzk2);
                if (zze.exists()) {
                    boolean isDirectory = zze.isDirectory();
                    String str = AppEventsConstants.EVENT_PARAM_VALUE_YES;
                    if (true != isDirectory) {
                        str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                    }
                    boolean isFile = zze.isFile();
                    String str2 = AppEventsConstants.EVENT_PARAM_VALUE_YES;
                    if (true != isFile) {
                        str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                    }
                    zzj(4023, currentTimeMillis2, "d:" + str + ",f:" + str2);
                    zzi(4015, currentTimeMillis2);
                } else if (!zze.mkdirs()) {
                    boolean canWrite = zze.canWrite();
                    String str3 = AppEventsConstants.EVENT_PARAM_VALUE_YES;
                    if (true != canWrite) {
                        str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                    }
                    zzj(4024, currentTimeMillis2, "cw:".concat(str3));
                    zzi(4015, currentTimeMillis2);
                    return false;
                }
                File zze2 = zze(zzk2);
                File file = new File(zze2, "pcam.jar");
                File file2 = new File(zze2, "pcbc");
                if (!zzfsp.zze(file, zzayhVar.zzf().zzA())) {
                    zzi(4016, currentTimeMillis);
                    return false;
                }
                if (!zzfsp.zze(file2, zzayhVar.zze().zzA())) {
                    zzi(4017, currentTimeMillis);
                    return false;
                }
                if (zzfsuVar != null && !zzfsuVar.zza(file)) {
                    zzi(4018, currentTimeMillis);
                    zzfsp.zzd(zze2);
                    return false;
                }
                String zzf = zzf(zzayhVar);
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
                zzayk zzk3 = zzk(1);
                if (zzk3 != null) {
                    hashSet.add(zzk3.zzk());
                }
                zzayk zzk4 = zzk(2);
                if (zzk4 != null) {
                    hashSet.add(zzk4.zzk());
                }
                for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzfsp.zzd(file3);
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
    public final zzfsn zzc(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzayk zzk = zzk(1);
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
                return new zzfsn(zzk, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzayk zzk = zzk(1);
                if (zzk == null) {
                    zzi(4025, currentTimeMillis);
                    return false;
                }
                File zze = zze(zzk.zzk());
                if (!new File(zze, "pcam.jar").exists()) {
                    zzi(4026, currentTimeMillis);
                    return false;
                }
                if (new File(zze, "pcbc").exists()) {
                    zzi(5019, currentTimeMillis);
                    return true;
                }
                zzi(4027, currentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
