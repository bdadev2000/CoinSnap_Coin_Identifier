package com.bytedance.sdk.component.Sg.YFl.YFl.YFl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class YFl extends com.bytedance.sdk.component.Sg.YFl.AlY {
    public static volatile NjR YFl;
    private ExecutorService AlY;
    private List<com.bytedance.sdk.component.Sg.YFl.Sg> Sg = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.Sg.YFl.Sg> tN = new CopyOnWriteArrayList();

    public YFl(ExecutorService executorService) {
        this.AlY = executorService;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.AlY
    public List<com.bytedance.sdk.component.Sg.YFl.Sg> AlY() {
        return this.tN;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.AlY
    public ExecutorService Sg() {
        ExecutorService executorService;
        if (YFl != null) {
            executorService = YFl.YFl();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            return executorService;
        }
        return this.AlY;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.AlY
    public int YFl() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.AlY
    public List<com.bytedance.sdk.component.Sg.YFl.Sg> tN() {
        return this.Sg;
    }

    public boolean wN() {
        return (YFl == null || YFl.YFl() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.AlY
    public void YFl(int i10) {
    }

    public static void YFl(NjR njR) {
        YFl = njR;
    }
}
