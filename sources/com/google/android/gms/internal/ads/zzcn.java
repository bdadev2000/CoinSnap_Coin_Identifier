package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public abstract class zzcn implements zzcm {
    protected zzck zzb;
    protected zzck zzc;
    private zzck zzd;
    private zzck zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzcn() {
        ByteBuffer byteBuffer = zzcm.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzck zzckVar = zzck.zza;
        this.zzd = zzckVar;
        this.zze = zzckVar;
        this.zzb = zzckVar;
        this.zzc = zzckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final zzck zza(zzck zzckVar) throws zzcl {
        this.zzd = zzckVar;
        this.zze = zzi(zzckVar);
        if (zzg()) {
            return this.zze;
        }
        return zzck.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    @CallSuper
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzcm.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzc() {
        this.zzg = zzcm.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzf() {
        zzc();
        this.zzf = zzcm.zza;
        zzck zzckVar = zzck.zza;
        this.zzd = zzckVar;
        this.zze = zzckVar;
        this.zzb = zzckVar;
        this.zzc = zzckVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    @CallSuper
    public boolean zzg() {
        return this.zze != zzck.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    @CallSuper
    public boolean zzh() {
        return this.zzh && this.zzg == zzcm.zza;
    }

    public zzck zzi(zzck zzckVar) throws zzcl {
        throw null;
    }

    public final ByteBuffer zzj(int i10) {
        if (this.zzf.capacity() < i10) {
            this.zzf = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
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
