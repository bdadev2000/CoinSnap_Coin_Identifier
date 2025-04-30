package com.google.android.gms.internal.ads;

import Q7.n0;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzhp extends zzgv implements zzhz {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final zzhy zzf;
    private final zzhy zzg;

    @Nullable
    private zzhh zzh;

    @Nullable
    private HttpURLConnection zzi;

    @Nullable
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.net.HttpURLConnection zzk(java.net.URL r3, int r4, @androidx.annotation.Nullable byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.zzc
            r3.setConnectTimeout(r4)
            int r4 = r2.zzd
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.zzhy r5 = r2.zzf
            if (r5 == 0) goto L20
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
        L20:
            com.google.android.gms.internal.ads.zzhy r5 = r2.zzg
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L34
        L50:
            r4 = 0
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = -1
            if (r12 != 0) goto L5f
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5e
            r4 = 0
            goto L74
        L5e:
            r6 = r4
        L5f:
            java.lang.String r4 = "bytes="
            java.lang.String r5 = "-"
            java.lang.StringBuilder r4 = y.AbstractC2933a.a(r4, r6, r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L70
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L70:
            java.lang.String r4 = r4.toString()
        L74:
            if (r4 == 0) goto L7b
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L7b:
            java.lang.String r4 = r2.zze
            if (r4 == 0) goto L84
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L84:
            r4 = 1
            if (r4 == r10) goto L8a
            java.lang.String r4 = "identity"
            goto L8c
        L8a:
            java.lang.String r4 = "gzip"
        L8c:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r4)
            r3.setInstanceFollowRedirects(r11)
            r4 = 0
            r3.setDoOutput(r4)
            int r4 = com.google.android.gms.internal.ads.zzhh.zzh
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhp.zzk(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL zzl(URL url, @Nullable String str, zzhh zzhhVar) throws zzhv {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new zzhv("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhhVar, 2001, 1);
                }
                if (!this.zzb && !protocol.equals(url.getProtocol())) {
                    throw new zzhv(n0.j("Disallowed cross-protocol redirect (", url.getProtocol(), " to ", protocol, ")"), zzhhVar, 2001, 1);
                }
                return url2;
            } catch (MalformedURLException e4) {
                throw new zzhv(e4, zzhhVar, 2001, 1);
            }
        }
        throw new zzhv("Null location redirect", zzhhVar, 2001, 1);
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                zzfk.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", e4);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws zzhv {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j7 = this.zzm;
            if (j7 != -1) {
                long j9 = j7 - this.zzn;
                if (j9 != 0) {
                    i10 = (int) Math.min(i10, j9);
                }
                return -1;
            }
            InputStream inputStream = this.zzj;
            int i11 = zzgd.zza;
            int read = inputStream.read(bArr, i9, i10);
            if (read == -1) {
                return -1;
            }
            this.zzn += read;
            zzg(read);
            return read;
        } catch (IOException e4) {
            zzhh zzhhVar = this.zzh;
            int i12 = zzgd.zza;
            throw zzhv.zza(e4, zzhhVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bd, code lost:
    
        if (r10 == r19) goto L35;
     */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzhh r27) throws com.google.android.gms.internal.ads.zzhv {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhp.zzb(com.google.android.gms.internal.ads.zzhh):long");
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhv {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                if (this.zzi != null) {
                    int i9 = zzgd.zza;
                }
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    zzhh zzhhVar = this.zzh;
                    int i10 = zzgd.zza;
                    throw new zzhv(e4, zzhhVar, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzm();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgv, com.google.android.gms.internal.ads.zzhb
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return zzgbf.zzd();
        }
        return new zzhn(httpURLConnection.getHeaderFields());
    }

    @Deprecated
    public zzhp() {
        this(null, 8000, 8000, false, null, null, false);
    }

    private zzhp(@Nullable String str, int i9, int i10, boolean z8, @Nullable zzhy zzhyVar, @Nullable zzfyh zzfyhVar, boolean z9) {
        super(true);
        this.zze = str;
        this.zzc = i9;
        this.zzd = i10;
        this.zzb = z8;
        this.zzf = zzhyVar;
        this.zzg = new zzhy();
    }
}
