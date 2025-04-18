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

/* loaded from: classes3.dex */
final class zzcev extends zzfw implements zzgy {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgx zze;
    private zzgi zzf;
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

    public zzcev(String str, zzhd zzhdVar, int i10, int i11, long j3, long j10) {
        super(true);
        zzdb.zzc(str);
        this.zzd = str;
        this.zze = new zzgx();
        this.zzb = i10;
        this.zzc = i11;
        this.zzh = new ArrayDeque();
        this.zzq = j3;
        this.zzr = j10;
        if (zzhdVar != null) {
            zzf(zzhdVar);
        }
    }

    private final void zzl() {
        while (!this.zzh.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzh.remove()).disconnect();
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unexpected error while disconnecting", e2);
            }
        }
        this.zzg = null;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) throws zzgu {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j3 = this.zzl;
            long j10 = this.zzm;
            if (j3 - j10 == 0) {
                return -1;
            }
            long j11 = this.zzn + j10;
            long j12 = i11;
            long j13 = j11 + j12 + this.zzr;
            long j14 = this.zzp;
            long j15 = j14 + 1;
            if (j13 > j15) {
                long j16 = this.zzo;
                if (j14 < j16) {
                    long min = Math.min(j16, Math.max(((this.zzq + j15) - r3) - 1, (-1) + j15 + j12));
                    zzk(j15, min, 2);
                    this.zzp = min;
                    j14 = min;
                }
            }
            int read = this.zzi.read(bArr, i10, (int) Math.min(j12, ((j14 + 1) - this.zzn) - this.zzm));
            if (read != -1) {
                this.zzm += read;
                zzg(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new zzgu(e2, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws zzgu {
        long min;
        this.zzf = zzgiVar;
        this.zzm = 0L;
        long j3 = zzgiVar.zze;
        long j10 = zzgiVar.zzf;
        if (j10 == -1) {
            min = this.zzq;
        } else {
            min = Math.min(this.zzq, j10);
        }
        this.zzn = j3;
        HttpURLConnection zzk = zzk(j3, (min + j3) - 1, 1);
        this.zzg = zzk;
        String headerField = zzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j11 = zzgiVar.zzf;
                    if (j11 != -1) {
                        this.zzl = j11;
                        this.zzo = Math.max(parseLong, (this.zzn + j11) - 1);
                    } else {
                        this.zzl = parseLong2 - this.zzn;
                        this.zzo = parseLong2 - 1;
                    }
                    this.zzp = parseLong;
                    this.zzj = true;
                    zzj(zzgiVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcet(headerField, zzgiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws zzgu {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new zzgu(e2, this.zzf, 2000, 3);
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

    @Override // com.google.android.gms.internal.ads.zzfw, com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final HttpURLConnection zzk(long j3, long j10, int i10) throws zzgu {
        String uri = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, "bytes=" + j3 + "-" + j10);
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String uri2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.zzi != null) {
                            inputStream = new SequenceInputStream(this.zzi, inputStream);
                        }
                        this.zzi = inputStream;
                        return httpURLConnection;
                    } catch (IOException e2) {
                        zzl();
                        throw new zzgu(e2, this.zzf, 2000, i10);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                zzl();
                throw new zzceu(this.zzk, headerFields, this.zzf, i10);
            } catch (IOException e10) {
                zzl();
                throw new zzgu("Unable to connect to ".concat(String.valueOf(uri2)), e10, this.zzf, 2000, i10);
            }
        } catch (IOException e11) {
            throw new zzgu("Unable to connect to ".concat(String.valueOf(uri)), e11, this.zzf, 2000, i10);
        }
    }
}
