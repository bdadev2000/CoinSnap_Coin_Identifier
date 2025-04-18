package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes3.dex */
public final class zzcw implements zzct {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcr zze;
    private zzcr zzf;
    private zzcr zzg;
    private zzcr zzh;
    private boolean zzi;

    @Nullable
    private zzcv zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzcw() {
        zzcr zzcrVar = zzcr.zza;
        this.zze = zzcrVar;
        this.zzf = zzcrVar;
        this.zzg = zzcrVar;
        this.zzh = zzcrVar;
        ByteBuffer byteBuffer = zzct.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final zzcr zza(zzcr zzcrVar) throws zzcs {
        if (zzcrVar.zzd != 2) {
            throw new zzcs("Unhandled input format:", zzcrVar);
        }
        int i2 = this.zzb;
        if (i2 == -1) {
            i2 = zzcrVar.zzb;
        }
        this.zze = zzcrVar;
        zzcr zzcrVar2 = new zzcr(i2, zzcrVar.zzc, 2);
        this.zzf = zzcrVar2;
        this.zzi = true;
        return zzcrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final ByteBuffer zzb() {
        int zza;
        zzcv zzcvVar = this.zzj;
        if (zzcvVar != null && (zza = zzcvVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzcvVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzct.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzc() {
        if (zzg()) {
            zzcr zzcrVar = this.zze;
            this.zzg = zzcrVar;
            zzcr zzcrVar2 = this.zzf;
            this.zzh = zzcrVar2;
            if (this.zzi) {
                this.zzj = new zzcv(zzcrVar.zzb, zzcrVar.zzc, this.zzc, this.zzd, zzcrVar2.zzb);
            } else {
                zzcv zzcvVar = this.zzj;
                if (zzcvVar != null) {
                    zzcvVar.zzc();
                }
            }
        }
        this.zzm = zzct.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzd() {
        zzcv zzcvVar = this.zzj;
        if (zzcvVar != null) {
            zzcvVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzcv zzcvVar = this.zzj;
            zzcvVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += remaining;
            zzcvVar.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzcr zzcrVar = zzcr.zza;
        this.zze = zzcrVar;
        this.zzf = zzcrVar;
        this.zzg = zzcrVar;
        this.zzh = zzcrVar;
        ByteBuffer byteBuffer = zzct.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final boolean zzg() {
        if (this.zzf.zzb == -1) {
            return false;
        }
        if (Math.abs(this.zzc - 1.0f) >= 1.0E-4f || Math.abs(this.zzd - 1.0f) >= 1.0E-4f) {
            return true;
        }
        return this.zzf.zzb != this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzcv zzcvVar = this.zzj;
        return zzcvVar == null || zzcvVar.zza() == 0;
    }

    public final long zzi(long j2) {
        long j3 = this.zzo;
        if (j3 < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (this.zzc * j2);
        }
        long j4 = this.zzn;
        this.zzj.getClass();
        long zzb = j4 - r3.zzb();
        int i2 = this.zzh.zzb;
        int i3 = this.zzg.zzb;
        return i2 == i3 ? zzeu.zzt(j2, zzb, j3, RoundingMode.FLOOR) : zzeu.zzt(j2, zzb * i2, j3 * i3, RoundingMode.FLOOR);
    }

    public final void zzj(float f2) {
        if (this.zzd != f2) {
            this.zzd = f2;
            this.zzi = true;
        }
    }

    public final void zzk(float f2) {
        if (this.zzc != f2) {
            this.zzc = f2;
            this.zzi = true;
        }
    }
}
