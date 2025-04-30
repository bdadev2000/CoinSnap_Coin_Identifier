package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.No, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1355No extends LinearLayout {
    public static byte[] A06;
    public static String[] A07 = {"cmzsI0MqV", "rmZj6bXGr2Mc3k6GGfUNTI8ab", "Oqa2BQOYUIgPEQnUKqUaSgjmS1hAy2aw", "VbR8t651F3u5xAC0yd", "KwIIB1PdAD0xOvkamO3Meu", "6KEr", "QBka00Gf2XeExLF7IYa6e3", ""};
    public static final LinearLayout.LayoutParams A08;
    public final int A00;
    public final View.OnClickListener A01;
    public final RelativeLayout A02;
    public final C1636Yn A03;
    public final ViewOnClickListenerC1508Tl A04;
    public final O3 A05;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {9, Ascii.FF, Ascii.FF, Ascii.CR, Ascii.FS, 9, 17, Ascii.DC4, Ascii.ESC};
        if (A07[1].length() != 25) {
            throw new RuntimeException();
        }
        A07[2] = "W8PIFEgMaUlhByfzvyeLgAFdtcDk8ZOz";
        A06 = bArr;
    }

    public abstract void A0A(int i9);

    public abstract View getExpandableLayout();

    public abstract void setTitleMaxLines(int i9);

    static {
        A01();
        A08 = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC1355No(C1636Yn c1636Yn, int i9, C1P c1p, boolean z8, String str, J2 j22, MC mc, RE re, C1295Lg c1295Lg, C1U c1u) {
        super(c1636Yn);
        AbstractC1303Lo.A0K(this);
        this.A03 = c1636Yn;
        this.A00 = i9;
        O3 o3 = new O3(c1636Yn);
        this.A05 = o3;
        AbstractC1303Lo.A0M(o3, 0);
        AbstractC1303Lo.A0K(o3);
        ViewOnClickListenerC1508Tl viewOnClickListenerC1508Tl = new ViewOnClickListenerC1508Tl(c1636Yn, str, c1p, z8, j22, mc, re, c1295Lg, c1u);
        this.A04 = viewOnClickListenerC1508Tl;
        AbstractC1303Lo.A0G(1001, viewOnClickListenerC1508Tl);
        this.A01 = OI.A03(viewOnClickListenerC1508Tl, A00(0, 9, 119));
        RelativeLayout relativeLayout = new RelativeLayout(c1636Yn);
        this.A02 = relativeLayout;
        relativeLayout.setLayoutParams(A08);
        AbstractC1303Lo.A0K(relativeLayout);
    }

    public void A09() {
        this.A05.setOnClickListener(this.A01);
    }

    public final ViewOnClickListenerC1508Tl getCTAButton() {
        return this.A04;
    }

    public final ImageView getIconView() {
        return this.A05;
    }

    public void setInfo(C1N c1n, C1Q c1q, String str, String str2, InterfaceC1357Nq interfaceC1357Nq) {
        this.A04.setCta(c1q, str, new HashMap(), interfaceC1357Nq);
        AsyncTaskC1513Tq asyncTaskC1513Tq = new AsyncTaskC1513Tq(this.A05, this.A03);
        int i9 = this.A00;
        asyncTaskC1513Tq.A05(i9, i9).A07(str2);
    }
}
