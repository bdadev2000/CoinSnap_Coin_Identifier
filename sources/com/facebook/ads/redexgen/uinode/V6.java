package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class V6 extends RD {
    public static String[] A04 = {"oSoBkaWeyKsp", "KBeBF", "kSDces9j50gwfjS4QfNYnWgLw2iPkymV", "EJmszBWYtRUz1Vdq", "qn5qycmxyPd80aqzWiKeSrAoNfum3VnE", "21Cce2q6wYIDkABj", "e4Lw2G3U", "jRNkDTlKn5mABl6KQSYrYYCrXHx6B19g"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C1188bK A01;
    public final /* synthetic */ V2 A02;
    public final /* synthetic */ boolean A03;

    public V6(V2 v22, View view, boolean z10, C1188bK c1188bK) {
        this.A02 = v22;
        this.A00 = view;
        this.A03 = z10;
        this.A01 = c1188bK;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A00() {
        JZ jz;
        jz = this.A02.A0e;
        jz.A06();
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A02() {
        JZ jz;
        jz = this.A02.A0e;
        jz.A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        JZ jz;
        JZ jz2;
        C1070Yn c1070Yn;
        RE re2;
        WeakReference weakReference;
        C0729Lg c0729Lg;
        JZ jz3;
        C1178bA c1178bA;
        View view;
        View view2;
        C1178bA c1178bA2;
        View view3;
        C1178bA c1178bA3;
        View view4;
        C1178bA c1178bA4;
        JS js;
        C1178bA c1178bA5;
        boolean z10;
        C1178bA c1178bA6;
        boolean z11;
        C1178bA c1178bA7;
        boolean z12;
        C1178bA c1178bA8;
        boolean A0p;
        C1178bA c1178bA9;
        AnonymousClass12 anonymousClass12;
        C1178bA c1178bA10;
        boolean z13;
        C1178bA c1178bA11;
        NativeAdLayout nativeAdLayout;
        C1178bA c1178bA12;
        String str;
        C1178bA c1178bA13;
        C1178bA c1178bA14;
        WeakReference weakReference2;
        WeakReference weakReference3;
        RE re3;
        Drawable drawable;
        RE re4;
        JZ jz4;
        RE re5;
        JZ jz5;
        jz = this.A02.A0e;
        jz.A0B();
        if (C0659Ih.A1o(this.A02.A11())) {
            View view5 = this.A00;
            if (view5 instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view5).getAdContentsView();
                if ((adContentsView instanceof QJ) && !((QJ) adContentsView).A02()) {
                    re5 = this.A02.A0R;
                    re5.A0T();
                    jz5 = this.A02.A0e;
                    jz5.A08();
                    return;
                }
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            if (A04[6].length() != 8) {
                throw new RuntimeException();
            }
            A04[4] = "kV1RqodiW8kqR1rQOQ4NCiAB35VpASKe";
            drawable = this.A02.A01;
            if (drawable == null) {
                re4 = this.A02.A0R;
                re4.A0T();
                jz4 = this.A02.A0e;
                jz4.A07();
                return;
            }
            V2.A0e(drawable, imageView);
        }
        jz2 = this.A02.A0e;
        c1070Yn = this.A02.A0c;
        jz2.A0C(c1070Yn, this.A01.A0G());
        re2 = this.A02.A0R;
        if (re2 != null) {
            re3 = this.A02.A0R;
            re3.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                ((RD) weakReference3.get()).A03();
            }
        }
        c0729Lg = this.A02.A0f;
        if (c0729Lg.A07()) {
            jz3 = this.A02.A0e;
            jz3.A04();
            return;
        }
        this.A02.A0b();
        c1178bA = this.A02.A09;
        if (c1178bA != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (view2 != null) {
                    c1178bA2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c1178bA2.A08(view3);
                    c1178bA3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c1178bA3.A07(view4);
                    c1178bA4 = this.A02.A09;
                    js = this.A02.A0I;
                    c1178bA4.A0B(js);
                    c1178bA5 = this.A02.A09;
                    z10 = this.A02.A0W;
                    c1178bA5.A0E(z10);
                    c1178bA6 = this.A02.A09;
                    z11 = this.A02.A0Z;
                    c1178bA6.A0I(z11);
                    c1178bA7 = this.A02.A09;
                    z12 = this.A02.A0Y;
                    c1178bA7.A0H(z12);
                    c1178bA8 = this.A02.A09;
                    A0p = this.A02.A0p();
                    c1178bA8.A0F(A0p);
                    c1178bA9 = this.A02.A09;
                    anonymousClass12 = this.A02.A08;
                    c1178bA9.A09(anonymousClass12);
                    c1178bA10 = this.A02.A09;
                    z13 = this.A02.A0X;
                    c1178bA10.A0G(z13);
                    c1178bA11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c1178bA11.A0A(AbstractC0764Mp.A00(nativeAdLayout));
                    c1178bA12 = this.A02.A09;
                    str = this.A02.A0S;
                    c1178bA12.A0C(str);
                    c1178bA13 = this.A02.A09;
                    c1178bA13.A0J(this.A03);
                    c1178bA14 = this.A02.A09;
                    c1178bA14.A02();
                }
            }
        }
    }
}
