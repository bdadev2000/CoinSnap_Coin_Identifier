package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes2.dex */
public final class zzars extends zzhhr {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzhib zzm;
    private long zzn;

    public zzars() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzhib.zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        sb.append(this.zzg);
        sb.append(";modificationTime=");
        sb.append(this.zzh);
        sb.append(";timescale=");
        sb.append(this.zzi);
        sb.append(";duration=");
        sb.append(this.zzj);
        sb.append(";rate=");
        sb.append(this.zzk);
        sb.append(";volume=");
        sb.append(this.zzl);
        sb.append(";matrix=");
        sb.append(this.zzm);
        sb.append(";nextTrackId=");
        return d.p(sb, this.zzn, "]");
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhhp
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzhhw.zza(zzaro.zzf(byteBuffer));
            this.zzh = zzhhw.zza(zzaro.zzf(byteBuffer));
            this.zzi = zzaro.zze(byteBuffer);
            this.zzj = zzaro.zzf(byteBuffer);
        } else {
            this.zzg = zzhhw.zza(zzaro.zze(byteBuffer));
            this.zzh = zzhhw.zza(zzaro.zze(byteBuffer));
            this.zzi = zzaro.zze(byteBuffer);
            this.zzj = zzaro.zze(byteBuffer);
        }
        this.zzk = zzaro.zzb(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & UnsignedBytes.MAX_VALUE) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzaro.zzd(byteBuffer);
        zzaro.zze(byteBuffer);
        zzaro.zze(byteBuffer);
        this.zzm = new zzhib(zzaro.zzb(byteBuffer), zzaro.zzb(byteBuffer), zzaro.zzb(byteBuffer), zzaro.zzb(byteBuffer), zzaro.zza(byteBuffer), zzaro.zza(byteBuffer), zzaro.zza(byteBuffer), zzaro.zzb(byteBuffer), zzaro.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzaro.zze(byteBuffer);
    }
}
