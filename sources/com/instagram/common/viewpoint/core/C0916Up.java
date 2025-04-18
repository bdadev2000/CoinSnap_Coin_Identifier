package com.instagram.common.viewpoint.core;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Up, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0916Up extends AbstractC0743Ny {
    public static byte[] A0F;
    public static String[] A0G = {"X5ywJXgSTO8PHmyyLHkjy", "LJCQW", "068uN", "say", "rTIjgGKqeW39zjdqZS0Aqu4tLxC", "Qrp", "m8T4zYbfVU3hLt0iEDnj", "pXMACVxBUOAUm1D"};
    public static final String A0H;
    public float A00;
    public C0688Lv A01;
    public AbstractC0832Rj A02;
    public C0833Rk A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Path A07;
    public final RectF A08;
    public final C1045Zs A09;
    public final WeakReference<O1> A0A;
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;
    public final AtomicInteger A0D;
    public final AtomicReference<String> A0E;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0F = new byte[]{91, 126, 89, 117, 116, 110, 104, 117, 118};
    }

    static {
        A06();
        A0H = C0916Up.class.getSimpleName();
    }

    public C0916Up(C1045Zs c1045Zs, WeakReference<O1> weakReference, int i2, String str) {
        this(c1045Zs, weakReference, i2, false);
        if (C0608Im.A1p(c1045Zs)) {
            c1045Zs.A01().A0A().AHP(this, str == null ? A04(0, 0, 91) : str, false, true);
            this.A06 = true;
        }
    }

    public C0916Up(C1045Zs c1045Zs, WeakReference<O1> weakReference, int i2, boolean z2) {
        super(c1045Zs);
        this.A0B = new AtomicBoolean();
        this.A0C = new AtomicBoolean(true);
        this.A07 = new Path();
        this.A08 = new RectF();
        this.A0D = new AtomicInteger(5000);
        this.A0E = new AtomicReference<>();
        this.A01 = new C0688Lv();
        this.A05 = true;
        this.A06 = false;
        this.A09 = c1045Zs;
        this.A04 = z2;
        this.A0A = weakReference;
        this.A02 = new C0920Ut(this);
        this.A03 = new C0833Rk(this, i2, new WeakReference(this.A02), this.A09);
        setWebChromeClient(A0D());
        setWebViewClient(A0E());
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        if (Build.VERSION.SDK_INT > 16) {
            addJavascriptInterface(new O0(this, weakReference.get(), this.A03, this.A0B, this.A0C, this.A09), A04(0, 9, 46));
        }
    }

    private final boolean A07() {
        return this.A0B.get();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0743Ny
    public final WebChromeClient A0D() {
        return new O2();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0743Ny
    public final WebViewClient A0E() {
        return new O3(this.A09, this.A0A, new WeakReference(this.A03), new WeakReference(this.A01), new WeakReference(this.A0C), new WeakReference(this), this.A0D, this.A0E, this.A04);
    }

    public final void A0F() {
        this.A09.A0E().AHR();
        this.A0B.set(true);
        new Handler(Looper.getMainLooper()).post(new C0918Ur(this.A03));
    }

    public final void A0G(int i2, int i3) {
        if (this.A03 != null) {
            this.A03.A0W(i2);
            this.A03.A0X(i3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0743Ny, android.webkit.WebView
    public final void destroy() {
        if (this.A06) {
            this.A09.A01().A0A().AHC(this);
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        M3.A0J(this);
        this.A02 = null;
        this.A01 = null;
        O4.A03(this);
        super.destroy();
    }

    public C0688Lv getTouchDataRecorder() {
        return this.A01;
    }

    public C0833Rk getViewabilityChecker() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A00 > 0.0f) {
            this.A08.set(0.0f, 0.0f, getWidth(), getHeight());
            String[] strArr = A0G;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[1] = "xZYpx";
            strArr2[2] = "aqsn9";
            this.A07.reset();
            this.A07.addRoundRect(this.A08, this.A00, this.A00, Path.Direction.CW);
            canvas.clipPath(this.A07);
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.A01.A06(this.A09, motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        if (this.A0A.get() != null) {
            this.A0A.get();
        }
        if (this.A03 == null) {
            return;
        }
        C1045Zs c1045Zs = this.A09;
        String[] strArr = A0G;
        if (strArr[6].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[6] = "5ON080OOKwQwIFP5OG7h";
        strArr2[0] = "JBDgk0gsadULglMDLs8S8";
        c1045Zs.A0E().AHf(i2);
        if (i2 == 0 && A07()) {
            this.A03.A0U();
        } else {
            if (i2 != 8) {
                return;
            }
            this.A03.A0V();
        }
    }

    public void setBlockLocalFileAccessOutsideCache(boolean z2) {
        this.A04 = z2;
    }

    public void setCheckAssetsByJavascriptBridge(boolean z2) {
        this.A0C.set(z2);
    }

    public void setCornerRadius(float f2) {
        this.A00 = f2;
        invalidate();
    }

    public void setLogMultipleImpressions(boolean z2) {
        this.A05 = z2;
    }

    public void setRequestId(String str) {
        this.A0E.set(str);
    }

    public void setWebViewTimeoutInMillis(int i2) {
        if (i2 >= 0) {
            this.A0D.set(i2);
        }
    }
}
