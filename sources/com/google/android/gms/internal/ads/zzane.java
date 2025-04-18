package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class zzane implements zzamz {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    @Nullable
    private final zzaoq zzb;

    @Nullable
    private final zzek zzc;
    private final boolean[] zzd;
    private final zzanc zze;

    @Nullable
    private final zzanr zzf;
    private zzand zzg;
    private long zzh;
    private String zzi;
    private zzaeh zzj;
    private boolean zzk;
    private long zzl;

    public zzane() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012f  */
    @Override // com.google.android.gms.internal.ads.zzamz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzek r18) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzane.zza(com.google.android.gms.internal.ads.zzek):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzade zzadeVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zzi = zzaonVar.zzb();
        zzaeh zzw = zzadeVar.zzw(zzaonVar.zza(), 2);
        this.zzj = zzw;
        this.zzg = new zzand(zzw);
        zzaoq zzaoqVar = this.zzb;
        if (zzaoqVar != null) {
            zzaoqVar.zzb(zzadeVar, zzaonVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z2) {
        zzdi.zzb(this.zzg);
        if (z2) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j2, int i2) {
        this.zzl = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        zzfs.zzh(this.zzd);
        this.zze.zzb();
        zzand zzandVar = this.zzg;
        if (zzandVar != null) {
            zzandVar.zzd();
        }
        zzanr zzanrVar = this.zzf;
        if (zzanrVar != null) {
            zzanrVar.zzb();
        }
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    public zzane(@Nullable zzaoq zzaoqVar) {
        zzek zzekVar;
        this.zzb = zzaoqVar;
        this.zzd = new boolean[4];
        this.zze = new zzanc(128);
        this.zzl = -9223372036854775807L;
        if (zzaoqVar != null) {
            this.zzf = new zzanr(Opcodes.GETSTATIC, 128);
            zzekVar = new zzek();
        } else {
            zzekVar = null;
            this.zzf = null;
        }
        this.zzc = zzekVar;
    }
}
