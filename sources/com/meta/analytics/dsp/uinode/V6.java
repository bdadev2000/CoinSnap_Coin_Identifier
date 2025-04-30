package com.meta.analytics.dsp.uinode;

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
    public final /* synthetic */ C1754bK A01;
    public final /* synthetic */ V2 A02;
    public final /* synthetic */ boolean A03;

    public V6(V2 v22, View view, boolean z8, C1754bK c1754bK) {
        this.A02 = v22;
        this.A00 = view;
        this.A03 = z8;
        this.A01 = c1754bK;
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A00() {
        JZ jz;
        jz = this.A02.A0e;
        jz.A06();
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A02() {
        JZ jz;
        jz = this.A02.A0e;
        jz.A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A03() {
        JZ jz;
        JZ jz2;
        C1636Yn c1636Yn;
        RE re;
        WeakReference weakReference;
        C1295Lg c1295Lg;
        JZ jz3;
        C1744bA c1744bA;
        View view;
        View view2;
        C1744bA c1744bA2;
        View view3;
        C1744bA c1744bA3;
        View view4;
        C1744bA c1744bA4;
        JS js;
        C1744bA c1744bA5;
        boolean z8;
        C1744bA c1744bA6;
        boolean z9;
        C1744bA c1744bA7;
        boolean z10;
        C1744bA c1744bA8;
        boolean A0p;
        C1744bA c1744bA9;
        AnonymousClass12 anonymousClass12;
        C1744bA c1744bA10;
        boolean z11;
        C1744bA c1744bA11;
        NativeAdLayout nativeAdLayout;
        C1744bA c1744bA12;
        String str;
        C1744bA c1744bA13;
        C1744bA c1744bA14;
        WeakReference weakReference2;
        WeakReference weakReference3;
        RE re2;
        Drawable drawable;
        RE re3;
        JZ jz4;
        RE re4;
        JZ jz5;
        jz = this.A02.A0e;
        jz.A0B();
        if (C1225Ih.A1o(this.A02.A11())) {
            View view5 = this.A00;
            if (view5 instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view5).getAdContentsView();
                if ((adContentsView instanceof QJ) && !((QJ) adContentsView).A02()) {
                    re4 = this.A02.A0R;
                    re4.A0T();
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
                re3 = this.A02.A0R;
                re3.A0T();
                jz4 = this.A02.A0e;
                jz4.A07();
                return;
            }
            V2.A0e(drawable, imageView);
        }
        jz2 = this.A02.A0e;
        c1636Yn = this.A02.A0c;
        jz2.A0C(c1636Yn, this.A01.A0G());
        re = this.A02.A0R;
        if (re != null) {
            re2 = this.A02.A0R;
            re2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                ((RD) weakReference3.get()).A03();
            }
        }
        c1295Lg = this.A02.A0f;
        if (c1295Lg.A07()) {
            jz3 = this.A02.A0e;
            jz3.A04();
            return;
        }
        this.A02.A0b();
        c1744bA = this.A02.A09;
        if (c1744bA != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (view2 != null) {
                    c1744bA2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c1744bA2.A08(view3);
                    c1744bA3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c1744bA3.A07(view4);
                    c1744bA4 = this.A02.A09;
                    js = this.A02.A0I;
                    c1744bA4.A0B(js);
                    c1744bA5 = this.A02.A09;
                    z8 = this.A02.A0W;
                    c1744bA5.A0E(z8);
                    c1744bA6 = this.A02.A09;
                    z9 = this.A02.A0Z;
                    c1744bA6.A0I(z9);
                    c1744bA7 = this.A02.A09;
                    z10 = this.A02.A0Y;
                    c1744bA7.A0H(z10);
                    c1744bA8 = this.A02.A09;
                    A0p = this.A02.A0p();
                    c1744bA8.A0F(A0p);
                    c1744bA9 = this.A02.A09;
                    anonymousClass12 = this.A02.A08;
                    c1744bA9.A09(anonymousClass12);
                    c1744bA10 = this.A02.A09;
                    z11 = this.A02.A0X;
                    c1744bA10.A0G(z11);
                    c1744bA11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c1744bA11.A0A(AbstractC1330Mp.A00(nativeAdLayout));
                    c1744bA12 = this.A02.A09;
                    str = this.A02.A0S;
                    c1744bA12.A0C(str);
                    c1744bA13 = this.A02.A09;
                    c1744bA13.A0J(this.A03);
                    c1744bA14 = this.A02.A09;
                    c1744bA14.A02();
                }
            }
        }
    }
}
