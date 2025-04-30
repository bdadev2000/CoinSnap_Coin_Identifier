package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public abstract class zzea implements zzdz {
    protected zzdx zzb;
    protected zzdx zzc;
    private zzdx zzd;
    private zzdx zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzea() {
        ByteBuffer byteBuffer = zzdz.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzdx zzdxVar = zzdx.zza;
        this.zzd = zzdxVar;
        this.zze = zzdxVar;
        this.zzb = zzdxVar;
        this.zzc = zzdxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final zzdx zza(zzdx zzdxVar) throws zzdy {
        this.zzd = zzdxVar;
        this.zze = zzi(zzdxVar);
        if (zzg()) {
            return this.zze;
        }
        return zzdx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    @CallSuper
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzdz.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzc() {
        this.zzg = zzdz.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzf() {
        zzc();
        this.zzf = zzdz.zza;
        zzdx zzdxVar = zzdx.zza;
        this.zzd = zzdxVar;
        this.zze = zzdxVar;
        this.zzb = zzdxVar;
        this.zzc = zzdxVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public boolean zzg() {
        if (this.zze != zzdx.zza) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    @CallSuper
    public boolean zzh() {
        return this.zzh && this.zzg == zzdz.zza;
    }

    public zzdx zzi(zzdx zzdxVar) throws zzdy {
        throw null;
    }

    public final ByteBuffer zzj(int i9) {
        if (this.zzf.capacity() < i9) {
            this.zzf = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    public void zzk() {
    }

    public void zzl() {
    }

    public void zzm() {
    }

    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
