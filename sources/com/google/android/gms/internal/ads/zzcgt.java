package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.download.Command;
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

/* loaded from: classes2.dex */
final class zzcgt extends zzgv implements zzhz {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzhy zzf;
    private zzhh zzg;
    private HttpURLConnection zzh;
    private final Queue zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    public zzcgt(String str, zzie zzieVar, int i9, int i10, long j7, long j9) {
        super(true);
        zzeq.zzc(str);
        this.zze = str;
        this.zzf = new zzhy();
        this.zzc = i9;
        this.zzd = i10;
        this.zzi = new ArrayDeque();
        this.zzr = j7;
        this.zzs = j9;
        if (zzieVar != null) {
            zzf(zzieVar);
        }
    }

    private final void zzl() {
        while (!this.zzi.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzi.remove()).disconnect();
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unexpected error while disconnecting", e4);
            }
        }
        this.zzh = null;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws zzhv {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j7 = this.zzm;
            long j9 = this.zzn;
            if (j7 - j9 == 0) {
                return -1;
            }
            long j10 = this.zzo + j9;
            long j11 = i10;
            long j12 = j10 + j11 + this.zzs;
            long j13 = this.zzq;
            long j14 = j13 + 1;
            if (j12 > j14) {
                long j15 = this.zzp;
                if (j13 < j15) {
                    long min = Math.min(j15, Math.max(((this.zzr + j14) - r3) - 1, (-1) + j14 + j11));
                    zzk(j14, min, 2);
                    this.zzq = min;
                    j13 = min;
                }
            }
            int read = this.zzj.read(bArr, i9, (int) Math.min(j11, ((j13 + 1) - this.zzo) - this.zzn));
            if (read != -1) {
                this.zzn += read;
                zzg(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e4) {
            throw new zzhv(e4, this.zzg, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) throws zzhv {
        long min;
        this.zzg = zzhhVar;
        this.zzn = 0L;
        long j7 = zzhhVar.zze;
        long j9 = zzhhVar.zzf;
        if (j9 == -1) {
            min = this.zzr;
        } else {
            min = Math.min(this.zzr, j9);
        }
        this.zzo = j7;
        HttpURLConnection zzk = zzk(j7, (min + j7) - 1, 1);
        this.zzh = zzk;
        String headerField = zzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j10 = zzhhVar.zzf;
                    if (j10 != -1) {
                        this.zzm = j10;
                        this.zzp = Math.max(parseLong, (this.zzo + j10) - 1);
                    } else {
                        this.zzm = parseLong2 - this.zzo;
                        this.zzp = parseLong2 - 1;
                    }
                    this.zzq = parseLong;
                    this.zzk = true;
                    zzj(zzhhVar);
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcgr(headerField, zzhhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
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
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    throw new zzhv(e4, this.zzg, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzl();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgv, com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final HttpURLConnection zzk(long j7, long j9, int i9) throws zzhv {
        String uri = this.zzg.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzc);
            httpURLConnection.setReadTimeout(this.zzd);
            for (Map.Entry entry : this.zzf.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, "bytes=" + j7 + "-" + j9);
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.zze);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzi.add(httpURLConnection);
            String uri2 = this.zzg.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzl = responseCode;
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.zzj != null) {
                            inputStream = new SequenceInputStream(this.zzj, inputStream);
                        }
                        this.zzj = inputStream;
                        return httpURLConnection;
                    } catch (IOException e4) {
                        zzl();
                        throw new zzhv(e4, this.zzg, 2000, i9);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                zzl();
                throw new zzcgs(this.zzl, headerFields, this.zzg, i9);
            } catch (IOException e9) {
                zzl();
                throw new zzhv("Unable to connect to ".concat(String.valueOf(uri2)), e9, this.zzg, 2000, i9);
            }
        } catch (IOException e10) {
            throw new zzhv("Unable to connect to ".concat(String.valueOf(uri)), e10, this.zzg, 2000, i9);
        }
    }
}
