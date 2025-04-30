package com.bytedance.sdk.component.COT.KS.zp;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* loaded from: classes.dex */
public class zp implements com.bytedance.sdk.component.COT.lMd, Cloneable {
    private static volatile com.bytedance.sdk.component.COT.lMd HWF;
    private File COT;
    private boolean KS;
    private boolean jU;
    private int lMd;
    private long zp;

    public zp(int i9, long j7, File file) {
        this(i9, j7, i9 != 0, j7 != 0, file);
    }

    public static com.bytedance.sdk.component.COT.lMd QR() {
        return HWF;
    }

    private static long ku() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    @Override // com.bytedance.sdk.component.COT.lMd
    public File COT() {
        return this.COT;
    }

    @Override // com.bytedance.sdk.component.COT.lMd
    public boolean HWF() {
        return true;
    }

    @Override // com.bytedance.sdk.component.COT.lMd
    public boolean KS() {
        return this.KS;
    }

    @Override // com.bytedance.sdk.component.COT.lMd
    public boolean jU() {
        return this.jU;
    }

    @Override // com.bytedance.sdk.component.COT.lMd
    public int lMd() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.COT.lMd
    public long zp() {
        return this.zp;
    }

    public zp(int i9, long j7, boolean z8, boolean z9, File file) {
        this.zp = j7;
        this.lMd = i9;
        this.KS = z8;
        this.jU = z9;
        this.COT = file;
    }

    public static void zp(Context context, com.bytedance.sdk.component.COT.lMd lmd) {
        if (lmd != null) {
            HWF = lmd;
        } else {
            HWF = zp(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.COT.lMd zp(File file) {
        int min;
        long min2;
        file.mkdirs();
        if (HWF == null) {
            min = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            min2 = Math.min(ku() / 16, 41943040L);
        } else {
            min = Math.min(HWF.lMd() / 2, 31457280);
            min2 = Math.min(HWF.zp() / 2, 41943040L);
        }
        return new zp(Math.max(min, 26214400), Math.max(min2, 20971520L), file);
    }
}
