package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzcez extends zzcbl {
    private final zzccg zzc;

    @Nullable
    private zzcfa zzd;
    private Uri zze;
    private zzcbk zzf;
    private boolean zzg;
    private int zzh;

    public zzcez(Context context, zzccg zzccgVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzccgVar;
        zzccgVar.zza(this);
    }

    private final boolean zzm() {
        int i10 = this.zzh;
        return (i10 == 1 || i10 == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i10) {
        if (i10 == 4) {
            this.zzc.zzc();
            this.zzb.zzb();
        } else if (this.zzh == 4) {
            this.zzc.zze();
            this.zzb.zzc();
        }
        this.zzh = i10;
    }

    @Override // android.view.View
    public final String toString() {
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(zzcez.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzb() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzc() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzg() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzh() {
        return 0L;
    }

    public final /* synthetic */ void zzi() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final String zzj() {
        return "ImmersivePlayer";
    }

    public final /* synthetic */ void zzk() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            if (!this.zzg) {
                zzcbkVar.zzg();
                this.zzg = true;
            }
            this.zzf.zze();
        }
    }

    public final /* synthetic */ void zzl() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl, com.google.android.gms.internal.ads.zzcci
    public final void zzn() {
        if (this.zzd != null) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzo() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzm() && this.zzd.zzd()) {
            this.zzd.zza();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcey
                @Override // java.lang.Runnable
                public final void run() {
                    zzcez.this.zzi();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzp() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzm()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcex
                @Override // java.lang.Runnable
                public final void run() {
                    zzcez.this.zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzq(int i10) {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView seek " + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzr(zzcbk zzcbkVar) {
        this.zzf = zzcbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzs(@Nullable String str) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.zze = parse;
            this.zzd = new zzcfa(parse.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcew
                @Override // java.lang.Runnable
                public final void run() {
                    zzcez.this.zzl();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzcfa zzcfaVar = this.zzd;
        if (zzcfaVar != null) {
            zzcfaVar.zzc();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzu(float f10, float f11) {
    }
}
