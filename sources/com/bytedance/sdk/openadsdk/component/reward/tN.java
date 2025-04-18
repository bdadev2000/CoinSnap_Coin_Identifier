package com.bytedance.sdk.openadsdk.component.reward;

import android.os.CountDownTimer;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH;
import com.bytedance.sdk.openadsdk.core.GA.AlY.YFl;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import k5.c;
import l5.d;
import l5.e;
import l5.g;
import n5.a;

/* loaded from: classes.dex */
public class tN implements g {
    private final a DSW;
    private final YFl YFl;
    private YFl.InterfaceC0113YFl qsH;

    /* renamed from: vc, reason: collision with root package name */
    private final Wwa f10605vc;
    private boolean wN;
    private boolean Sg = true;
    private long tN = 0;
    private boolean AlY = false;

    /* loaded from: classes.dex */
    public static class YFl implements c {
        private CountDownTimer AlY;
        private final a DSW;
        private long Sg;
        private final long YFl;
        private final com.bytedance.sdk.openadsdk.AlY.DSW qsH;
        private int tN = 0;

        /* renamed from: vc, reason: collision with root package name */
        private long f10606vc;
        private e wN;

        public YFl(long j3, a aVar, com.bytedance.sdk.openadsdk.AlY.DSW dsw) {
            this.YFl = j3;
            this.DSW = aVar;
            this.qsH = dsw;
        }

        @Override // k5.c
        public int AlY() {
            return 0;
        }

        @Override // k5.c
        public boolean DSW() {
            return this.tN == 2;
        }

        public long EH() {
            return this.f10606vc;
        }

        public int GA() {
            return 0;
        }

        public void NjR() {
            if (this.tN == 1) {
                return;
            }
            this.tN = 1;
            final long pDU = pDU();
            final long j3 = pDU - this.Sg;
            CountDownTimer countDownTimer = new CountDownTimer(j3, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.tN.YFl.1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    YFl.this.tN = 4;
                    YFl.this.f10606vc = pDU;
                    if (YFl.this.wN != null) {
                        YFl.this.wN.YFl(YFl.this.EH(), 100);
                    }
                    EH.YFl yFl = new EH.YFl();
                    yFl.YFl(pDU);
                    yFl.tN(pDU);
                    yFl.Sg(YFl.this.YoT());
                    yFl.AlY(YFl.this.GA());
                    com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.Sg(YFl.this.DSW, yFl, YFl.this.qsH);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j10) {
                    long j11 = (j3 - j10) + YFl.this.Sg;
                    YFl.this.f10606vc = j11;
                    if (YFl.this.wN != null) {
                        YFl.this.wN.YFl(j11, pDU);
                    }
                }
            };
            this.AlY = countDownTimer;
            countDownTimer.start();
        }

        @Override // k5.c
        public boolean Sg() {
            return false;
        }

        @Override // k5.c
        public boolean YFl() {
            return false;
        }

        public long YoT() {
            return 0L;
        }

        public void eT() {
            this.tN = 0;
            CountDownTimer countDownTimer = this.AlY;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.AlY = null;
            }
            if (this.wN != null) {
                this.wN = null;
            }
        }

        public void nc() {
            this.tN = 2;
            this.Sg = this.f10606vc;
            CountDownTimer countDownTimer = this.AlY;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.AlY = null;
            }
        }

        public long pDU() {
            return this.YFl;
        }

        @Override // k5.c
        public boolean qsH() {
            return this.tN == 0;
        }

        @Override // k5.c
        public boolean tN() {
            return false;
        }

        @Override // k5.c
        public int wN() {
            return 0;
        }

        @Override // k5.c
        public boolean vc() {
            return this.tN == 1;
        }

        public void YFl(long j3) {
            this.Sg = j3;
        }

        public void YFl(e eVar) {
            this.wN = eVar;
        }
    }

    public tN(Wwa wwa, com.bytedance.sdk.openadsdk.AlY.DSW dsw) {
        long j3;
        a aVar = new a() { // from class: com.bytedance.sdk.openadsdk.component.reward.tN.1
        };
        this.DSW = aVar;
        this.f10605vc = wwa;
        p5.a BPI = wwa.BPI();
        long j10 = 10;
        if (BPI != null) {
            j3 = (long) BPI.f23459d;
        } else {
            j3 = 10;
        }
        if (j3 <= 0) {
            BPI.f23459d = 10.0d;
        } else {
            j10 = j3;
        }
        this.YFl = new YFl(j10 * 1000, aVar, dsw);
    }

    @Override // l5.g
    public void AlY(boolean z10) {
    }

    @Override // l5.g
    public int DSW() {
        return 0;
    }

    @Override // l5.g
    public boolean EH() {
        return this.wN;
    }

    @Override // l5.g
    public l5.a GA() {
        return null;
    }

    @Override // l5.g
    public long NjR() {
        return wN();
    }

    @Override // l5.g
    public void Sg(p5.c cVar) {
    }

    public a Wwa() {
        return this.DSW;
    }

    @Override // l5.g
    public void YFl(l5.c cVar) {
    }

    @Override // l5.g
    public c YoT() {
        return this.YFl;
    }

    @Override // l5.g
    public boolean eT() {
        return false;
    }

    @Override // l5.g
    public boolean lG() {
        return false;
    }

    @Override // l5.g
    public int nc() {
        return j5.a.a(this.YFl.f10606vc, this.YFl.YFl);
    }

    @Override // l5.g
    public boolean pDU() {
        return this.AlY;
    }

    @Override // l5.g
    public long qsH() {
        return this.YFl.pDU();
    }

    @Override // l5.g
    public boolean rkt() {
        return false;
    }

    @Override // l5.g
    public void tN(long j3) {
    }

    @Override // l5.g
    public long vc() {
        return 0L;
    }

    @Override // l5.g
    public void wN(boolean z10) {
    }

    @Override // l5.g
    public void AlY() {
        tN();
    }

    @Override // l5.g
    public void Sg() {
        this.YFl.NjR();
        EH.YFl yFl = new EH.YFl();
        yFl.YFl(wN());
        yFl.tN(qsH());
        yFl.Sg(vc());
        com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.Sg(this.DSW, yFl);
        YFl.InterfaceC0113YFl interfaceC0113YFl = this.qsH;
        if (interfaceC0113YFl != null) {
            interfaceC0113YFl.YFl(1);
        }
    }

    @Override // l5.g
    public void YFl(d dVar) {
    }

    @Override // l5.g
    public void tN() {
        this.YFl.eT();
    }

    @Override // l5.g
    public long wN() {
        return this.YFl.EH();
    }

    @Override // l5.g
    public void YFl() {
        this.YFl.nc();
        EH.YFl yFl = new EH.YFl();
        yFl.YFl(wN());
        yFl.tN(qsH());
        yFl.Sg(vc());
        com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(this.DSW, yFl);
        YFl.InterfaceC0113YFl interfaceC0113YFl = this.qsH;
        if (interfaceC0113YFl != null) {
            interfaceC0113YFl.YFl(2);
        }
    }

    @Override // l5.g
    public void tN(boolean z10) {
        this.wN = z10;
    }

    @Override // l5.g
    public void Sg(long j3) {
        this.tN = j3;
    }

    @Override // l5.g
    public void Sg(boolean z10) {
        this.AlY = z10;
    }

    @Override // l5.g
    public void YFl(boolean z10, int i10) {
        tN();
    }

    @Override // l5.g
    public boolean YFl(p5.c cVar) {
        this.AlY = cVar.qsH();
        if (cVar.DSW() > 0) {
            this.YFl.YFl(cVar.DSW());
        }
        com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(this.f10605vc, this.DSW, cVar);
        this.YFl.NjR();
        return true;
    }

    @Override // l5.g
    public void YFl(long j3) {
        this.YFl.YFl(j3);
    }

    @Override // l5.g
    public void YFl(boolean z10) {
        this.Sg = z10;
    }

    @Override // l5.g
    public void YFl(e eVar) {
        this.YFl.YFl(eVar);
    }

    public void YFl(YFl.InterfaceC0113YFl interfaceC0113YFl) {
        this.qsH = interfaceC0113YFl;
    }
}
