package com.facebook.ads.internal.dynamicloading;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.api.AdSettingsApi;
import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.api.AudienceNetworkAdsApi;
import com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import com.facebook.ads.internal.api.BidderTokenProviderApi;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.InitApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.api.NativeAdViewApi;
import com.facebook.ads.internal.api.NativeAdViewAttributesApi;
import com.facebook.ads.internal.api.NativeAdViewTypeApi;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.api.NativeBannerAdApi;
import com.facebook.ads.internal.api.NativeBannerAdViewApi;
import com.facebook.ads.internal.api.NativeComponentTagApi;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.instagram.common.viewpoint.core.C02925b;
import com.instagram.common.viewpoint.core.C02955e;
import com.instagram.common.viewpoint.core.C02985h;
import com.instagram.common.viewpoint.core.C03015k;
import com.instagram.common.viewpoint.core.C03025l;
import com.instagram.common.viewpoint.core.C03055o;
import com.instagram.common.viewpoint.core.C03125v;
import com.instagram.common.viewpoint.core.C03165z;
import com.instagram.common.viewpoint.core.C03598c;
import com.instagram.common.viewpoint.core.C0626Jh;
import com.instagram.common.viewpoint.core.C1074aL;
import com.instagram.common.viewpoint.core.C1075aM;
import com.instagram.common.viewpoint.core.C1091ac;
import com.instagram.common.viewpoint.core.C5M;
import com.instagram.common.viewpoint.core.C5P;
import com.instagram.common.viewpoint.core.C5Q;
import com.instagram.common.viewpoint.core.C5Z;
import com.instagram.common.viewpoint.core.EnumC0627Jj;
import com.instagram.common.viewpoint.core.J0;
import com.instagram.common.viewpoint.core.J1;
import com.instagram.common.viewpoint.core.JT;
import com.instagram.common.viewpoint.core.JU;
import com.instagram.common.viewpoint.core.JV;
import com.instagram.common.viewpoint.core.JW;
import com.instagram.common.viewpoint.core.LA;
import com.instagram.common.viewpoint.core.W7;
import com.instagram.common.viewpoint.core.WJ;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class DynamicLoaderImpl implements DynamicLoader, RemoteRenderingApi {
    public static AdSettingsApi A00;
    public static AudienceNetworkAdsApi A01;
    public static NativeAdViewApi A02;
    public static NativeBannerAdViewApi A03;
    public static C5Z A04;
    public static String[] A05 = {"FC7PnIQgfKJQfBdQKCurjH6JKIFxjroV", "Ez", "t7pjhhQGIazlhmf4UkwJSh", "Iyhtqk6gC8uyo8Dul94yaDEfv0PrNxAT", "5egoyUR4tSKxNoVVXreZdHvR7BDPW4Oi", "IYlCvOKkAZQkBJEI1e2UxVPIL3gdF2Y", "0QNvsKlwTsAv0tvLZz9yZ17i9BLNPSLj", "RauEdYPLg0wTIRL3lDclFm017FzJm5su"};
    public static final InitApi A06 = new InitApi() { // from class: com.facebook.ads.redexgen.X.5d
        @Override // com.facebook.ads.internal.api.InitApi
        public final void initialize(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i2) {
            C03598c.A0H(C02925b.A09(context), multithreadedBundleWrapper, initListener, i2);
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final boolean isInitialized() {
            return C03598c.A0I();
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void onAdLoadInvoked(Context context) {
            C03598c.A08(C02925b.A09(context));
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void onContentProviderCreated(Context context) {
            C03598c.A09(C02925b.A09(context));
        }
    };

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i2, AdOptionsView adOptionsView) {
        return new C1091ac(context, nativeAdBase, nativeAdLayout, orientation, i2, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        return new C1091ac(context, nativeAdBase, nativeAdLayout, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSettingsApi createAdSettingsApi() {
        if (A00 == null) {
            A00 = new AdSettingsApi() { // from class: com.facebook.ads.redexgen.X.5O
                public static byte[] A00;
                public static String[] A01 = {"5g08JbOH8rkW6qlmlOL6A29nsZk", "3r4qaOnTaYokldocBIi2hcDPsInD4tfb", "t1tpXM0pz4jVDPHhq8DkXYPWitYDcWj1", "M2cS8KouRYddMtKm0nW0nVVXMs", "pym3fLCD1Tj466B1DlzVQDM4sLBUPDKC", "ku7CSS8RQpD6IDBrWEnqwcDf2zEQuZtv", "vquYYtSubxB68XLpTdo3CiQszZtPPcit", "yyxMEkIlFEzZN5mv2HKHli04TbghSWGE"};
                public static final String A02;
                public static final Collection<String> A03;
                public static volatile boolean A04;

                public static String A00(int i2, int i3, int i4) {
                    byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
                    for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                        copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 79);
                        String[] strArr = A01;
                        if (strArr[7].charAt(16) == strArr[1].charAt(16)) {
                            throw new RuntimeException();
                        }
                        A01[0] = "ed4gaD";
                    }
                    return new String(copyOfRange);
                }

                public static void A01() {
                    A00 = new byte[]{14, 5, 23, 15, 8, 14, 3, 24, 25, 10, 21, 31, 25, 3, 21, 24, 3, 20, 29, 15, 20, 3, 23, 25, 5, 90, 107, 125, 122, 46, 99, 97, 106, 107, 46, 106, 107, 120, 103, 109, 107, 46, 102, 111, 125, 102, 52, 46, 71, 120, 117, 126, 48, 100, 117, 99, 100, 121, 126, 119, 48, 105, Byte.MAX_VALUE, 101, 98, 48, 113, 96, 96, 48, 103, 121, 100, 120, 48, 86, 113, 115, 117, 114, Byte.MAX_VALUE, Byte.MAX_VALUE, 123, 55, 99, 48, 113, 116, 48, 101, 126, 121, 100, 99, 48, 105, Byte.MAX_VALUE, 101, 48, 125, 101, 99, 100, 48, 99, 96, 117, 115, 121, 118, 105, 48, 100, 120, 117, 48, 116, 117, 102, 121, 115, 117, 48, 120, 113, 99, 120, 117, 116, 48, 89, 84, 48, 100, Byte.MAX_VALUE, 48, 117, 126, 99, 101, 98, 117, 48, 100, 120, 117, 48, 116, 117, 124, 121, 102, 117, 98, 105, 48, Byte.MAX_VALUE, 118, 48, 100, 117, 99, 100, 48, 113, 116, 99, 60, 48, 113, 116, 116, 48, 100, 120, 117, 48, 118, Byte.MAX_VALUE, 124, 124, Byte.MAX_VALUE, 103, 121, 126, 119, 48, 115, Byte.MAX_VALUE, 116, 117, 48, 114, 117, 118, Byte.MAX_VALUE, 98, 117, 48, 124, Byte.MAX_VALUE, 113, 116, 121, 126, 119, 48, 113, 126, 48, 113, 116, 42, 48, 81, 116, 67, 117, 100, 100, 121, 126, 119, 99, 62, 113, 116, 116, 68, 117, 99, 100, 84, 117, 102, 121, 115, 117, 56, 50, 7, 6, 21, 10, 0, 6, 42, 7, 43, 2, 16, 11, 103, 111, 111, 103, 108, 101, 95, 115, 100, 107, 126, 105, 102, 16, 4, 9, 30, 94, 80, 22, 124, 104, 101, 114, 50, 60, 126, 122};
                }

                static {
                    A01();
                    A02 = AdInternalSettings.class.getSimpleName();
                    A03 = new HashSet();
                    A03.add(A00(262, 3, 66));
                    A03.add(A00(252, 10, 79));
                    A03.add(A00(265, 7, 41));
                    A03.add(A00(272, 8, 69));
                    A04 = false;
                }

                public static void A02(String str) {
                    if (A04) {
                        return;
                    }
                    A04 = true;
                    Log.i(A02, A00(25, 23, 65) + str);
                    Log.i(A02, A00(48, Opcodes.CHECKCAST, 95) + str + A00(0, 3, 99));
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final boolean isTestMode(Context context) {
                    if (!AdInternalSettings.isDebugBuild() && !AdInternalSettings.isExplicitTestMode()) {
                        Collection<String> collection = A03;
                        String str = Build.PRODUCT;
                        String[] strArr = A01;
                        if (strArr[7].charAt(16) == strArr[1].charAt(16)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A01;
                        strArr2[7] = "T4gBNxEGe37wgzXKS7GC3py1fkLao5wI";
                        strArr2[1] = "pVb2nflAxo98tm2kzzD3dq5aQ79B8LIX";
                        if (!collection.contains(str)) {
                            MultithreadedBundleWrapper multithreadedBundleWrapper = AdInternalSettings.sSettingsBundle;
                            String A002 = A00(3, 22, 19);
                            String string = multithreadedBundleWrapper.getString(A002, null);
                            if (string == null) {
                                SharedPreferences A003 = KJ.A00(context);
                                String A004 = A00(240, 12, 44);
                                string = A003.getString(A004, null);
                                if (TextUtils.isEmpty(string)) {
                                    string = UUID.randomUUID().toString();
                                    SharedPreferences.Editor edit = A003.edit();
                                    String[] strArr3 = A01;
                                    if (strArr3[7].charAt(16) != strArr3[1].charAt(16)) {
                                        A01[3] = "RjRRqTdr5YFfB1Oiza3DhfcwhE";
                                        edit.putString(A004, string).apply();
                                    } else {
                                        edit.putString(A004, string).apply();
                                    }
                                }
                                AdInternalSettings.sSettingsBundle.putString(A002, string);
                            }
                            if (AdInternalSettings.getTestDevicesList().contains(string)) {
                                return true;
                            }
                            A02(string);
                            return false;
                        }
                    }
                    return true;
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final void turnOnDebugger() {
                    AbstractC0638Ju.A02();
                }
            };
        }
        return A00;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSizeApi createAdSizeApi(int i2) {
        final EnumC0627Jj A022 = LA.A02(i2);
        return new AdSizeApi() { // from class: com.facebook.ads.redexgen.X.8Z
            @Override // com.facebook.ads.internal.api.AdSizeApi
            public final int getHeight() {
                return A022.A03();
            }

            @Override // com.facebook.ads.internal.api.AdSizeApi
            public final int getWidth() {
                return A022.A04();
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        return (AdViewApi) C5M.A00(new C5P(context, str, adSize, adViewParentApi, adView), AdViewApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws Exception {
        try {
            return (AdViewApi) C5M.A00(new C5P(context, str, str2, adViewParentApi, adView), AdViewApi.class);
        } catch (C0626Jh e) {
            throw new Exception(e.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkActivityApi createAudienceNetworkActivity(final AudienceNetworkActivity audienceNetworkActivity, final AudienceNetworkActivityApi audienceNetworkActivityApi) {
        final C5Q c5q = new C5Q(audienceNetworkActivity, audienceNetworkActivityApi);
        return new AudienceNetworkActivityApi(audienceNetworkActivity, audienceNetworkActivityApi, c5q) { // from class: com.facebook.ads.redexgen.X.5R
            public static byte[] A03;
            public static String[] A04 = {"npa5fyfDyBgpHwGfwNiqfHEj4F8LEiZf", "OqeETugh9", "5goSJATWOcVItDjddk", "82BqGjCZsQ5KSOXOW0A0KlOfyUV9N54d", "DC8qTi6RH4AT7G9O", "9IwTeKuU2aT5NbzWtfQwCWqg5E0PczVH", "CnGxzoUQk", "OIUpXP34AuomSZv"};
            public boolean A00;
            public final AudienceNetworkActivityApi A01;
            public final C5Q A02;

            public static String A00(int i2, int i3, int i4) {
                byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
                for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                    copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 41);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                byte[] bArr = {101, 97, 98, 86, 71, 74, 70, 77, 64, 70, 109, 70, 87, 84, 76, 81, 72, 19, 40, 35, 62, 54, 35, 37, 50, 35, 34, 102, 35, 62, 37, 35, 54, 50, 47, 41, 40, 104, 60, 51, 2, 60, 62, 41, 52, 43, 52, 41, 36};
                if (A04[2].length() == 12) {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[3] = "H3o2ukg7PoWSfztBPt1oK5BMl3p36c0G";
                strArr[0] = "tZaZcqIYCt5A5bsZPeypVNujsThHJ9sw";
                A03 = bArr;
            }

            static {
                A01();
            }

            {
                this.A01 = audienceNetworkActivityApi;
                this.A02 = c5q;
            }

            private void A02(Throwable th) {
                this.A00 = true;
                this.A02.A09();
                finish(8);
                C7j logContext = this.A02.A06();
                if (logContext != null) {
                    logContext.A07().AA0(A00(38, 11, 116), C8E.A0C, new C8F(th));
                    return;
                }
                Log.e(A00(0, 17, 10), A00(17, 21, 111), th);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
                try {
                    if (this.A00) {
                        this.A01.dump(str, fileDescriptor, printWriter, strArr);
                    } else {
                        this.A02.dump(str, fileDescriptor, printWriter, strArr);
                    }
                } catch (Throwable t2) {
                    A02(t2);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void finish(int i2) {
                this.A02.finish(i2);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onActivityResult(int i2, int i3, Intent intent) {
                try {
                } catch (Throwable t2) {
                    A02(t2);
                }
                if (this.A00) {
                    this.A01.onActivityResult(i2, i3, intent);
                } else {
                    this.A02.onActivityResult(i2, i3, intent);
                    this.A01.onActivityResult(i2, i3, intent);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onBackPressed() {
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onBackPressed();
                } catch (Throwable th) {
                    if (A04[5].charAt(6) == 'I') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A04;
                    strArr[7] = "nPADpKrXuoueUGX";
                    strArr[4] = "T13akIzntQNSUZag";
                    A02(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onConfigurationChanged(Configuration configuration) {
                try {
                } catch (Throwable t2) {
                    A02(t2);
                }
                if (this.A00) {
                    this.A01.onConfigurationChanged(configuration);
                    return;
                }
                this.A02.onConfigurationChanged(configuration);
                this.A01.onConfigurationChanged(configuration);
                String[] strArr = A04;
                if (strArr[1].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[7] = "Q1wJ3SQKEGYG95X";
                strArr2[4] = "AvO5pGxADzIyCHUj";
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onCreate(Bundle bundle) {
                this.A01.onCreate(bundle);
                try {
                    this.A02.onCreate(bundle);
                } catch (Throwable t2) {
                    A02(t2);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onDestroy() {
                try {
                } catch (Throwable th) {
                    if (A04[2].length() == 12) {
                        throw new RuntimeException();
                    }
                    A04[2] = "3CPJLXRae2337PFMI";
                    A02(th);
                }
                if (this.A00) {
                    this.A01.onDestroy();
                } else {
                    this.A02.onDestroy();
                    this.A01.onDestroy();
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onPause() {
                try {
                } catch (Throwable t2) {
                    A02(t2);
                }
                if (this.A00) {
                    this.A01.onPause();
                } else {
                    this.A02.onPause();
                    this.A01.onPause();
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onResume() {
                this.A01.onResume();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onResume();
                } catch (Throwable t2) {
                    A02(t2);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onSaveInstanceState(Bundle bundle) {
                this.A01.onSaveInstanceState(bundle);
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onSaveInstanceState(bundle);
                } catch (Throwable t2) {
                    A02(t2);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onStart() {
                this.A01.onStart();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onStart();
                } catch (Throwable t2) {
                    A02(t2);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onStop() {
                this.A01.onStop();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onStop();
                } catch (Throwable t2) {
                    A02(t2);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                try {
                } catch (Throwable t2) {
                    A02(t2);
                }
                if (this.A00) {
                    return this.A01.onTouchEvent(motionEvent);
                }
                this.A02.onTouchEvent(motionEvent);
                return this.A01.onTouchEvent(motionEvent);
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkAdsApi createAudienceNetworkAdsApi() {
        if (A01 == null) {
            A01 = new AudienceNetworkAdsApi() { // from class: com.facebook.ads.redexgen.X.5T
                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final int getAdFormatForPlacement(String str) {
                    KQ.A02(this);
                    return 0;
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void initialize(Context context, MultithreadedBundleWrapper initSettings, AudienceNetworkAds.InitListener initListener) {
                    if (KQ.A02(this)) {
                        return;
                    }
                    if (initListener == null) {
                        try {
                            initListener = new AudienceNetworkAds.InitListener() { // from class: com.facebook.ads.redexgen.X.5S
                                @Override // com.facebook.ads.AudienceNetworkAds.InitListener
                                public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                                }
                            };
                        } catch (Throwable th) {
                            KQ.A00(th, this);
                            return;
                        }
                    }
                    DynamicLoaderFactory.makeLoader(context).getInitApi().initialize(context, initSettings, initListener, 1);
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final boolean isInitialized() {
                    if (KQ.A02(this)) {
                        return false;
                    }
                    try {
                        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
                        if (dynamicLoader == null) {
                            return false;
                        }
                        return dynamicLoader.getInitApi().isInitialized();
                    } catch (Throwable th) {
                        KQ.A00(th, this);
                        return false;
                    }
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void onContentProviderCreated(Context context) {
                    if (KQ.A02(this)) {
                        return;
                    }
                    try {
                        DynamicLoaderFactory.makeLoader(context).getInitApi().onContentProviderCreated(context);
                    } catch (Throwable th) {
                        KQ.A00(th, this);
                    }
                }
            };
        }
        AudienceNetworkAdsApi audienceNetworkAdsApi = A01;
        if (A05[2].length() != 22) {
            throw new RuntimeException();
        }
        A05[3] = "WLYy1k58X1wQ2fFP1Kpc3q8pOUGU5mJB";
        return audienceNetworkAdsApi;
    }

    @Override // com.facebook.ads.internal.dynamicloading.RemoteRenderingApi
    public AudienceNetworkExportedActivityApi createAudienceNetworkExportedActivityApi(Activity activity) {
        return new J0(activity);
    }

    @Override // com.facebook.ads.internal.dynamicloading.RemoteRenderingApi
    public AudienceNetworkRemoteServiceApi createAudienceNetworkRemoteService(Service service) {
        return new J1(service);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public BidderTokenProviderApi createBidderTokenProviderApi() {
        return getBidderTokenProviderApi();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public DefaultMediaViewVideoRendererApi createDefaultMediaViewVideoRendererApi() {
        return new WJ();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InterstitialAdApi createInterstitialAd(Context context, String str, InterstitialAd interstitialAd) {
        return (InterstitialAdApi) C5M.A00(new C02955e(context, str, interstitialAd), InterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewApi createMediaViewApi() {
        return new C1075aM();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewVideoRendererApi createMediaViewVideoRendererApi() {
        return new C02985h();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public C03015k createNativeAdApi(NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new C03015k(nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public C03015k createNativeAdApi(NativeAdBase nativeAdBase, NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new C03015k(nativeAdBase, nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(Context context, String str) {
        return new W7(context, str, (JT) W7.A0K(), false);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(NativeAdBaseApi nativeAdBaseApi) {
        return new W7((W7) nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBase createNativeAdBaseFromBidPayload(Context context, String str, String str2) throws Exception {
        try {
            return W7.A0A(context, str, str2);
        } catch (C0626Jh e) {
            throw new Exception(e.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdImageApi createNativeAdImageApi(JSONObject jSONObject) {
        return JU.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdLayoutApi createNativeAdLayoutApi() {
        return new C1074aL();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public JV createNativeAdRatingApi(JSONObject jSONObject) {
        return JV.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdScrollViewApi createNativeAdScrollViewApi(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, NativeAdScrollView.AdViewProvider adViewProvider, int i2, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i3) {
        return new C03025l(nativeAdScrollView, context, nativeAdsManager, adViewProvider, i2, type, nativeAdViewAttributes, i3);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewApi createNativeAdViewApi() {
        if (A02 == null) {
            A02 = new NativeAdViewApi() { // from class: com.facebook.ads.redexgen.X.5m
                public static View A00(C1045Zs c1045Zs, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    JW jw = (JW) nativeAdViewAttributes.getInternalAttributes();
                    W7 internalNativeAd = W7.A0L(nativeAd.getInternalNativeAd());
                    internalNativeAd.A1Z(JX.A00(type.getEnumCode()));
                    internalNativeAd.A1Y(jw);
                    C0516Ek c0516Ek = new C0516Ek();
                    NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c1045Zs, c0516Ek);
                    c0516Ek.A04(mediumRectTemplateLayout, c1045Zs, nativeAd, jw);
                    mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (LP.A02 * type.getHeight())));
                    return mediumRectTemplateLayout;
                }

                public static View A01(C1045Zs c1045Zs, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    W7 A0L = W7.A0L(nativeAd.getInternalNativeAd());
                    JW jw = (JW) nativeAdViewAttributes.getInternalAttributes();
                    A0L.A1Z(JX.A0B);
                    A0L.A1Y(jw);
                    C0516Ek c0516Ek = new C0516Ek();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(c1045Zs, c0516Ek);
                    c0516Ek.A04(nativeAdLayout, c1045Zs, nativeAd, jw);
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd) {
                    return render(context, nativeAd, (NativeAdViewAttributes) null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
                    return render(context, nativeAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A00(C02925b.A03(context), nativeAd, type, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return AbstractC0707Mo.A00(C02925b.A03(context), th);
                    }
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
                    C1045Zs contextWrapper;
                    try {
                        if (context instanceof C1045Zs) {
                            contextWrapper = (C1045Zs) context;
                        } else {
                            contextWrapper = C02925b.A03(context);
                        }
                        return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return AbstractC0707Mo.A00(C02925b.A03(context), th);
                    }
                }
            };
        }
        return A02;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewAttributesApi createNativeAdViewAttributesApi() {
        return new JW();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewTypeApi createNativeAdViewTypeApi(final int i2) {
        return new NativeAdViewTypeApi(i2) { // from class: com.facebook.ads.redexgen.X.5n
            public final JX A00;

            {
                this.A00 = JX.A00(i2);
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getHeight() {
                return this.A00.A04();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getValue() {
                return this.A00.A05();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getWidth() {
                return this.A00.A06();
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdsManagerApi createNativeAdsManagerApi(Context context, String str, int i2) {
        return (NativeAdsManagerApi) C5M.A00(new C03055o(context, str, i2), NativeAdsManagerApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdApi createNativeBannerAdApi(NativeBannerAd nativeBannerAd, NativeAdBaseApi nativeAdBaseApi) {
        return new NativeBannerAdApi(nativeAdBaseApi) { // from class: com.facebook.ads.redexgen.X.5s
            public static byte[] A01;
            public static String[] A02 = {"068yMtBHtCdtzUYBTQD9IwnMWW1doBJF", "2l8Hok5ewW", "SqMVYGMc7AyphtDxx4DkXGESiOtqp3Wk", "n7xht10RjuH04nLwyOxbbpbZUJ6bFNP5", "hemUdCIRyaFDmP64bLQtQG29khNbMpFH", "0krrnlsRXu", "j9YMm5Kfv7iMZif7VGfsQGY8YQ9Z0I42", "SiUubuHC3Y"};
            public final W7 A00;

            public static String A00(int i2, int i3, int i4) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                    byte b2 = copyOfRange[i5];
                    if (A02[0].charAt(2) != '8') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[2] = "SDJ7CqIuYGJEmotuvG7btG7Q2tCK4c6p";
                    strArr[6] = "3TZdd6KNeaSFSkmrHNZK7GULPPfkGOEa";
                    copyOfRange[i5] = (byte) ((b2 - i4) - 50);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{-50, -54, -55, -3, -20, -15, -19, -10, -21, -19, -42, -19, -4, -1, -9, -6, -13};
            }

            static {
                A01();
            }

            {
                this.A00 = W7.A0L(nativeAdBaseApi);
                this.A00.A1a(EnumC0629Jl.A05);
            }

            private void A02(ImageView imageView, NativeAdBaseApi nativeAdBaseApi2) {
                W7 A0L = W7.A0L(nativeAdBaseApi2);
                C1067aE c1067aE = new C1067aE(this, imageView, A0L);
                JU adIcon = A0L.getAdIcon();
                if (adIcon != null) {
                    Bitmap A0M = A0L.A10().A0M(adIcon.getUrl());
                    Context context = imageView.getContext();
                    String[] strArr = A02;
                    if (strArr[2].charAt(21) == strArr[6].charAt(21)) {
                        A02[4] = "oesEo3u5gOmbsNZfXjsimFyw8pPXYbZZ";
                        C1045Zs A032 = C02925b.A03(context);
                        if (A0M != null) {
                            Drawable A052 = W7.A05(A032, A0M, A0L.A1f(), A0L.A1C());
                            W7.A0e(A052, imageView);
                            imageView.post(new C1066aD(this, A0L, A052));
                            return;
                        } else {
                            C1067aE c1067aE2 = null;
                            AsyncTaskC03065p loadImageTask = new AsyncTaskC03065p(A032, c1067aE, A0L.A1f(), c1067aE2);
                            loadImageTask.execute(new C03085r(adIcon.getUrl(), A0L.A1C(), c1067aE2));
                            return;
                        }
                    }
                } else {
                    W6 A15 = A0L.A15();
                    AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
                    if (A02[4].charAt(17) != 't') {
                        A02[4] = "aFZFEDb6phUkMJAuumeHd9ws0nVx9tBY";
                        A0L.A11().A0E().A38(-1L, adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
                        if (A15 != null) {
                            A15.ABs(C0625Jg.A00(adErrorType));
                        }
                        Log.e(A00(0, 17, 86), adErrorType.getDefaultErrorMessage());
                        return;
                    }
                }
                throw new RuntimeException();
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, ImageView imageView) {
                registerViewForInteraction(view, imageView, (List<View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, ImageView imageView, List<View> list) {
                if (imageView != null) {
                    A02(imageView, this.A00);
                }
                if (list != null) {
                    W7 w7 = this.A00;
                    if (A02[1].length() != 10) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[5] = "ll9cTRtW3a";
                    strArr[7] = "WGLVGgKdvO";
                    w7.A1M(view, imageView, list);
                    return;
                }
                this.A00.A1L(view, imageView);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, MediaView mediaView) {
                registerViewForInteraction(view, mediaView, (List<View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, MediaView mediaView, List<View> clickableViews) {
                if (mediaView != null) {
                    ((C1075aM) mediaView.getMediaViewApi()).A0M(this.A00, true);
                }
                if (clickableViews != null) {
                    this.A00.A1P(view, mediaView, clickableViews, true);
                } else {
                    this.A00.A1Q(view, mediaView, true);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdViewApi createNativeBannerAdViewApi() {
        if (A03 == null) {
            A03 = new NativeBannerAdViewApi() { // from class: com.facebook.ads.redexgen.X.5t
                public static View A00(C1045Zs c1045Zs, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    W7.A0L(nativeBannerAd.getInternalNativeAd()).A1Z(JX.A00(type.getEnumCode()));
                    FK bannerTemplateLayoutApi = new FK();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(c1045Zs, bannerTemplateLayoutApi);
                    bannerTemplateLayoutApi.A04(c1045Zs, nativeBannerAd, (JW) nativeAdViewAttributes.getInternalAttributes(), nativeAdLayout);
                    nativeAdLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (LP.A02 * type.getHeight())));
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type) {
                    return render(context, nativeBannerAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A00(C02925b.A03(context), nativeBannerAd, type, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return AbstractC0707Mo.A00(C02925b.A03(context), th);
                    }
                }
            };
        }
        return A03;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeComponentTagApi createNativeComponentTagApi() {
        return new NativeComponentTagApi() { // from class: com.facebook.ads.redexgen.X.5u
            @Override // com.facebook.ads.internal.api.NativeComponentTagApi
            public final void tagView(View view, NativeAdBase.NativeComponentTag nativeComponentTag) {
                if (view != null && nativeComponentTag != null) {
                    LU.A03(view, nativeComponentTag);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public RewardedInterstitialAdApi createRewardedInterstitialAd(Context context, String str, RewardedInterstitialAd rewardedInterstitialAd) {
        return (RewardedInterstitialAdApi) C5M.A00(new C03125v(context, str, rewardedInterstitialAd), RewardedInterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public RewardedVideoAdApi createRewardedVideoAd(Context context, String str, RewardedVideoAd rewardedVideoAd) {
        return (RewardedVideoAdApi) C5M.A00(new C03165z(context, str, rewardedVideoAd), RewardedVideoAdApi.class);
    }

    public static C5Z getBidderTokenProviderApi() {
        if (A04 == null) {
            A04 = new C5Z();
        }
        return A04;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InitApi getInitApi() {
        return A06;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public void maybeInitInternally(Context context) {
        C03598c.A0A(C02925b.A09(context));
    }
}
