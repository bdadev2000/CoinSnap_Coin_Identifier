package com.facebook.ads.redexgen.uinode;

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
public final class ViewOnClickListenerC0942Tl extends AbstractC0796Nv implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"idQnrwKrPQs0c3zYYHT6WTvW1aXoRMqQ", "Gekt1WHQiHnIJqxdwB9j8FzDtIJy1cfJ", "sF2V", "CdtBVDHmuEaNC9R8", "jtmNaJ8NDkAfiILRFeCM3WK", "aXO2Ks7stxeTyHMnCxwSATKtkmhK3bmt", "xmLEl9t0StR", ""};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C1070Yn A05;
    public L9 A06;
    public C0944Tn A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final C0792Nr A0B;
    public final Map<String, String> A0C;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A0E[2].length() != 4) {
                throw new RuntimeException();
            }
            A0E[3] = "DG";
            copyOfRange[i13] = (byte) (i14 ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{3, Ascii.FF, 9, 3, Ascii.VT, 63, 19, Ascii.SI, Ascii.NAK, Ascii.DC2, 3, 5, 8, Ascii.FF, 67, 3, Ascii.VT, Ascii.GS, Ascii.GS, Ascii.VT, 0, 9, Ascii.VT, Ascii.FS, Byte.MAX_VALUE, 121, 111, 120, 105, 102, 99, 105, 97};
    }

    static {
        A07();
        A0F = (int) (LD.A02 * 24.0f);
    }

    public ViewOnClickListenerC0942Tl(C1070Yn c1070Yn, AbstractC1173b5 abstractC1173b5, C1P c1p, J2 j22, MC mc2, RE re2, C0729Lg c0729Lg) {
        this(c1070Yn, abstractC1173b5.A0L(), c1p, abstractC1173b5.A0x().A0F().A06(), j22, mc2, re2, c0729Lg, abstractC1173b5.A0y());
        this.A0B.A04(abstractC1173b5);
    }

    public ViewOnClickListenerC0942Tl(C1070Yn c1070Yn, String str, C1P c1p, J2 j22, MC mc2, RE re2, C0729Lg c0729Lg, C1U c1u) {
        this(c1070Yn, str, c1p, false, j22, mc2, re2, c0729Lg, c1u);
    }

    public ViewOnClickListenerC0942Tl(C1070Yn c1070Yn, String str, C1P c1p, boolean z10, J2 j22, MC mc2, RE re2, C0729Lg c0729Lg, C1U c1u) {
        super(c1070Yn, c1p);
        this.A0C = new HashMap();
        this.A05 = c1070Yn;
        this.A0A = z10;
        this.A0B = new C0792Nr(c1070Yn, str, re2, c0729Lg, j22, c1u, mc2);
        setOnClickListener(this);
        AbstractC0737Lo.A0G(1001, this);
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
            this.A02 = A03(AbstractC0746Lx.A03(this.A05, str.contains(A04(12, 12, 61)) ? EnumC0745Lw.MESSENGER : EnumC0745Lw.WHATSAPP));
            this.A03 = new Paint();
            int i10 = A0F;
            setPadding(i10, 0, i10, 0);
        }
    }

    private void A06() {
        L9 l92 = this.A06;
        if (l92 != null) {
            l92.A06();
        }
        C0944Tn c0944Tn = this.A07;
        if (c0944Tn != null) {
            c0944Tn.A04();
        }
    }

    public static boolean A08(AbstractC1173b5 abstractC1173b5) {
        return ((long) abstractC1173b5.A0u()) > 0 && abstractC1173b5.A0s() >= 0;
    }

    public final void A09(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return;
        }
        A06();
        this.A0C.put(A04(0, 12, 51), str);
        this.A0B.A07(this.A08, this.A09, this.A0C);
    }

    public final boolean A0A(AbstractC1173b5 abstractC1173b5, MB mb2) {
        if (this.A06 != null || !A08(abstractC1173b5) || abstractC1173b5.A11().A01() == null || abstractC1173b5.A11().A00() == null) {
            return false;
        }
        this.A07 = new C0944Tn(abstractC1173b5.A0s(), abstractC1173b5.A0u(), abstractC1173b5.A0t(), abstractC1173b5.A11().A01(), abstractC1173b5.A11().A00(), mb2, this);
        L9 l92 = new L9(abstractC1173b5.A0u(), this.A07);
        this.A06 = l92;
        l92.A07();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            A09(A04(24, 9, 89));
        } catch (Throwable th2) {
            KL.A00(th2, this);
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
            float f10 = width2 - textWidth;
            float textWidth2 = this.A00;
            int i10 = (int) (f10 - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i10, top, i10 + left, left + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            A06();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!z10) {
            A06();
        }
    }

    public void setCreativeAsCtaLoggingHelper(OG og2) {
        this.A0B.A06(og2);
    }

    public void setCta(C1Q c1q, String str, Map<String, String> extraData) {
        setCta(c1q, str, extraData, null);
    }

    public void setCta(C1Q c1q, String str, Map<String, String> extraData, InterfaceC0791Nq interfaceC0791Nq) {
        this.A08 = str;
        this.A09 = c1q.A05();
        this.A0C.putAll(extraData);
        this.A0B.A05(interfaceC0791Nq);
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

    public void setIsInAppBrowser(boolean z10) {
        this.A0B.A08(z10);
    }
}
