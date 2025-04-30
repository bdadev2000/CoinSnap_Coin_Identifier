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
import y.AbstractC2933a;

/* loaded from: classes2.dex */
public final class zzasa implements zzaqo {
    private final zzarz zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzasa(zzarz zzarzVar, int i9) {
        this.zzc = zzarzVar;
    }

    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    public static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    public static String zzh(zzary zzaryVar) throws IOException {
        return new String(zzm(zzaryVar, zzf(zzaryVar)), "UTF-8");
    }

    public static void zzj(OutputStream outputStream, int i9) throws IOException {
        outputStream.write(i9 & 255);
        outputStream.write((i9 >> 8) & 255);
        outputStream.write((i9 >> 16) & 255);
        outputStream.write((i9 >> 24) & 255);
    }

    public static void zzk(OutputStream outputStream, long j7) throws IOException {
        outputStream.write((byte) j7);
        outputStream.write((byte) (j7 >>> 8));
        outputStream.write((byte) (j7 >>> 16));
        outputStream.write((byte) (j7 >>> 24));
        outputStream.write((byte) (j7 >>> 32));
        outputStream.write((byte) (j7 >>> 40));
        outputStream.write((byte) (j7 >>> 48));
        outputStream.write((byte) (j7 >>> 56));
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static byte[] zzm(zzary zzaryVar, long j7) throws IOException {
        long zza = zzaryVar.zza();
        if (j7 >= 0 && j7 <= zza) {
            int i9 = (int) j7;
            if (i9 == j7) {
                byte[] bArr = new byte[i9];
                new DataInputStream(zzaryVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder a6 = AbstractC2933a.a("streamToBytes length=", j7, ", maxLength=");
        a6.append(zza);
        throw new IOException(a6.toString());
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzarx zzarxVar) {
        if (!this.zza.containsKey(str)) {
            this.zzb += zzarxVar.zza;
        } else {
            this.zzb = (zzarxVar.zza - ((zzarx) this.zza.get(str)).zza) + this.zzb;
        }
        this.zza.put(str, zzarxVar);
    }

    private final void zzp(String str) {
        zzarx zzarxVar = (zzarx) this.zza.remove(str);
        if (zzarxVar != null) {
            this.zzb -= zzarxVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final synchronized zzaqn zza(String str) {
        zzarx zzarxVar = (zzarx) this.zza.get(str);
        if (zzarxVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzary zzaryVar = new zzary(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzarx zza = zzarx.zza(zzaryVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzarq.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzaryVar, zzaryVar.zza());
                zzaqn zzaqnVar = new zzaqn();
                zzaqnVar.zza = zzm;
                zzaqnVar.zzb = zzarxVar.zzc;
                zzaqnVar.zzc = zzarxVar.zzd;
                zzaqnVar.zzd = zzarxVar.zze;
                zzaqnVar.zze = zzarxVar.zzf;
                zzaqnVar.zzf = zzarxVar.zzg;
                List<zzaqw> list = zzarxVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzaqw zzaqwVar : list) {
                    treeMap.put(zzaqwVar.zza(), zzaqwVar.zzb());
                }
                zzaqnVar.zzg = treeMap;
                zzaqnVar.zzh = Collections.unmodifiableList(zzarxVar.zzh);
                return zzaqnVar;
            } finally {
                zzaryVar.close();
            }
        } catch (IOException e4) {
            zzarq.zza("%s: %s", zzg.getAbsolutePath(), e4.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final synchronized void zzb() {
        long length;
        zzary zzaryVar;
        File zza = this.zzc.zza();
        if (!zza.exists()) {
            if (!zza.mkdirs()) {
                zzarq.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
            }
        } else {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        length = file.length();
                        zzaryVar = new zzary(new BufferedInputStream(new FileInputStream(file)), length);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        zzarx zza2 = zzarx.zza(zzaryVar);
                        zza2.zza = length;
                        zzo(zza2.zzb, zza2);
                        zzaryVar.close();
                    } catch (Throwable th) {
                        zzaryVar.close();
                        throw th;
                        break;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final synchronized void zzc(String str, boolean z8) {
        zzaqn zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final synchronized void zzd(String str, zzaqn zzaqnVar) {
        try {
            long j7 = this.zzb;
            int length = zzaqnVar.zza.length;
            long j9 = j7 + length;
            int i9 = this.zzd;
            if (j9 <= i9 || length <= i9 * 0.9f) {
                File zzg = zzg(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
                    zzarx zzarxVar = new zzarx(str, zzaqnVar);
                    try {
                        zzj(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzarxVar.zzb);
                        String str2 = zzarxVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzk(bufferedOutputStream, zzarxVar.zzd);
                        zzk(bufferedOutputStream, zzarxVar.zze);
                        zzk(bufferedOutputStream, zzarxVar.zzf);
                        zzk(bufferedOutputStream, zzarxVar.zzg);
                        List<zzaqw> list = zzarxVar.zzh;
                        if (list != null) {
                            zzj(bufferedOutputStream, list.size());
                            for (zzaqw zzaqwVar : list) {
                                zzl(bufferedOutputStream, zzaqwVar.zza());
                                zzl(bufferedOutputStream, zzaqwVar.zzb());
                            }
                        } else {
                            zzj(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzaqnVar.zza);
                        bufferedOutputStream.close();
                        zzarxVar.zza = zzg.length();
                        zzo(str, zzarxVar);
                        if (this.zzb >= this.zzd) {
                            if (zzarq.zzb) {
                                zzarq.zzd("Pruning old cache entries.", new Object[0]);
                            }
                            long j10 = this.zzb;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i10 = 0;
                            while (it.hasNext()) {
                                zzarx zzarxVar2 = (zzarx) ((Map.Entry) it.next()).getValue();
                                if (zzg(zzarxVar2.zzb).delete()) {
                                    this.zzb -= zzarxVar2.zza;
                                } else {
                                    String str3 = zzarxVar2.zzb;
                                    zzarq.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i10++;
                                if (((float) this.zzb) < this.zzd * 0.9f) {
                                    break;
                                }
                            }
                            if (zzarq.zzb) {
                                zzarq.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i10), Long.valueOf(this.zzb - j10), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e4) {
                        zzarq.zza("%s", e4.toString());
                        bufferedOutputStream.close();
                        zzarq.zza("Failed to write header for %s", zzg.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!zzg.delete()) {
                        zzarq.zza("Could not clean up file %s", zzg.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzarq.zza("Re-initializing cache after external clearing.", new Object[0]);
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
        if (!delete) {
            zzarq.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
        }
    }

    public zzasa(File file, int i9) {
        this.zzc = new zzarw(this, file);
    }
}
