package f;

import a4.l;
import a4.u;
import a4.v;
import a5.k;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.s0;
import com.adjust.sdk.AdjustSessionSuccess;
import com.adjust.sdk.OnSessionTrackingSucceededListener;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import e4.f;
import e4.i;
import eb.j;
import f0.g;
import g0.s;
import h.g0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import k.b0;
import k.m;
import k.o;
import k4.d0;
import k4.y;
import n0.o2;
import n0.r2;
import n0.z;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import u7.r;
import u7.u0;
import z6.h;

/* loaded from: classes.dex */
public final class a implements b0, m, z, s, OnSessionTrackingSucceededListener, v, androidx.activity.result.b, i, k4.z, k4.a, e4.c, k, PAGInterstitialAdInteractionListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17508b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17509c;

    public /* synthetic */ a(j jVar) {
        this.f17508b = 14;
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f17509c;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f596c;
        int i10 = zzb.zze(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f2941f;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f595b;
        if (i11 != -1 || i10 != 0) {
            zzb.zzk("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
        proxyBillingActivityV2.finish();
    }

    @Override // k.b0
    public final void b(o oVar, boolean z10) {
        ((g0) this.f17509c).s(oVar);
    }

    @Override // k4.z
    public final y c(d0 d0Var) {
        switch (this.f17508b) {
            case 19:
                return new k4.b((AssetManager) this.f17509c, this);
            case 20:
                return new k4.e((kc.c) this.f17509c, 1);
            default:
                return new l4.a((v3.c) this.f17509c);
        }
    }

    @Override // g0.s
    public final boolean d(Object obj) {
        return ((g) obj).f17519c;
    }

    @Override // k.m
    public final boolean e(o oVar, MenuItem menuItem) {
        boolean z10;
        Object obj = this.f17509c;
        if (((ActionMenuView) obj).C == null) {
            return false;
        }
        fb.c cVar = (fb.c) ((ActionMenuView) obj).C;
        if (((Toolbar) cVar.f17773c).I.a(menuItem)) {
            z10 = true;
        } else {
            ((Toolbar) cVar.f17773c).getClass();
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final a4.m f() {
        String str = (String) this.f17509c;
        if (str != null) {
            a4.m mVar = new a4.m(0);
            mVar.f153b = str;
            return mVar;
        }
        throw new IllegalArgumentException("Purchase token must be set");
    }

    @Override // a5.k
    public final void g(a5.m mVar) {
        int g10 = mVar.g();
        synchronized (((a5.e) this.f17509c).f182b) {
            Map map = (Map) ((a5.e) this.f17509c).f182b.get(g10);
            if (map != null) {
                map.remove(mVar.f221h);
            }
        }
        if (a5.v.a) {
            Log.d("TAG_PROXY_Preloader", "afterExecute, key: " + mVar.f221h);
        }
    }

    @Override // k.b0
    public final boolean i(o oVar) {
        Window.Callback B = ((g0) this.f17509c).B();
        if (B != null) {
            B.onMenuOpened(108, oVar);
            return true;
        }
        return true;
    }

    @Override // k.m
    public final void j(o oVar) {
        m mVar = ((ActionMenuView) this.f17509c).f719x;
        if (mVar != null) {
            mVar.j(oVar);
        }
    }

    public final k0.c k(ProviderInfo providerInfo, PackageManager packageManager) {
        String str = providerInfo.authority;
        String str2 = providerInfo.packageName;
        Signature[] l10 = ((ac.e) this.f17509c).l(packageManager, str2);
        ArrayList arrayList = new ArrayList();
        for (Signature signature : l10) {
            arrayList.add(signature.toByteArray());
        }
        return new k0.c(str, Collections.singletonList(arrayList), str2, "emojicompat-emoji-font");
    }

    @Override // a4.v
    public final void l(l lVar, ArrayList arrayList) {
        Log.d("PurchaseEG", "onSkuSubsDetailsResponse: " + arrayList.size());
        Object obj = ((s0) this.f17509c).f2032c;
        ((g3.c) obj).f18012g = arrayList;
        ((g3.c) obj).getClass();
        g3.c cVar = (g3.c) ((s0) this.f17509c).f2032c;
        cVar.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            cVar.f18014i.put(uVar.f162c, uVar);
        }
    }

    @Override // g0.s
    public final int m(Object obj) {
        return ((g) obj).f17518b;
    }

    @Override // e4.i
    public final ImageHeaderParser$ImageType n(f fVar) {
        try {
            return fVar.c((InputStream) this.f17509c);
        } finally {
            ((InputStream) this.f17509c).reset();
        }
    }

    @Override // k4.a
    public final com.bumptech.glide.load.data.k o(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.k(assetManager, str, 1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        Object obj = this.f17509c;
        if (((h) obj).f28546g != null) {
            ((h) obj).f28546g.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        Object obj = this.f17509c;
        if (((h) obj).f28546g != null) {
            ((h) obj).f28546g.onAdClosed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        Object obj = this.f17509c;
        if (((h) obj).f28546g != null) {
            ((h) obj).f28546g.onAdOpened();
            ((h) this.f17509c).f28546g.reportAdImpression();
        }
    }

    @Override // com.adjust.sdk.OnSessionTrackingSucceededListener
    public final void onFinishedSessionTrackingSucceeded(AdjustSessionSuccess adjustSessionSuccess) {
        Log.d("ITGAdjust", "Session success callback called!");
        Log.d("ITGAdjust", "Session success data: " + adjustSessionSuccess.toString());
    }

    @Override // e4.c
    public final boolean p(Object obj, File file, e4.m mVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = (byte[]) ((h4.h) this.f17509c).c(byte[].class, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream2 = fileOutputStream;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        ((h4.h) this.f17509c).g(bArr);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        ((h4.h) this.f17509c).g(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
                ((h4.h) this.f17509c).g(bArr);
                return true;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException e10) {
            e = e10;
        }
    }

    public final short q(int i10) {
        boolean z10;
        if (((ByteBuffer) this.f17509c).remaining() - i10 >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return ((ByteBuffer) this.f17509c).getShort(i10);
        }
        return (short) -1;
    }

    public final void r(Exception exc) {
        n9.o.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        r4.c cVar = ((u0) this.f17509c).I0;
        Handler handler = (Handler) cVar.f23999c;
        if (handler != null) {
            handler.post(new r(cVar, exc, 0));
        }
    }

    @Override // n0.z
    public final r2 t(View view, r2 r2Var) {
        boolean z10;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f17509c;
        if (!Objects.equals(coordinatorLayout.f1162p, r2Var)) {
            coordinatorLayout.f1162p = r2Var;
            boolean z11 = true;
            if (r2Var.e() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            coordinatorLayout.f1163q = z10;
            if (z10 || coordinatorLayout.getBackground() != null) {
                z11 = false;
            }
            coordinatorLayout.setWillNotDraw(z11);
            o2 o2Var = r2Var.a;
            if (!o2Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    if (ViewCompat.getFitsSystemWindows(childAt) && ((b0.d) childAt.getLayoutParams()).a != null && o2Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return r2Var;
    }

    public /* synthetic */ a(Object obj, int i10) {
        this.f17508b = i10;
        this.f17509c = obj;
    }

    public a(InvocationHandler invocationHandler) {
        this.f17508b = 11;
        this.f17509c = (WebMessagePortBoundaryInterface) mi.a.b(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    public /* synthetic */ a(kc.c cVar) {
        this.f17508b = 15;
        this.f17509c = (zzai) cVar.f20640c;
    }

    public a() {
        this.f17508b = 7;
        this.f17509c = new AtomicBoolean(false);
    }

    public a(int i10) {
        this.f17508b = i10;
        int i11 = 20;
        if (i10 == 20) {
            this.f17509c = new kc.c(this, i11);
            return;
        }
        if (i10 == 22) {
            this.f17509c = new v3.c(0);
        } else if (i10 == 26) {
            this.f17509c = new ConcurrentHashMap();
        } else if (i10 != 28) {
            this.f17509c = new ArrayDeque();
        }
    }

    public a(TextView textView) {
        this.f17508b = 9;
        if (textView != null) {
            this.f17509c = new e1.i(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }

    public a(Object obj) {
        Object cVar;
        this.f17508b = 8;
        if (Build.VERSION.SDK_INT >= 28) {
            cVar = new androidx.emoji2.text.d();
        } else {
            cVar = new androidx.emoji2.text.c();
        }
        this.f17509c = cVar;
    }

    public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f17508b = 6;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f17509c = new s0.d(uri, clipDescription, uri2);
        } else {
            this.f17509c = new h.c(uri, clipDescription, uri2, 4);
        }
    }

    public a(byte[] bArr, int i10) {
        this.f17508b = 23;
        this.f17509c = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
    }

    public a(ClipData clipData, int i10) {
        this.f17508b = 5;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f17509c = new n0.c(clipData, i10);
        } else {
            this.f17509c = new n0.e(clipData, i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(u0 u0Var) {
        this(u0Var, 29);
        this.f17508b = 29;
    }
}
