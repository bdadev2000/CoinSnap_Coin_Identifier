package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzjv implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzabq, zzpr, zzxb, zztw, zzhx, zzht {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjz zza;

    public /* synthetic */ zzjv(zzjz zzjzVar, zzju zzjuVar) {
        this.zza = zzjzVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzjz.zzK(this.zza, surfaceTexture);
        zzjz.zzI(this.zza, i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzjz.zzL(this.zza, null);
        zzjz.zzI(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzjz.zzI(this.zza, i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        zzjz.zzI(this.zza, i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzjz.zzI(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zza(Exception exc) {
        zzjz.zzF(this.zza).zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzb(String str, long j2, long j3) {
        zzjz.zzF(this.zza).zzw(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzc(String str) {
        zzjz.zzF(this.zza).zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzd(zzia zziaVar) {
        zzjz.zzF(this.zza).zzy(zziaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzia zziaVar) {
        zzjz.zzF(this.zza).zzz(zziaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzf(zzaf zzafVar, @Nullable zzib zzibVar) {
        zzjz.zzF(this.zza).zzA(zzafVar, zzibVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j2) {
        zzjz.zzF(this.zza).zzB(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzh(Exception exc) {
        zzjz.zzF(this.zza).zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzi(zzps zzpsVar) {
        zzjz.zzF(this.zza).zzD(zzpsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzj(zzps zzpsVar) {
        zzjz.zzF(this.zza).zzE(zzpsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzk(int i2, long j2, long j3) {
        zzjz.zzF(this.zza).zzF(i2, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzl(int i2, long j2) {
        zzjz.zzF(this.zza).zzG(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzm(Object obj, long j2) {
        zzjz.zzF(this.zza).zzH(obj, j2);
        zzjz zzjzVar = this.zza;
        if (zzjz.zzG(zzjzVar) == obj) {
            zzdz zzD = zzjz.zzD(zzjzVar);
            zzD.zzd(26, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjt
                @Override // com.google.android.gms.internal.ads.zzdw
                public final void zza(Object obj2) {
                }
            });
            zzD.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzn(final boolean z2) {
        zzjz zzjzVar = this.zza;
        if (zzjz.zzQ(zzjzVar) == z2) {
            return;
        }
        zzjz.zzH(zzjzVar, z2);
        zzdz zzD = zzjz.zzD(this.zza);
        zzD.zzd(23, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjr
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzbu) obj).zzn(z2);
            }
        });
        zzD.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzo(Exception exc) {
        zzjz.zzF(this.zza).zzI(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzp(String str, long j2, long j3) {
        zzjz.zzF(this.zza).zzJ(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzq(String str) {
        zzjz.zzF(this.zza).zzK(str);
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzr(zzia zziaVar) {
        zzjz.zzF(this.zza).zzL(zziaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzs(zzia zziaVar) {
        zzjz.zzF(this.zza).zzM(zziaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzt(long j2, int i2) {
        zzjz.zzF(this.zza).zzN(j2, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzu(zzaf zzafVar, @Nullable zzib zzibVar) {
        zzjz.zzF(this.zza).zzO(zzafVar, zzibVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzv(final zzcp zzcpVar) {
        zzdz zzD = zzjz.zzD(this.zza);
        zzD.zzd(25, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjs
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzbu) obj).zzr(zzcp.this);
            }
        });
        zzD.zzc();
    }
}
