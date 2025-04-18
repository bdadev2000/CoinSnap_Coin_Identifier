package com.bytedance.sdk.openadsdk.Sg;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class Sg extends YFl {
    private volatile boolean AlY;
    private int Sg;
    private int tN;

    public Sg(int i10, int i11) {
        this.Sg = 15;
        this.tN = 3;
        if (i10 > 0) {
            this.Sg = i10;
            this.tN = i11;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    private void AlY(List<File> list) {
        long Sg;
        int size;
        boolean YFl;
        if (list != null) {
            try {
                if (list.size() == 0 || (YFl = YFl((Sg = Sg(list)), (size = list.size())))) {
                    return;
                }
                TreeMap treeMap = new TreeMap();
                for (File file : list) {
                    treeMap.put(Long.valueOf(file.lastModified()), file);
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    if (entry != null && !YFl) {
                        ((Long) entry.getKey()).longValue();
                        File file2 = (File) entry.getValue();
                        long length = file2.length();
                        if (file2.delete()) {
                            size--;
                            Sg -= length;
                        }
                        if (YFl(file2, Sg, size)) {
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void tN(List<File> list) {
        long Sg = Sg(list);
        int size = list.size();
        if (!YFl(Sg, size)) {
            for (File file : list) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    Sg -= length;
                }
                if (YFl(file, Sg, size)) {
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.Sg.YFl
    public boolean YFl(long j3, int i10) {
        return i10 <= this.Sg;
    }

    @Override // com.bytedance.sdk.openadsdk.Sg.YFl
    public boolean YFl(File file, long j3, int i10) {
        return i10 <= this.tN;
    }

    @Override // com.bytedance.sdk.openadsdk.Sg.YFl
    public void YFl(List<File> list) {
        if (this.AlY) {
            AlY(list);
            this.AlY = false;
        } else {
            tN(list);
        }
    }

    public Sg(int i10, int i11, boolean z10) {
        this.Sg = 15;
        this.tN = 3;
        if (i10 > 0) {
            this.Sg = i10;
            this.tN = i11;
            this.AlY = z10;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
