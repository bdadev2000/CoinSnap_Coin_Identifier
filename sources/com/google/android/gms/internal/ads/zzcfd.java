package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes3.dex */
public final class zzcfd extends zzcbp {
    private final zzcck zzc;

    @Nullable
    private zzcfe zzd;
    private Uri zze;
    private zzcbo zzf;
    private boolean zzg;
    private int zzh;

    public zzcfd(Context context, zzcck zzcckVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcckVar;
        zzcckVar.zza(this);
    }

    @EnsuresNonNullIf(expression = {"immersiveAdPlayer"}, result = true)
    private final boolean zzm() {
        int i2 = this.zzh;
        return (i2 == 1 || i2 == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i2) {
        if (i2 == 4) {
            this.zzc.zzc();
            this.zzb.zzb();
        } else if (this.zzh == 4) {
            this.zzc.zze();
            this.zzb.zzc();
        }
        this.zzh = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(g.f30053h, this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzcbp, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public final String toString() {
        return androidx.compose.foundation.text.input.a.k(zzcfd.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzb() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzc() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzg() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzh() {
        return 0L;
    }

    public final /* synthetic */ void zzi() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final String zzj() {
        return "ImmersivePlayer";
    }

    public final /* synthetic */ void zzk() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            if (!this.zzg) {
                zzcboVar.zzg();
                this.zzg = true;
            }
            this.zzf.zze();
        }
    }

    public final /* synthetic */ void zzl() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp, com.google.android.gms.internal.ads.zzccm
    public final void zzn() {
        if (this.zzd != null) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzo() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzm() && this.zzd.zzd()) {
            this.zzd.zza();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfc
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfd.this.zzi();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzp() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzm()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfd.this.zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzq(int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView seek " + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzr(zzcbo zzcboVar) {
        this.zzf = zzcboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzs(@Nullable String str) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.zze = parse;
            this.zzd = new zzcfe(parse.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfa
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfd.this.zzl();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzcfe zzcfeVar = this.zzd;
        if (zzcfeVar != null) {
            zzcfeVar.zzc();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzu(float f2, float f3) {
    }
}
