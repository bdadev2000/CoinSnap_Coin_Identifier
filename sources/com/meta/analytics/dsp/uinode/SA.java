package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class SA extends RelativeLayout implements RC, QE {
    public static byte[] A0E;
    public static String[] A0F = {"bTF0mPynjITMPKd7AWnGFE0wjuUHqGk", "NLuteA0O4hImypGMVaagZ7KROvpQko", "vHIsSgA1dNPe0TxNLDw8T5r", "Tu3OEd7", "fTm", "FLX2LFKD3Z9kyRG7iyj3Ajj18EKg1", "ES7oyLysdjBWPeOJZDQ9P8Sn", "e8"};
    public static final C1412Pt A0G;
    public static final O8 A0H;
    public static final C1354Nn A0I;
    public static final C1320Mf A0J;
    public static final C1315Ma A0K;
    public static final MW A0L;
    public static final MU A0M;
    public static final C1309Lu A0N;
    public int A00;
    public JA A01;
    public QJ A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final Handler A08;
    public final View.OnTouchListener A09;
    public final C1636Yn A0A;
    public final C09978r<AbstractC09988s, C09968q> A0B;
    public final List<QN> A0C;
    public final R9 A0D;

    public static String A0F(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0I() {
        byte[] bArr = {4, 87, 73, 71, 4, 88, 83, 88, 69, 80, 4, 91, 69, 88, 71, 76, 4, 88, 77, 81, 73, 38, 88, 85, 85, 72, 81, 87, 79, 92, 3, 68, 87, 3};
        if (A0F[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[5] = "dnbQEbQJ0095hjHrUlDt4BBpkj0Wp";
        strArr[7] = "GI";
        A0E = bArr;
    }

    static {
        A0I();
        A0I = new C1354Nn();
        A0G = new C1412Pt();
        A0J = new C1320Mf();
        A0K = new C1315Ma();
        A0H = new O8();
        A0L = new MW();
        A0N = new C1309Lu();
        A0M = new MU();
    }

    public SA(C1636Yn c1636Yn) {
        super(c1636Yn);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C09978r<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new QD(this);
        this.A0A = c1636Yn;
        if (A0S(c1636Yn)) {
            this.A0D = new TextureViewSurfaceTextureListenerC1261Jv(c1636Yn);
        } else {
            this.A0D = new TextureViewSurfaceTextureListenerC1260Ju(c1636Yn);
        }
        A0G();
    }

    public SA(C1636Yn c1636Yn, AttributeSet attributeSet) {
        super(c1636Yn, attributeSet);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C09978r<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new QD(this);
        this.A0A = c1636Yn;
        if (A0S(c1636Yn)) {
            this.A0D = new TextureViewSurfaceTextureListenerC1261Jv(c1636Yn, attributeSet);
        } else {
            this.A0D = new TextureViewSurfaceTextureListenerC1260Ju(c1636Yn, attributeSet);
        }
        A0G();
    }

    public SA(C1636Yn c1636Yn, AttributeSet attributeSet, int i9) {
        super(c1636Yn, attributeSet, i9);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C09978r<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new QD(this);
        this.A0A = c1636Yn;
        if (A0S(c1636Yn)) {
            this.A0D = new TextureViewSurfaceTextureListenerC1261Jv(c1636Yn, attributeSet, i9);
        } else {
            this.A0D = new TextureViewSurfaceTextureListenerC1260Ju(c1636Yn, attributeSet, i9);
        }
        A0G();
    }

    public static /* synthetic */ C1354Nn A0C() {
        C1354Nn c1354Nn = A0I;
        if (A0F[0].length() != 31) {
            throw new RuntimeException();
        }
        A0F[6] = "XnBln0F0zo0j2g49JSScdoR2";
        return c1354Nn;
    }

    private void A0G() {
        this.A06 = C1225Ih.A0o(this.A0A);
        this.A0A.A0E().A32();
        this.A0D.setRequestedVolume(1.0f);
        this.A0D.setVideoStateChangeListener(this);
        this.A02 = new QJ(this.A0A, this.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
        setOnTouchListener(this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        this.A07.postDelayed(new SE(this), this.A00);
    }

    private final void A0J() {
        for (QN plugin : this.A0C) {
            if (plugin instanceof QQ) {
                A0Q((QQ) plugin);
            }
            plugin.A9R(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(int i9) {
        if (C1225Ih.A0s(this.A0A)) {
            Toast.makeText(this.A0A, A0F(21, 13, 124) + (i9 / 1000.0f) + A0F(0, 21, 125), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(J9 j9) {
        JA ja = this.A01;
        if (ja == null) {
            return;
        }
        ja.A04(j9, null);
    }

    private void A0P(QN qn) {
        if (qn instanceof QQ) {
            A0R((QQ) qn);
        }
        qn.AGl(this);
    }

    private void A0Q(QQ qq) {
        if (qq.getParent() == null) {
            if (qq instanceof C7R) {
                this.A02.A00(qq);
            } else {
                addView(qq);
            }
        }
    }

    private void A0R(QQ qq) {
        if (qq instanceof C7R) {
            this.A02.A01(qq);
        } else {
            AbstractC1303Lo.A0J(qq);
        }
    }

    private boolean A0S(C1636Yn c1636Yn) {
        return C1225Ih.A2S(c1636Yn, C1441Qw.A03());
    }

    public final void A0V() {
        this.A0D.setVideoStateChangeListener(null);
        this.A0D.destroy();
    }

    public final void A0W() {
        if (A0i()) {
            return;
        }
        this.A0D.A8Q();
    }

    public final void A0X() {
        Iterator<QN> it = this.A0C.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0F[0].length() != 31) {
                throw new RuntimeException();
            }
            A0F[0] = "GYUlZXdJo7nruMh2UHaMalRUd7rYm0D";
            if (hasNext) {
                A0P(it.next());
            } else {
                this.A0C.clear();
                String[] strArr = A0F;
                if (strArr[4].length() != strArr[3].length()) {
                    String[] strArr2 = A0F;
                    strArr2[4] = "dBG";
                    strArr2[3] = "pEPub8w";
                    return;
                }
                return;
            }
        }
    }

    public final void A0Y(int i9) {
        this.A07.removeCallbacksAndMessages(null);
        this.A0D.seekTo(i9);
    }

    public final void A0Z(int i9) {
        this.A0D.AGZ(i9);
    }

    public final void A0a(QH qh) {
        SB sb = new SB(this);
        if (this.A06) {
            ExecutorC1297Li.A00(sb);
        } else {
            Handler handler = this.A08;
            if (A0F[6].length() != 24) {
                throw new RuntimeException();
            }
            A0F[6] = "kK0l9LoMdPIpLA2D0gOeof4W";
            handler.post(sb);
        }
        this.A0D.AGN(qh.A02());
    }

    public final void A0b(QM qm, int i9) {
        if (this.A03 && this.A0D.getState() == RB.A06) {
            this.A03 = false;
        }
        this.A0D.AGS(qm, i9);
    }

    public final void A0c(QN qn) {
        this.A0C.add(qn);
    }

    public final void A0d(QN qn) {
        this.A0C.remove(qn);
        A0P(qn);
    }

    public final void A0e(boolean z8, int i9) {
        if (A0i()) {
            return;
        }
        this.A0D.ADu(z8, i9);
    }

    public final void A0f(boolean z8, boolean z9, int i9) {
        this.A05 = z9;
        A0e(z8, i9);
    }

    public final boolean A0g() {
        return this.A0D.A8b();
    }

    public final boolean A0h() {
        return getVolume() == 0.0f;
    }

    public final boolean A0i() {
        return getState() == RB.A05;
    }

    public final boolean A0j() {
        return A0i() && this.A0D.A9B();
    }

    public final boolean A0k() {
        return getState() == RB.A0A;
    }

    public final boolean A0l() {
        return this.A06;
    }

    @Override // com.meta.analytics.dsp.uinode.QE
    public final boolean A92() {
        return A0S(this.A0A);
    }

    @Override // com.meta.analytics.dsp.uinode.QE
    public final boolean A95() {
        return this.A04;
    }

    @Override // com.meta.analytics.dsp.uinode.RC
    public final void ABa(final long j7, final long j9, final long j10, final float f9) {
        if (!C1225Ih.A1X(this.A0A)) {
            return;
        }
        this.A0B.A02(new QA(j7, j9, j10, f9) { // from class: com.facebook.ads.redexgen.X.9F
        });
    }

    @Override // com.meta.analytics.dsp.uinode.RC
    public final void ACD() {
        A0e(true, 4);
    }

    @Override // com.meta.analytics.dsp.uinode.RC
    public final void ACE() {
        A0b(QM.A04, 6);
    }

    @Override // com.meta.analytics.dsp.uinode.RC
    public final void AD3(int i9, int i10) {
        SC sc = new SC(this, i9, i10);
        if (this.A06) {
            ExecutorC1297Li.A00(sc);
        } else {
            this.A08.post(sc);
        }
        A0H();
    }

    @Override // com.meta.analytics.dsp.uinode.RC
    public final void ADh(RB rb) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        SD sd = new SD(this, rb, currentPositionInMillis, currentPositionMS);
        if (this.A06) {
            ExecutorC1297Li.A00(sd);
        } else {
            this.A08.post(sd);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.QE
    public int getCurrentPositionInMillis() {
        return this.A0D.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0D.getDuration();
    }

    public C09978r<AbstractC09988s, C09968q> getEventBus() {
        return this.A0B;
    }

    @Override // com.meta.analytics.dsp.uinode.QE
    public long getInitialBufferTime() {
        return this.A0D.getInitialBufferTime();
    }

    public RB getState() {
        return this.A0D.getState();
    }

    public Handler getStateHandler() {
        return this.A08;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0D;
    }

    public int getVideoHeight() {
        return this.A0D.getVideoHeight();
    }

    public View getVideoImplView() {
        return this.A0D.getView();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.QE
    public QM getVideoStartReason() {
        return this.A0D.getStartReason();
    }

    public View getVideoView() {
        return this.A02;
    }

    public int getVideoWidth() {
        return this.A0D.getVideoWidth();
    }

    @Override // com.meta.analytics.dsp.uinode.QE
    public float getVolume() {
        return this.A0D.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0B.A02(A0M);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0B.A02(A0N);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        R9 r9 = this.A0D;
        if (r9 != null) {
            r9.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(JA ja) {
        this.A01 = ja;
    }

    public void setIsFullScreen(boolean z8) {
        this.A04 = z8;
        this.A0D.setFullScreen(z8);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(String str) {
        this.A0D.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i9) {
        this.A00 = i9;
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            A0X();
        } else {
            A0J();
            this.A0D.setup(uri);
        }
        this.A03 = false;
    }

    public void setVideoURI(String str) {
        this.A0A.A0E().A39(str);
        setVideoURI(str != null ? AbstractC1287Ky.A00(str) : null);
    }

    public void setVolume(float f9) {
        if (f9 == 1.0f) {
            A0L(J9.A0f);
            this.A0A.A0E().A3D();
        } else {
            A0L(J9.A0e);
            this.A0A.A0E().A3C();
        }
        this.A0D.setRequestedVolume(f9);
        C09978r<AbstractC09988s, C09968q> eventBus = getEventBus();
        if (A0F[2].length() == 19) {
            throw new RuntimeException();
        }
        A0F[2] = "etD2zaPMct9y2wbR2YehsJmmTem";
        eventBus.A02(A0L);
    }
}
