package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzwm implements zzaae, zzvd {
    final /* synthetic */ zzwr zza;
    private final Uri zzc;
    private final zzid zzd;
    private final zzwg zze;
    private final zzadx zzf;
    private final zzeu zzg;
    private volatile boolean zzi;
    private long zzk;

    @Nullable
    private zzafa zzm;
    private boolean zzn;
    private final zzaeq zzh = new zzaeq();
    private boolean zzj = true;
    private final long zzb = zzvf.zza();
    private zzhh zzl = zzi(0);

    public zzwm(zzwr zzwrVar, Uri uri, zzhb zzhbVar, zzwg zzwgVar, zzadx zzadxVar, zzeu zzeuVar) {
        this.zza = zzwrVar;
        this.zzc = uri;
        this.zzd = new zzid(zzhbVar);
        this.zze = zzwgVar;
        this.zzf = zzadxVar;
        this.zzg = zzeuVar;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzwm zzwmVar, long j7, long j9) {
        zzwmVar.zzh.zza = j7;
        zzwmVar.zzk = j9;
        zzwmVar.zzj = true;
        zzwmVar.zzn = false;
    }

    private final zzhh zzi(long j7) {
        Map map;
        zzhf zzhfVar = new zzhf();
        zzhfVar.zzd(this.zzc);
        zzhfVar.zzc(j7);
        zzhfVar.zza(6);
        map = zzwr.zzb;
        zzhfVar.zzb(map);
        return zzhfVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final void zza(zzfu zzfuVar) {
        long zzR;
        long max;
        if (!this.zzn) {
            max = this.zzk;
        } else {
            zzR = this.zza.zzR(true);
            max = Math.max(zzR, this.zzk);
        }
        long j7 = max;
        int zzb = zzfuVar.zzb();
        zzafa zzafaVar = this.zzm;
        zzafaVar.getClass();
        zzaey.zzb(zzafaVar, zzfuVar, zzb);
        zzafaVar.zzs(j7, 1, zzb, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaae
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ec A[EDGE_INSN: B:102:0x01ec->B:80:0x01ec BREAK  A[LOOP:1: B:61:0x01a9->B:72:0x01a9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0135 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:11:0x003c, B:13:0x0047, B:16:0x005c, B:18:0x0062, B:22:0x0097, B:24:0x00a2, B:25:0x00ae, B:27:0x00b8, B:28:0x00c4, B:30:0x00ce, B:31:0x00da, B:33:0x00e4, B:34:0x00f6, B:36:0x0100, B:38:0x0106, B:42:0x0135, B:43:0x013c, B:45:0x0149, B:47:0x0151, B:48:0x016e, B:112:0x0110, B:115:0x0126, B:124:0x006e, B:127:0x0087), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189 A[Catch: all -> 0x018f, TryCatch #8 {all -> 0x018f, blocks: (B:51:0x017e, B:53:0x0189, B:54:0x0193, B:56:0x0197), top: B:50:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0197 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #8 {all -> 0x018f, blocks: (B:51:0x017e, B:53:0x0189, B:54:0x0193, B:56:0x0197), top: B:50:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[LOOP:0: B:2:0x0004->B:88:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0212  */
    @Override // com.google.android.gms.internal.ads.zzaae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwm.zzh():void");
    }
}
