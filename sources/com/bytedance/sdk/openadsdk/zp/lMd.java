package com.bytedance.sdk.openadsdk.zp;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class lMd extends zp {
    private volatile boolean KS;
    private int lMd;
    private int zp;

    public lMd(int i9, int i10) {
        this.zp = 15;
        this.lMd = 3;
        if (i9 > 0) {
            this.zp = i9;
            this.lMd = i10;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    private void KS(List<File> list) {
        long lMd = lMd(list);
        int size = list.size();
        if (!zp(lMd, size)) {
            for (File file : list) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    lMd -= length;
                }
                if (zp(file, lMd, size)) {
                    return;
                }
            }
        }
    }

    private void jU(List<File> list) {
        long lMd;
        int size;
        boolean zp;
        if (list != null) {
            try {
                if (list.size() == 0 || (zp = zp((lMd = lMd(list)), (size = list.size())))) {
                    return;
                }
                TreeMap treeMap = new TreeMap();
                for (File file : list) {
                    treeMap.put(Long.valueOf(file.lastModified()), file);
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    if (entry != null && !zp) {
                        ((Long) entry.getKey()).getClass();
                        File file2 = (File) entry.getValue();
                        long length = file2.length();
                        if (file2.delete()) {
                            size--;
                            lMd -= length;
                        }
                        if (zp(file2, lMd, size)) {
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.zp.zp
    public boolean zp(long j7, int i9) {
        return i9 <= this.zp;
    }

    @Override // com.bytedance.sdk.openadsdk.zp.zp
    public boolean zp(File file, long j7, int i9) {
        return i9 <= this.lMd;
    }

    @Override // com.bytedance.sdk.openadsdk.zp.zp
    public void zp(List<File> list) {
        if (this.KS) {
            jU(list);
            this.KS = false;
        } else {
            KS(list);
        }
    }

    public lMd(int i9, int i10, boolean z8) {
        this.zp = 15;
        this.lMd = 3;
        if (i9 > 0) {
            this.zp = i9;
            this.lMd = i10;
            this.KS = z8;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
