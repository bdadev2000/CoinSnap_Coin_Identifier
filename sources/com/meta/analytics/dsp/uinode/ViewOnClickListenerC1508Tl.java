package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Tl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC1508Tl extends AbstractC1362Nv implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"idQnrwKrPQs0c3zYYHT6WTvW1aXoRMqQ", "Gekt1WHQiHnIJqxdwB9j8FzDtIJy1cfJ", "sF2V", "CdtBVDHmuEaNC9R8", "jtmNaJ8NDkAfiILRFeCM3WK", "aXO2Ks7stxeTyHMnCxwSATKtkmhK3bmt", "xmLEl9t0StR", ""};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C1636Yn A05;
    public L9 A06;
    public C1510Tn A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final C1358Nr A0B;
    public final Map<String, String> A0C;

    public static String A04(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            int i13 = copyOfRange[i12] ^ i11;
            if (A0E[2].length() != 4) {
                throw new RuntimeException();
            }
            A0E[3] = "DG";
            copyOfRange[i12] = (byte) (i13 ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{3, Ascii.FF, 9, 3, Ascii.VT, 63, 19, Ascii.SI, Ascii.NAK, Ascii.DC2, 3, 5, 8, Ascii.FF, 67, 3, Ascii.VT, Ascii.GS, Ascii.GS, Ascii.VT, 0, 9, Ascii.VT, Ascii.FS, Ascii.DEL, 121, 111, 120, 105, 102, 99, 105, 97};
    }

    static {
        A07();
        A0F = (int) (LD.A02 * 24.0f);
    }

    public ViewOnClickListenerC1508Tl(C1636Yn c1636Yn, AbstractC1739b5 abstractC1739b5, C1P c1p, J2 j22, MC mc, RE re, C1295Lg c1295Lg) {
        this(c1636Yn, abstractC1739b5.A0L(), c1p, abstractC1739b5.A0x().A0F().A06(), j22, mc, re, c1295Lg, abstractC1739b5.A0y());
        this.A0B.A04(abstractC1739b5);
    }

    public ViewOnClickListenerC1508Tl(C1636Yn c1636Yn, String str, C1P c1p, J2 j22, MC mc, RE re, C1295Lg c1295Lg, C1U c1u) {
        this(c1636Yn, str, c1p, false, j22, mc, re, c1295Lg, c1u);
    }

    public ViewOnClickListenerC1508Tl(C1636Yn c1636Yn, String str, C1P c1p, boolean z8, J2 j22, MC mc, RE re, C1295Lg c1295Lg, C1U c1u) {
        super(c1636Yn, c1p);
        this.A0C = new HashMap();
        this.A05 = c1636Yn;
        this.A0A = z8;
        this.A0B = new C1358Nr(c1636Yn, str, re, c1295Lg, j22, c1u, mc);
        setOnClickListener(this);
        AbstractC1303Lo.A0G(1001, this);
    }

    public static Bitmap A03(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private void A05() {
        String str;
        if (this.A0A && (str = this.A09) != null) {
            this.A02 = A03(AbstractC1312Lx.A03(this.A05, str.contains(A04(12, 12, 61)) ? EnumC1311Lw.MESSENGER : EnumC1311Lw.WHATSAPP));
            this.A03 = new Paint();
            int i9 = A0F;
            setPadding(i9, 0, i9, 0);
        }
    }

    private void A06() {
        L9 l9 = this.A06;
        if (l9 != null) {
            l9.A06();
        }
        C1510Tn c1510Tn = this.A07;
        if (c1510Tn != null) {
            c1510Tn.A04();
        }
    }

    public static boolean A08(AbstractC1739b5 abstractC1739b5) {
        return ((long) abstractC1739b5.A0u()) > 0 && abstractC1739b5.A0s() >= 0;
    }

    public final void A09(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return;
        }
        A06();
        this.A0C.put(A04(0, 12, 51), str);
        this.A0B.A07(this.A08, this.A09, this.A0C);
    }

    public final boolean A0A(AbstractC1739b5 abstractC1739b5, MB mb) {
        if (this.A06 != null || !A08(abstractC1739b5) || abstractC1739b5.A11().A01() == null || abstractC1739b5.A11().A00() == null) {
            return false;
        }
        this.A07 = new C1510Tn(abstractC1739b5.A0s(), abstractC1739b5.A0u(), abstractC1739b5.A0t(), abstractC1739b5.A11().A01(), abstractC1739b5.A11().A00(), mb, this);
        L9 l9 = new L9(abstractC1739b5.A0u(), this.A07);
        this.A06 = l9;
        l9.A07();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            A09(A04(24, 9, 89));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A06();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            int width = this.A02.getWidth();
            this.A01 = width;
            this.A00 = 12;
            int shift = (width + 12) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width2 = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f9 = width2 - textWidth;
            float textWidth2 = this.A00;
            int i9 = (int) (f9 - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i9, top, i9 + left, left + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i9) {
        super.onVisibilityChanged(view, i9);
        if (i9 != 0) {
            A06();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        if (!z8) {
            A06();
        }
    }

    public void setCreativeAsCtaLoggingHelper(OG og) {
        this.A0B.A06(og);
    }

    public void setCta(C1Q c1q, String str, Map<String, String> extraData) {
        setCta(c1q, str, extraData, null);
    }

    public void setCta(C1Q c1q, String str, Map<String, String> extraData, InterfaceC1357Nq interfaceC1357Nq) {
        this.A08 = str;
        this.A09 = c1q.A05();
        this.A0C.putAll(extraData);
        this.A0B.A05(interfaceC1357Nq);
        String A04 = c1q.A04();
        if (!TextUtils.isEmpty(A04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(A04);
                A05();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z8) {
        this.A0B.A08(z8);
    }
}
