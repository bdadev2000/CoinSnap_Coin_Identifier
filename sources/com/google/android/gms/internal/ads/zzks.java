package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzks implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaci, zzqo, zzxu, zzun, zziu, zziq {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzkw zza;

    public /* synthetic */ zzks(zzkw zzkwVar, zzkr zzkrVar) {
        this.zza = zzkwVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        zzkw.zzP(this.zza, surfaceTexture);
        zzkw.zzN(this.zza, i9, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzkw.zzQ(this.zza, null);
        zzkw.zzN(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        zzkw.zzN(this.zza, i9, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
        zzkw.zzN(this.zza, i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzkw.zzN(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zza(Exception exc) {
        zzkw.zzF(this.zza).zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzb(String str, long j7, long j9) {
        zzkw.zzF(this.zza).zzw(str, j7, j9);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzc(String str) {
        zzkw.zzF(this.zza).zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzd(zzix zzixVar) {
        zzkw.zzF(this.zza).zzy(zzixVar);
        zzkw.zzI(this.zza, null);
        zzkw.zzH(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zze(zzix zzixVar) {
        zzkw.zzH(this.zza, zzixVar);
        zzkw.zzF(this.zza).zzz(zzixVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzf(zzan zzanVar, @Nullable zziy zziyVar) {
        zzkw.zzI(this.zza, zzanVar);
        zzkw.zzF(this.zza).zzA(zzanVar, zziyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzg(long j7) {
        zzkw.zzF(this.zza).zzB(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzh(Exception exc) {
        zzkw.zzF(this.zza).zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzi(zzqp zzqpVar) {
        zzkw.zzF(this.zza).zzD(zzqpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzj(zzqp zzqpVar) {
        zzkw.zzF(this.zza).zzE(zzqpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzk(int i9, long j7, long j9) {
        zzkw.zzF(this.zza).zzF(i9, j7, j9);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzl(int i9, long j7) {
        zzkw.zzF(this.zza).zzG(i9, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzm(Object obj, long j7) {
        zzkw.zzF(this.zza).zzH(obj, j7);
        zzkw zzkwVar = this.zza;
        if (zzkw.zzG(zzkwVar) == obj) {
            zzfh zzD = zzkw.zzD(zzkwVar);
            zzD.zzd(26, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkq
                @Override // com.google.android.gms.internal.ads.zzfe
                public final void zza(Object obj2) {
                }
            });
            zzD.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzn(final boolean z8) {
        zzkw zzkwVar = this.zza;
        if (zzkw.zzV(zzkwVar) == z8) {
            return;
        }
        zzkw.zzJ(zzkwVar, z8);
        zzfh zzD = zzkw.zzD(this.zza);
        zzD.zzd(23, new zzfe() { // from class: com.google.android.gms.internal.ads.zzko
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                ((zzcq) obj).zzn(z8);
            }
        });
        zzD.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzo(Exception exc) {
        zzkw.zzF(this.zza).zzI(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzp(String str, long j7, long j9) {
        zzkw.zzF(this.zza).zzJ(str, j7, j9);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzq(String str) {
        zzkw.zzF(this.zza).zzK(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzr(zzix zzixVar) {
        zzkw.zzF(this.zza).zzL(zzixVar);
        zzkw.zzL(this.zza, null);
        zzkw.zzK(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzs(zzix zzixVar) {
        zzkw.zzK(this.zza, zzixVar);
        zzkw.zzF(this.zza).zzM(zzixVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzt(long j7, int i9) {
        zzkw.zzF(this.zza).zzN(j7, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzu(zzan zzanVar, @Nullable zziy zziyVar) {
        zzkw.zzL(this.zza, zzanVar);
        zzkw.zzF(this.zza).zzO(zzanVar, zziyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final void zzv(final zzdv zzdvVar) {
        zzkw.zzM(this.zza, zzdvVar);
        zzfh zzD = zzkw.zzD(this.zza);
        zzD.zzd(25, new zzfe() { // from class: com.google.android.gms.internal.ads.zzkp
            @Override // com.google.android.gms.internal.ads.zzfe
            public final void zza(Object obj) {
                ((zzcq) obj).zzr(zzdv.this);
            }
        });
        zzD.zzc();
    }
}
