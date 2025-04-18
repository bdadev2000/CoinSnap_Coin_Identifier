package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class ZH extends C03475a implements MediaViewApi, Repairable, InterfaceC03947b {
    public static byte[] A0E;
    public static String[] A0F = {"5egxRyJvv3hsImr6xVPVZGZzS", "S92E58UIdGCmPOb4LYA51SRur0tU5vPU", "gB2LJBWgacco1yi3dwEv6yCRJyLib4yq", "IRYDxixZynQ1VjnPzR0JfxvjieAE", "Yx6PPUM30uHFy3rHO75LIsUaVykI", "YSQgGTlHzzB", "fqdcFq1cD4m6uZ0nLvDLKOa7nCA9CaYH", "MqJIv4BM2hfR6AMSoGkEEGT8SPZgcE8o"};
    public static final String A0G;
    public View A00;
    public View A01;
    public ImageView A02;
    public MediaView A03;
    public MediaViewListener A04;
    public MediaViewVideoRenderer A05;
    public AdComponentViewParentApi A06;
    public C1070Yn A07;
    public C3C A08;
    public C0780Nf A09;
    public B0 A0A;
    public C0850Px A0B;
    public boolean A0C;
    public boolean A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{56, Ascii.SUB, 9, Ascii.DC4, Ascii.SO, 8, Ascii.RS, Ascii.ETB, 91, 9, Ascii.RS, Ascii.NAK, Ascii.US, Ascii.RS, 9, Ascii.RS, 9, 91, Ascii.SYN, Ascii.SO, 8, Ascii.SI, 91, Ascii.EM, Ascii.RS, 91, 8, Ascii.RS, Ascii.SI, 91, Ascii.EM, Ascii.RS, Ascii.GS, Ascii.DC4, 9, Ascii.RS, 91, Ascii.NAK, Ascii.SUB, Ascii.SI, Ascii.DC2, Ascii.CR, Ascii.RS, 58, Ascii.US, 85, Ascii.SUB, Ascii.RS, Ascii.GS, 41, 56, 53, 57, 50, 63, 57, Ascii.DC2, 57, 40, 43, 51, 46, 55, 64, 100, 104, 110, 108, 41, 123, 108, 103, 109, 108, 123, 108, 123, 41, 100, 124, 122, 125, 41, 107, 108, 41, 122, 108, 125, 41, 107, 108, 111, 102, 123, 108, 41, 103, 104, 125, 96, Byte.MAX_VALUE, 108, 72, 109, 39, 96, 68, 72, 78, 76, 9, 91, 76, 71, 77, 76, 91, 76, 91, 9, 68, 92, 90, 93, 9, 75, 76, 9, 90, 76, 93, 9, 75, 76, 79, 70, 91, 76, 9, 71, 72, 93, 64, 95, 76, 107, 72, 71, 71, 76, 91, 104, 77, 7, Ascii.DC2, 53, 45, 58, 55, 50, 63, 123, Ascii.CR, 50, 62, 44, 123, 56, 52, 53, 40, 47, 41, 46, 56, 47, 52, 41, 123, 43, 58, 41, 58, 54, 40, 123, 47, 34, 43, 62, 117, 1, 46, 59, 38, 57, 42, 111, Ascii.SO, 43, 111, 6, 44, 32, 33, 111, 38, 60, 111, 33, 58, 35, 35, 97, Ascii.VT, 52, 57, 56, 50, 125, 47, 56, 51, 57, 56, 47, 56, 47, 125, 48, 40, 46, 41, 125, 63, 56, 125, 46, 56, 41, 125, 63, 56, 59, 50, 47, 56, 125, 51, 60, 41, 52, 43, 56, Ascii.FS, 57, 115, Ascii.SUB, Ascii.VT, Ascii.DC2, 96, 108, 110, 45, 101, 98, 96, 102, 97, 108, 108, 104, 45, 98, 103, 112, 45, 109, 98, 119, 106, 117, 102, 45, 96, 111, 106, 96, 104, 102, 103, 117, 106, 103, 102, 108, 86, 113, 111, 62};
    }

    static {
        A08();
        A0G = MediaView.class.getSimpleName();
    }

    private void A05() {
        B0 b02 = this.A0A;
        if (b02 != null) {
            b02.setVisibility(8);
            C3T.A0A(this.A0A.getDynamicWebViewController().A0O(), new ColorDrawable(0));
            this.A03.removeView(this.A0A);
            this.A0A = null;
        }
    }

    private void A06() {
        if (!this.A0D) {
            View view = this.A01;
            String[] strArr = A0F;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "HiqmuX4YAHl";
            strArr2[0] = "JtgDxExoVYEb5OmxUIRsQ7gjV";
            if (view != null) {
                AbstractC0737Lo.A0J(this.A08);
            }
            float f10 = LD.A02;
            float density = 4.0f * f10;
            int hPadding = Math.round(density);
            float density2 = 12.0f * f10;
            int vPadding = Math.round(density2);
            this.A08.setChildSpacing(hPadding);
            this.A08.setPadding(0, vPadding, 0, vPadding);
            this.A08.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            C3C c3c = this.A08;
            this.A01 = c3c;
            this.A03.addView(c3c, layoutParams);
            return;
        }
        throw new IllegalStateException(A04(0, 46, 84));
    }

    private void A07() {
        LI.A04(this.A03, LI.A0A);
        LI.A04(this.A09, LI.A0A);
        LI.A04(this.A05, LI.A0A);
        LI.A04(this.A01, LI.A0A);
    }

    private final void A09(View view, ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A03.addView(view, layoutParams);
        A01(true);
    }

    private void A0A(View view, V2 v22) {
        C0850Px c0850Px = this.A0B;
        if (c0850Px != null) {
            MediaView mediaView = this.A03;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "tYahJlzELN2bWoIKGOvNb4V2q4om3tal";
            strArr2[2] = "knO8IZUpKtredd0Q2IkvjJrJQGpJW1Qq";
            mediaView.removeView(c0850Px);
        }
        if (!v22.A1d()) {
            return;
        }
        String A1C = v22.A1C();
        Context context = this.A03.getContext();
        String[] strArr3 = A0F;
        String str = strArr3[5];
        String mediationData = strArr3[0];
        if (str.length() != mediationData.length()) {
            String[] strArr4 = A0F;
            strArr4[4] = "LedcnhOkj71a4gNr9a9uwwPVwkpS";
            strArr4[3] = "bOPNktfa058vxRDYU7HJ2aiUk3a2";
            if (context == null) {
                return;
            }
        } else if (context == null) {
            return;
        }
        C0850Px A01 = AbstractC0849Pw.A01(this.A07, A1C);
        if (A0F[7].charAt(21) != 'L') {
            A0F[1] = "IBU68ioTGuVBWJ1dkmCJ7UK76Osi7EVF";
            this.A0B = A01;
            if (A01 == null) {
                return;
            }
        } else {
            this.A0B = A01;
            if (A01 == null) {
                return;
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(5, view.getId());
        layoutParams.addRule(7, view.getId());
        layoutParams.addRule(6, view.getId());
        layoutParams.addRule(8, view.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
        }
        A09(this.A0B, layoutParams);
        this.A06.bringChildToFront(this.A0B);
    }

    private void A0B(ImageView imageView) {
        if (!this.A0D) {
            ImageView imageView2 = this.A02;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "9onWrVOda1qlu0pAvyXYf5LKITz29A5r";
            strArr2[2] = "G6pev0JETY7bhqmEZOziJsmCoQM1bBBX";
            if (imageView2 != null) {
                AbstractC0737Lo.A0J(imageView2);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(imageView, layoutParams);
            imageView.setId(AbstractC0737Lo.A00());
            this.A02 = imageView;
            return;
        }
        throw new IllegalStateException(A04(106, 49, 6));
    }

    private final void A0C(C1070Yn c1070Yn, AttributeSet attributeSet, int i10, int i11, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1070Yn, attributeSet, i10, i11));
        A0H(new C0780Nf(c1070Yn, attributeSet, i10, i11));
        this.A08 = new C3C(c1070Yn, attributeSet, i10);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1070Yn, attributeSet, i10, i11));
        A07();
    }

    private final void A0D(C1070Yn c1070Yn, AttributeSet attributeSet, int i10, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1070Yn, attributeSet, i10));
        A0H(new C0780Nf(c1070Yn, attributeSet, i10));
        this.A08 = new C3C(c1070Yn, attributeSet, i10);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1070Yn, attributeSet, i10));
        A07();
    }

    private final void A0E(C1070Yn c1070Yn, AttributeSet attributeSet, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1070Yn, attributeSet));
        A0H(new C0780Nf(c1070Yn, attributeSet));
        this.A08 = new C3C(c1070Yn, attributeSet);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1070Yn, attributeSet));
        A07();
    }

    private final void A0F(C1070Yn c1070Yn, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1070Yn));
        A0H(new C0780Nf(c1070Yn));
        this.A08 = new C3C(c1070Yn);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1070Yn));
        A07();
    }

    private void A0G(V2 v22, boolean z10, JP jp) {
        AsyncTaskC0947Tq A04 = new AsyncTaskC0947Tq(this.A02, this.A07).A04();
        if (z10) {
            A04.A06(new ZO(this, v22));
        }
        A04.A07(jp.getUrl());
    }

    private void A0H(C0780Nf c0780Nf) {
        if (!this.A0D) {
            C0780Nf c0780Nf2 = this.A09;
            if (c0780Nf2 != null) {
                this.A03.removeView(c0780Nf2);
            }
            c0780Nf.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(c0780Nf, layoutParams);
            this.A09 = c0780Nf;
            return;
        }
        throw new IllegalStateException(A04(63, 43, 38));
    }

    private boolean A0I(NativeAd nativeAd) {
        List<NativeAd> carousel = ((C03555i) nativeAd.getNativeAdApi()).A03();
        if (carousel == null) {
            return false;
        }
        Iterator<NativeAd> it = carousel.iterator();
        while (it.hasNext()) {
            if (it.next().getAdCoverImage() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(NativeAd nativeAd) {
        return Build.VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(((C03555i) nativeAd.getNativeAdApi()).A02());
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x035e, code lost:
    
        if ((r1 instanceof com.facebook.ads.redexgen.uinode.NW) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0360, code lost:
    
        ((com.facebook.ads.redexgen.uinode.NW) r1).A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03b6, code lost:
    
        ((com.facebook.ads.redexgen.uinode.C0553Eb) r1).setAdapter(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x03b3, code lost:
    
        if ((r1 instanceof com.facebook.ads.redexgen.uinode.NW) != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0L(com.facebook.ads.NativeAd r18) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.ZH.A0L(com.facebook.ads.NativeAd):void");
    }

    public final void A0M(NativeAdBaseApi nativeAdBaseApi, boolean z10) {
        C1070Yn A11 = ((V2) nativeAdBaseApi).A11();
        C1070Yn adObjectContext = this.A07;
        adObjectContext.A0K(A11);
        A11.A0L(this);
        this.A0D = true;
        V2 A0L = V2.A0L(nativeAdBaseApi);
        A0L.A1P(this.A03);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((C03545h) this.A05.getMediaViewVideoRendererApi()).A03();
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
            View view2 = this.A01;
            if (view2 instanceof NW) {
                ((NW) view2).A04();
            } else {
                ((C0553Eb) view2).setAdapter(null);
            }
        }
        this.A02.setVisibility(0);
        bringChildToFront(this.A02);
        this.A00 = this.A02;
        JP adIcon = A0L.getAdIcon();
        if (adIcon != null) {
            Bitmap A0M = A0L.A10().A0M(adIcon.getUrl());
            if (A0M != null) {
                this.A02.setImageBitmap(A0M);
                if (z10) {
                    this.A03.post(new ZP(this, A0L));
                }
            } else {
                A0G(A0L, z10, adIcon);
            }
        } else {
            V1 A15 = A0L.A15();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            A11.A0E().A2m(A0L.A0x(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (A15 != null) {
                A15.ABR(C0676Jb.A00(adErrorType));
            }
            Log.e(A04(46, 17, 115), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                C1070Yn adObjectContext2 = this.A07;
                adObjectContext2.A07().A9a(A04(258, 3, 84), C8A.A0W, new C8B(A04(PsExtractor.AUDIO_STREAM, 23, 96)));
            }
        }
        A0A(this.A02, A0L);
    }

    public final boolean A0N() {
        View view = this.A01;
        return view != null && view.getVisibility() == 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03947b
    public final C1070Yn A5t() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.uinode.C03475a, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        if (view == this.A01 || view == this.A05 || view == this.A09 || view == this.A02) {
            this.A06.bringChildToFront(view);
            C0850Px c0850Px = this.A0B;
            if (c0850Px != null) {
                this.A06.bringChildToFront(c0850Px);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A05.pause(false);
        this.A05.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getHeight();
        }
        if (A0F[1].charAt(24) == 't') {
            throw new RuntimeException();
        }
        A0F[7] = "3C5Zne3gt6SFfa7y1AnuQltffgpI3Oh8";
        return 0;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaWidth() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageWidth();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getWidth();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getWidth();
        }
        String[] strArr = A0F;
        if (strArr[6].charAt(12) == strArr[2].charAt(12)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[5] = "pFreRfYdfw1";
        strArr2[0] = "pVUprXCJsnglf8IlGtX2XFBaJ";
        return 0;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C1070Yn) {
            this.A07 = (C1070Yn) context;
        } else {
            this.A07 = C03495c.A03(context);
        }
        this.A07.A0L(this);
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                A0F(this.A07, mediaView);
                break;
            case 1:
                A0E(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
                break;
            case 2:
                A0D(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), mediaView);
                break;
            case 3:
                A0C(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
                break;
            default:
                throw new IllegalArgumentException(A04(155, 37, 116));
        }
        A01(true);
    }

    @Override // com.facebook.ads.redexgen.uinode.C03475a, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        int currentHeight = this.A03.getWidth();
        int height = this.A03.getHeight();
        if (currentHeight > 0 && height > 0) {
            this.A03.repair(th2);
            this.A03.getLayoutParams().width = currentHeight;
            MediaView mediaView = this.A03;
            if (A0F[1].charAt(24) == 116) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[5] = "Mgb6bOJjyiN";
            strArr[0] = "MTEeDXbdwkPsq4eW7ABfM3WBi";
            mediaView.getLayoutParams().height = height;
            this.A03.setBackgroundColor(-3355444);
            return;
        }
        this.A03.repair(th2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A04 = mediaViewListener;
        if (mediaViewListener == null) {
            ((C03545h) this.A05.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((C03545h) this.A05.getMediaViewVideoRendererApi()).A07(new ZI(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0D) {
            MediaViewVideoRenderer mediaViewVideoRenderer2 = this.A05;
            if (A0F[7].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "ifAS5bhxfK6Gg4eu5Yemnhg9EBEfp9jT";
            strArr[2] = "R5YDbsM1msNnvJcIFydw3DY2O0brJ9d9";
            if (mediaViewVideoRenderer2 != null) {
                this.A03.removeView(mediaViewVideoRenderer2);
                this.A05.getMediaViewVideoRendererApi().destroy();
            }
            ((C03545h) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A07.A09());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((ZH) this.A03.getMediaViewApi()).A09(mediaViewVideoRenderer, layoutParams);
            this.A05 = mediaViewVideoRenderer;
            this.A0C = !(mediaViewVideoRenderer instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(AbstractC0737Lo.A00());
            return;
        }
        throw new IllegalStateException(A04(215, 43, 114));
    }
}
