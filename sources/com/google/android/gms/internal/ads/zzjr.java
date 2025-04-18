package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzjr implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzabg, zzpn, zzwu, zztp, zzhu, zzhp {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjv zza;

    public /* synthetic */ zzjr(zzjv zzjvVar, zzju zzjuVar) {
        this.zza = zzjvVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzjv.zzK(this.zza, surfaceTexture);
        zzjv.zzI(this.zza, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzjv.zzL(this.zza, null);
        zzjv.zzI(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzjv.zzI(this.zza, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        zzjv.zzI(this.zza, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzjv.zzI(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zza(Exception exc) {
        zzjv.zzF(this.zza).zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzb(String str, long j3, long j10) {
        zzjv.zzF(this.zza).zzw(str, j3, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzc(String str) {
        zzjv.zzF(this.zza).zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzd(zzhx zzhxVar) {
        zzjv.zzF(this.zza).zzy(zzhxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zze(zzhx zzhxVar) {
        zzjv.zzF(this.zza).zzz(zzhxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzf(zzad zzadVar, @Nullable zzhy zzhyVar) {
        zzjv.zzF(this.zza).zzA(zzadVar, zzhyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzg(long j3) {
        zzjv.zzF(this.zza).zzB(j3);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzh(Exception exc) {
        zzjv.zzF(this.zza).zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzi(zzpo zzpoVar) {
        zzjv.zzF(this.zza).zzD(zzpoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzj(zzpo zzpoVar) {
        zzjv.zzF(this.zza).zzE(zzpoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzk(int i10, long j3, long j10) {
        zzjv.zzF(this.zza).zzF(i10, j3, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzl(int i10, long j3) {
        zzjv.zzF(this.zza).zzG(i10, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzm(Object obj, long j3) {
        zzjv.zzF(this.zza).zzH(obj, j3);
        zzjv zzjvVar = this.zza;
        if (zzjv.zzG(zzjvVar) == obj) {
            zzds zzD = zzjv.zzD(zzjvVar);
            zzD.zzd(26, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjq
                @Override // com.google.android.gms.internal.ads.zzdp
                public final void zza(Object obj2) {
                }
            });
            zzD.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzn(final boolean z10) {
        zzjv zzjvVar = this.zza;
        if (zzjv.zzQ(zzjvVar) == z10) {
            return;
        }
        zzjv.zzH(zzjvVar, z10);
        zzds zzD = zzjv.zzD(this.zza);
        zzD.zzd(23, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjo
            @Override // com.google.android.gms.internal.ads.zzdp
            public final void zza(Object obj) {
                ((zzbm) obj).zzn(z10);
            }
        });
        zzD.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzo(Exception exc) {
        zzjv.zzF(this.zza).zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzp(String str, long j3, long j10) {
        zzjv.zzF(this.zza).zzK(str, j3, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzq(String str) {
        zzjv.zzF(this.zza).zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzr(zzhx zzhxVar) {
        zzjv.zzF(this.zza).zzM(zzhxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzs(zzhx zzhxVar) {
        zzjv.zzF(this.zza).zzN(zzhxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzt(long j3, int i10) {
        zzjv.zzF(this.zza).zzO(j3, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzu(zzad zzadVar, @Nullable zzhy zzhyVar) {
        zzjv.zzF(this.zza).zzP(zzadVar, zzhyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzv(final zzci zzciVar) {
        zzds zzD = zzjv.zzD(this.zza);
        zzD.zzd(25, new zzdp() { // from class: com.google.android.gms.internal.ads.zzjp
            @Override // com.google.android.gms.internal.ads.zzdp
            public final void zza(Object obj) {
                ((zzbm) obj).zzr(zzci.this);
            }
        });
        zzD.zzc();
    }
}
