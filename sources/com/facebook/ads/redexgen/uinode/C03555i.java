package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.internal.api.NativeAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03555i implements NativeAdApi {
    public static String[] A02 = {"mRGpAzErj1xKeHc9WkF3Ujy7h38joZC8", "9wVKpObP8FA1o7oyYWhkpjh48o8VAcWp", "pz3BbJjT9xlHe4B2EghGg76rolJKqfV", "txN8wQ5fkL3IFh565s3Q1NMKA4RH7CNr", "KrzK51p50C2Qp4g1XOaXdDfTUeF", "0wnkiGzVks6qBKMatIgqU8hY2PaKlPy", "GWxCKnjCJrIvVlnjjEtvZJVKWYpK", "UfKYcBFUD7Ap"};
    public final NativeAd A00;
    public final NativeAdBaseApi A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, List<View> list) {
        registerViewForInteraction(view, mediaView, (MediaView) null, list);
    }

    public C03555i(NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
        V2.A0L(nativeAdBaseApi).A1Y(EnumC0680Jg.A05);
    }

    public C03555i(NativeAdBase nativeAdBase, NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
    }

    private V2 A00() {
        return V2.A0L(this.A01);
    }

    public final String A01() {
        return A00().A1F();
    }

    public final String A02() {
        return A00().A1G();
    }

    public final List<NativeAd> A03() {
        if (A00().A1H() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (V2 internalNativeAd : A00().A1H()) {
            arrayList.add(new NativeAd(internalNativeAd.A11(), internalNativeAd));
        }
        return arrayList;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final NativeAd.AdCreativeType getAdCreativeType() {
        if (!TextUtils.isEmpty(A00().A1G())) {
            return NativeAd.AdCreativeType.VIDEO;
        }
        if (A00().A1H() != null && !A00().A1H().isEmpty()) {
            return NativeAd.AdCreativeType.CAROUSEL;
        }
        if (A00().getAdCoverImage() != null && !TextUtils.isEmpty(A00().getAdCoverImage().getUrl())) {
            NativeAd.AdCreativeType adCreativeType = NativeAd.AdCreativeType.IMAGE;
            String[] strArr = A02;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "AqlRmswAejgv";
            strArr2[6] = "RNgsy314kOszGsZ2llWC7eCbS6WS";
            return adCreativeType;
        }
        return NativeAd.AdCreativeType.UNKNOWN;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return JU.A00(A00().A18());
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView) {
        registerViewForInteraction(view, mediaView, (MediaView) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, ImageView imageView) {
        registerViewForInteraction(view, mediaView, imageView, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, ImageView imageView, List<View> clickableViews) {
        if (imageView != null) {
            C1070Yn A11 = A00().A11();
            C1070Yn downloadContext = C03495c.A03(imageView.getContext());
            downloadContext.A0K(A11);
            V2.A0j(A00().getAdIcon(), imageView, downloadContext);
        }
        registerViewForInteraction(view, mediaView, (MediaView) null, clickableViews);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, MediaView mediaView2) {
        registerViewForInteraction(view, mediaView, mediaView2, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, MediaView mediaView2, List<View> list) {
        if (mediaView != null) {
            ((ZH) mediaView.getMediaViewApi()).A0L(this.A00);
        }
        if (mediaView2 != null) {
            ((ZH) mediaView2.getMediaViewApi()).A0M(this.A01, false);
        }
        if (list != null) {
            A00().A1O(view, mediaView, list);
            return;
        }
        V2 A00 = A00();
        if (A02[4].length() == 7) {
            throw new RuntimeException();
        }
        A02[1] = "MBrHnoNt0t7c904xRN41qBo9Q6s9Di6J";
        A00.A1N(view, mediaView);
    }
}
