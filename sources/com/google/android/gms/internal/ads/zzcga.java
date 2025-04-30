package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
final class zzcga extends zzgv implements zzhz {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzhy zzh;
    private zzhh zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set zzs;

    public zzcga(String str, zzie zzieVar, int i9, int i10, int i11) {
        super(true);
        this.zzd = new zzcfz(this);
        this.zzs = new HashSet();
        zzeq.zzc(str);
        this.zzg = str;
        this.zzh = new zzhy();
        this.zze = i9;
        this.zzf = i10;
        this.zzr = i11;
        if (zzieVar != null) {
            zzf(zzieVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unexpected error while disconnecting", e4);
            }
            this.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws zzhv {
        try {
            if (this.zzp != this.zzn) {
                byte[] bArr2 = (byte[]) zzc.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j7 = this.zzp;
                    long j9 = this.zzn;
                    if (j7 != j9) {
                        int read = this.zzk.read(bArr2, 0, (int) Math.min(j9 - j7, bArr2.length));
                        if (!Thread.interrupted()) {
                            if (read != -1) {
                                this.zzp += read;
                                zzg(read);
                            } else {
                                throw new EOFException();
                            }
                        } else {
                            throw new InterruptedIOException();
                        }
                    } else {
                        zzc.set(bArr2);
                        break;
                    }
                }
            }
            if (i10 == 0) {
                return 0;
            }
            long j10 = this.zzo;
            if (j10 != -1) {
                long j11 = j10 - this.zzq;
                if (j11 != 0) {
                    i10 = (int) Math.min(i10, j11);
                }
                return -1;
            }
            int read2 = this.zzk.read(bArr, i9, i10);
            if (read2 == -1) {
                if (this.zzo == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzq += read2;
            zzg(read2);
            return read2;
        } catch (IOException e4) {
            throw new zzhv(e4, this.zzi, 2000, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (r2 == 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023e A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x0040, B:10:0x0058, B:12:0x005e, B:19:0x0082, B:21:0x009c, B:22:0x00ae, B:23:0x00b3, B:25:0x00bc, B:26:0x00c3, B:39:0x00ee, B:100:0x0233, B:102:0x023e, B:104:0x024f, B:110:0x0258, B:111:0x0267, B:114:0x026f, B:115:0x0276, B:118:0x0277, B:119:0x028d), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x0040, B:10:0x0058, B:12:0x005e, B:19:0x0082, B:21:0x009c, B:22:0x00ae, B:23:0x00b3, B:25:0x00bc, B:26:0x00c3, B:39:0x00ee, B:100:0x0233, B:102:0x023e, B:104:0x024f, B:110:0x0258, B:111:0x0267, B:114:0x026f, B:115:0x0276, B:118:0x0277, B:119:0x028d), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c0  */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzhh r21) throws com.google.android.gms.internal.ads.zzhv {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcga.zzb(com.google.android.gms.internal.ads.zzhh):long");
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhv {
        try {
            InputStream inputStream = this.zzk;
            if (inputStream != null) {
                int i9 = zzgd.zza;
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    throw new zzhv(e4, this.zzi, 2000, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzn();
            if (this.zzl) {
                this.zzl = false;
                zzh();
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgv, com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int i9) {
        this.zzr = i9;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to update receive buffer size.", e4);
                }
            }
        }
    }
}
