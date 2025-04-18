package com.bytedance.sdk.component.vc.YFl;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class qsH {
    private static qsH GA;

    /* renamed from: nc, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.vc.YFl.wN.YFl f10464nc;
    private volatile com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl AlY;
    private volatile com.bytedance.sdk.component.vc.YFl.YFl.wN DSW;
    private long EH;
    private volatile wN NjR;
    private volatile com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl Sg;
    private volatile Context YFl;
    private volatile Map<Integer, com.bytedance.sdk.component.vc.YFl.Sg.tN> YoT;
    private volatile com.bytedance.sdk.component.vc.YFl.Sg.tN eT;
    private final AtomicBoolean pDU = new AtomicBoolean(false);
    private volatile boolean qsH;
    private volatile com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl tN;

    /* renamed from: vc, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl f10465vc;
    private volatile com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl wN;

    private qsH() {
    }

    public static synchronized qsH DSW() {
        qsH qsh;
        synchronized (qsH.class) {
            if (GA == null) {
                GA = new qsH();
            }
            qsh = GA;
        }
        return qsh;
    }

    public static com.bytedance.sdk.component.vc.YFl.wN.YFl wN() {
        if (f10464nc == null) {
            synchronized (qsH.class) {
                if (f10464nc == null) {
                    f10464nc = new com.bytedance.sdk.component.vc.YFl.wN.Sg();
                }
            }
        }
        return f10464nc;
    }

    public com.bytedance.sdk.component.vc.YFl.YFl.wN AlY() {
        return this.DSW;
    }

    public com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl EH() {
        return this.wN;
    }

    public com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl GA() {
        return this.tN;
    }

    public void NjR() {
        com.bytedance.sdk.component.vc.YFl.Sg.AlY.YFl.Sg();
    }

    public boolean Sg() {
        return this.qsH;
    }

    public boolean YFl() {
        return this.pDU.get();
    }

    public com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl YoT() {
        return this.Sg;
    }

    public void eT() {
        com.bytedance.sdk.component.vc.YFl.Sg.AlY.YFl.tN();
    }

    public long lG() {
        return this.EH * 24 * 60 * 60 * 1000;
    }

    public com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl nc() {
        return this.f10465vc;
    }

    public com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl pDU() {
        return this.AlY;
    }

    public com.bytedance.sdk.component.vc.YFl.Sg.tN qsH() {
        return this.eT;
    }

    public wN rkt() {
        return this.NjR;
    }

    public Map<Integer, com.bytedance.sdk.component.vc.YFl.Sg.tN> tN() {
        return this.YoT;
    }

    public Context vc() {
        return this.YFl;
    }

    public void AlY(com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl) {
        this.AlY = yFl;
    }

    public void Sg(boolean z10) {
        this.qsH = z10;
    }

    public void YFl(boolean z10) {
        this.pDU.set(z10);
    }

    public void tN(com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl) {
        this.tN = yFl;
    }

    public void Sg(com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl) {
        this.Sg = yFl;
    }

    public void YFl(com.bytedance.sdk.component.vc.YFl.YFl.wN wNVar) {
        this.DSW = wNVar;
    }

    public void YFl(Context context) {
        this.YFl = context;
    }

    public void YFl(com.bytedance.sdk.component.vc.YFl.Sg.tN tNVar) {
        this.eT = tNVar;
    }

    public void YFl(com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl) {
        this.f10465vc = yFl;
    }

    public void YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl) {
        if (yFl == null) {
            return;
        }
        yFl.YFl(System.currentTimeMillis());
        com.bytedance.sdk.component.vc.YFl.Sg.AlY.YFl.YFl(yFl, yFl.AlY());
    }

    public void wN(com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl) {
        this.wN = yFl;
    }

    public void YFl(String str, boolean z10) {
        com.bytedance.sdk.component.vc.YFl.vc.YFl.YFl().YFl(str, z10);
    }

    public void YFl(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.vc.YFl.vc.YFl.YFl().YFl(str, list, z10, map, i10, str2);
    }

    public void YFl(wN wNVar) {
        this.NjR = wNVar;
    }

    public void YFl(long j3) {
        this.EH = j3;
    }
}
