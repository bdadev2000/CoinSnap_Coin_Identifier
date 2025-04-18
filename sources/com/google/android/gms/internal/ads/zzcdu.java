package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcdu extends zzcdr {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcdu(zzccf zzccfVar) {
        super(zzccfVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfsc.zza(zzfsb.zza(), cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        } else {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        }
    }

    private final File zza(File file) {
        return new File(zzfsc.zza(zzfsb.zza(), this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x034b, code lost:
    
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0351, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0359, code lost:
    
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(3) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x035b, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zze("Preloaded " + com.google.android.gms.internal.ads.zzcdu.zzf.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x037e, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0387, code lost:
    
        if (r0.isFile() == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0389, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0391, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03f1  */
    @Override // com.google.android.gms.internal.ads.zzcdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzt(final java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdu.zzt(java.lang.String):boolean");
    }
}
