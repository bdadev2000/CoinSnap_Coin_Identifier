package com.bytedance.sdk.openadsdk.AlY.wN.Sg;

import com.bytedance.sdk.openadsdk.core.model.Wwa;
import p5.b;
import p5.c;

/* loaded from: classes.dex */
public class EH {
    private c AlY;
    private String Sg;
    private long YFl;
    private int tN;
    private Wwa wN;

    /* loaded from: classes.dex */
    public static class YFl {
        private int DSW;
        private int NjR;
        private b eT;
        private int qsH;

        /* renamed from: vc, reason: collision with root package name */
        private int f10511vc;
        private int wN;
        private long YFl = 0;
        private long Sg = 0;
        private long tN = 0;
        private boolean AlY = false;

        /* renamed from: nc, reason: collision with root package name */
        private boolean f10510nc = false;

        private void GA() {
            long j3 = this.tN;
            if (j3 > 0) {
                long j10 = this.YFl;
                if (j10 > j3) {
                    this.YFl = j10 % j3;
                }
            }
        }

        public int AlY() {
            return this.wN;
        }

        public int DSW() {
            return this.DSW;
        }

        public int NjR() {
            return this.NjR;
        }

        public long Sg() {
            return this.Sg;
        }

        public long YFl() {
            return this.YFl;
        }

        public b YoT() {
            return this.eT;
        }

        public boolean eT() {
            return this.AlY;
        }

        public boolean nc() {
            return this.f10510nc;
        }

        public int qsH() {
            return this.qsH;
        }

        public long tN() {
            return this.tN;
        }

        public int vc() {
            long j3 = this.tN;
            if (j3 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.YFl * 100) / j3), 100);
        }

        public int wN() {
            return this.f10511vc;
        }

        public void AlY(int i10) {
            this.NjR = i10;
        }

        public void Sg(long j3) {
            this.Sg = j3;
        }

        public void YFl(long j3) {
            this.YFl = j3;
            GA();
        }

        public void tN(long j3) {
            this.tN = j3;
            GA();
        }

        public void Sg(int i10) {
            this.f10511vc = i10;
        }

        public void YFl(int i10) {
            this.wN = i10;
        }

        public void tN(int i10) {
            this.DSW = i10;
        }

        public void YFl(boolean z10) {
            this.AlY = z10;
        }

        public void YFl(b bVar) {
            this.eT = bVar;
        }
    }

    public EH(long j3, String str, int i10, c cVar, Wwa wwa) {
        this.YFl = j3;
        this.Sg = str;
        this.tN = i10;
        this.AlY = cVar;
        this.wN = wwa;
    }

    public c AlY() {
        return this.AlY;
    }

    public String Sg() {
        return this.Sg;
    }

    public long YFl() {
        return this.YFl;
    }

    public int tN() {
        return this.tN;
    }

    public Wwa wN() {
        return this.wN;
    }
}
