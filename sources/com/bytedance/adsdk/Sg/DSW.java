package com.bytedance.adsdk.Sg;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DSW {
    private Map<String, nc> AlY;
    private SparseArray<com.bytedance.adsdk.Sg.tN.AlY> DSW;
    private float GA;
    private List<com.bytedance.adsdk.Sg.tN.tN.wN> NjR;
    private YFl Wwa;
    private float YoT;
    private float eT;

    /* renamed from: nc, reason: collision with root package name */
    private Rect f10145nc;
    private boolean pDU;
    private Sg qO;
    private LongSparseArray<com.bytedance.adsdk.Sg.tN.tN.wN> qsH;
    private tN rkt;
    private Map<String, List<com.bytedance.adsdk.Sg.tN.tN.wN>> tN;

    /* renamed from: vc, reason: collision with root package name */
    private List<com.bytedance.adsdk.Sg.tN.vc> f10146vc;
    private Map<String, com.bytedance.adsdk.Sg.tN.tN> wN;
    private final Wwa YFl = new Wwa();
    private final HashSet<String> Sg = new HashSet<>();
    private int EH = 0;
    private String lG = "";

    /* loaded from: classes.dex */
    public static class Sg {
        public int[][] Sg;
        public String YFl;
    }

    /* loaded from: classes.dex */
    public static class YFl {
        public Map<String, Object> Sg;
        public int YFl;
        public Map<String, Object> tN;
    }

    /* loaded from: classes.dex */
    public static class tN {
        public String AlY;
        public String Sg;
        public int YFl;
        public String tN;

        /* renamed from: vc, reason: collision with root package name */
        public String f10149vc;
        public int[] wN;
    }

    public Rect AlY() {
        return this.f10145nc;
    }

    public float DSW() {
        return this.YoT;
    }

    public Map<String, com.bytedance.adsdk.Sg.tN.tN> EH() {
        return this.wN;
    }

    public List<com.bytedance.adsdk.Sg.tN.tN.wN> GA() {
        return this.NjR;
    }

    public String NjR() {
        return this.lG;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int Sg() {
        return this.EH;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void YFl(Rect rect, float f10, float f11, float f12, List<com.bytedance.adsdk.Sg.tN.tN.wN> list, LongSparseArray<com.bytedance.adsdk.Sg.tN.tN.wN> longSparseArray, Map<String, List<com.bytedance.adsdk.Sg.tN.tN.wN>> map, Map<String, nc> map2, SparseArray<com.bytedance.adsdk.Sg.tN.AlY> sparseArray, Map<String, com.bytedance.adsdk.Sg.tN.tN> map3, List<com.bytedance.adsdk.Sg.tN.vc> list2, tN tNVar, String str, YFl yFl, Sg sg2) {
        this.f10145nc = rect;
        this.eT = f10;
        this.YoT = f11;
        this.GA = f12;
        this.NjR = list;
        this.qsH = longSparseArray;
        this.tN = map;
        this.AlY = map2;
        this.DSW = sparseArray;
        this.wN = map3;
        this.f10146vc = list2;
        this.rkt = tNVar;
        this.lG = str;
        this.Wwa = yFl;
        this.qO = sg2;
    }

    public float YoT() {
        return this.GA;
    }

    public YFl eT() {
        return this.Wwa;
    }

    public float lG() {
        return this.YoT - this.eT;
    }

    public Sg nc() {
        return this.qO;
    }

    public SparseArray<com.bytedance.adsdk.Sg.tN.AlY> pDU() {
        return this.DSW;
    }

    public tN qsH() {
        return this.rkt;
    }

    public Map<String, nc> rkt() {
        return this.AlY;
    }

    public Wwa tN() {
        return this.YFl;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.Sg.tN.tN.wN> it = this.NjR.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().YFl("\t"));
        }
        return sb2.toString();
    }

    public float vc() {
        return this.eT;
    }

    public float wN() {
        return (lG() / this.GA) * 1000.0f;
    }

    public void Sg(boolean z10) {
        this.YFl.YFl(z10);
    }

    public com.bytedance.adsdk.Sg.tN.vc tN(String str) {
        int size = this.f10146vc.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.bytedance.adsdk.Sg.tN.vc vcVar = this.f10146vc.get(i10);
            if (vcVar.YFl(str)) {
                return vcVar;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<com.bytedance.adsdk.Sg.tN.tN.wN> Sg(String str) {
        return this.tN.get(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void YFl(String str) {
        this.Sg.add(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void YFl(boolean z10) {
        this.pDU = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void YFl(int i10) {
        this.EH += i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean YFl() {
        return this.pDU;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public com.bytedance.adsdk.Sg.tN.tN.wN YFl(long j3) {
        return this.qsH.get(j3);
    }

    public float YFl(float f10) {
        return com.bytedance.adsdk.Sg.vc.wN.YFl(this.eT, this.YoT, f10);
    }
}
