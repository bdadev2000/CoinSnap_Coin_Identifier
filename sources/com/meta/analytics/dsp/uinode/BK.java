package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class BK extends TS {
    public MZ A00;
    public InterfaceC1383Oq A01;
    public C1410Pr A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public RelativeLayout A06;
    public C1472Sb A07;
    public final C1636Yn A08;
    public final AbstractC1413Pu A09;
    public final AbstractC1380On A0A;
    public final O7 A0B;
    public final NX A0C;
    public final MV A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final OP A0I;
    public static String[] A0J = {"dJoea1DbFsfm9GTpKIzcXYdmCRfBe4FS", "N1xc2MysRccxXRgwDgHXZSQeh7bFq7uk", "3nDu3mubCrSGPsHb", "SUxuavEQD34fwSKO8hxc7w", "hmAyL1Y1BI3zOyZEMNvfuG", "1nycCDmAbpyAo4RWRzHJ2ixoeiRT", "fh6VcnyoMwgZMcb2oBIx6", "bmD"};
    public static final int A0L = (int) (LD.A02 * 0.0f);
    public static final int A0M = (int) (LD.A02 * 9.0f);
    public static final int A0K = (int) (LD.A02 * 9.0f);

    public BK(OP op, boolean z8, String str, C1472Sb c1472Sb) {
        super(op, z8);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new BP(this);
        this.A09 = new BO(this);
        this.A0B = new BN(this);
        this.A0A = new BM(this);
        this.A0C = new BL(this);
        this.A0I = op;
        this.A07 = c1472Sb;
        this.A0E = str;
        C1636Yn A05 = op.A05();
        this.A08 = A05;
        setGravity(17);
        int i9 = A0L;
        setPadding(i9, 0, i9, i9);
        AbstractC1303Lo.A0M(this, 0);
        setUpView(A05);
        Paint paint = new Paint();
        this.A0F = paint;
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(16);
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A0I.A0A() != null && this.A02 != null) {
            this.A0I.A0A().A9R(this.A02.getSimpleVideoView());
            if (C1225Ih.A1r(getContext())) {
                this.A0I.A0A().A07(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        if (this.A0I.A0A() != null) {
            this.A0I.A0A().A05();
            if (this.A02 != null) {
                this.A0I.A0A().AGl(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A01 == null) {
            return;
        }
        if (!A18() || !this.A05) {
            boolean A18 = A18();
            String[] strArr = A0J;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[3] = "whWH7G9NZGoicUCMK8TGye";
            strArr2[4] = "jQqQ2QRGHP0rmsCqitHuog";
            if (A18 || !this.A04) {
                return;
            }
        }
        this.A01.AAn();
    }

    private void A05(View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A06(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        AbstractC1303Lo.A0K(view);
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A0D() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A11() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.TS
    public final void A14() {
        C1410Pr c1410Pr;
        if (A18() && (c1410Pr = this.A02) != null) {
            c1410Pr.A01();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TS
    public final void A15() {
        if (A18()) {
            A16();
            C1410Pr c1410Pr = this.A02;
            if (c1410Pr != null) {
                c1410Pr.A05(QM.A02);
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TS
    public final void A16() {
        C1410Pr c1410Pr;
        float volume = this.A07.A0P().getVolume();
        if (!A18() || (c1410Pr = this.A02) == null) {
            return;
        }
        float newVolume = c1410Pr.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TS
    public final boolean A17() {
        C1410Pr c1410Pr;
        return A18() && (c1410Pr = this.A02) != null && c1410Pr.A06();
    }

    @Override // com.meta.analytics.dsp.uinode.TS
    public final boolean A18() {
        return this.A03;
    }

    public final void A19(Map<String, String> extraParams) {
        C1410Pr c1410Pr = this.A02;
        if (c1410Pr != null) {
            c1410Pr.A02();
            if (A18()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    public final C1410Pr getVideoView() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.OL, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i9 = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z8 = radius == 1;
        if (z8) {
            i9 = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i9, i9, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int i10 = A0L;
        int radius2 = getWidth();
        float f9 = radius2 - i10;
        int radius3 = getHeight();
        rectF.set(i10, 0.0f, f9, radius3 - i10);
        if (z8) {
            i9 = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i9, i9, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(C1Q c1q, Map<String, String> extraData) {
        getCtaButton().setCta(c1q, this.A0E, extraData);
    }

    public void setImageUrl(String str) {
        MZ mz = this.A00;
        if (mz != null) {
            mz.setVisibility(0);
            new AsyncTaskC1513Tq(this.A00, this.A08).A04().A06(new C1505Ti(this, null)).A07(str);
        }
        C1410Pr c1410Pr = this.A02;
        if (c1410Pr != null) {
            c1410Pr.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z8) {
        this.A03 = z8;
    }

    public void setOnAssetsLoadedListener(InterfaceC1383Oq interfaceC1383Oq) {
        this.A01 = interfaceC1383Oq;
    }

    public void setUpImageView(C1636Yn c1636Yn) {
        this.A00 = new MZ(c1636Yn);
        if (C1225Ih.A16(c1636Yn)) {
            AbstractC1352Nl.A00(this.A00, C1225Ih.A17(c1636Yn), new ViewOnClickListenerC1363Nw(this));
        }
        A06(this.A00);
    }

    public void setUpMediaContainer(C1636Yn c1636Yn) {
        RelativeLayout relativeLayout = new RelativeLayout(c1636Yn);
        this.A06 = relativeLayout;
        A06(relativeLayout);
        MZ mz = this.A00;
        if (mz != null) {
            this.A06.addView(mz);
            A05(this.A00);
        }
        C1410Pr c1410Pr = this.A02;
        if (c1410Pr != null) {
            this.A06.addView(c1410Pr);
            A05(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C1636Yn c1636Yn) {
        this.A02 = new C1410Pr(c1636Yn, new JA(this.A0E, getAdEventManager()));
        if (C1225Ih.A18(c1636Yn)) {
            AbstractC1352Nl.A00(this.A02, C1225Ih.A19(c1636Yn), new ViewOnClickListenerC1364Nx(this));
        }
        A06(this.A02);
    }

    private void setUpView(C1636Yn c1636Yn) {
        setUpImageView(c1636Yn);
        setUpVideoView(c1636Yn);
        setUpMediaContainer(c1636Yn);
    }

    public void setVideoPlaceholderUrl(String str) {
        C1410Pr c1410Pr = this.A02;
        if (c1410Pr != null) {
            c1410Pr.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        MZ mz = this.A00;
        if (mz != null) {
            if (A0J[5].length() == 10) {
                throw new RuntimeException();
            }
            A0J[2] = "s54OOOYMcUndmM7F";
            mz.setVisibility(8);
        }
        C1410Pr c1410Pr = this.A02;
        if (c1410Pr != null) {
            c1410Pr.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
