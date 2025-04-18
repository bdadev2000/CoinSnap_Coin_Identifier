package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ui, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC0909Ui extends OL implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", "E", "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C1045Zs A05;
    public LH A06;
    public C0911Uk A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final OH A0B;
    public final Map<String, String> A0C;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{-30, -21, -24, -30, -22, -34, -14, -18, -12, -15, -30, -28, -23, -27, -80, -16, -24, -10, -10, -24, -15, -22, -24, -11, 40, 38, 24, 37, 22, 31, 28, 22, 30};
    }

    static {
        A07();
        A0F = (int) (LP.A02 * 24.0f);
    }

    public ViewOnClickListenerC0909Ui(C1045Zs c1045Zs, AbstractC1187cD abstractC1187cD, C1O c1o, J7 j7, MR mr, C0833Rk c0833Rk, C0688Lv c0688Lv, LZ lz) {
        this(c1045Zs, abstractC1187cD.A0Y(), c1o, abstractC1187cD.A1P().A0G().A06(), j7, mr, c0833Rk, c0688Lv, abstractC1187cD.A1Q(), lz);
        this.A0B.A04(abstractC1187cD);
    }

    public ViewOnClickListenerC0909Ui(C1045Zs c1045Zs, String str, C1O c1o, J7 j7, MR mr, C0833Rk c0833Rk, C0688Lv c0688Lv, C1T c1t) {
        this(c1045Zs, str, c1o, false, j7, mr, c0833Rk, c0688Lv, c1t);
    }

    public ViewOnClickListenerC0909Ui(C1045Zs c1045Zs, String str, C1O c1o, boolean z2, J7 j7, MR mr, C0833Rk c0833Rk, C0688Lv c0688Lv, C1T c1t) {
        super(c1045Zs, c1o);
        this.A0C = new HashMap();
        this.A05 = c1045Zs;
        this.A0A = z2;
        this.A0B = new OH(c1045Zs, str, c0833Rk, c0688Lv, j7, c1t, mr);
        setOnClickListener(this);
        M3.A0G(1001, this);
    }

    public ViewOnClickListenerC0909Ui(C1045Zs c1045Zs, String str, C1O c1o, boolean z2, J7 j7, MR mr, C0833Rk c0833Rk, C0688Lv c0688Lv, C1T c1t, LZ lz) {
        super(c1045Zs, c1o);
        this.A0C = new HashMap();
        this.A05 = c1045Zs;
        this.A0A = z2;
        this.A0B = new OH(c1045Zs, str, c0833Rk, c0688Lv, j7, c1t, mr, lz);
        setOnClickListener(this);
        M3.A0G(1001, this);
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
        if (this.A0A && this.A09 != null) {
            this.A02 = A03(MC.A03(this.A05, this.A09.contains(A04(12, 12, 10)) ? MB.MESSENGER : MB.WHATSAPP));
            this.A03 = new Paint();
            setPadding(A0F, 0, A0F, 0);
        }
    }

    private void A06() {
        if (this.A06 != null) {
            LH lh = this.A06;
            if (A0E[0].charAt(27) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            lh.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static boolean A08(AbstractC1187cD abstractC1187cD) {
        return ((long) abstractC1187cD.A1M()) > 0 && abstractC1187cD.A1K() >= 0;
    }

    public final void A09(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return;
        }
        A06();
        this.A0C.put(A04(0, 12, 6), str);
        this.A0B.A08(this.A08, this.A09, this.A0C);
    }

    public final boolean A0A(AbstractC1187cD abstractC1187cD, MQ mq) {
        if (this.A06 != null || !A08(abstractC1187cD) || abstractC1187cD.A1T().A01() == null || abstractC1187cD.A1T().A00() == null) {
            return false;
        }
        this.A07 = new C0911Uk(abstractC1187cD.A1K(), abstractC1187cD.A1M(), abstractC1187cD.A1L(), abstractC1187cD.A1T().A01(), abstractC1187cD.A1T().A00(), mq, this);
        this.A06 = new LH(abstractC1187cD.A1M(), this.A07);
        this.A06.A07();
        return true;
    }

    public OH getCtaActionHelper() {
        return this.A0B;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            A09(A04(24, 9, 58));
        } catch (Throwable th) {
            KQ.A00(th, this);
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
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f2 = width - textWidth;
            float textWidth2 = this.A00;
            int i2 = (int) (f2 - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i2, top, left + i2, this.A01 + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 != 0) {
            A06();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (!z2) {
            A06();
        }
    }

    public void setCreativeAsCtaLoggingHelper(LL ll) {
        this.A0B.A05(ll);
    }

    public void setCta(C1P c1p, String str, Map<String, String> extraData) {
        setCta(c1p, str, extraData, null);
    }

    public void setCta(C1P c1p, String str, Map<String, String> extraData, LZ lz, OG og) {
        setCta(c1p, str, extraData, og);
        this.A0B.A06(lz);
    }

    public void setCta(C1P c1p, String str, Map<String, String> extraData, OG og) {
        this.A08 = str;
        this.A09 = c1p.A05();
        this.A0C.putAll(extraData);
        this.A0B.A07(og);
        String A04 = c1p.A04();
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

    public void setIsInAppBrowser(boolean z2) {
        this.A0B.A09(z2);
    }
}
