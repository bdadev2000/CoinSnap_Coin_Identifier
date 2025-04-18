package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class zzceb extends zzcdv implements zzhh {
    private String zzd;
    private final zzcci zze;
    private boolean zzf;
    private final zzcea zzg;
    private final zzcdf zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzceb(zzccj zzccjVar, zzcci zzcciVar) {
        super(zzccjVar);
        this.zze = zzcciVar;
        this.zzg = new zzcea();
        this.zzh = new zzcdf();
        this.zzk = new Object();
        this.zzl = (String) zzfxx.zzd(zzccjVar != null ? zzccjVar.zzr() : null).zzb("");
        this.zzm = zzccjVar != null ? zzccjVar.zzf() : 0;
    }

    public static final String zzm(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzv() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round((position / zza) * zza2);
        int zzs = zzcca.zzs();
        int zzu = zzcca.zzu();
        String str = this.zzd;
        zzn(str, zzm(str), position, zza, round, zza2, round > 0, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zza(zzgg zzggVar, zzgm zzgmVar, boolean z2, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzb(zzgg zzggVar, zzgm zzgmVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzc(zzgg zzggVar, zzgm zzgmVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzd(zzgg zzggVar, zzgm zzgmVar, boolean z2) {
        if (zzggVar instanceof zzgu) {
            this.zzg.zzb((zzgu) zzggVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
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
    @Override // com.google.android.gms.internal.ads.zzcdv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzt(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzceb.zzt(java.lang.String):boolean");
    }
}
