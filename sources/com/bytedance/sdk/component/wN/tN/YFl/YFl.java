package com.bytedance.sdk.component.wN.tN.YFl;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* loaded from: classes.dex */
public class YFl implements com.bytedance.sdk.component.wN.Sg, Cloneable {

    /* renamed from: vc, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.wN.Sg f10474vc;
    private boolean AlY;
    private int Sg;
    private long YFl;
    private boolean tN;
    private File wN;

    public YFl(int i10, long j3, File file) {
        this(i10, j3, i10 != 0, j3 != 0, file);
    }

    public static com.bytedance.sdk.component.wN.Sg DSW() {
        return f10474vc;
    }

    private static long qsH() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    @Override // com.bytedance.sdk.component.wN.Sg
    public boolean AlY() {
        return this.AlY;
    }

    @Override // com.bytedance.sdk.component.wN.Sg
    public int Sg() {
        return this.Sg;
    }

    @Override // com.bytedance.sdk.component.wN.Sg
    public long YFl() {
        return this.YFl;
    }

    @Override // com.bytedance.sdk.component.wN.Sg
    public boolean tN() {
        return this.tN;
    }

    @Override // com.bytedance.sdk.component.wN.Sg
    public boolean vc() {
        return true;
    }

    @Override // com.bytedance.sdk.component.wN.Sg
    public File wN() {
        return this.wN;
    }

    public YFl(int i10, long j3, boolean z10, boolean z11, File file) {
        this.YFl = j3;
        this.Sg = i10;
        this.tN = z10;
        this.AlY = z11;
        this.wN = file;
    }

    public static void YFl(Context context, com.bytedance.sdk.component.wN.Sg sg2) {
        if (sg2 != null) {
            f10474vc = sg2;
        } else {
            f10474vc = YFl(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.wN.Sg YFl(File file) {
        int min;
        long min2;
        file.mkdirs();
        if (f10474vc == null) {
            min = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            min2 = Math.min(qsH() / 16, 41943040L);
        } else {
            min = Math.min(f10474vc.Sg() / 2, 31457280);
            min2 = Math.min(f10474vc.YFl() / 2, 41943040L);
        }
        return new YFl(Math.max(min, 26214400), Math.max(min2, 20971520L), file);
    }
}
