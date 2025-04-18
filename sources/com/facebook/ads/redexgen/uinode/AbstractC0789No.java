package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.No, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0789No extends LinearLayout {
    public static byte[] A06;
    public static String[] A07 = {"cmzsI0MqV", "rmZj6bXGr2Mc3k6GGfUNTI8ab", "Oqa2BQOYUIgPEQnUKqUaSgjmS1hAy2aw", "VbR8t651F3u5xAC0yd", "KwIIB1PdAD0xOvkamO3Meu", "6KEr", "QBka00Gf2XeExLF7IYa6e3", ""};
    public static final LinearLayout.LayoutParams A08;
    public final int A00;
    public final View.OnClickListener A01;
    public final RelativeLayout A02;
    public final C1070Yn A03;
    public final ViewOnClickListenerC0942Tl A04;
    public final O3 A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 49);
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

    public abstract void A0A(int i10);

    public abstract View getExpandableLayout();

    public abstract void setTitleMaxLines(int i10);

    static {
        A01();
        A08 = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC0789No(C1070Yn c1070Yn, int i10, C1P c1p, boolean z10, String str, J2 j22, MC mc2, RE re2, C0729Lg c0729Lg, C1U c1u) {
        super(c1070Yn);
        AbstractC0737Lo.A0K(this);
        this.A03 = c1070Yn;
        this.A00 = i10;
        O3 o32 = new O3(c1070Yn);
        this.A05 = o32;
        AbstractC0737Lo.A0M(o32, 0);
        AbstractC0737Lo.A0K(o32);
        ViewOnClickListenerC0942Tl viewOnClickListenerC0942Tl = new ViewOnClickListenerC0942Tl(c1070Yn, str, c1p, z10, j22, mc2, re2, c0729Lg, c1u);
        this.A04 = viewOnClickListenerC0942Tl;
        AbstractC0737Lo.A0G(1001, viewOnClickListenerC0942Tl);
        this.A01 = OI.A03(viewOnClickListenerC0942Tl, A00(0, 9, 119));
        RelativeLayout relativeLayout = new RelativeLayout(c1070Yn);
        this.A02 = relativeLayout;
        relativeLayout.setLayoutParams(A08);
        AbstractC0737Lo.A0K(relativeLayout);
    }

    public void A09() {
        this.A05.setOnClickListener(this.A01);
    }

    public final ViewOnClickListenerC0942Tl getCTAButton() {
        return this.A04;
    }

    public final ImageView getIconView() {
        return this.A05;
    }

    public void setInfo(C1N c1n, C1Q c1q, String str, String str2, InterfaceC0791Nq interfaceC0791Nq) {
        this.A04.setCta(c1q, str, new HashMap(), interfaceC0791Nq);
        AsyncTaskC0947Tq asyncTaskC0947Tq = new AsyncTaskC0947Tq(this.A05, this.A03);
        int i10 = this.A00;
        asyncTaskC0947Tq.A05(i10, i10).A07(str2);
    }
}
