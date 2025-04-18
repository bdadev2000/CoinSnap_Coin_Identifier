package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzvn implements zzzb, zzug {
    final /* synthetic */ zzvs zza;
    private final Uri zzc;
    private final zzhc zzd;
    private final zzvh zze;
    private final zzacu zzf;
    private final zzdf zzg;
    private volatile boolean zzi;
    private long zzk;

    @Nullable
    private zzadx zzm;
    private boolean zzn;
    private final zzadn zzh = new zzadn();
    private boolean zzj = true;
    private final long zzb = zzui.zza();
    private zzgi zzl = zzi(0);

    public zzvn(zzvs zzvsVar, Uri uri, zzgd zzgdVar, zzvh zzvhVar, zzacu zzacuVar, zzdf zzdfVar) {
        this.zza = zzvsVar;
        this.zzc = uri;
        this.zzd = new zzhc(zzgdVar);
        this.zze = zzvhVar;
        this.zzf = zzacuVar;
        this.zzg = zzdfVar;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzvn zzvnVar, long j3, long j10) {
        zzvnVar.zzh.zza = j3;
        zzvnVar.zzk = j10;
        zzvnVar.zzj = true;
        zzvnVar.zzn = false;
    }

    private final zzgi zzi(long j3) {
        Map map;
        zzgg zzggVar = new zzgg();
        zzggVar.zzd(this.zzc);
        zzggVar.zzc(j3);
        zzggVar.zza(6);
        map = zzvs.zzb;
        zzggVar.zzb(map);
        return zzggVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zza(zzed zzedVar) {
        long zzR;
        long max;
        if (!this.zzn) {
            max = this.zzk;
        } else {
            zzR = this.zza.zzR(true);
            max = Math.max(zzR, this.zzk);
        }
        int zzb = zzedVar.zzb();
        zzadx zzadxVar = this.zzm;
        zzadxVar.getClass();
        zzadxVar.zzq(zzedVar, zzb);
        zzadxVar.zzs(max, 1, zzb, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzzb
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e3 A[EDGE_INSN: B:101:0x01e3->B:79:0x01e3 BREAK  A[LOOP:1: B:60:0x01a0->B:71:0x01a0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc A[Catch: all -> 0x0208, TRY_LEAVE, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0146 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:6:0x000b, B:11:0x003c, B:12:0x0041, B:15:0x0057, B:17:0x005d, B:21:0x0093, B:23:0x009e, B:24:0x00aa, B:26:0x00b4, B:27:0x00c0, B:29:0x00ca, B:30:0x00d6, B:32:0x00e0, B:33:0x00f2, B:35:0x00fc, B:37:0x0102, B:41:0x0132, B:42:0x0139, B:44:0x0146, B:46:0x014e, B:47:0x016b, B:111:0x010c, B:114:0x0120, B:123:0x0069, B:126:0x007f), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0186 A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:50:0x017b, B:52:0x0186, B:53:0x018b, B:55:0x018f), top: B:49:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018f A[Catch: all -> 0x0205, TRY_LEAVE, TryCatch #1 {all -> 0x0205, blocks: (B:50:0x017b, B:52:0x0186, B:53:0x018b, B:55:0x018f), top: B:49:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[LOOP:0: B:2:0x0004->B:87:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020e  */
    @Override // com.google.android.gms.internal.ads.zzzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvn.zzh():void");
    }
}
