package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class WB extends AbstractC0832Rj {
    public static String[] A04 = {"hBf0w5eWi1Spl1ubHLZPwgySyKwDkFls", "R1QfRDzVW3llag6pkWHTLJyFxLfuZYUb", "hIMvI", "VChjXPEjBKz9WEtkkyfZeEDOAtDm6pyS", "ZAoFS", "FLKekHrPvHjWwOMiUj748H2wUl", "P5m22x1ZKo3VUkYY2cMyPktUJxi7JgjH", "Nk3fSWmW4cxCKGmv1zm92qMESviF4Rnt"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C1204cU A01;
    public final /* synthetic */ W7 A02;
    public final /* synthetic */ boolean A03;

    public WB(W7 w7, View view, boolean z2, C1204cU c1204cU) {
        this.A02 = w7;
        this.A00 = view;
        this.A03 = z2;
        this.A01 = c1204cU;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0832Rj
    public final void A00() {
        C0624Je c0624Je;
        c0624Je = this.A02.A0e;
        c0624Je.A06();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0832Rj
    public final void A02() {
        C0624Je c0624Je;
        c0624Je = this.A02.A0e;
        c0624Je.A0A();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0832Rj
    public final void A03() {
        C0624Je c0624Je;
        C0624Je c0624Je2;
        C1045Zs c1045Zs;
        C0833Rk c0833Rk;
        WeakReference weakReference;
        C0688Lv c0688Lv;
        C0624Je c0624Je3;
        C1193cJ c1193cJ;
        View view;
        View view2;
        C1193cJ c1193cJ2;
        View view3;
        C1193cJ c1193cJ3;
        View view4;
        C1193cJ c1193cJ4;
        JX jx;
        C1193cJ c1193cJ5;
        boolean z2;
        C1193cJ c1193cJ6;
        boolean z3;
        C1193cJ c1193cJ7;
        boolean z4;
        C1193cJ c1193cJ8;
        boolean A0p;
        C1193cJ c1193cJ9;
        AnonymousClass12 anonymousClass12;
        C1193cJ c1193cJ10;
        boolean z5;
        C1193cJ c1193cJ11;
        NativeAdLayout nativeAdLayout;
        C1193cJ c1193cJ12;
        String str;
        C1193cJ c1193cJ13;
        C1193cJ c1193cJ14;
        WeakReference weakReference2;
        WeakReference weakReference3;
        C0833Rk c0833Rk2;
        Drawable drawable;
        C0833Rk c0833Rk3;
        C0624Je c0624Je4;
        C0833Rk c0833Rk4;
        C0624Je c0624Je5;
        c0624Je = this.A02.A0e;
        c0624Je.A0B();
        if (C0608Im.A27(this.A02.A11()) && (this.A00 instanceof AdNativeComponentView)) {
            View adContentsView = ((AdNativeComponentView) this.A00).getAdContentsView();
            if ((adContentsView instanceof C0812Qp) && !((C0812Qp) adContentsView).A02()) {
                c0833Rk4 = this.A02.A0R;
                c0833Rk4.A0T();
                c0624Je5 = this.A02.A0e;
                c0624Je5.A08();
                return;
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            drawable = this.A02.A01;
            if (drawable == null) {
                c0833Rk3 = this.A02.A0R;
                c0833Rk3.A0T();
                c0624Je4 = this.A02.A0e;
                c0624Je4.A07();
                return;
            }
            W7.A0e(drawable, imageView);
        }
        c0624Je2 = this.A02.A0e;
        c1045Zs = this.A02.A0c;
        c0624Je2.A0C(c1045Zs, this.A01.A0G());
        c0833Rk = this.A02.A0R;
        if (c0833Rk != null) {
            c0833Rk2 = this.A02.A0R;
            c0833Rk2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                ((AbstractC0832Rj) weakReference3.get()).A03();
            }
        }
        c0688Lv = this.A02.A0f;
        if (c0688Lv.A07()) {
            c0624Je3 = this.A02.A0e;
            c0624Je3.A04();
            return;
        }
        this.A02.A0b();
        c1193cJ = this.A02.A09;
        if (c1193cJ != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (A04[6].charAt(19) == 'P') {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[0] = "XqswFkrS2Yg5WXkyCZy0rAQHDfEy407U";
                strArr[3] = "6zRr91flYJNmh2JhyLNuVxqP1ZintOSM";
                if (view2 != null) {
                    c1193cJ2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c1193cJ2.A08(view3);
                    c1193cJ3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c1193cJ3.A07(view4);
                    c1193cJ4 = this.A02.A09;
                    jx = this.A02.A0I;
                    c1193cJ4.A0B(jx);
                    c1193cJ5 = this.A02.A09;
                    z2 = this.A02.A0W;
                    c1193cJ5.A0E(z2);
                    c1193cJ6 = this.A02.A09;
                    z3 = this.A02.A0Z;
                    c1193cJ6.A0I(z3);
                    c1193cJ7 = this.A02.A09;
                    z4 = this.A02.A0Y;
                    c1193cJ7.A0H(z4);
                    c1193cJ8 = this.A02.A09;
                    A0p = this.A02.A0p();
                    c1193cJ8.A0F(A0p);
                    c1193cJ9 = this.A02.A09;
                    anonymousClass12 = this.A02.A08;
                    c1193cJ9.A09(anonymousClass12);
                    c1193cJ10 = this.A02.A09;
                    z5 = this.A02.A0X;
                    c1193cJ10.A0G(z5);
                    c1193cJ11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c1193cJ11.A0A(NF.A00(nativeAdLayout));
                    c1193cJ12 = this.A02.A09;
                    str = this.A02.A0S;
                    c1193cJ12.A0C(str);
                    c1193cJ13 = this.A02.A09;
                    c1193cJ13.A0J(this.A03);
                    c1193cJ14 = this.A02.A09;
                    c1193cJ14.A03();
                }
            }
        }
    }
}
