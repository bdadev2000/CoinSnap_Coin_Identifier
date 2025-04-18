package kc;

import a4.l;
import a4.u;
import a4.v;
import a5.r;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p1;
import androidx.fragment.app.q0;
import androidx.recyclerview.widget.s0;
import androidx.work.g;
import com.adjust.sdk.AdjustEventFailure;
import com.adjust.sdk.OnEventTrackingFailedListener;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.manager.n;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.facebook.x;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import g0.s;
import g4.w;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k.b0;
import k.i0;
import k.m;
import k.o;
import k0.h;
import k4.d0;
import k4.h0;
import k4.y;
import k4.z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n0.e2;
import n0.g2;
import n0.h2;
import n0.i2;
import n0.r2;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import y0.j1;
import y0.n1;

/* loaded from: classes3.dex */
public final class c implements p1, b0, m, s, WebMessageListenerBoundaryInterface, OnEventTrackingFailedListener, v, androidx.activity.result.b, x4.a, z, k4.a, h0, n, PAGAppOpenAdInteractionListener {

    /* renamed from: d, reason: collision with root package name */
    public static volatile c f20638d;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20639b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20640c;

    public /* synthetic */ c() {
        this.f20639b = 15;
    }

    public static ByteArrayInputStream p(String str) {
        if (str.startsWith("data:image")) {
            int indexOf = str.indexOf(44);
            if (indexOf != -1) {
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        throw new IllegalArgumentException("Not a valid image data URL.");
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f20640c;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f596c;
        int i10 = zzb.zze(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f2940d;
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
            zzb.zzk("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // k.b0
    public final void b(o oVar, boolean z10) {
        if (oVar instanceof i0) {
            oVar.k().c(false);
        }
        b0 b0Var = ((androidx.appcompat.widget.m) this.f20640c).f920g;
        if (b0Var != null) {
            b0Var.b(oVar, z10);
        }
    }

    @Override // k4.z
    public final y c(d0 d0Var) {
        switch (this.f20639b) {
            case 19:
                return new k4.b((AssetManager) this.f20640c, this);
            case 20:
            default:
                return new k4.i0(this);
            case 21:
                return new k4.m((Resources) this.f20640c, d0Var.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    @Override // g0.s
    public final boolean d(Object obj) {
        return ((h) obj).f20206d;
    }

    @Override // k.m
    public final boolean e(o oVar, MenuItem menuItem) {
        ((Toolbar) this.f20640c).getClass();
        return false;
    }

    @Override // x4.a
    public final Object f() {
        ob.c cVar = (ob.c) this.f20640c;
        return new g4.v((j4.e) cVar.a, (j4.e) cVar.f23292b, (j4.e) cVar.f23293c, (j4.e) cVar.f23294d, (w) cVar.f23295e, (g4.y) cVar.f23296f, (m0.c) cVar.f23297g);
    }

    public final void g() {
        RandomAccessFile randomAccessFile = (RandomAccessFile) this.f20640c;
        Handler handler = i5.a.a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[Catch: all -> 0x0051, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0019, B:7:0x001d, B:9:0x0023, B:12:0x0035, B:13:0x003f, B:15:0x0045, B:28:0x0015, B:25:0x0008), top: B:2:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h(com.facebook.appevents.t r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = m6.a.b(r4)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L8
            goto L18
        L8:
            java.util.HashMap r0 = r4.f10971b     // Catch: java.lang.Throwable -> L14
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "events.entries"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L14
            goto L19
        L14:
            r0 = move-exception
            m6.a.a(r4, r0)     // Catch: java.lang.Throwable -> L51
        L18:
            r0 = 0
        L19:
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L51
        L1d:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L51
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L51
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L51
            com.facebook.appevents.b r1 = (com.facebook.appevents.b) r1     // Catch: java.lang.Throwable -> L51
            com.facebook.appevents.u r1 = r3.s(r1)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L1d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L51
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L51
        L3f:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L51
            com.facebook.appevents.e r2 = (com.facebook.appevents.e) r2     // Catch: java.lang.Throwable -> L51
            r1.a(r2)     // Catch: java.lang.Throwable -> L51
            goto L3f
        L4f:
            monitor-exit(r3)
            return
        L51:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.c.h(com.facebook.appevents.t):void");
    }

    @Override // k.b0
    public final boolean i(o oVar) {
        Object obj = this.f20640c;
        if (oVar == ((androidx.appcompat.widget.m) obj).f918d) {
            return false;
        }
        ((i0) oVar).A.getClass();
        ((androidx.appcompat.widget.m) obj).getClass();
        b0 b0Var = ((androidx.appcompat.widget.m) this.f20640c).f920g;
        if (b0Var == null) {
            return false;
        }
        return b0Var.i(oVar);
    }

    @Override // k.m
    public final void j(o oVar) {
        boolean z10;
        androidx.appcompat.widget.m mVar = ((Toolbar) this.f20640c).f772b.f717v;
        if (mVar != null && mVar.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Iterator it = ((Toolbar) this.f20640c).I.f22341b.iterator();
            while (it.hasNext()) {
                ((q0) ((n0.s) it.next())).a.dispatchPrepareOptionsMenu(oVar);
            }
        }
        ((Toolbar) this.f20640c).getClass();
    }

    @Override // k4.h0
    public final com.bumptech.glide.load.data.e k(Uri uri) {
        return new com.bumptech.glide.load.data.o((ContentResolver) this.f20640c, uri);
    }

    @Override // a4.v
    public final void l(l lVar, ArrayList arrayList) {
        Log.d("PurchaseEG", "onSkuINAPDetailsResponse: " + arrayList.size());
        Object obj = ((s0) this.f20640c).f2032c;
        ((g3.c) obj).f18011f = arrayList;
        ((g3.c) obj).getClass();
        g3.c cVar = (g3.c) ((s0) this.f20640c).f2032c;
        cVar.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            cVar.f18013h.put(uVar.f162c, uVar);
        }
    }

    @Override // g0.s
    public final int m(Object obj) {
        return ((h) obj).f20205c;
    }

    public final r2 n() {
        return ((i2) this.f20640c).b();
    }

    @Override // k4.a
    public final k o(AssetManager assetManager, String str) {
        return new k(assetManager, str, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        Object obj = this.f20640c;
        if (((z6.c) obj).f28531g != null) {
            ((z6.c) obj).f28531g.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        Object obj = this.f20640c;
        if (((z6.c) obj).f28531g != null) {
            ((z6.c) obj).f28531g.onAdClosed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        Object obj = this.f20640c;
        if (((z6.c) obj).f28531g != null) {
            ((z6.c) obj).f28531g.onAdOpened();
            ((z6.c) this.f20640c).f28531g.reportAdImpression();
        }
    }

    @Override // com.adjust.sdk.OnEventTrackingFailedListener
    public final void onFinishedEventTrackingFailed(AdjustEventFailure adjustEventFailure) {
        Log.d("ITGAdjust", "Event failure callback called!");
        Log.d("ITGAdjust", "Event failure data: " + adjustEventFailure.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPostMessage(android.webkit.WebView r10, java.lang.reflect.InvocationHandler r11, android.net.Uri r12, boolean r13, java.lang.reflect.InvocationHandler r14) {
        /*
            r9 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r11 = mi.a.b(r0, r11)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r11 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r11
            java.lang.reflect.InvocationHandler[] r0 = r11.getPorts()
            int r1 = r0.length
            f.a[] r1 = new f.a[r1]
            r2 = 0
            r3 = r2
        L11:
            int r4 = r0.length
            if (r3 >= r4) goto L20
            f.a r4 = new f.a
            r5 = r0[r3]
            r4.<init>(r5)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L11
        L20:
            l2.b r0 = l2.n.a
            boolean r0 = r0.b()
            if (r0 == 0) goto L53
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r11 = r11.getMessagePayload()
            java.lang.Object r11 = mi.a.b(r0, r11)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r11 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r11
            int r0 = r11.getType()
            if (r0 == 0) goto L49
            r1 = 1
            if (r0 == r1) goto L3f
            r11 = 0
            goto L5d
        L3f:
            k2.c r0 = new k2.c
            byte[] r11 = r11.getAsArrayBuffer()
            r0.<init>(r11)
            goto L5c
        L49:
            k2.c r0 = new k2.c
            java.lang.String r11 = r11.getAsString()
            r0.<init>(r11)
            goto L5c
        L53:
            k2.c r0 = new k2.c
            java.lang.String r11 = r11.getData()
            r0.<init>(r11)
        L5c:
            r11 = r0
        L5d:
            r5 = r11
            if (r5 == 0) goto L7f
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r11 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r11 = mi.a.b(r11, r14)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r11 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r11
            l2.h r14 = new l2.h
            r14.<init>(r11, r2)
            java.lang.Object r11 = r11.getOrCreatePeer(r14)
            r8 = r11
            l2.i r8 = (l2.i) r8
            java.lang.Object r11 = r9.f20640c
            r3 = r11
            k2.d r3 = (k2.d) r3
            r4 = r10
            r6 = r12
            r7 = r13
            r3.onPostMessage(r4, r5, r6, r7, r8)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.c.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    public final j1 q() {
        return (j1) ((MutableStateFlow) this.f20640c).getValue();
    }

    public final synchronized int r() {
        int i10;
        int size;
        i10 = 0;
        for (com.facebook.appevents.u uVar : ((HashMap) this.f20640c).values()) {
            synchronized (uVar) {
                if (!m6.a.b(uVar)) {
                    try {
                        size = uVar.f10973c.size();
                    } catch (Throwable th2) {
                        m6.a.a(uVar, th2);
                    }
                }
                size = 0;
            }
            i10 += size;
        }
        return i10;
    }

    public final synchronized com.facebook.appevents.u s(com.facebook.appevents.b bVar) {
        Context a;
        com.facebook.internal.c y4;
        com.facebook.appevents.u uVar = (com.facebook.appevents.u) ((HashMap) this.f20640c).get(bVar);
        if (uVar == null && (y4 = com.facebook.b.y((a = x.a()))) != null) {
            com.facebook.c cVar = com.facebook.appevents.k.f10950b;
            uVar = new com.facebook.appevents.u(y4, com.facebook.c.q(a));
        }
        if (uVar == null) {
            return null;
        }
        ((HashMap) this.f20640c).put(bVar, uVar);
        return uVar;
    }

    public final synchronized Set t() {
        Set keySet;
        keySet = ((HashMap) this.f20640c).keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "stateMap.keys");
        return keySet;
    }

    public final String toString() {
        switch (this.f20639b) {
            case 24:
                return super.toString() + "{fragment=" + ((com.bumptech.glide.manager.s) this.f20640c) + "}";
            default:
                return super.toString();
        }
    }

    public final void u(List list) {
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a4.z zVar = (a4.z) it.next();
                if (!"play_pass_subs".equals(zVar.f172b)) {
                    hashSet.add(zVar.f172b);
                }
            }
            if (hashSet.size() <= 1) {
                this.f20640c = zzai.zzj(list);
                return;
            }
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        throw new IllegalArgumentException("Product list cannot be empty.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r6.a > r2.a) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(y0.j1 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.Object r0 = r5.f20640c
            kotlinx.coroutines.flow.MutableStateFlow r0 = (kotlinx.coroutines.flow.MutableStateFlow) r0
        L9:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            y0.j1 r2 = (y0.j1) r2
            boolean r3 = r2 instanceof y0.y0
            if (r3 == 0) goto L16
            r3 = 1
            goto L1c
        L16:
            y0.n1 r3 = y0.n1.f27813b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
        L1c:
            if (r3 == 0) goto L1f
            goto L29
        L1f:
            boolean r3 = r2 instanceof y0.d
            if (r3 == 0) goto L2b
            int r3 = r6.a
            int r4 = r2.a
            if (r3 <= r4) goto L2f
        L29:
            r2 = r6
            goto L2f
        L2b:
            boolean r3 = r2 instanceof y0.v0
            if (r3 == 0) goto L36
        L2f:
            boolean r1 = r0.compareAndSet(r1, r2)
            if (r1 == 0) goto L9
            return
        L36:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.c.v(y0.j1):void");
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.f20639b = i10;
        this.f20640c = obj;
    }

    public c(File file, String str) {
        this.f20639b = 25;
        try {
            this.f20640c = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e2) {
            throw new r(e2);
        }
    }

    public c(g gVar) {
        this.f20639b = 17;
        this.f20640c = Collections.unmodifiableMap(new HashMap(gVar.a));
    }

    public c(int i10) {
        Handler handler;
        Handler handler2;
        this.f20639b = i10;
        if (i10 == 7) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                this.f20640c = new h2();
                return;
            } else if (i11 >= 29) {
                this.f20640c = new g2();
                return;
            } else {
                this.f20640c = new e2();
                return;
            }
        }
        if (i10 == 8) {
            n1 n1Var = n1.f27813b;
            Intrinsics.checkNotNull(n1Var, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
            this.f20640c = StateFlowKt.MutableStateFlow(n1Var);
            return;
        }
        if (i10 != 12) {
            if (i10 == 23) {
                char[] cArr = w4.m.a;
                this.f20640c = new ArrayDeque(0);
                return;
            } else if (i10 == 26) {
                this.f20640c = new HashMap();
                return;
            } else {
                if (i10 != 28) {
                    this.f20640c = new HashSet();
                    return;
                }
                return;
            }
        }
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler2 = com.bytedance.sdk.component.adexpress.vc.a.l(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e2) {
                e = e2;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f20640c = handler2;
            } catch (InstantiationException e10) {
                e = e10;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f20640c = handler2;
            } catch (NoSuchMethodException e11) {
                e = e11;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f20640c = handler2;
            } catch (InvocationTargetException e12) {
                Throwable cause = e12.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
                throw ((RuntimeException) cause);
            }
            handler2 = handler;
        }
        this.f20640c = handler2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(u7.e eVar, int i10) {
        this(eVar);
        this.f20639b = 29;
    }

    public c(u7.e eVar) {
        this.f20639b = 29;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(eVar.f25552b).setFlags(eVar.f25553c).setUsage(eVar.f25554d);
        int i10 = n9.h0.a;
        if (i10 >= 29) {
            u7.c.a(usage, eVar.f25555f);
        }
        if (i10 >= 32) {
            u7.d.a(usage, eVar.f25556g);
        }
        this.f20640c = usage.build();
    }

    public c(Context context, Uri uri) {
        this.f20639b = 6;
        this.f20640c = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public c(r2 r2Var) {
        this.f20639b = 7;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f20640c = new h2(r2Var);
        } else if (i10 >= 29) {
            this.f20640c = new g2(r2Var);
        } else {
            this.f20640c = new e2(r2Var);
        }
    }
}
