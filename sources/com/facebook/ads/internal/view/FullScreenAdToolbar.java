package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.meta.analytics.dsp.uinode.AbstractC1303Lo;
import com.meta.analytics.dsp.uinode.C08111a;
import com.meta.analytics.dsp.uinode.C08171g;
import com.meta.analytics.dsp.uinode.C1316Mb;
import com.meta.analytics.dsp.uinode.C1407Po;
import com.meta.analytics.dsp.uinode.C1636Yn;
import com.meta.analytics.dsp.uinode.C1P;
import com.meta.analytics.dsp.uinode.EnumC1311Lw;
import com.meta.analytics.dsp.uinode.JA;
import com.meta.analytics.dsp.uinode.LD;
import com.meta.analytics.dsp.uinode.M9;
import com.meta.analytics.dsp.uinode.MA;
import com.meta.analytics.dsp.uinode.MB;
import com.meta.analytics.dsp.uinode.MC;
import com.meta.analytics.dsp.uinode.ML;
import com.meta.analytics.dsp.uinode.OI;
import com.meta.analytics.dsp.uinode.ViewOnClickListenerC1508Tl;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends MB {
    public static byte[] A09;
    public static String[] A0A = {"elaUgpg", "xyZ5KhWZZkOCw26QnbyRE89VYXYHkT38", "j2Hg99bd5kkvFLrtwtqoGvtE7T", "FtK0h2Y990QReQxCoMrwn7Y", "09p430KvfvIa5D7TMMbG57be7BWhVuc0", "4K9Dg6G4rdQDm1ubILJxRl9GbBVTjarc", "MQsbPX4", "ODYsITK"};
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public M9 A00;
    public MA A01;
    public MA A02;
    public boolean A03;
    public final RelativeLayout A04;
    public final JA A05;
    public final MC A06;
    public final C1316Mb A07;
    public final C1407Po A08;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{-26, Ascii.SI, Ascii.DC2, Ascii.SYN, 8, -61, -28, 7, 56, 75, 86, 85, 88, 90, 6, 39, 74, 77, 72, 72, 69, 59, 58, 75};
    }

    static {
        A03();
        int i9 = (int) (LD.A02 * 10.0f);
        A0B = i9;
        int i10 = (int) (LD.A02 * 16.0f);
        A0F = i10;
        A0D = i10 - i9;
        A0E = (i10 * 2) - i9;
        A0C = (int) (LD.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C1636Yn c1636Yn, MC mc, JA ja, int i9) {
        super(c1636Yn);
        this.A01 = null;
        this.A03 = true;
        this.A06 = mc;
        this.A05 = ja;
        setGravity(16);
        C1316Mb c1316Mb = new C1316Mb(c1636Yn, i9);
        this.A07 = c1316Mb;
        c1316Mb.setContentDescription(A02(0, 8, 50));
        c1316Mb.setActionClickListener(new ML(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A0D;
        layoutParams.setMargins(i10, i10, A0E, i10);
        addView(c1316Mb, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(c1636Yn);
        this.A04 = relativeLayout;
        LinearLayout.LayoutParams containerParams = new LinearLayout.LayoutParams(0, -2);
        containerParams.weight = 1.0f;
        C1407Po c1407Po = new C1407Po(c1636Yn);
        this.A08 = c1407Po;
        AbstractC1303Lo.A0G(1006, c1407Po);
        LinearLayout.LayoutParams toolbarActionViewParams = new LinearLayout.LayoutParams(-2, -2);
        toolbarActionViewParams.gravity = 17;
        c1407Po.setLayoutParams(toolbarActionViewParams);
        relativeLayout.addView(c1407Po);
        addView(relativeLayout, containerParams);
    }

    public FullScreenAdToolbar(C1636Yn c1636Yn, MC mc, JA ja, int i9, int i10) {
        this(c1636Yn, mc, ja, i9);
        A09(c1636Yn, i10);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public final void A04() {
        MA ma = this.A01;
        if (ma != null) {
            this.A02 = ma;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public final void A05() {
        this.A01 = getToolbarListener();
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public final void A06(C1P c1p, boolean z8) {
        boolean z9 = this.A03;
        int A04 = c1p.A04(z9);
        this.A08.A02(c1p.A0A(z9), A04);
        this.A00.setIconColors(A04);
        this.A00.setContentDescription(A02(8, 9, 117));
        this.A07.A02(c1p, z9, z8);
        if (z9) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            AbstractC1303Lo.A0S(this, gradientDrawable);
            AbstractC1303Lo.A0Q(this.A00, 0, ViewCompat.MEASURED_STATE_MASK, A0C);
            return;
        }
        AbstractC1303Lo.A0M(this, 0);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public final boolean A07() {
        return this.A07.A03();
    }

    public final void A08(C08111a c08111a, String str, int i9) {
        this.A07.setInitialUnskippableSeconds(i9);
        M9 m9 = this.A00;
        if (m9 != null) {
            m9.setAdDetails(c08111a, str, this.A05, this.A06);
        }
    }

    public final void A09(C1636Yn c1636Yn, int i9) {
        M9 m9 = this.A00;
        if (m9 != null) {
            AbstractC1303Lo.A0J(m9);
            this.A00.removeAllViews();
        }
        this.A00 = new M9(c1636Yn, i9);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        int i10 = A0F;
        layoutParams.setMargins(0, i10 / 2, i10 / 2, i10 / 2);
        addView(this.A00, layoutParams);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public View getDetailsContainer() {
        return this.A04;
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public int getToolbarActionMode() {
        return this.A07.getToolbarActionMode();
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public int getToolbarHeight() {
        return MB.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public MA getToolbarListener() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setAdReportingVisible(boolean z8) {
        this.A00.setVisibility(z8 ? 0 : 8);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A08.setOnClickListener(onClickListener);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setCTAClickListener(ViewOnClickListenerC1508Tl viewOnClickListenerC1508Tl) {
        this.A08.setOnClickListener(OI.A03(viewOnClickListenerC1508Tl, A02(17, 7, 104)));
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setFullscreen(boolean z8) {
        this.A03 = z8;
    }

    public void setOnlyPageDetails(C08111a c08111a) {
        if (c08111a != null) {
            this.A08.setPageDetails(c08111a);
        } else {
            this.A08.A01();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setPageDetails(C08111a c08111a, String str, int i9, C08171g c08171g) {
        this.A07.setInitialUnskippableSeconds(i9);
        this.A08.setPageDetails(c08111a);
        M9 m9 = this.A00;
        if (m9 != null) {
            m9.setAdDetails(c08111a, str, this.A05, this.A06);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setPageDetailsVisible(boolean z8) {
        this.A04.removeAllViews();
        if (z8) {
            RelativeLayout relativeLayout = this.A04;
            C1407Po c1407Po = this.A08;
            if (A0A[4].charAt(4) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[2] = "uYrc95dj4mq6YR3RipRhNZPjST";
            strArr[3] = "ufyXPPKrvmASdIniU0CJIS9";
            relativeLayout.addView(c1407Po);
        }
        C1316Mb c1316Mb = this.A07;
        String[] strArr2 = A0A;
        if (strArr2[2].length() == strArr2[3].length()) {
            c1316Mb.setToolbarMessageEnabled(!z8);
        } else {
            A0A[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
            c1316Mb.setToolbarMessageEnabled(!z8);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgress(float f9) {
        this.A07.setProgress(f9);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A07.setProgressClickListener(onClickListener);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgressImage(EnumC1311Lw enumC1311Lw) {
        this.A07.setProgressImage(enumC1311Lw);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgressImmediate(float f9) {
        this.A07.setProgressImmediate(f9);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgressSpinnerInvisible(boolean z8) {
        this.A07.setProgressSpinnerInvisible(z8);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setToolbarActionMessage(String str) {
        this.A07.setToolbarMessage(str);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setToolbarActionMode(int i9) {
        this.A07.setToolbarActionMode(i9);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setToolbarListener(MA ma) {
        this.A02 = ma;
    }
}
