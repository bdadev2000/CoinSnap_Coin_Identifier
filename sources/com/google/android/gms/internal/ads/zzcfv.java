package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzcfv extends zzcfp implements zzie {
    private String zzd;
    private final zzced zze;
    private boolean zzf;
    private final zzcfu zzg;
    private final zzcfa zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcfv(zzcee zzceeVar, zzced zzcedVar) {
        super(zzceeVar);
        String str;
        int i9;
        this.zze = zzcedVar;
        this.zzg = new zzcfu();
        this.zzh = new zzcfa();
        this.zzk = new Object();
        if (zzceeVar != null) {
            str = zzceeVar.zzr();
        } else {
            str = null;
        }
        this.zzl = (String) zzfyb.zzd(str).zzb("");
        if (zzceeVar != null) {
            i9 = zzceeVar.zzf();
        } else {
            i9 = 0;
        }
        this.zzm = i9;
    }

    public static final String zzm(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzv() {
        boolean z8;
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round((position / zza) * zza2);
        int zzs = zzcdv.zzs();
        int zzu = zzcdv.zzu();
        String str = this.zzd;
        String zzm = zzm(str);
        long j7 = round;
        if (round > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzn(str, zzm, position, zza, j7, zza2, z8, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zza(zzhb zzhbVar, zzhh zzhhVar, boolean z8, int i9) {
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzb(zzhb zzhbVar, zzhh zzhhVar, boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzc(zzhb zzhbVar, zzhh zzhhVar, boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzd(zzhb zzhbVar, zzhh zzhhVar, boolean z8) {
        if (zzhbVar instanceof zzhp) {
            this.zzg.zzb((zzhp) zzhbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
        synchronized (this.zzk) {
            try {
                ByteBuffer byteBuffer = this.zzi;
                if (byteBuffer != null && !this.zzj) {
                    byteBuffer.flip();
                    this.zzj = true;
                }
                this.zzf = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.zzi;
    }

    public final boolean zzl() {
        return this.zzn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ed, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b4, code lost:
    
        r21.zzn = true;
        zzj(r22, r4, (int) r21.zzh.zza(r21.zzi));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:? -> B:52:0x00d6). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcfp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzt(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfv.zzt(java.lang.String):boolean");
    }
}
