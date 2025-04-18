package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AdError;
import com.google.common.net.HttpHeaders;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class zzcez extends zzfz implements zzhc {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzhb zze;
    private zzgm zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    public zzcez(String str, zzhh zzhhVar, int i2, int i3, long j2, long j3) {
        super(true);
        zzdi.zzc(str);
        this.zzd = str;
        this.zze = new zzhb();
        this.zzb = i2;
        this.zzc = i3;
        this.zzh = new ArrayDeque();
        this.zzq = j2;
        this.zzr = j3;
        if (zzhhVar != null) {
            zzf(zzhhVar);
        }
    }

    private final void zzl() {
        while (!this.zzh.isEmpty()) {
            try {
                AdMobNetworkBridge.httpUrlConnectionDisconnect((HttpURLConnection) this.zzh.remove());
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unexpected error while disconnecting", e);
            }
        }
        this.zzg = null;
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) throws zzgy {
        if (i3 == 0) {
            return 0;
        }
        try {
            long j2 = this.zzl;
            long j3 = this.zzm;
            if (j2 - j3 == 0) {
                return -1;
            }
            long j4 = this.zzn + j3;
            long j5 = i3;
            long j6 = j4 + j5 + this.zzr;
            long j7 = this.zzp;
            long j8 = j7 + 1;
            if (j6 > j8) {
                long j9 = this.zzo;
                if (j7 < j9) {
                    long min = Math.min(j9, Math.max(((this.zzq + j8) - r3) - 1, (-1) + j8 + j5));
                    zzk(j8, min, 2);
                    this.zzp = min;
                    j7 = min;
                }
            }
            int read = this.zzi.read(bArr, i2, (int) Math.min(j5, ((j7 + 1) - this.zzn) - this.zzm));
            if (read == -1) {
                throw new EOFException();
            }
            this.zzm += read;
            zzg(read);
            return read;
        } catch (IOException e) {
            throw new zzgy(e, this.zzf, AdError.SERVER_ERROR_CODE, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(zzgm zzgmVar) throws zzgy {
        this.zzf = zzgmVar;
        this.zzm = 0L;
        long j2 = zzgmVar.zze;
        long j3 = zzgmVar.zzf;
        long min = j3 == -1 ? this.zzq : Math.min(this.zzq, j3);
        this.zzn = j2;
        HttpURLConnection zzk = zzk(j2, (min + j2) - 1, 1);
        this.zzg = zzk;
        String headerField = zzk.getHeaderField(HttpHeaders.CONTENT_RANGE);
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = zzgmVar.zzf;
                    if (j4 != -1) {
                        this.zzl = j4;
                        this.zzo = Math.max(parseLong, (this.zzn + j4) - 1);
                    } else {
                        this.zzl = parseLong2 - this.zzn;
                        this.zzo = parseLong2 - 1;
                    }
                    this.zzp = parseLong;
                    this.zzj = true;
                    zzj(zzgmVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcex(headerField, zzgmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws zzgy {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzgy(e, this.zzf, AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfz, com.google.android.gms.internal.ads.zzgg
    @Nullable
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @VisibleForTesting
    public final HttpURLConnection zzk(long j2, long j3, int i2) throws zzgy {
        String uri = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty(HttpHeaders.RANGE, "bytes=" + j2 + "-" + j3);
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.zzd);
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String uri2 = this.zzf.zza.toString();
            try {
                int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                this.zzk = httpUrlConnectionGetResponseCode;
                if (httpUrlConnectionGetResponseCode < 200 || httpUrlConnectionGetResponseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzcey(this.zzk, headerFields, this.zzf, i2);
                }
                try {
                    InputStream urlConnectionGetInputStream = AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                    if (this.zzi != null) {
                        urlConnectionGetInputStream = new SequenceInputStream(this.zzi, urlConnectionGetInputStream);
                    }
                    this.zzi = urlConnectionGetInputStream;
                    return httpURLConnection;
                } catch (IOException e) {
                    zzl();
                    throw new zzgy(e, this.zzf, AdError.SERVER_ERROR_CODE, i2);
                }
            } catch (IOException e2) {
                zzl();
                throw new zzgy("Unable to connect to ".concat(String.valueOf(uri2)), e2, this.zzf, AdError.SERVER_ERROR_CODE, i2);
            }
        } catch (IOException e3) {
            throw new zzgy("Unable to connect to ".concat(String.valueOf(uri)), e3, this.zzf, AdError.SERVER_ERROR_CODE, i2);
        }
    }
}
