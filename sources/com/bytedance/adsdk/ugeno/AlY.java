package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.AlY.vc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AlY {
    private static volatile AlY YFl;
    private YFl AlY;
    private List<com.bytedance.adsdk.ugeno.core.Sg> Sg;
    private com.bytedance.adsdk.ugeno.core.tN tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.Sg.tN f10229vc;
    private com.bytedance.adsdk.ugeno.tN.YFl wN;

    private AlY() {
    }

    public static AlY YFl() {
        if (YFl == null) {
            synchronized (AlY.class) {
                if (YFl == null) {
                    YFl = new AlY();
                }
            }
        }
        return YFl;
    }

    private void wN() {
        ArrayList arrayList = new ArrayList();
        this.Sg = arrayList;
        com.bytedance.adsdk.ugeno.core.tN tNVar = this.tN;
        if (tNVar != null) {
            arrayList.addAll(tNVar.YFl());
        }
        com.bytedance.adsdk.ugeno.core.AlY.YFl(this.Sg);
    }

    public com.bytedance.adsdk.ugeno.core.Sg.tN AlY() {
        return this.f10229vc;
    }

    public YFl Sg() {
        return this.AlY;
    }

    public com.bytedance.adsdk.ugeno.tN.YFl tN() {
        return this.wN;
    }

    public void YFl(Context context, com.bytedance.adsdk.ugeno.core.tN tNVar, YFl yFl) {
        this.tN = tNVar;
        this.AlY = yFl;
        wN();
    }

    public void YFl(com.bytedance.adsdk.ugeno.tN.YFl yFl) {
        this.wN = yFl;
    }

    public void YFl(com.bytedance.adsdk.ugeno.AlY.AlY alY) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.AlY.YFl().YFl());
        if (alY != null) {
            arrayList.addAll(alY.YFl());
        }
        vc.YFl(arrayList);
    }
}
