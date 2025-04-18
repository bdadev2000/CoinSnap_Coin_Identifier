package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class zzaqy implements zzapm {
    private final zzaqx zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaqy(zzaqx zzaqxVar, int i2) {
        this.zzc = zzaqxVar;
    }

    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    public static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    public static String zzh(zzaqw zzaqwVar) throws IOException {
        return new String(zzm(zzaqwVar, zzf(zzaqwVar)), "UTF-8");
    }

    public static void zzj(OutputStream outputStream, int i2) throws IOException {
        outputStream.write(i2 & 255);
        outputStream.write((i2 >> 8) & 255);
        outputStream.write((i2 >> 16) & 255);
        outputStream.write((i2 >> 24) & 255);
    }

    public static void zzk(OutputStream outputStream, long j2) throws IOException {
        outputStream.write((byte) j2);
        outputStream.write((byte) (j2 >>> 8));
        outputStream.write((byte) (j2 >>> 16));
        outputStream.write((byte) (j2 >>> 24));
        outputStream.write((byte) (j2 >>> 32));
        outputStream.write((byte) (j2 >>> 40));
        outputStream.write((byte) (j2 >>> 48));
        outputStream.write((byte) (j2 >>> 56));
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    @VisibleForTesting
    public static byte[] zzm(zzaqw zzaqwVar, long j2) throws IOException {
        long zza = zzaqwVar.zza();
        if (j2 >= 0 && j2 <= zza) {
            int i2 = (int) j2;
            if (i2 == j2) {
                byte[] bArr = new byte[i2];
                new DataInputStream(zzaqwVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder r2 = androidx.compose.foundation.text.input.a.r("streamToBytes length=", j2, ", maxLength=");
        r2.append(zza);
        throw new IOException(r2.toString());
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaqv zzaqvVar) {
        if (this.zza.containsKey(str)) {
            this.zzb = (zzaqvVar.zza - ((zzaqv) this.zza.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzaqvVar.zza;
        }
        this.zza.put(str, zzaqvVar);
    }

    private final void zzp(String str) {
        zzaqv zzaqvVar = (zzaqv) this.zza.remove(str);
        if (zzaqvVar != null) {
            this.zzb -= zzaqvVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final synchronized zzapl zza(String str) {
        zzaqv zzaqvVar = (zzaqv) this.zza.get(str);
        if (zzaqvVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzaqw zzaqwVar = new zzaqw(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzaqv zza = zzaqv.zza(zzaqwVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzaqo.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzaqwVar, zzaqwVar.zza());
                zzapl zzaplVar = new zzapl();
                zzaplVar.zza = zzm;
                zzaplVar.zzb = zzaqvVar.zzc;
                zzaplVar.zzc = zzaqvVar.zzd;
                zzaplVar.zzd = zzaqvVar.zze;
                zzaplVar.zze = zzaqvVar.zzf;
                zzaplVar.zzf = zzaqvVar.zzg;
                List<zzapu> list = zzaqvVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzapu zzapuVar : list) {
                    treeMap.put(zzapuVar.zza(), zzapuVar.zzb());
                }
                zzaplVar.zzg = treeMap;
                zzaplVar.zzh = Collections.unmodifiableList(zzaqvVar.zzh);
                return zzaplVar;
            } finally {
                zzaqwVar.close();
            }
        } catch (IOException e) {
            zzaqo.zza("%s: %s", zzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final synchronized void zzb() {
        long length;
        zzaqw zzaqwVar;
        File zza = this.zzc.zza();
        if (zza.exists()) {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        length = file.length();
                        zzaqwVar = new zzaqw(new BufferedInputStream(new FileInputStream(file)), length);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        zzaqv zza2 = zzaqv.zza(zzaqwVar);
                        zza2.zza = length;
                        zzo(zza2.zzb, zza2);
                        zzaqwVar.close();
                    } catch (Throwable th) {
                        zzaqwVar.close();
                        throw th;
                        break;
                    }
                }
            }
        } else if (!zza.mkdirs()) {
            zzaqo.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final synchronized void zzc(String str, boolean z2) {
        zzapl zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final synchronized void zzd(String str, zzapl zzaplVar) {
        try {
            long j2 = this.zzb;
            int length = zzaplVar.zza.length;
            long j3 = j2 + length;
            int i2 = this.zzd;
            if (j3 <= i2 || length <= i2 * 0.9f) {
                File zzg = zzg(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(AdMobFilesBridge.fileOutputStreamCtor(zzg));
                    zzaqv zzaqvVar = new zzaqv(str, zzaplVar);
                    try {
                        zzj(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzaqvVar.zzb);
                        String str2 = zzaqvVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzk(bufferedOutputStream, zzaqvVar.zzd);
                        zzk(bufferedOutputStream, zzaqvVar.zze);
                        zzk(bufferedOutputStream, zzaqvVar.zzf);
                        zzk(bufferedOutputStream, zzaqvVar.zzg);
                        List<zzapu> list = zzaqvVar.zzh;
                        if (list != null) {
                            zzj(bufferedOutputStream, list.size());
                            for (zzapu zzapuVar : list) {
                                zzl(bufferedOutputStream, zzapuVar.zza());
                                zzl(bufferedOutputStream, zzapuVar.zzb());
                            }
                        } else {
                            zzj(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzaplVar.zza);
                        bufferedOutputStream.close();
                        zzaqvVar.zza = zzg.length();
                        zzo(str, zzaqvVar);
                        if (this.zzb >= this.zzd) {
                            if (zzaqo.zzb) {
                                zzaqo.zzd("Pruning old cache entries.", new Object[0]);
                            }
                            long j4 = this.zzb;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                zzaqv zzaqvVar2 = (zzaqv) ((Map.Entry) it.next()).getValue();
                                if (zzg(zzaqvVar2.zzb).delete()) {
                                    this.zzb -= zzaqvVar2.zza;
                                } else {
                                    String str3 = zzaqvVar2.zzb;
                                    zzaqo.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i3++;
                                if (((float) this.zzb) < this.zzd * 0.9f) {
                                    break;
                                }
                            }
                            if (zzaqo.zzb) {
                                zzaqo.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.zzb - j4), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        zzaqo.zza("%s", e.toString());
                        bufferedOutputStream.close();
                        zzaqo.zza("Failed to write header for %s", zzg.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!zzg.delete()) {
                        zzaqo.zza("Could not clean up file %s", zzg.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzaqo.zza("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzb();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (delete) {
            return;
        }
        zzaqo.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzaqy(File file, int i2) {
        this.zzc = new zzaqu(this, file);
    }
}
