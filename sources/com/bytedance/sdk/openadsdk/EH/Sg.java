package com.bytedance.sdk.openadsdk.EH;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Sg {
    public static int AlY = 2;
    public static int Sg = 0;
    public static int YFl = -1;
    public static int tN = 1;
    public static int wN = 3;

    /* renamed from: vc, reason: collision with root package name */
    private int f10515vc = YFl;
    private long DSW = 0;
    private long qsH = 0;
    private final List<tN> NjR = new ArrayList();

    /* renamed from: nc, reason: collision with root package name */
    private long f10514nc = 0;

    public void AlY(long j3) {
        int i10 = this.f10515vc;
        if (i10 != YFl && i10 == AlY) {
            this.f10515vc = tN;
            this.NjR.add(new tN(this.f10514nc, j3));
            this.f10514nc = 0L;
        }
    }

    public void Sg(long j3) {
        int i10;
        int i11 = this.f10515vc;
        if (i11 != YFl && i11 != (i10 = wN)) {
            this.f10515vc = i10;
            this.qsH = j3;
        }
    }

    public void YFl(long j3) {
        this.f10515vc = Sg;
        this.DSW = j3;
    }

    public void tN(long j3) {
        int i10;
        int i11 = this.f10515vc;
        if (i11 != YFl && i11 != (i10 = AlY) && i11 != wN) {
            this.f10515vc = i10;
            this.f10514nc = j3;
        }
    }

    public long YFl(long j3, long j10) {
        long j11;
        long j12;
        long Sg2;
        long j13 = this.qsH;
        if (j13 != 0 && j3 > j13) {
            return 0L;
        }
        int i10 = 0;
        for (tN tNVar : this.NjR) {
            if (tNVar.Sg() > j3) {
                if (j3 < tNVar.YFl()) {
                    j12 = i10;
                    Sg2 = tNVar.Sg() - tNVar.YFl();
                } else {
                    j12 = i10;
                    Sg2 = tNVar.Sg() - j3;
                }
                i10 = (int) (Sg2 + j12);
            }
        }
        long j14 = this.DSW;
        if (j14 < j3) {
            long j15 = this.f10514nc;
            if (j15 == 0) {
                j15 = this.qsH;
                if (j15 == 0) {
                    j11 = j10 - j3;
                }
            } else if (j15 <= j3) {
                return 0L;
            }
            return (j15 - j3) - i10;
        }
        long j16 = this.f10514nc;
        if (j16 == 0) {
            j16 = this.qsH;
            if (j16 == 0) {
                j11 = j10 - j14;
            }
        } else if (j16 <= j14) {
            return 0L;
        }
        return (j16 - j14) - i10;
        return j11 - i10;
    }

    public int YFl() {
        return this.f10515vc;
    }
}
