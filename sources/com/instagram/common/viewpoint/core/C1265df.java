package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.df, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1265df {
    public static String[] A0D = {"hvB6Y5lFyDpOUo5WE2d6RBuRXgbY5ZUm", "NE", "ywY8EvofFV55395JkJDayoeTErGWKbkG", "zJ8LsRBLLSys8CPHp", "gH0zTalybZGhm0qBmcsXdCP28l4r1an9", "kduBCn7ltQGfodptcqURcnO6EcdnH0I2", "cBbzau3JoVbeDspRwe3LG6GIj8yddyUH", "tX"};
    public InterfaceC1268dj A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final Handler A04;
    public final T0 A05;
    public final InterfaceC1274dq A06;
    public final ViewpointQeConfig A07;
    public final ViewpointRegistry A08;
    public final IA A09;
    public final Runnable A0A;
    public final List<Rect> A0B;
    public final List<DspViewableNode> A0C;

    public C1265df(ViewpointQeConfig viewpointQeConfig, InterfaceC1274dq interfaceC1274dq, T0 t02, IA ia, ViewpointRegistry viewpointRegistry, Handler handler) {
        this(viewpointQeConfig, interfaceC1274dq, t02, ia, viewpointRegistry, handler, 100);
    }

    public C1265df(ViewpointQeConfig viewpointQeConfig, InterfaceC1274dq interfaceC1274dq, T0 t02, IA ia, ViewpointRegistry viewpointRegistry, Handler handler, int i2) {
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A0C = new ArrayList();
        this.A0B = new ArrayList();
        this.A01 = false;
        this.A07 = viewpointQeConfig;
        this.A06 = interfaceC1274dq;
        this.A05 = t02;
        this.A09 = ia;
        this.A08 = viewpointRegistry;
        this.A04 = handler;
        this.A0A = new RunnableC1266dg(this, i2, new Exception());
    }

    private void A03(long j2) {
        if (this.A0C.isEmpty()) {
            this.A06.A8m(this.A0B);
            this.A09.A4N(j2, this.A0B);
            this.A09.A5v();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j2) {
        this.A06.A8m(this.A0B);
        this.A09.A4N(j2, this.A0B);
        if (this.A0C.isEmpty()) {
            this.A08.A08(this.A0C);
            for (final DspViewableNode dspViewableNode : this.A0C) {
                if (this.A07.A00) {
                    this.A08.A07(dspViewableNode, new InterfaceC0574Hd() { // from class: com.facebook.ads.redexgen.X.70
                        @Override // com.instagram.common.viewpoint.core.InterfaceC0574Hd
                        public final Object A9K(Object obj) {
                            return C1265df.this.A08(dspViewableNode, (Cdo) obj);
                        }
                    });
                } else {
                    A06(dspViewableNode, this.A08.A02(dspViewableNode));
                }
            }
            this.A09.A5v();
            if (this.A00 != null) {
                InterfaceC1268dj interfaceC1268dj = this.A00;
                String[] strArr = A0D;
                if (strArr[2].charAt(24) != strArr[5].charAt(24)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[6] = "0nrzH38GFR0AnNATGilmIDxGL8fq4UsQ";
                strArr2[4] = "c6vzpxWZV3AO1VWKwqmDQLGTjAEAJtLq";
                interfaceC1268dj.ADV();
            }
            this.A0C.clear();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    private void A06(DspViewableNode dspViewableNode, Cdo<?, ?> cdo) {
        for (Rect rect : this.A0B) {
            Rect containerRect = this.A03;
            if (dspViewableNode.A8l(containerRect, this.A02, rect) && cdo != Cdo.A08) {
                IA ia = this.A09;
                Rect rect2 = this.A03;
                String[] strArr = A0D;
                if (strArr[1].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[6] = "GkBz7jFj6BmSvOwlnDuwIQ8kdYWcjX9Q";
                strArr2[4] = "0Qzzj3tYyfuWL6OVNzyvBOA9tkBax5QR";
                ia.A3r(cdo, rect2, this.A02);
            }
        }
    }

    public final /* synthetic */ C1252dK A08(DspViewableNode dspViewableNode, Cdo cdo) {
        A06(dspViewableNode, cdo);
        return null;
    }

    public final void A09() {
        if (this.A00 != null) {
            this.A00.ADV();
        }
        if (this.A01) {
            this.A04.removeCallbacks(this.A0A);
            A03(this.A05.AAy());
        }
        this.A01 = false;
    }

    public final void A0A() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A0A);
        }
    }

    public final void A0B(InterfaceC1270dl interfaceC1270dl) {
        this.A09.AGh(interfaceC1270dl);
    }

    public final void A0C(InterfaceC1268dj interfaceC1268dj) {
        this.A00 = interfaceC1268dj;
    }
}
