package fb;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.z1;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.k1;
import androidx.datastore.preferences.protobuf.r;
import androidx.viewpager2.widget.ViewPager2;
import com.adjust.sdk.AdjustEventSuccess;
import com.adjust.sdk.Constants;
import com.adjust.sdk.OnEventTrackingSucceededListener;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.g;
import com.bumptech.glide.manager.l;
import com.bumptech.glide.manager.n;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.firebase.components.ComponentDiscoveryService;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import g4.m;
import g4.q;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicInteger;
import k4.d0;
import k4.h0;
import k4.i0;
import k4.y;
import k4.z;
import n0.e0;
import n0.g0;
import o0.u;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import v8.b1;
import y8.i;
import z8.j;

/* loaded from: classes3.dex */
public final class c implements z1, p, u, l2.p, OnEventTrackingSucceededListener, x4.a, k4.c, z, h0, g, n, AudienceNetworkActivityApi, PAGRewardedAdInteractionListener, b1, i, w9.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17772b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17773c;

    public /* synthetic */ c(Object obj, int i10) {
        this.f17772b = i10;
        this.f17773c = obj;
    }

    public final void A(int i10, int i11) {
        ((r) this.f17773c).t0(i10, i11);
    }

    public final void B(int i10, int i11) {
        ((r) this.f17773c).p0(i10, i11);
    }

    public final void C(int i10, long j3) {
        ((r) this.f17773c).r0(i10, j3);
    }

    public final void D(int i10, float f10) {
        r rVar = (r) this.f17773c;
        rVar.getClass();
        rVar.p0(i10, Float.floatToRawIntBits(f10));
    }

    public final void E(int i10, k1 k1Var, Object obj) {
        r rVar = (r) this.f17773c;
        rVar.z0(i10, 3);
        k1Var.a((androidx.datastore.preferences.protobuf.b) obj, rVar.f1461o);
        rVar.z0(i10, 4);
    }

    public final void F(int i10, int i11) {
        ((r) this.f17773c).t0(i10, i11);
    }

    public final void G(int i10, long j3) {
        ((r) this.f17773c).C0(i10, j3);
    }

    public final void H(int i10, k1 k1Var, Object obj) {
        ((r) this.f17773c).v0(i10, (androidx.datastore.preferences.protobuf.b) obj, k1Var);
    }

    public final void I(int i10, int i11) {
        ((r) this.f17773c).p0(i10, i11);
    }

    public final void J(int i10, long j3) {
        ((r) this.f17773c).r0(i10, j3);
    }

    public final void K(int i10, int i11) {
        ((r) this.f17773c).A0(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void L(int i10, long j3) {
        ((r) this.f17773c).C0(i10, (j3 >> 63) ^ (j3 << 1));
    }

    public final void M(int i10, int i11) {
        ((r) this.f17773c).A0(i10, i11);
    }

    public final void N(int i10, long j3) {
        ((r) this.f17773c).C0(i10, j3);
    }

    @Override // k4.c
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.g
    public final void b() {
    }

    @Override // k4.z
    public final y c(d0 d0Var) {
        return new i0(this);
    }

    @Override // v8.b1
    public final boolean continueLoading(long j3) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (b1 b1Var : (b1[]) this.f17773c) {
                long nextLoadPositionUs2 = b1Var.getNextLoadPositionUs();
                if (nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    z10 |= b1Var.continueLoading(j3);
                }
            }
            z12 |= z10;
        } while (z10);
        return z12;
    }

    @Override // l2.p
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) mi.a.b(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f17773c).createWebView(webView));
    }

    @Override // y8.i
    public final long d(long j3, long j10) {
        return j10;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super/*android.app.Activity*/.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // y8.i
    public final long e(long j3, long j10) {
        return 0L;
    }

    @Override // x4.a
    public final Object f() {
        switch (this.f17772b) {
            case 14:
                f0.c cVar = (f0.c) this.f17773c;
                return new m((q) cVar.f17516c, (m0.c) cVar.f17517d);
            default:
                try {
                    return new i4.i(MessageDigest.getInstance(Constants.SHA256));
                } catch (NoSuchAlgorithmException e2) {
                    throw new RuntimeException(e2);
                }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i10) {
        super/*android.app.Activity*/.finish();
    }

    @Override // y8.i
    public final long g(long j3, long j10) {
        return C.TIME_UNSET;
    }

    @Override // v8.b1
    public final long getBufferedPositionUs() {
        long j3 = Long.MAX_VALUE;
        for (b1 b1Var : (b1[]) this.f17773c) {
            long bufferedPositionUs = b1Var.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j3 = Math.min(j3, bufferedPositionUs);
            }
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // v8.b1
    public final long getNextLoadPositionUs() {
        long j3 = Long.MAX_VALUE;
        for (b1 b1Var : (b1[]) this.f17773c) {
            long nextLoadPositionUs = b1Var.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j3 = Math.min(j3, nextLoadPositionUs);
            }
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // l2.p
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) mi.a.b(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f17773c).getStatics());
    }

    @Override // y8.i
    public final long getTimeUs(long j3) {
        return 0L;
    }

    @Override // y8.i
    public final j h(long j3) {
        return (j) this.f17773c;
    }

    @Override // com.bumptech.glide.load.data.g
    public final Object i() {
        ((ByteBuffer) this.f17773c).position(0);
        return (ByteBuffer) this.f17773c;
    }

    @Override // v8.b1
    public final boolean isLoading() {
        for (b1 b1Var : (b1[]) this.f17773c) {
            if (b1Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // y8.i
    public final long j(long j3, long j10) {
        return 0L;
    }

    @Override // k4.h0
    public final e k(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.f17773c, uri, 1);
    }

    @Override // k4.c
    public final Object l(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // y8.i
    public final long m(long j3) {
        return 1L;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super/*android.app.Activity*/.onActivityResult(i10, i11, intent);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        Object obj = this.f17773c;
        if (((z6.m) obj).f28562g != null) {
            ((z6.m) obj).f28562g.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        Object obj = this.f17773c;
        if (((z6.m) obj).f28562g != null) {
            ((z6.m) obj).f28562g.onAdClosed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        Object obj = this.f17773c;
        if (((z6.m) obj).f28562g != null) {
            ((z6.m) obj).f28562g.onAdOpened();
            ((z6.m) this.f17773c).f28562g.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        super/*android.app.Activity*/.onBackPressed();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.app.Activity*/.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(Bundle bundle) {
        super/*android.app.Activity*/.onCreate(bundle);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onDestroy() {
        super/*android.app.Activity*/.onDestroy();
    }

    @Override // com.adjust.sdk.OnEventTrackingSucceededListener
    public final void onFinishedEventTrackingSucceeded(AdjustEventSuccess adjustEventSuccess) {
        Log.d("ITGAdjust", "Event success callback called!");
        Log.d("ITGAdjust", "Event success data: " + adjustEventSuccess.toString());
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        super/*android.app.Activity*/.onPause();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        super/*android.app.Activity*/.onResume();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        super/*android.app.Activity*/.onSaveInstanceState(bundle);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        super/*android.app.Activity*/.onStart();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        super/*android.app.Activity*/.onStop();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        onTouchEvent = super/*android.app.Activity*/.onTouchEvent(motionEvent);
        return onTouchEvent;
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public final void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
        r4.c cVar = new r4.c(6, this, pAGRewardItem);
        Object obj = this.f17773c;
        if (((z6.m) obj).f28562g != null) {
            ((z6.m) obj).f28562g.onUserEarnedReward(cVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public final void onUserEarnedRewardFail(int i10, String str) {
        Log.d(PangleMediationAdapter.TAG, com.bumptech.glide.d.j(i10, String.format("Failed to reward user: %s", str)).toString());
    }

    @Override // o0.u
    public final boolean p(View view) {
        j2.m mVar = (j2.m) this.f17773c;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = mVar.f19736h;
        if (viewPager2.f2164t) {
            viewPager2.c(currentItem);
        }
        return true;
    }

    @Override // l2.p
    public final String[] q() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f17773c).getSupportedFeatures();
    }

    @Override // v8.b1
    public final void reevaluateBuffer(long j3) {
        for (b1 b1Var : (b1[]) this.f17773c) {
            b1Var.reevaluateBuffer(j3);
        }
    }

    @Override // y8.i
    public final boolean t() {
        return true;
    }

    public final String toString() {
        switch (this.f17772b) {
            case 19:
                return super.toString() + "{fragment=" + ((l) this.f17773c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // y8.i
    public final long u() {
        return 0L;
    }

    @Override // y8.i
    public final long v(long j3, long j10) {
        return 1L;
    }

    public final int w() {
        return ((AtomicInteger) this.f17773c).get();
    }

    public final void x(int i10, boolean z10) {
        ((r) this.f17773c).l0(i10, z10);
    }

    public final void y(int i10, k kVar) {
        ((r) this.f17773c).n0(i10, kVar);
    }

    public final void z(int i10, double d10) {
        r rVar = (r) this.f17773c;
        rVar.getClass();
        rVar.r0(i10, Double.doubleToRawLongBits(d10));
    }

    public c(s.a aVar) {
        this.f17772b = 5;
        this.f17773c = aVar;
    }

    public c(Object obj) {
        this.f17772b = 8;
        this.f17773c = new AtomicInteger(0);
    }

    public c(eb.j jVar) {
        this.f17772b = 23;
        this.f17773c = null;
    }

    public c(View view) {
        this.f17772b = 7;
        if (Build.VERSION.SDK_INT >= 30) {
            this.f17773c = new g0(view);
        } else {
            this.f17773c = new e0(view);
        }
    }

    public c(r rVar) {
        this.f17772b = 9;
        Charset charset = androidx.datastore.preferences.protobuf.h0.a;
        if (rVar != null) {
            this.f17773c = rVar;
            rVar.f1461o = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public c(WindowInsetsController windowInsetsController) {
        this.f17772b = 7;
        this.f17773c = new g0(windowInsetsController);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        this(ComponentDiscoveryService.class, 29);
        this.f17772b = 29;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(materialButtonToggleGroup, 27);
        this.f17772b = 27;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(x7.i iVar) {
        this(iVar, 24);
        this.f17772b = 24;
    }

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f17772b = 28;
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.f11564f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.f11565g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.f11562d = 0;
    }
}
