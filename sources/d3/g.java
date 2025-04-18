package d3;

import a4.e0;
import a4.g0;
import a4.u;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l0;
import androidx.viewpager.widget.ViewPager;
import androidx.work.t;
import androidx.work.v;
import androidx.work.w;
import com.ads.control.admob.AppOpenManager;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.play_billing.zzaa;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import com.plantcare.ai.identifier.plantid.R;
import e4.h;
import e4.m;
import e4.p;
import g4.k0;
import h4.j;
import h4.k;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import k4.d0;
import k4.x;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import n0.i2;
import n0.r2;
import n0.w0;
import n0.z;
import n4.o;
import v1.f0;
import w4.i;

/* loaded from: classes.dex */
public final class g implements z, w, e0, h, com.bumptech.glide.load.data.d, j, p, o {

    /* renamed from: f, reason: collision with root package name */
    public static volatile g f16810f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16811b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16812c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16813d;

    public /* synthetic */ g() {
        this.f16811b = 13;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00b3 -> B:14:0x00b6). Please report as a decompilation issue!!! */
    public static void C(Activity activity, e3.b bVar, FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout) {
        if (bVar.f17088f == null) {
            shimmerFrameLayout.setVisibility(8);
            return;
        }
        NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(activity).inflate(bVar.f17087d, (ViewGroup) null);
        shimmerFrameLayout.b();
        shimmerFrameLayout.setVisibility(8);
        frameLayout.setVisibility(0);
        c3.j b3 = c3.j.b();
        NativeAd nativeAd = bVar.f17088f;
        b3.getClass();
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(R.id.ad_media));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.ad_app_icon));
        nativeAdView.setPriceView(nativeAdView.findViewById(R.id.ad_price));
        nativeAdView.setStarRatingView(nativeAdView.findViewById(R.id.ad_stars));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(R.id.ad_advertiser));
        try {
            ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.getHeadline());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            if (nativeAd.getBody() == null) {
                nativeAdView.getBodyView().setVisibility(4);
            } else {
                nativeAdView.getBodyView().setVisibility(0);
                ((TextView) nativeAdView.getBodyView()).setText(nativeAd.getBody());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            if (nativeAd.getCallToAction() == null) {
                View callToActionView = nativeAdView.getCallToActionView();
                Objects.requireNonNull(callToActionView);
                callToActionView.setVisibility(4);
            } else {
                View callToActionView2 = nativeAdView.getCallToActionView();
                Objects.requireNonNull(callToActionView2);
                callToActionView2.setVisibility(0);
                ((TextView) nativeAdView.getCallToActionView()).setText(nativeAd.getCallToAction());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            if (nativeAd.getIcon() == null) {
                View iconView = nativeAdView.getIconView();
                Objects.requireNonNull(iconView);
                iconView.setVisibility(8);
            } else {
                ((ImageView) nativeAdView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
                nativeAdView.getIconView().setVisibility(0);
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        try {
            if (nativeAd.getPrice() == null) {
                View priceView = nativeAdView.getPriceView();
                Objects.requireNonNull(priceView);
                priceView.setVisibility(4);
            } else {
                View priceView2 = nativeAdView.getPriceView();
                Objects.requireNonNull(priceView2);
                priceView2.setVisibility(0);
                ((TextView) nativeAdView.getPriceView()).setText(nativeAd.getPrice());
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        try {
            if (nativeAd.getStarRating() == null) {
                View starRatingView = nativeAdView.getStarRatingView();
                Objects.requireNonNull(starRatingView);
                starRatingView.setVisibility(4);
            } else {
                View starRatingView2 = nativeAdView.getStarRatingView();
                Objects.requireNonNull(starRatingView2);
                ((RatingBar) starRatingView2).setRating(nativeAd.getStarRating().floatValue());
                nativeAdView.getStarRatingView().setVisibility(0);
            }
        } catch (Exception e14) {
            e14.printStackTrace();
        }
        try {
            if (nativeAd.getAdvertiser() == null) {
                nativeAdView.getAdvertiserView().setVisibility(4);
            } else {
                ((TextView) nativeAdView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
                nativeAdView.getAdvertiserView().setVisibility(0);
            }
        } catch (Exception e15) {
            e15.printStackTrace();
        }
        nativeAdView.setNativeAd(nativeAd);
        frameLayout.removeAllViews();
        frameLayout.addView(nativeAdView);
    }

    public static n4.z l(ImageDecoder.Source source, int i10, int i11, m mVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new m4.b(i10, i11, mVar));
        if (w0.x(decodeDrawable)) {
            return new n4.z(w0.f(decodeDrawable), 2);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    public static void m(FragmentActivity fragmentActivity, e3.a aVar, fg.f fVar) {
        if (System.currentTimeMillis() - fragmentActivity.getSharedPreferences("itg_ad_pref", 0).getLong("KEY_LAST_IMPRESSION_INTERSTITIAL_TIME", 0L) < ((h3.b) r().f16812c).f18734i * 1000) {
            fVar.w();
            return;
        }
        if (aVar != null && !(!aVar.k())) {
            c cVar = new c(fVar, fragmentActivity, aVar);
            c3.j b3 = c3.j.b();
            InterstitialAd interstitialAd = aVar.f17086d;
            b3.a = 3;
            if (fragmentActivity.getSharedPreferences("setting.pref", 0).getBoolean("IS_FIRST_OPEN", false)) {
                fragmentActivity.getSharedPreferences("setting_admob.pref", 0).edit().putLong("KEY_FIRST_TIME", System.currentTimeMillis()).apply();
                fragmentActivity.getSharedPreferences("setting.pref", 0).edit().putBoolean("IS_FIRST_OPEN", true).apply();
            } else {
                if (System.currentTimeMillis() - fragmentActivity.getSharedPreferences("setting_admob.pref", 0).getLong("KEY_FIRST_TIME", System.currentTimeMillis()) >= com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS) {
                    fragmentActivity.getSharedPreferences("setting_admob.pref", 0).edit().clear().apply();
                    fragmentActivity.getSharedPreferences("setting_admob.pref", 0).edit().putLong("KEY_FIRST_TIME", System.currentTimeMillis()).apply();
                }
            }
            if (g3.c.a().f18018m) {
                cVar.w();
                return;
            }
            if (interstitialAd == null) {
                cVar.w();
                return;
            }
            interstitialAd.setFullScreenContentCallback(new c3.d(b3, fragmentActivity, cVar, interstitialAd));
            if (fragmentActivity.getSharedPreferences("setting_admob.pref", 0).getInt(interstitialAd.getAdUnitId(), 0) < 100) {
                int i10 = b3.a + 1;
                b3.a = i10;
                if (i10 >= 3) {
                    if (l0.f1793k.f1799h.f1835d.a(androidx.lifecycle.o.RESUMED)) {
                        try {
                            i3.a aVar2 = b3.f2568d;
                            if (aVar2 != null && aVar2.isShowing()) {
                                b3.f2568d.dismiss();
                            }
                            i3.a aVar3 = new i3.a(fragmentActivity, 0);
                            b3.f2568d = aVar3;
                            aVar3.setCancelable(false);
                            try {
                                cVar.u();
                                b3.f2568d.show();
                                AppOpenManager.f().f2915l = true;
                            } catch (Exception unused) {
                                cVar.w();
                                return;
                            }
                        } catch (Exception e2) {
                            b3.f2568d = null;
                            e2.printStackTrace();
                        }
                        new Handler().postDelayed(new c3.b(0, b3, fragmentActivity, cVar, interstitialAd), 800L);
                    }
                    b3.a = 0;
                    return;
                }
                i3.a aVar4 = b3.f2568d;
                if (aVar4 != null) {
                    aVar4.dismiss();
                }
                cVar.w();
                return;
            }
            cVar.w();
            return;
        }
        fVar.w();
    }

    public static String q(int i10, int i11, Bitmap.Config config) {
        StringBuilder n10 = a4.j.n("[", i10, "x", i11, "], ");
        n10.append(config);
        return n10.toString();
    }

    public static synchronized g r() {
        g gVar;
        synchronized (g.class) {
            if (f16810f == null) {
                f16810f = new g(0, (com.applovin.impl.mediation.ads.e) null);
            }
            gVar = f16810f;
        }
        return gVar;
    }

    public static void x(Activity activity, String str, int i10, hf.b bVar) {
        c3.j.b().d(activity, str, new d(bVar, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x0059), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d3.g z(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6d
            ki.l[] r0 = new ki.l[r0]     // Catch: java.io.IOException -> L6d
            ki.i r1 = new ki.i     // Catch: java.io.IOException -> L6d
            r1.<init>()     // Catch: java.io.IOException -> L6d
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6d
            if (r3 >= r4) goto L59
            r4 = r12[r3]     // Catch: java.io.IOException -> L6d
            java.lang.String[] r5 = x3.b.f27349g     // Catch: java.io.IOException -> L6d
            r6 = 34
            r1.w(r6)     // Catch: java.io.IOException -> L6d
            int r7 = r4.length()     // Catch: java.io.IOException -> L6d
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6d
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6d
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.X(r9, r8, r4)     // Catch: java.io.IOException -> L6d
        L3d:
            r1.Y(r10)     // Catch: java.io.IOException -> L6d
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.X(r9, r7, r4)     // Catch: java.io.IOException -> L6d
        L4a:
            r1.w(r6)     // Catch: java.io.IOException -> L6d
            r1.readByte()     // Catch: java.io.IOException -> L6d
            ki.l r4 = r1.readByteString()     // Catch: java.io.IOException -> L6d
            r0[r3] = r4     // Catch: java.io.IOException -> L6d
            int r3 = r3 + 1
            goto La
        L59:
            d3.g r1 = new d3.g     // Catch: java.io.IOException -> L6d
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6d
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6d
            int r2 = ki.z.f21034d     // Catch: java.io.IOException -> L6d
            ki.z r0 = wh.a0.B(r0)     // Catch: java.io.IOException -> L6d
            r2 = 12
            r1.<init>(r2, r12, r0)     // Catch: java.io.IOException -> L6d
            return r1
        L6d:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.g.z(java.lang.String[]):d3.g");
    }

    public final InputConnection A(InputConnection inputConnection, EditorInfo editorInfo) {
        e1.b bVar = (e1.b) this.f16813d;
        if (inputConnection == null) {
            bVar.getClass();
            return null;
        }
        return ((ka.e) bVar.f17071d).q(inputConnection, editorInfo);
    }

    public final void B(k0.f fVar) {
        boolean z10;
        int i10 = fVar.f20200b;
        int i11 = 0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((Handler) this.f16813d).post(new k0.a(i11, this, (fb.c) this.f16812c, fVar.a));
        } else {
            ((Handler) this.f16813d).post(new d.d(this, (fb.c) this.f16812c, i10, 5));
        }
    }

    public final void D(k kVar, Object obj) {
        h4.f fVar = (h4.f) ((Map) this.f16813d).get(kVar);
        if (fVar == null) {
            fVar = new h4.f(kVar);
            h4.f fVar2 = fVar.f18741d;
            fVar2.f18740c = fVar.f18740c;
            fVar.f18740c.f18741d = fVar2;
            h4.f fVar3 = (h4.f) this.f16812c;
            fVar.f18741d = fVar3.f18741d;
            fVar.f18740c = fVar3;
            fVar3.f18741d = fVar;
            fVar.f18741d.f18740c = fVar;
            ((Map) this.f16813d).put(kVar, fVar);
        } else {
            kVar.a();
        }
        if (fVar.f18739b == null) {
            fVar.f18739b = new ArrayList();
        }
        fVar.f18739b.add(obj);
    }

    public final void E(String str) {
        i4.b bVar;
        synchronized (this) {
            Object obj = ((Map) this.f16812c).get(str);
            com.bumptech.glide.c.l(obj);
            bVar = (i4.b) obj;
            int i10 = bVar.f19141b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                bVar.f19141b = i11;
                if (i11 == 0) {
                    i4.b bVar2 = (i4.b) ((Map) this.f16812c).remove(str);
                    if (bVar2.equals(bVar)) {
                        f.a aVar = (f.a) this.f16813d;
                        synchronized (((Queue) aVar.f17509c)) {
                            if (((Queue) aVar.f17509c).size() < 10) {
                                ((Queue) aVar.f17509c).offer(bVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f19141b);
            }
        }
        bVar.a.unlock();
    }

    public final Object F() {
        int i10;
        h4.f fVar = ((h4.f) this.f16812c).f18741d;
        while (true) {
            Object obj = null;
            if (fVar.equals((h4.f) this.f16812c)) {
                return null;
            }
            ArrayList arrayList = fVar.f18739b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                obj = fVar.f18739b.remove(i10 - 1);
            }
            if (obj != null) {
                return obj;
            }
            h4.f fVar2 = fVar.f18741d;
            fVar2.f18740c = fVar.f18740c;
            fVar.f18740c.f18741d = fVar2;
            Map map = (Map) this.f16813d;
            Object obj2 = fVar.a;
            map.remove(obj2);
            ((k) obj2).a();
            fVar = fVar.f18741d;
        }
    }

    public final void G(u uVar) {
        this.f16812c = uVar;
        if (uVar.a() != null) {
            uVar.a().getClass();
            String str = uVar.a().f157d;
            if (str != null) {
                this.f16813d = str;
            }
        }
    }

    public final void H(int i10, int i11, int i12, int i13) {
        ((CardView) this.f16813d).f1125f.set(i10, i11, i12, i13);
        Object obj = this.f16813d;
        CardView.a((CardView) obj, i10 + ((CardView) obj).f1124d.left, i11 + ((CardView) obj).f1124d.top, i12 + ((CardView) obj).f1124d.right, i13 + ((CardView) obj).f1124d.bottom);
    }

    public final void I(va.b bVar) {
        ((androidx.lifecycle.e0) this.f16812c).postValue(bVar);
        if (bVar instanceof v) {
            ((w2.j) this.f16813d).h((v) bVar);
        } else if (bVar instanceof t) {
            ((w2.j) this.f16813d).i(((t) bVar).f2235i);
        }
    }

    public final void J(zzga zzgaVar) {
        if (zzgaVar == null) {
            return;
        }
        try {
            zzhd zzy = zzhe.zzy();
            zzy.zzn((zzgu) this.f16812c);
            zzy.zzl(zzgaVar);
            ((g0) this.f16813d).e((zzhe) zzy.zzf());
        } catch (Throwable th2) {
            zzb.zzl("BillingLogger", "Unable to log.", th2);
        }
    }

    public final void K(zzge zzgeVar) {
        if (zzgeVar == null) {
            return;
        }
        try {
            zzhd zzy = zzhe.zzy();
            zzy.zzn((zzgu) this.f16812c);
            zzy.zzm(zzgeVar);
            ((g0) this.f16813d).e((zzhe) zzy.zzf());
        } catch (Throwable th2) {
            zzb.zzl("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // h4.j
    public final void a(Bitmap bitmap) {
        h4.c cVar = (h4.c) this.f16812c;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        h4.b bVar = (h4.b) cVar.h();
        bVar.f18735b = width;
        bVar.f18736c = height;
        bVar.f18737d = config;
        ((g) this.f16813d).D(bVar, bitmap);
    }

    @Override // h4.j
    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        h4.b bVar = (h4.b) ((h4.c) this.f16812c).h();
        bVar.f18735b = i10;
        bVar.f18736c = i11;
        bVar.f18737d = config;
        return (Bitmap) ((g) this.f16813d).o(bVar);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void c(Exception exc) {
        boolean z10;
        k0 k0Var = (k0) this.f16813d;
        x xVar = (x) this.f16812c;
        x xVar2 = k0Var.f18109h;
        if (xVar2 != null && xVar2 == xVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            k0 k0Var2 = (k0) this.f16813d;
            x xVar3 = (x) this.f16812c;
            g4.g gVar = k0Var2.f18105c;
            g4.f fVar = k0Var2.f18110i;
            com.bumptech.glide.load.data.e eVar = xVar3.f20271c;
            gVar.a(fVar, exc, eVar, eVar.d());
        }
    }

    @Override // h4.j
    public final String d(Bitmap bitmap) {
        return q(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // h4.j
    public final String e(int i10, int i11, Bitmap.Config config) {
        return q(i10, i11, config);
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        switch (this.f16811b) {
            case 11:
                if (!(obj instanceof m0.b)) {
                    return false;
                }
                m0.b bVar = (m0.b) obj;
                Object obj2 = bVar.a;
                Object obj3 = this.f16812c;
                if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return false;
                }
                Object obj4 = this.f16813d;
                Object obj5 = bVar.f21421b;
                if (obj5 != obj4 && (obj5 == null || !obj5.equals(obj4))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        boolean z10;
        k0 k0Var = (k0) this.f16813d;
        x xVar = (x) this.f16812c;
        x xVar2 = k0Var.f18109h;
        if (xVar2 != null && xVar2 == xVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            k0 k0Var2 = (k0) this.f16813d;
            x xVar3 = (x) this.f16812c;
            g4.p pVar = k0Var2.f18104b.f18089p;
            if (obj != null && pVar.a(xVar3.f20271c.d())) {
                k0Var2.f18108g = obj;
                k0Var2.f18105c.d();
            } else {
                g4.g gVar = k0Var2.f18105c;
                e4.j jVar = xVar3.a;
                com.bumptech.glide.load.data.e eVar = xVar3.f20271c;
                gVar.c(jVar, obj, eVar, eVar.d(), k0Var2.f18110i);
            }
        }
    }

    @Override // h4.j
    public final int g(Bitmap bitmap) {
        return w4.m.c(bitmap);
    }

    @Override // e4.p
    public final int h(m mVar) {
        return ((p) this.f16813d).h(mVar);
    }

    public final int hashCode() {
        int hashCode;
        switch (this.f16811b) {
            case 11:
                Object obj = this.f16812c;
                int i10 = 0;
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                Object obj2 = this.f16813d;
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                }
                return hashCode ^ i10;
            default:
                return super.hashCode();
        }
    }

    @Override // n4.o
    public final void i(Bitmap bitmap, h4.d dVar) {
        IOException iOException = ((w4.e) this.f16813d).f26731c;
        if (iOException != null) {
            if (bitmap != null) {
                dVar.a(bitmap);
                throw iOException;
            }
            throw iOException;
        }
    }

    @Override // e4.h
    public final int j(e4.f fVar) {
        switch (this.f16811b) {
            case 16:
                try {
                    return fVar.d((ByteBuffer) this.f16812c, (h4.h) this.f16813d);
                } finally {
                    w4.b.c((ByteBuffer) this.f16812c);
                }
            default:
                try {
                    return fVar.a((InputStream) this.f16812c, (h4.h) this.f16813d);
                } finally {
                    ((InputStream) this.f16812c).reset();
                }
        }
    }

    public final a4.g k() {
        zzaa.zzc((u) this.f16812c, "ProductDetails is required for constructing ProductDetailsParams.");
        if (((u) this.f16812c).f168i != null) {
            zzaa.zzc((String) this.f16813d, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
        }
        return new a4.g(this);
    }

    @Override // n4.o
    public final void n() {
        n4.w wVar = (n4.w) this.f16812c;
        synchronized (wVar) {
            wVar.f22452d = wVar.f22450b.length;
        }
    }

    public final Object o(k kVar) {
        int i10;
        h4.f fVar = (h4.f) ((Map) this.f16813d).get(kVar);
        if (fVar == null) {
            fVar = new h4.f(kVar);
            ((Map) this.f16813d).put(kVar, fVar);
        } else {
            kVar.a();
        }
        h4.f fVar2 = fVar.f18741d;
        fVar2.f18740c = fVar.f18740c;
        fVar.f18740c.f18741d = fVar2;
        h4.f fVar3 = (h4.f) this.f16812c;
        fVar.f18741d = fVar3;
        h4.f fVar4 = fVar3.f18740c;
        fVar.f18740c = fVar4;
        fVar4.f18741d = fVar;
        fVar.f18741d.f18740c = fVar;
        ArrayList arrayList = fVar.f18739b;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            return fVar.f18739b.remove(i10 - 1);
        }
        return null;
    }

    @Override // e4.c
    public final boolean p(Object obj, File file, m mVar) {
        return ((p) this.f16813d).p(new n4.d(((BitmapDrawable) ((g4.g0) obj).get()).getBitmap(), (h4.d) this.f16812c), file, mVar);
    }

    @Override // h4.j
    public final Bitmap removeLast() {
        return (Bitmap) ((g) this.f16813d).F();
    }

    public final KeyListener s(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            return ((ka.e) ((e1.b) this.f16813d).f17071d).j(keyListener);
        }
        return keyListener;
    }

    @Override // n0.z
    public final r2 t(View view, r2 r2Var) {
        r2 onApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, r2Var);
        if (onApplyWindowInsets.a.m()) {
            return onApplyWindowInsets;
        }
        Rect rect = (Rect) this.f16812c;
        rect.left = onApplyWindowInsets.c();
        rect.top = onApplyWindowInsets.e();
        rect.right = onApplyWindowInsets.d();
        rect.bottom = onApplyWindowInsets.b();
        int childCount = ((ViewPager) this.f16813d).getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r2 dispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(((ViewPager) this.f16813d).getChildAt(i10), onApplyWindowInsets);
            rect.left = Math.min(dispatchApplyWindowInsets.c(), rect.left);
            rect.top = Math.min(dispatchApplyWindowInsets.e(), rect.top);
            rect.right = Math.min(dispatchApplyWindowInsets.d(), rect.right);
            rect.bottom = Math.min(dispatchApplyWindowInsets.b(), rect.bottom);
        }
        int i11 = rect.left;
        int i12 = rect.top;
        int i13 = rect.right;
        int i14 = rect.bottom;
        kc.c cVar = new kc.c(onApplyWindowInsets);
        ((i2) cVar.f20640c).g(g0.f.b(i11, i12, i13, i14));
        return cVar.n();
    }

    public final String toString() {
        int i10;
        switch (this.f16811b) {
            case 5:
                return "Bounds{lower=" + ((g0.f) this.f16812c) + " upper=" + ((g0.f) this.f16813d) + "}";
            case 11:
                return "Pair{" + this.f16812c + " " + this.f16813d + "}";
            case 20:
                return "AttributeStrategy:\n  " + ((g) this.f16813d);
            case 21:
                StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
                h4.f fVar = ((h4.f) this.f16812c).f18740c;
                boolean z10 = false;
                while (!fVar.equals((h4.f) this.f16812c)) {
                    sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
                    sb2.append(fVar.a);
                    sb2.append(AbstractJsonLexerKt.COLON);
                    ArrayList arrayList = fVar.f18739b;
                    if (arrayList != null) {
                        i10 = arrayList.size();
                    } else {
                        i10 = 0;
                    }
                    sb2.append(i10);
                    sb2.append("}, ");
                    fVar = fVar.f18740c;
                    z10 = true;
                }
                if (z10) {
                    sb2.delete(sb2.length() - 2, sb2.length());
                }
                sb2.append(" )");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public final String u(e4.j jVar) {
        String str;
        synchronized (((i) this.f16812c)) {
            str = (String) ((i) this.f16812c).a(jVar);
        }
        if (str == null) {
            Object d10 = ((m0.c) this.f16813d).d();
            com.bumptech.glide.c.l(d10);
            i4.i iVar = (i4.i) d10;
            try {
                jVar.b(iVar.f19152b);
                byte[] digest = iVar.f19152b.digest();
                char[] cArr = w4.m.f26739b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < digest.length; i10++) {
                        int i11 = digest[i10] & UByte.MAX_VALUE;
                        int i12 = i10 * 2;
                        char[] cArr2 = w4.m.a;
                        cArr[i12] = cArr2[i11 >>> 4];
                        cArr[i12 + 1] = cArr2[i11 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((m0.c) this.f16813d).c(iVar);
            }
        }
        synchronized (((i) this.f16812c)) {
            ((i) this.f16812c).d(jVar, str);
        }
        return str;
    }

    public final void v(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = ((EditText) this.f16812c).getContext().obtainStyledAttributes(attributeSet, g.a.f17886i, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            ((ka.e) ((e1.b) this.f16813d).f17071d).t(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void w(Activity activity, String str, int i10, FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout, hf.a aVar) {
        c3.j.b().d(activity, str, new e(this, aVar, i10, activity, frameLayout, shimmerFrameLayout));
    }

    public final byte[] y(int i10) {
        Object obj = this.f16813d;
        if (((h4.h) obj) == null) {
            return new byte[i10];
        }
        return (byte[]) ((h4.h) obj).c(byte[].class, i10);
    }

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f16811b = i10;
        this.f16812c = obj;
        this.f16813d = obj2;
    }

    public /* synthetic */ g(Object obj, Object obj2, int i10) {
        this.f16811b = i10;
        this.f16812c = obj2;
        this.f16813d = obj;
    }

    public g(f0 database) {
        this.f16811b = 8;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f16812c = database;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f16813d = newSetFromMap;
    }

    public g(Context context, zzgu zzguVar) {
        this.f16811b = 14;
        this.f16813d = new g0(context);
        this.f16812c = zzguVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(h.c cVar) {
        this(new d0(cVar));
        this.f16811b = 25;
    }

    public g(d0 d0Var) {
        this.f16811b = 25;
        this.f16813d = new androidx.work.g(2);
        this.f16812c = d0Var;
    }

    public g(EditText editText) {
        this.f16811b = 1;
        this.f16812c = editText;
        this.f16813d = new e1.b(editText);
    }

    public g(int i10, com.applovin.impl.mediation.ads.e eVar) {
        this.f16811b = i10;
        if (i10 == 10) {
            this.f16812c = new androidx.lifecycle.e0();
            this.f16813d = new w2.j();
            I(w.T7);
            return;
        }
        if (i10 != 11) {
            if (i10 != 24) {
                switch (i10) {
                    case 20:
                        this.f16812c = new h4.c(0);
                        this.f16813d = new g(21, (com.applovin.impl.mediation.ads.e) null);
                        return;
                    case 21:
                        this.f16812c = new h4.f(null);
                        this.f16813d = new HashMap();
                        return;
                    case 22:
                        this.f16812c = new HashMap();
                        this.f16813d = new f.a(18);
                        return;
                    default:
                        this.f16813d = Boolean.FALSE;
                        return;
                }
            }
            this.f16812c = new i(1000L);
            this.f16813d = p6.a.w(10, new fb.c(this, 15));
        }
    }

    public g(ArrayList arrayList, ArrayList arrayList2) {
        this.f16811b = 3;
        int size = arrayList.size();
        this.f16812c = new int[size];
        this.f16813d = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f16812c)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f16813d)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public g(int i10, int i11) {
        this.f16811b = 3;
        this.f16812c = new int[]{i10, i11};
        this.f16813d = new float[]{0.0f, 1.0f};
    }

    public g(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f16811b = 5;
        lowerBound = bounds.getLowerBound();
        this.f16812c = g0.f.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f16813d = g0.f.c(upperBound);
    }

    public g(int i10, int i11, int i12) {
        this.f16811b = 3;
        this.f16812c = new int[]{i10, i11, i12};
        this.f16813d = new float[]{0.0f, 0.5f, 1.0f};
    }

    public g(ViewPager viewPager) {
        this.f16811b = 9;
        this.f16813d = viewPager;
        this.f16812c = new Rect();
    }

    public g(CardView cardView) {
        this.f16811b = 2;
        this.f16813d = cardView;
    }
}
