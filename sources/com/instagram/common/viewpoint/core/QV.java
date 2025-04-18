package com.instagram.common.viewpoint.core;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class QV extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"5vYLtEaU9MAxDoI06TlJjFfWs8tiaGj", "TX23sib3Tj6X7eJy5cgYAILp0vVPLOiW", "Lxz50jZMaNdiu", "yIxUapHBf", "xsW4qvb7U5EMj5cNQbMl14i5qh6u6uOh", "8XLPt3rjq6gnj0Cd96o3z24ZTqMdgzej", "IIODaFrLnzdPntRGftRJpuPC", "ODWlzaCdU1siup4vWOfVQK22DnthNinE"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AbstractC1187cD A03;
    public final C01901b A04;
    public final C1045Zs A05;
    public final J7 A06;
    public final O1 A07;
    public final C0916Up A08;
    public final QT A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 9);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        String[] strArr = A0D;
        if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[7] = "Af0WM9g7Nak7nSkWG18ndsMVC8MahONd";
        strArr2[4] = "VergmF1iO6RBn6aZ7U2vBdquKGl77VZm";
        A0C = new byte[]{54, 18, 32, 28, 17, 9, 17, 18, 28, 21, 49, 20, 19, 34, 49, 48, 42, 45, 36, 99, 38, 49, 49, 44, 49, 68, 120, 117, 109, 117, 118, 120, 113, 52, 112, 123, 87, 96, 117, 87, 120, 125, 119, Byte.MAX_VALUE, 52, 96, 102, 125, 115, 115, 113, 102, 113, 112, 52, 99, 125, 96, 124, 52, 100, 102, 113, 57, 113, 98, 113, 122, 96, 52, 119, 120, 125, 119, Byte.MAX_VALUE, 103, 52, 119, 123, 97, 122, 96, 52, 117, 122, 112, 52, 80, 113, 120, 117, 109, 13, 49, 60, 36, 60, Utf8.REPLACEMENT_BYTE, 49, 56, 28, 57, 46, 11, 52, 56, 42, 114, 117, 119, 121, 126, 48, 124, Byte.MAX_VALUE, 113, 116, 121, 126, 119, 48, 98, 117, 125, Byte.MAX_VALUE, 100, 117, 48, 96, 124, 113, 105, 113, 114, 124, 117, 34, 45, 40, 34, 42, 50, 5, 4, 13, 0, 24, 114, 110, 99, 123, 99, 96, 110, 103, 52, 40, 37, 61, 37, 38, 40, 33, 27, 54, 33, 41, 43, 48, 33, 95, 72, 64, 66, 89, 72, 114, 94, 72, 94, 94, 68, 66, 67, 114, 68, 73, 78, 85, 81, 95, 84, 119, 101, 98, 95, 118, 105, 101, 119};
    }

    static {
        A09();
        A0E = (int) (LP.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public QV(C1045Zs c1045Zs, AbstractC1187cD abstractC1187cD, C01901b c01901b, J7 j7, QT qt, Map<String, String> playableMetricsData) {
        super(c1045Zs);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC0919Us() { // from class: com.facebook.ads.redexgen.X.9Y
            @Override // com.instagram.common.viewpoint.core.O1
            public final void ABD() {
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC0919Us, com.instagram.common.viewpoint.core.O1
            public final void ABx(int i2, String str) {
                AtomicBoolean atomicBoolean;
                QT qt2;
                atomicBoolean = QV.this.A0B;
                atomicBoolean.set(true);
                qt2 = QV.this.A09;
                qt2.ACV();
            }

            @Override // com.instagram.common.viewpoint.core.O1
            public final void ACA() {
                AtomicBoolean atomicBoolean;
                AtomicBoolean atomicBoolean2;
                QT qt2;
                atomicBoolean = QV.this.A0B;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean2 = QV.this.A0A;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                qt2 = QV.this.A09;
                qt2.ACA();
            }

            @Override // com.instagram.common.viewpoint.core.O1
            public final void AEC() {
                QT qt2;
                qt2 = QV.this.A09;
                qt2.AEC();
            }
        };
        this.A05 = c1045Zs;
        this.A03 = abstractC1187cD;
        this.A04 = c01901b;
        this.A06 = j7;
        this.A09 = qt;
        this.A02 = playableMetricsData;
        this.A08 = A04();
        if (C0608Im.A1p(this.A05)) {
            this.A05.A0A().AHO(this.A08, this.A03.A1U(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(QV qv) {
        int i2 = qv.A00;
        qv.A00 = i2 + 1;
        return i2;
    }

    private C0916Up A04() {
        C0916Up c0916Up = new C0916Up(this.A05, (WeakReference<O1>) new WeakReference(this.A07), 10, C0608Im.A1y(this.A05));
        c0916Up.setCornerRadius(A0E);
        c0916Up.setLogMultipleImpressions(false);
        c0916Up.setCheckAssetsByJavascriptBridge(false);
        c0916Up.setWebViewTimeoutInMillis(this.A04.A09());
        c0916Up.setRequestId(this.A03.A0l());
        c0916Up.setOnTouchListener(new QU(this));
        WebSettings settings = c0916Up.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            c0916Up.addJavascriptInterface(new QW(this.A05, this, this.A06, this.A02, this.A03.A1U()), A06(0, 12, Opcodes.LSHL));
        }
        return c0916Up;
    }

    public final void A0A() {
        long currentTimeMillis = System.currentTimeMillis() - this.A01;
        C8F c8f = new C8F(A06(25, 67, 29));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A06(Opcodes.L2I, 6, 72), this.A00);
            jSONObject.put(A06(Opcodes.D2I, 5, 104), currentTimeMillis);
            jSONObject.put(A06(Opcodes.NEW, 5, 51), this.A03.A1U());
        } catch (JSONException e) {
            Log.e(A06(92, 15, 84), A06(12, 13, 74), e);
        }
        c8f.A07(jSONObject);
        c8f.A05(1);
        C8D A07 = this.A05.A07();
        int i2 = C8E.A2D;
        String A06 = A06(Opcodes.I2S, 8, 11);
        A07.AA1(A06, i2, c8f);
        this.A00 = 0;
        if (!C0608Im.A1k(this.A05)) {
            this.A09.ABe();
            return;
        }
        if (currentTimeMillis <= C0608Im.A0J(this.A05)) {
            QT qt = this.A09;
            String[] strArr = A0D;
            if (strArr[7].charAt(0) == strArr[4].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "0XAlcIRGce3nNmobAWWNAzxTwWjfpKo1";
            strArr2[5] = "vX4VpuJxASYV4FwrDvVxGQ4QiWthZxUm";
            qt.ABe();
            return;
        }
        c8f.A05(0);
        this.A05.A07().AA0(A06, C8E.A2E, c8f);
    }

    public final void A0B() {
        String A0F2;
        if (this.A04.A0N()) {
            C8F c8f = new C8F(A06(107, 29, 25));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(Opcodes.TABLESWITCH, 17, 36), this.A04.A0I());
                jSONObject.put(A06(Opcodes.NEW, 5, 51), this.A03.A1U());
            } catch (JSONException e) {
                String A06 = A06(92, 15, 84);
                String A062 = A06(12, 13, 74);
                String[] strArr = A0D;
                if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[3] = "qKqF8GsLC";
                strArr2[6] = "yUBs4wOBB81EmWZp6CsNCuI0";
                Log.e(A06, A062, e);
            }
            c8f.A07(jSONObject);
            c8f.A05(1);
            C8D A07 = this.A05.A07();
            int i2 = C8E.A2G;
            String A063 = A06(155, 15, 77);
            A07.AA1(A063, i2, c8f);
            if (C0608Im.A0o(this.A05) && AbstractC0685Ls.A00(this.A05) == EnumC0684Lr.A07) {
                this.A05.A07().AA1(A063, C8E.A2F, c8f);
                this.A07.ABx(0, null);
                String[] strArr3 = A0D;
                if (strArr3[1].charAt(1) != strArr3[5].charAt(1)) {
                    String[] strArr4 = A0D;
                    strArr4[7] = "eYeTyqsAvkMxTzxGPJMzaaOJBs1WoRUE";
                    strArr4[4] = "DGSgvEgHkFrTWskIwQomZOyU4ros1fyW";
                    return;
                } else {
                    String[] strArr5 = A0D;
                    strArr5[1] = "QXwUk7ZcYbXDO6xLw92fyo5XHWgn18Du";
                    strArr5[5] = "iXthj0ZXJZZP0QlicLBvNNfJ4d5EWvqr";
                    return;
                }
            }
        }
        try {
            C0916Up c0916Up = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0C())) {
                A0F2 = this.A04.A0C();
            } else {
                A0F2 = this.A04.A0F();
            }
            c0916Up.loadUrl(A0F2);
        } catch (Exception e2) {
            this.A05.A07().AA0(A06(Opcodes.CHECKCAST, 8, 9), C8E.A2f, new C8F(e2));
        }
    }

    public final void A0C() {
        if (C0608Im.A1p(this.A05)) {
            this.A05.A0A().AHC(this.A08);
        }
        this.A08.removeJavascriptInterface(A06(0, 12, Opcodes.LSHL));
        this.A08.destroy();
    }

    public C0688Lv getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    public C0833Rk getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
