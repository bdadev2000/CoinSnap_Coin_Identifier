package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class zzanb implements zzamz {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzaeh zzc;

    @Nullable
    private final zzaoq zzd;

    @Nullable
    private final zzek zze;

    @Nullable
    private final zzanr zzf;
    private final boolean[] zzg;
    private final zzana zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzanb() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bf  */
    @Override // com.google.android.gms.internal.ads.zzamz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzek r20) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanb.zza(com.google.android.gms.internal.ads.zzek):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzade zzadeVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zzb = zzaonVar.zzb();
        this.zzc = zzadeVar.zzw(zzaonVar.zza(), 2);
        zzaoq zzaoqVar = this.zzd;
        if (zzaoqVar != null) {
            zzaoqVar.zzb(zzadeVar, zzaonVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z2) {
        zzdi.zzb(this.zzc);
        if (z2) {
            boolean z3 = this.zzp;
            long j2 = this.zzi - this.zzn;
            this.zzc.zzs(this.zzo, z3 ? 1 : 0, (int) j2, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j2, int i2) {
        this.zzm = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        zzfs.zzh(this.zzg);
        this.zzh.zzb();
        zzanr zzanrVar = this.zzf;
        if (zzanrVar != null) {
            zzanrVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    public zzanb(@Nullable zzaoq zzaoqVar) {
        zzek zzekVar;
        this.zzd = zzaoqVar;
        this.zzg = new boolean[4];
        this.zzh = new zzana(128);
        if (zzaoqVar != null) {
            this.zzf = new zzanr(Opcodes.GETSTATIC, 128);
            zzekVar = new zzek();
        } else {
            zzekVar = null;
            this.zzf = null;
        }
        this.zze = zzekVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
