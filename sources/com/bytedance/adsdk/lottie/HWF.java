package com.bytedance.adsdk.lottie;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class HWF {
    private float Bj;
    private Map<String, com.bytedance.adsdk.lottie.KS.KS> COT;
    private List<com.bytedance.adsdk.lottie.KS.HWF> HWF;
    private Map<String, List<com.bytedance.adsdk.lottie.KS.KS.jU>> KS;
    private SparseArray<com.bytedance.adsdk.lottie.KS.jU> QR;
    private List<com.bytedance.adsdk.lottie.KS.KS.jU> YW;
    private Rect dT;
    private Map<String, YW> jU;
    private LongSparseArray<com.bytedance.adsdk.lottie.KS.KS.jU> ku;
    private boolean rV;
    private float tG;
    private float vDp;
    private final woN zp = new woN();
    private final HashSet<String> lMd = new HashSet<>();
    private int dQp = 0;

    public Map<String, com.bytedance.adsdk.lottie.KS.KS> Bj() {
        return this.COT;
    }

    public float COT() {
        return (tG() / this.tG) * 1000.0f;
    }

    public float HWF() {
        return this.Bj;
    }

    public woN KS() {
        return this.zp;
    }

    public float QR() {
        return this.vDp;
    }

    public List<com.bytedance.adsdk.lottie.KS.KS.jU> YW() {
        return this.YW;
    }

    public SparseArray<com.bytedance.adsdk.lottie.KS.jU> dT() {
        return this.QR;
    }

    public Rect jU() {
        return this.dT;
    }

    public float ku() {
        return this.tG;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int lMd() {
        return this.dQp;
    }

    public float tG() {
        return this.vDp - this.Bj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.lottie.KS.KS.jU> it = this.YW.iterator();
        while (it.hasNext()) {
            sb.append(it.next().zp("\t"));
        }
        return sb.toString();
    }

    public Map<String, YW> vDp() {
        return this.jU;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void zp(Rect rect, float f9, float f10, float f11, List<com.bytedance.adsdk.lottie.KS.KS.jU> list, LongSparseArray<com.bytedance.adsdk.lottie.KS.KS.jU> longSparseArray, Map<String, List<com.bytedance.adsdk.lottie.KS.KS.jU>> map, Map<String, YW> map2, SparseArray<com.bytedance.adsdk.lottie.KS.jU> sparseArray, Map<String, com.bytedance.adsdk.lottie.KS.KS> map3, List<com.bytedance.adsdk.lottie.KS.HWF> list2) {
        this.dT = rect;
        this.Bj = f9;
        this.vDp = f10;
        this.tG = f11;
        this.YW = list;
        this.ku = longSparseArray;
        this.KS = map;
        this.jU = map2;
        this.QR = sparseArray;
        this.COT = map3;
        this.HWF = list2;
    }

    public com.bytedance.adsdk.lottie.KS.HWF KS(String str) {
        int size = this.HWF.size();
        for (int i9 = 0; i9 < size; i9++) {
            com.bytedance.adsdk.lottie.KS.HWF hwf = this.HWF.get(i9);
            if (hwf.zp(str)) {
                return hwf;
            }
        }
        return null;
    }

    public void lMd(boolean z8) {
        this.zp.zp(z8);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<com.bytedance.adsdk.lottie.KS.KS.jU> lMd(String str) {
        return this.KS.get(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void zp(String str) {
        this.lMd.add(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void zp(boolean z8) {
        this.rV = z8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void zp(int i9) {
        this.dQp += i9;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean zp() {
        return this.rV;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public com.bytedance.adsdk.lottie.KS.KS.jU zp(long j7) {
        return this.ku.get(j7);
    }

    public float zp(float f9) {
        return com.bytedance.adsdk.lottie.HWF.COT.zp(this.Bj, this.vDp, f9);
    }
}
