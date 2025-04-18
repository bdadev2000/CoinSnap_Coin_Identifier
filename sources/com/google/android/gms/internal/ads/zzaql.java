package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class zzaql implements zzaoz {
    private final zzaqk zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaql(zzaqk zzaqkVar, int i10) {
        this.zzc = zzaqkVar;
    }

    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    public static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    public static String zzh(zzaqj zzaqjVar) throws IOException {
        return new String(zzm(zzaqjVar, zzf(zzaqjVar)), "UTF-8");
    }

    public static void zzj(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    public static void zzk(OutputStream outputStream, long j3) throws IOException {
        outputStream.write((byte) j3);
        outputStream.write((byte) (j3 >>> 8));
        outputStream.write((byte) (j3 >>> 16));
        outputStream.write((byte) (j3 >>> 24));
        outputStream.write((byte) (j3 >>> 32));
        outputStream.write((byte) (j3 >>> 40));
        outputStream.write((byte) (j3 >>> 48));
        outputStream.write((byte) (j3 >>> 56));
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static byte[] zzm(zzaqj zzaqjVar, long j3) throws IOException {
        long zza = zzaqjVar.zza();
        if (j3 >= 0 && j3 <= zza) {
            int i10 = (int) j3;
            if (i10 == j3) {
                byte[] bArr = new byte[i10];
                new DataInputStream(zzaqjVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("streamToBytes length=", j3, ", maxLength=");
        o10.append(zza);
        throw new IOException(o10.toString());
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaqi zzaqiVar) {
        if (!this.zza.containsKey(str)) {
            this.zzb += zzaqiVar.zza;
        } else {
            this.zzb = (zzaqiVar.zza - ((zzaqi) this.zza.get(str)).zza) + this.zzb;
        }
        this.zza.put(str, zzaqiVar);
    }

    private final void zzp(String str) {
        zzaqi zzaqiVar = (zzaqi) this.zza.remove(str);
        if (zzaqiVar != null) {
            this.zzb -= zzaqiVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final synchronized zzaoy zza(String str) {
        zzaqi zzaqiVar = (zzaqi) this.zza.get(str);
        if (zzaqiVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzaqj zzaqjVar = new zzaqj(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzaqi zza = zzaqi.zza(zzaqjVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzaqb.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzaqjVar, zzaqjVar.zza());
                zzaoy zzaoyVar = new zzaoy();
                zzaoyVar.zza = zzm;
                zzaoyVar.zzb = zzaqiVar.zzc;
                zzaoyVar.zzc = zzaqiVar.zzd;
                zzaoyVar.zzd = zzaqiVar.zze;
                zzaoyVar.zze = zzaqiVar.zzf;
                zzaoyVar.zzf = zzaqiVar.zzg;
                List<zzaph> list = zzaqiVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzaph zzaphVar : list) {
                    treeMap.put(zzaphVar.zza(), zzaphVar.zzb());
                }
                zzaoyVar.zzg = treeMap;
                zzaoyVar.zzh = Collections.unmodifiableList(zzaqiVar.zzh);
                return zzaoyVar;
            } finally {
                zzaqjVar.close();
            }
        } catch (IOException e2) {
            zzaqb.zza("%s: %s", zzg.getAbsolutePath(), e2.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final synchronized void zzb() {
        long length;
        zzaqj zzaqjVar;
        File zza = this.zzc.zza();
        if (!zza.exists()) {
            if (!zza.mkdirs()) {
                zzaqb.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
            }
        } else {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        length = file.length();
                        zzaqjVar = new zzaqj(new BufferedInputStream(new FileInputStream(file)), length);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        zzaqi zza2 = zzaqi.zza(zzaqjVar);
                        zza2.zza = length;
                        zzo(zza2.zzb, zza2);
                        zzaqjVar.close();
                    } catch (Throwable th2) {
                        zzaqjVar.close();
                        throw th2;
                        break;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final synchronized void zzc(String str, boolean z10) {
        zzaoy zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final synchronized void zzd(String str, zzaoy zzaoyVar) {
        long j3 = this.zzb;
        int length = zzaoyVar.zza.length;
        long j10 = j3 + length;
        int i10 = this.zzd;
        if (j10 <= i10 || length <= i10 * 0.9f) {
            File zzg = zzg(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
                zzaqi zzaqiVar = new zzaqi(str, zzaoyVar);
                try {
                    zzj(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzaqiVar.zzb);
                    String str2 = zzaqiVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzk(bufferedOutputStream, zzaqiVar.zzd);
                    zzk(bufferedOutputStream, zzaqiVar.zze);
                    zzk(bufferedOutputStream, zzaqiVar.zzf);
                    zzk(bufferedOutputStream, zzaqiVar.zzg);
                    List<zzaph> list = zzaqiVar.zzh;
                    if (list != null) {
                        zzj(bufferedOutputStream, list.size());
                        for (zzaph zzaphVar : list) {
                            zzl(bufferedOutputStream, zzaphVar.zza());
                            zzl(bufferedOutputStream, zzaphVar.zzb());
                        }
                    } else {
                        zzj(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzaoyVar.zza);
                    bufferedOutputStream.close();
                    zzaqiVar.zza = zzg.length();
                    zzo(str, zzaqiVar);
                    if (this.zzb >= this.zzd) {
                        if (zzaqb.zzb) {
                            zzaqb.zzd("Pruning old cache entries.", new Object[0]);
                        }
                        long j11 = this.zzb;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.zza.entrySet().iterator();
                        int i11 = 0;
                        while (it.hasNext()) {
                            zzaqi zzaqiVar2 = (zzaqi) ((Map.Entry) it.next()).getValue();
                            if (zzg(zzaqiVar2.zzb).delete()) {
                                this.zzb -= zzaqiVar2.zza;
                            } else {
                                String str3 = zzaqiVar2.zzb;
                                zzaqb.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i11++;
                            if (((float) this.zzb) < this.zzd * 0.9f) {
                                break;
                            }
                        }
                        if (zzaqb.zzb) {
                            zzaqb.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.zzb - j11), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        }
                    }
                } catch (IOException e2) {
                    zzaqb.zza("%s", e2.toString());
                    bufferedOutputStream.close();
                    zzaqb.zza("Failed to write header for %s", zzg.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!zzg.delete()) {
                    zzaqb.zza("Could not clean up file %s", zzg.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzaqb.zza("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzb();
                }
            }
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (!delete) {
            zzaqb.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
        }
    }

    public zzaql(File file, int i10) {
        this.zzc = new zzaqh(this, file);
    }
}
