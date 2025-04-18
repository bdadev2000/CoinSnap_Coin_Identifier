package com.facebook.ads.redexgen.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0719Kw extends ImageView implements QN {
    public static byte[] A05;
    public static String[] A06 = {"CZ6R6baQKTb1E5sAmpDqVkfMXF7zVnG4", "nQZGX73N3q5NRRZlZyP90gUTrDeeLYBu", "LfCM6PYFJNbwOvLH4thVDQon3h1Zk2zk", "bpUakkTElIOqaP65ISNG9oh", "gJtMODfbj2e7z8MJG7ZRKfD", "8rYwk9o7IGDDsMQbyUTj4ra1LUt9E6qX", "3WiLQHXTUUJ8WctEatoRQ", "Xo7nIXQ5hsw2R0tzDjIU8fyfjH4jtFIR"};
    public static final int A07;
    public SA A00;
    public final Paint A01;
    public final C1070Yn A02;
    public final JA A03;
    public final MV A04;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{101, 93, 92, 77, 8, 105, 76};
    }

    static {
        A06();
        A07 = (int) (LD.A02 * 4.0f);
    }

    public C0719Kw(C1070Yn c1070Yn, JA ja2) {
        super(c1070Yn);
        this.A04 = new MV() { // from class: com.facebook.ads.redexgen.X.7S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MW mw) {
                C0719Kw.this.A09();
            }
        };
        this.A03 = ja2;
        this.A02 = c1070Yn;
        Paint paint = new Paint();
        this.A01 = paint;
        paint.setColor(-1728053248);
        setColorFilter(-1);
        int i10 = A07;
        setPadding(i10, i10, i10, i10);
        setContentDescription(A03(0, 7, 59));
        A05();
        setOnClickListener(new ViewOnClickListenerC0854Qb(this));
    }

    private void A04() {
        setImageBitmap(AbstractC0746Lx.A01(EnumC0745Lw.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(AbstractC0746Lx.A01(EnumC0745Lw.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        SA sa2 = this.A00;
        if (sa2 != null) {
            float volume = sa2.getVolume();
            String[] strArr = A06;
            if (strArr[5].charAt(12) == strArr[1].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "7LwdJMyLjSlNEKSwxkcw7Q3";
            strArr2[6] = "d5nTRpYYugpReKnwSxkEX";
            if (volume == 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void A9R(SA sa2) {
        this.A00 = sa2;
        if (sa2 != null) {
            sa2.getEventBus().A05(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void AGl(SA sa2) {
        SA sa3 = this.A00;
        if (sa3 != null) {
            sa3.getEventBus().A06(this.A04);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int y4 = getWidth() / 2;
        int x10 = getHeight() / 2;
        canvas.drawCircle(y4, x10, Math.min(y4, x10), this.A01);
        super.onDraw(canvas);
    }
}
