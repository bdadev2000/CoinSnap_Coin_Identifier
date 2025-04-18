package com.bytedance.sdk.openadsdk.core;

/* loaded from: classes.dex */
public class bZ {
    private static bZ YFl;
    private com.bytedance.sdk.openadsdk.YFl.wN.YFl AlY;
    private com.bytedance.sdk.openadsdk.core.model.YFl Sg;
    private com.bytedance.sdk.openadsdk.core.model.Wwa tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.YFl.AlY.Sg f10669vc;
    private com.bytedance.sdk.openadsdk.YFl.tN.Sg wN;

    private bZ() {
    }

    public static bZ YFl() {
        if (YFl == null) {
            YFl = new bZ();
        }
        return YFl;
    }

    public com.bytedance.sdk.openadsdk.YFl.tN.Sg AlY() {
        return this.wN;
    }

    public com.bytedance.sdk.openadsdk.core.model.YFl DSW() {
        return this.Sg;
    }

    public com.bytedance.sdk.openadsdk.core.model.Wwa Sg() {
        return this.tN;
    }

    public com.bytedance.sdk.openadsdk.YFl.wN.YFl tN() {
        return this.AlY;
    }

    public void vc() {
        this.tN = null;
        this.Sg = null;
        this.AlY = null;
        this.wN = null;
        this.f10669vc = null;
    }

    public com.bytedance.sdk.openadsdk.YFl.AlY.Sg wN() {
        return this.f10669vc;
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        this.tN = wwa;
    }

    public void YFl(com.bytedance.sdk.openadsdk.YFl.tN.Sg sg2) {
        this.wN = sg2;
    }

    public void YFl(com.bytedance.sdk.openadsdk.YFl.wN.YFl yFl) {
        this.AlY = yFl;
    }

    public void YFl(com.bytedance.sdk.openadsdk.YFl.AlY.Sg sg2) {
        this.f10669vc = sg2;
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.model.YFl yFl) {
        this.Sg = yFl;
    }
}
