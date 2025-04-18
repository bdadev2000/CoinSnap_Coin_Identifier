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

/* loaded from: classes3.dex */
final class zzcec extends zzfw implements zzgy {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzgx zzg;
    private zzgi zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzcec(String str, zzhd zzhdVar, int i10, int i11, int i12) {
        super(true);
        this.zzc = new zzceb(this);
        this.zzr = new HashSet();
        zzdb.zzc(str);
        this.zzf = str;
        this.zzg = new zzgx();
        this.zzd = i10;
        this.zze = i11;
        this.zzq = i12;
        if (zzhdVar != null) {
            zzf(zzhdVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unexpected error while disconnecting", e2);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) throws zzgu {
        try {
            if (this.zzo != this.zzm) {
                byte[] bArr2 = (byte[]) zzb.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j3 = this.zzo;
                    long j10 = this.zzm;
                    if (j3 != j10) {
                        int read = this.zzj.read(bArr2, 0, (int) Math.min(j10 - j3, bArr2.length));
                        if (!Thread.interrupted()) {
                            if (read != -1) {
                                this.zzo += read;
                                zzg(read);
                            } else {
                                throw new EOFException();
                            }
                        } else {
                            throw new InterruptedIOException();
                        }
                    } else {
                        zzb.set(bArr2);
                        break;
                    }
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j11 = this.zzn;
            if (j11 != -1) {
                long j12 = j11 - this.zzp;
                if (j12 != 0) {
                    i11 = (int) Math.min(i11, j12);
                }
                return -1;
            }
            int read2 = this.zzj.read(bArr, i10, i11);
            if (read2 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += read2;
            zzg(read2);
            return read2;
        } catch (IOException e2) {
            throw new zzgu(e2, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0100, code lost:
    
        if (r2 == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023a A[Catch: IOException -> 0x028a, TryCatch #0 {IOException -> 0x028a, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:40:0x00e6, B:102:0x022f, B:104:0x023a, B:106:0x024b, B:112:0x0254, B:113:0x0263, B:116:0x026b, B:117:0x0272, B:120:0x0273, B:121:0x0289), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[Catch: IOException -> 0x028a, TryCatch #0 {IOException -> 0x028a, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:40:0x00e6, B:102:0x022f, B:104:0x023a, B:106:0x024b, B:112:0x0254, B:113:0x0263, B:116:0x026b, B:117:0x0272, B:120:0x0273, B:121:0x0289), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgi r21) throws com.google.android.gms.internal.ads.zzgu {
        /*
            Method dump skipped, instructions count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcec.zzb(com.google.android.gms.internal.ads.zzgi):long");
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws zzgu {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                int i10 = zzen.zza;
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new zzgu(e2, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfw, com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int i10) {
        this.zzq = i10;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to update receive buffer size.", e2);
                }
            }
        }
    }
}
