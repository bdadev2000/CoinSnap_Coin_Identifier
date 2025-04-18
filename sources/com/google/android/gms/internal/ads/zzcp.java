package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes3.dex */
public final class zzcp implements zzcm {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzck zze;
    private zzck zzf;
    private zzck zzg;
    private zzck zzh;
    private boolean zzi;

    @Nullable
    private zzco zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzcp() {
        zzck zzckVar = zzck.zza;
        this.zze = zzckVar;
        this.zzf = zzckVar;
        this.zzg = zzckVar;
        this.zzh = zzckVar;
        ByteBuffer byteBuffer = zzcm.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final zzck zza(zzck zzckVar) throws zzcl {
        if (zzckVar.zzd == 2) {
            int i10 = this.zzb;
            if (i10 == -1) {
                i10 = zzckVar.zzb;
            }
            this.zze = zzckVar;
            zzck zzckVar2 = new zzck(i10, zzckVar.zzc, 2);
            this.zzf = zzckVar2;
            this.zzi = true;
            return zzckVar2;
        }
        throw new zzcl("Unhandled input format:", zzckVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final ByteBuffer zzb() {
        int zza;
        zzco zzcoVar = this.zzj;
        if (zzcoVar != null && (zza = zzcoVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzcoVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzcm.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzc() {
        if (zzg()) {
            zzck zzckVar = this.zze;
            this.zzg = zzckVar;
            zzck zzckVar2 = this.zzf;
            this.zzh = zzckVar2;
            if (this.zzi) {
                this.zzj = new zzco(zzckVar.zzb, zzckVar.zzc, this.zzc, this.zzd, zzckVar2.zzb);
            } else {
                zzco zzcoVar = this.zzj;
                if (zzcoVar != null) {
                    zzcoVar.zzc();
                }
            }
        }
        this.zzm = zzcm.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzd() {
        zzco zzcoVar = this.zzj;
        if (zzcoVar != null) {
            zzcoVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zze(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        zzco zzcoVar = this.zzj;
        zzcoVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.zzn += remaining;
        zzcoVar.zzf(asShortBuffer);
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzck zzckVar = zzck.zza;
        this.zze = zzckVar;
        this.zzf = zzckVar;
        this.zzg = zzckVar;
        this.zzh = zzckVar;
        ByteBuffer byteBuffer = zzcm.zza;
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

    @Override // com.google.android.gms.internal.ads.zzcm
    public final boolean zzg() {
        if (this.zzf.zzb == -1) {
            return false;
        }
        if (Math.abs(this.zzc - 1.0f) >= 1.0E-4f || Math.abs(this.zzd - 1.0f) >= 1.0E-4f) {
            return true;
        }
        if (this.zzf.zzb == this.zze.zzb) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzco zzcoVar = this.zzj;
        return zzcoVar == null || zzcoVar.zza() == 0;
    }

    public final long zzi(long j3) {
        long j10 = this.zzo;
        if (j10 >= 1024) {
            long j11 = this.zzn;
            this.zzj.getClass();
            long zzb = j11 - r3.zzb();
            int i10 = this.zzh.zzb;
            int i11 = this.zzg.zzb;
            if (i10 == i11) {
                return zzen.zzu(j3, zzb, j10, RoundingMode.FLOOR);
            }
            return zzen.zzu(j3, zzb * i10, j10 * i11, RoundingMode.FLOOR);
        }
        return (long) (this.zzc * j3);
    }

    public final void zzj(float f10) {
        if (this.zzd != f10) {
            this.zzd = f10;
            this.zzi = true;
        }
    }

    public final void zzk(float f10) {
        if (this.zzc != f10) {
            this.zzc = f10;
            this.zzi = true;
        }
    }
}
