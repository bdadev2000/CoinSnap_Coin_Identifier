package com.google.android.gms.internal.ads;

import a4.j;
import java.nio.ByteBuffer;
import java.util.Date;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzarf extends zzhfg {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzhfq zzm;
    private long zzn;

    public zzarf() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzhfq.zza;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        sb2.append(this.zzg);
        sb2.append(";modificationTime=");
        sb2.append(this.zzh);
        sb2.append(";timescale=");
        sb2.append(this.zzi);
        sb2.append(";duration=");
        sb2.append(this.zzj);
        sb2.append(";rate=");
        sb2.append(this.zzk);
        sb2.append(";volume=");
        sb2.append(this.zzl);
        sb2.append(";matrix=");
        sb2.append(this.zzm);
        sb2.append(";nextTrackId=");
        return j.j(sb2, this.zzn, "]");
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhfe
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzhfl.zza(zzarb.zzf(byteBuffer));
            this.zzh = zzhfl.zza(zzarb.zzf(byteBuffer));
            this.zzi = zzarb.zze(byteBuffer);
            this.zzj = zzarb.zzf(byteBuffer);
        } else {
            this.zzg = zzhfl.zza(zzarb.zze(byteBuffer));
            this.zzh = zzhfl.zza(zzarb.zze(byteBuffer));
            this.zzi = zzarb.zze(byteBuffer);
            this.zzj = zzarb.zze(byteBuffer);
        }
        this.zzk = zzarb.zzb(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & UByte.MAX_VALUE) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzarb.zzd(byteBuffer);
        zzarb.zze(byteBuffer);
        zzarb.zze(byteBuffer);
        this.zzm = new zzhfq(zzarb.zzb(byteBuffer), zzarb.zzb(byteBuffer), zzarb.zzb(byteBuffer), zzarb.zzb(byteBuffer), zzarb.zza(byteBuffer), zzarb.zza(byteBuffer), zzarb.zza(byteBuffer), zzarb.zzb(byteBuffer), zzarb.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzarb.zze(byteBuffer);
    }
}
