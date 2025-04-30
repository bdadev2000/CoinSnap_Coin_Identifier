package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes2.dex */
public final class zzec implements zzdz {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdx zze;
    private zzdx zzf;
    private zzdx zzg;
    private zzdx zzh;
    private boolean zzi;

    @Nullable
    private zzeb zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzec() {
        zzdx zzdxVar = zzdx.zza;
        this.zze = zzdxVar;
        this.zzf = zzdxVar;
        this.zzg = zzdxVar;
        this.zzh = zzdxVar;
        ByteBuffer byteBuffer = zzdz.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final zzdx zza(zzdx zzdxVar) throws zzdy {
        if (zzdxVar.zzd == 2) {
            int i9 = this.zzb;
            if (i9 == -1) {
                i9 = zzdxVar.zzb;
            }
            this.zze = zzdxVar;
            zzdx zzdxVar2 = new zzdx(i9, zzdxVar.zzc, 2);
            this.zzf = zzdxVar2;
            this.zzi = true;
            return zzdxVar2;
        }
        throw new zzdy("Unhandled input format:", zzdxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final ByteBuffer zzb() {
        int zza;
        zzeb zzebVar = this.zzj;
        if (zzebVar != null && (zza = zzebVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzebVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzdz.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzc() {
        if (zzg()) {
            zzdx zzdxVar = this.zze;
            this.zzg = zzdxVar;
            zzdx zzdxVar2 = this.zzf;
            this.zzh = zzdxVar2;
            if (this.zzi) {
                this.zzj = new zzeb(zzdxVar.zzb, zzdxVar.zzc, this.zzc, this.zzd, zzdxVar2.zzb);
            } else {
                zzeb zzebVar = this.zzj;
                if (zzebVar != null) {
                    zzebVar.zzc();
                }
            }
        }
        this.zzm = zzdz.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzd() {
        zzeb zzebVar = this.zzj;
        if (zzebVar != null) {
            zzebVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zze(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        zzeb zzebVar = this.zzj;
        zzebVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.zzn += remaining;
        zzebVar.zzf(asShortBuffer);
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzdx zzdxVar = zzdx.zza;
        this.zze = zzdxVar;
        this.zzf = zzdxVar;
        this.zzg = zzdxVar;
        this.zzh = zzdxVar;
        ByteBuffer byteBuffer = zzdz.zza;
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

    @Override // com.google.android.gms.internal.ads.zzdz
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

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzeb zzebVar = this.zzj;
        return zzebVar == null || zzebVar.zza() == 0;
    }

    public final long zzi(long j7) {
        long j9 = this.zzo;
        if (j9 >= 1024) {
            long j10 = this.zzn;
            this.zzj.getClass();
            long zzb = j10 - r3.zzb();
            int i9 = this.zzh.zzb;
            int i10 = this.zzg.zzb;
            if (i9 == i10) {
                return zzgd.zzt(j7, zzb, j9, RoundingMode.FLOOR);
            }
            return zzgd.zzt(j7, zzb * i9, j9 * i10, RoundingMode.FLOOR);
        }
        return (long) (this.zzc * j7);
    }

    public final void zzj(float f9) {
        if (this.zzd != f9) {
            this.zzd = f9;
            this.zzi = true;
        }
    }

    public final void zzk(float f9) {
        if (this.zzc != f9) {
            this.zzc = f9;
            this.zzi = true;
        }
    }
}
