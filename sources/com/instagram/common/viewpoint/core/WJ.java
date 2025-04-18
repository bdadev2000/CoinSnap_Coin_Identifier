package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public final class WJ extends C5Y implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"gicLODNc4Ss02ASp0SH6jYH1jReGCf7D", "ud1g41PfTpgHVgN2zMRJY9l5AGp7t", "qgXpVhlOa1wHLevNk8n", "YvRZAMwcrsdunGxdPmTtNWzK4vSRpQc4", "eiRiwAROr6ki2Hau4nBgoUP0cJGv3yGG", "AknM7mKZVSENDtzyALrGWQlwPvra0WAt", "RqySj6gASebQYnIOdgQzgXbIWVvFlmni", "rcToBCOkHOudlFUS35924ELLk4KD1"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C1045Zs A01;
    public JP A02;
    public C0452Bu A04;
    public C7V A05;
    public C7O A06;
    public AbstractC0832Rj A07;
    public C0833Rk A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC0811Qo A0C = new WP(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public JZ A03 = JZ.A03;

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{11, 44, 52, 35, 46, 43, 38, 98, 48, 39, 44, 38, 39, 48, 39, 48, 98, 33, 42, 43, 46, 38, 98, 33, 45, 44, 36, 43, 37, 108, 7, 47, 46, 35, 43, 28, 35, 47, 61, 28, 35, 46, 47, 37, 106, 35, 57, 106, 36, Utf8.REPLACEMENT_BYTE, 38, 38, 113, 106, Utf8.REPLACEMENT_BYTE, 36, 43, 40, 38, 47, 106, 62, 37, 106, 44, 35, 36, 46, 106, 35, 62, 100, 122, 65, 78, 77, 67, 74, 15, 91, 64, 15, 73, 70, 65, 75, 15, 98, 74, 75, 70, 78, 121, 70, 74, 88, 121, 70, 75, 74, 64, 15, 76, 71, 70, 67, 75, 1};
    }

    static {
        A0E();
        A0H = WJ.class.getSimpleName();
    }

    private WO A00(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new WO(this, mediaViewVideoRendererApi);
    }

    private WN A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new WN(this, mediaViewVideoRendererApi);
    }

    private WL A02() {
        return new WL(this);
    }

    private C0833Rk A05() {
        return new C0833Rk(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        if (this.A04 != null) {
            C0452Bu c0452Bu = this.A04;
            if (A0G[6].charAt(16) != 'd') {
                throw new RuntimeException();
            }
            A0G[5] = "Ntv0Vby76dSesAjQjgB6ptCIElpzOEzL";
            ((C0812Qp) c0452Bu.getVideoView()).setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        if (this.A04 != null) {
            this.A04.getVideoView().setOnTouchListener(new JO(this));
        }
    }

    private void A0B() {
        if (this.A04 != null) {
            ((C0812Qp) this.A04.getVideoView()).setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09 && this.A00.hasWindowFocus()) {
            this.A08.A0U();
            return;
        }
        if (this.A04 != null) {
            EnumC0830Rh state = this.A04.getState();
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[4] = "z79LrkWpr7afRwAllWq14kp6jWBswbkV";
            if (state == EnumC0830Rh.A05) {
                this.A0B = true;
            }
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = JZ.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(W7 w7, JP jp) {
        String str;
        this.A0A = false;
        this.A0B = false;
        this.A02 = jp;
        A09();
        C7V c7v = this.A05;
        if (w7 != null && w7.getAdCoverImage() != null) {
            JU adCoverImage = w7.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[5] = "TnDtOWvYiNMfLmp09Wf7ctnD5adJ0dsa";
            str = adCoverImage.getUrl();
        } else {
            str = null;
        }
        c7v.setImage(str, new WM(this));
        this.A03 = w7.A18();
        this.A06.setPlayAccessibilityLabel(w7.A1E());
        this.A06.setPauseAccessibilityLabel(w7.A1D());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(EnumC0815Qs enumC0815Qs) {
        if (this.A04 != null) {
            this.A04.A0b(enumC0815Qs, 24);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.e(A0H, A06(30, 42, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        if (this.A04 == null || this.A04.getState() == EnumC0830Rh.A06) {
            return false;
        }
        return this.A03 == JZ.A05 || this.A03 == JZ.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i2) {
        JR A01;
        ((C5Y) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        switch (i2) {
            case 0:
                A01 = A01(mediaViewVideoRendererApi);
                break;
            case 1:
                A01 = A00(mediaViewVideoRendererApi);
                break;
            default:
                throw new IllegalArgumentException(A06(0, 30, 15));
        }
        ((C02985h) mediaViewVideoRendererApi).A06(A01);
        this.A01 = C02925b.A03(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C7V(this.A01);
        this.A07 = A02();
        this.A08 = A05();
        float density = LP.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A06 = new C7O(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A06.setLayoutParams(layoutParams);
        int i3 = 0;
        while (true) {
            int i4 = this.A00.getChildCount();
            if (A0G[2].length() == 26) {
                throw new RuntimeException();
            }
            A0G[6] = "7BCad5LO6te39ERddnjUHTKJR8zzbght";
            if (i3 < i4) {
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof C0452Bu) {
                    this.A04 = (C0452Bu) childAt;
                } else {
                    i3++;
                }
            }
        }
        if (this.A04 == null) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0H, A06(72, 36, 98));
            }
        } else {
            this.A04.A0c(this.A05);
            C0452Bu c0452Bu = this.A04;
            C7O c7o = this.A06;
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                c0452Bu.A0c(c7o);
            } else {
                A0G[5] = "Z21owOXIiAfqNY46KReygSjUmuqXSFx4";
                c0452Bu.A0c(c7o);
            }
        }
        this.A08.A0W(0);
        this.A08.A0X(250);
        A01.AGT();
    }

    @Override // com.instagram.common.viewpoint.core.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.instagram.common.viewpoint.core.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        boolean A0p = C0608Im.A0p(this.A01);
        this.A00.setOnTouchListener(new JN(this, A0p));
        if (!A0p) {
            A0A();
        }
    }

    @Override // com.instagram.common.viewpoint.core.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        A0C();
    }

    @Override // com.instagram.common.viewpoint.core.C5Y, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        A0C();
    }
}
