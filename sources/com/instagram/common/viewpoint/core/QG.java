package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class QG implements InterfaceC0816Qt {
    public static String[] A0C = {"2ZSu0wXuDbQnaud22BC", "QCmSLF", "fQxhtf", "E3sU0uCnWEnB3ZcSzOkvj4xNFgaNSXPe", "Ye0yKWwaCEsRuR61siA7kBVWrkv2bkox", "1q930HE08Ni0sTckStF", "wfAs2pJjw0biCEJKLi3nGPcNksloIp8Y", "ZBBhRoR6L"};
    public T7 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC0852Sd A07 = new AbstractC0852Sd() { // from class: com.facebook.ads.redexgen.X.9N
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC03808x
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C9P c9p) {
            Handler handler;
            boolean A0D;
            handler = QG.this.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = QG.this.A0D(RE.A04);
            if (A0D) {
                QG.this.A03();
                QG.this.A06(true, false);
            }
            QG.this.A03 = true;
        }
    };
    public final AbstractC0858Sj A06 = new AbstractC0858Sj() { // from class: com.facebook.ads.redexgen.X.9M
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC03808x
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C9R c9r) {
            QG.this.A03();
            QG.this.A06(false, false);
            QG.this.A03 = true;
        }
    };
    public final AbstractC0836Rn A08 = new C9K(this);
    public final R8 A09 = new R8() { // from class: com.facebook.ads.redexgen.X.9D
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC03808x
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C9O c9o) {
            boolean z2;
            boolean A0D;
            z2 = QG.this.A02;
            if (z2) {
                return;
            }
            A0D = QG.this.A0D(RE.A04);
            if (!A0D) {
                return;
            }
            QG.this.A03();
            QG.this.A06(true, false);
        }
    };
    public final AbstractC0820Qx A0A = new AnonymousClass98(this);
    public final Handler A05 = new Handler();
    public final List<RF> A0B = new ArrayList();
    public int A00 = AdError.SERVER_ERROR_CODE;

    public QG(boolean z2) {
        this.A02 = z2;
    }

    public static /* synthetic */ int A00(QG qg) {
        return qg.A00;
    }

    public static /* synthetic */ Handler A01(QG qg) {
        return qg.A05;
    }

    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<RF> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0C[7].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[6] = "Y40dGjVL9Zscw9FMyiKWKh6z3JvZ0T5u";
            strArr[4] = "hO4VpYUkDoigTR3nwiJ8PFOPPoG0N1QG";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ void A04(QG qg) {
        qg.A03();
    }

    public static /* synthetic */ void A05(QG qg, boolean z2, boolean z3) {
        qg.A06(z2, z3);
    }

    public void A06(boolean z2, boolean z3) {
        Iterator<RF> it = this.A0B.iterator();
        while (it.hasNext()) {
            it.next().A3u(z2, z3);
        }
    }

    public static /* synthetic */ boolean A07(QG qg) {
        return qg.A03;
    }

    public static /* synthetic */ boolean A08(QG qg) {
        return qg.A02;
    }

    public static /* synthetic */ boolean A09(QG qg) {
        return qg.A04;
    }

    public static /* synthetic */ boolean A0A(QG qg, RE re) {
        return qg.A0D(re);
    }

    public static /* synthetic */ boolean A0B(QG qg, boolean z2) {
        qg.A03 = z2;
        return z2;
    }

    public static /* synthetic */ boolean A0C(QG qg, boolean z2) {
        qg.A04 = z2;
        return z2;
    }

    public boolean A0D(RE re) {
        Iterator<RF> it = this.A0B.iterator();
        while (it.hasNext()) {
            if (it.next().A8Q() != re) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i2) {
        this.A00 = i2;
    }

    public final void A0I(RF rf) {
        this.A0B.add(rf);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0816Qt
    public final void A9r(T7 t7) {
        this.A01 = t7;
        t7.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0816Qt
    public final void AHD(T7 t7) {
        A03();
        t7.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
