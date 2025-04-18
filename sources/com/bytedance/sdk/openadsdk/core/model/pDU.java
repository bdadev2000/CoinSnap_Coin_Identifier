package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class pDU implements com.bytedance.sdk.component.adexpress.tN {
    public final float AlY;
    public final int DSW;
    public final boolean EH;
    public JSONObject GA;
    public final int NjR;
    public final float Sg;
    public boolean Wwa;
    public final float YFl;
    public int YoT;
    public final String eT;
    public JSONObject lG;

    /* renamed from: nc, reason: collision with root package name */
    public final int f10709nc;
    public SparseArray<tN.YFl> pDU;
    public final int qsH;
    public int rkt;
    public final float tN;

    /* renamed from: vc, reason: collision with root package name */
    public final long f10710vc;
    public final long wN;

    /* loaded from: classes.dex */
    public static class YFl {
        private float AlY;
        private float DSW;
        private int EH;
        private int GA;
        private int NjR;
        private long Sg;
        private boolean Wwa;
        private String YoT;
        private int eT;

        /* renamed from: nc, reason: collision with root package name */
        private int f10711nc;
        private JSONObject pDU;
        private int qsH;
        private JSONObject rkt;
        private long tN;

        /* renamed from: vc, reason: collision with root package name */
        private float f10712vc;
        private float wN;
        private boolean lG = false;
        protected SparseArray<tN.YFl> YFl = new SparseArray<>();

        public YFl AlY(float f10) {
            this.DSW = f10;
            return this;
        }

        public YFl Sg(int i10) {
            this.GA = i10;
            return this;
        }

        public YFl YFl(int i10) {
            this.EH = i10;
            return this;
        }

        public YFl tN(float f10) {
            this.f10712vc = f10;
            return this;
        }

        public YFl vc(int i10) {
            this.eT = i10;
            return this;
        }

        public YFl wN(int i10) {
            this.f10711nc = i10;
            return this;
        }

        public YFl AlY(int i10) {
            this.NjR = i10;
            return this;
        }

        public YFl Sg(long j3) {
            this.tN = j3;
            return this;
        }

        public YFl YFl(JSONObject jSONObject) {
            this.pDU = jSONObject;
            return this;
        }

        public YFl tN(int i10) {
            this.qsH = i10;
            return this;
        }

        public YFl Sg(float f10) {
            this.wN = f10;
            return this;
        }

        public YFl YFl(boolean z10) {
            this.Wwa = z10;
            return this;
        }

        public YFl Sg(JSONObject jSONObject) {
            this.rkt = jSONObject;
            return this;
        }

        public YFl YFl(long j3) {
            this.Sg = j3;
            return this;
        }

        public YFl Sg(boolean z10) {
            this.lG = z10;
            return this;
        }

        public YFl YFl(float f10) {
            this.AlY = f10;
            return this;
        }

        public YFl YFl(String str) {
            this.YoT = str;
            return this;
        }

        public YFl YFl(SparseArray<tN.YFl> sparseArray) {
            this.YFl = sparseArray;
            return this;
        }

        public pDU YFl() {
            return new pDU(this);
        }
    }

    private pDU(@NonNull YFl yFl) {
        this.Wwa = false;
        this.YFl = yFl.DSW;
        this.Sg = yFl.f10712vc;
        this.tN = yFl.wN;
        this.AlY = yFl.AlY;
        this.wN = yFl.tN;
        this.f10710vc = yFl.Sg;
        this.DSW = yFl.qsH;
        this.qsH = yFl.NjR;
        this.NjR = yFl.f10711nc;
        this.f10709nc = yFl.eT;
        this.eT = yFl.YoT;
        this.pDU = yFl.YFl;
        this.EH = yFl.Wwa;
        this.YoT = yFl.GA;
        this.GA = yFl.pDU;
        this.rkt = yFl.EH;
        this.lG = yFl.rkt;
        this.Wwa = yFl.lG;
    }
}
