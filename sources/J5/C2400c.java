package j5;

import B3.q;
import C2.m;
import F2.h;
import O5.k;
import P1.r;
import P1.s;
import P1.u;
import S1.e;
import T.E0;
import T.G0;
import T.InterfaceC0266e;
import T.InterfaceC0292x;
import T1.A;
import T1.C0296b;
import T1.F;
import T1.G;
import T1.InterfaceC0295a;
import T1.v;
import android.app.UiModeManager;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import b3.C0566k;
import c6.InterfaceC0613a;
import c6.InterfaceC0614b;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.bumptech.glide.load.data.j;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.facebook.ads.AdView;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.TraceMetric;
import e5.C2221a;
import e6.AbstractC2224b;
import f6.C2272a;
import h.C2310a;
import i5.J;
import j2.n;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k2.InterfaceC2429a;
import n1.C2475f;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import p1.DialogC2540d;
import q.c1;
import z.AbstractC2965e;
import z2.i;

/* renamed from: j5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2400c implements InterfaceC0292x, C3.a, h.b, InterfaceC2429a, S5.b, InterfaceC0266e, v, InterfaceC0295a, F, WebMessageListenerBoundaryInterface, MediaViewListener, PAGNativeAdInteractionListener, InterfaceC0614b, AdViewParentApi {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C2400c f21105d;

    /* renamed from: f, reason: collision with root package name */
    public static C2400c f21106f;
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21107c;

    public /* synthetic */ C2400c(int i9, boolean z8) {
        this.b = i9;
    }

    @Override // S5.b, c6.InterfaceC0614b
    public JSONObject a(View view) {
        int currentModeType;
        switch (this.b) {
            case 11:
                JSONObject a6 = U5.b.a(0, 0, 0, 0);
                UiModeManager uiModeManager = i.f24529a;
                try {
                    a6.put("noOutputDevice", U5.a.f3340a[AbstractC2965e.d((uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : h.b)] == 1);
                } catch (JSONException e4) {
                    m.c("Error with setting output device status", e4);
                }
                return a6;
            default:
                if (view == null) {
                    return AbstractC2224b.a(0, 0, 0, 0);
                }
                int width = view.getWidth();
                int height = view.getHeight();
                int[] iArr = (int[]) this.f21107c;
                view.getLocationOnScreen(iArr);
                return AbstractC2224b.a(iArr[0], iArr[1], width, height);
        }
    }

    @Override // h.b
    public void b(Object obj) {
        Bundle extras;
        C2310a c2310a = (C2310a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f21107c;
        proxyBillingActivityV2.getClass();
        Intent intent = c2310a.f20551c;
        int i9 = zzb.zze(intent, "ProxyBillingActivityV2").f1520a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f5613f;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i9, extras);
        }
        int i10 = c2310a.b;
        if (i10 != -1 || i9 != 0) {
            zzb.zzk("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i10 + " and billing's responseCode: " + i9);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // T.InterfaceC0266e
    public int c() {
        int flags;
        flags = ((ContentInfo) this.f21107c).getFlags();
        return flags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S5.b
    public void d(View view, JSONObject jSONObject, S5.a aVar, boolean z8, boolean z9) {
        ArrayList arrayList = new ArrayList();
        R5.c cVar = R5.c.f2741c;
        if (cVar != null) {
            Collection unmodifiableCollection = Collections.unmodifiableCollection(cVar.b);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            Iterator it = unmodifiableCollection.iterator();
            while (it.hasNext()) {
                View view2 = (View) ((k) it.next()).f2231d.get();
                if (view2 != null && view2.isAttachedToWindow() && view2.isShown()) {
                    View view3 = view2;
                    while (true) {
                        if (view3 != null) {
                            if (view3.getAlpha() == 0.0f) {
                                break;
                            }
                            Object parent = view3.getParent();
                            if (parent instanceof View) {
                                view3 = (View) parent;
                            } else {
                                view3 = null;
                            }
                        } else {
                            View rootView = view2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z10 = rootView.getZ();
                                int size = arrayList.size();
                                while (size > 0 && ((View) arrayList.get(size - 1)).getZ() > z10) {
                                    size--;
                                }
                                arrayList.add(size, rootView);
                            }
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((V5.b) aVar).a((View) it2.next(), (S5.b) this.f21107c, jSONObject, z9);
        }
    }

    @Override // k2.InterfaceC2429a
    public Object e() {
        c1 c1Var = (c1) this.f21107c;
        return new r((e) c1Var.f22636a, (e) c1Var.b, (e) c1Var.f22637c, (e) c1Var.f22638d, (s) c1Var.f22639e, (u) c1Var.f22640f, (C.c) c1Var.f22641g);
    }

    @Override // T1.InterfaceC0295a
    public com.bumptech.glide.load.data.e f(AssetManager assetManager, String str) {
        return new j(assetManager, str, 0);
    }

    @Override // T.InterfaceC0266e
    public ContentInfo g() {
        return (ContentInfo) this.f21107c;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // T1.F
    public com.bumptech.glide.load.data.e h(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.f21107c, uri, 0);
    }

    @Override // T1.v
    public T1.u i(A a6) {
        switch (this.b) {
            case 13:
                return new C0296b(0, (AssetManager) this.f21107c, this);
            case 14:
                return new C0296b((Resources) this.f21107c, a6.b(Uri.class, AssetFileDescriptor.class));
            case 15:
                return new G(this);
            default:
                return new U1.a((C2475f) this.f21107c);
        }
    }

    @Override // T.InterfaceC0292x
    public G0 j(View view, G0 g02) {
        boolean z8;
        switch (this.b) {
            case 1:
                DialogC2540d dialogC2540d = (DialogC2540d) this.f21107c;
                q qVar = dialogC2540d.f22194o;
                if (qVar != null) {
                    dialogC2540d.f22189h.f13935W.remove(qVar);
                }
                q qVar2 = new q(dialogC2540d.f22192k, g02);
                dialogC2540d.f22194o = qVar2;
                qVar2.e(dialogC2540d.getWindow());
                BottomSheetBehavior bottomSheetBehavior = dialogC2540d.f22189h;
                q qVar3 = dialogC2540d.f22194o;
                ArrayList arrayList = bottomSheetBehavior.f13935W;
                if (!arrayList.contains(qVar3)) {
                    arrayList.add(qVar3);
                }
                return g02;
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f21107c;
                if (!Objects.equals(coordinatorLayout.f4356p, g02)) {
                    coordinatorLayout.f4356p = g02;
                    boolean z9 = true;
                    if (g02.d() > 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    coordinatorLayout.f4357q = z8;
                    if (z8 || coordinatorLayout.getBackground() != null) {
                        z9 = false;
                    }
                    coordinatorLayout.setWillNotDraw(z9);
                    E0 e02 = g02.f2863a;
                    if (!e02.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i9 = 0; i9 < childCount; i9++) {
                            View childAt = coordinatorLayout.getChildAt(i9);
                            if (!ViewCompat.getFitsSystemWindows(childAt) || ((G.e) childAt.getLayoutParams()).f1225a == null || !e02.m()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return g02;
        }
    }

    @Override // T.InterfaceC0266e
    public int k() {
        int source;
        source = ((ContentInfo) this.f21107c).getSource();
        return source;
    }

    @Override // c6.InterfaceC0614b
    public void l(View view, JSONObject jSONObject, InterfaceC0613a interfaceC0613a, boolean z8, boolean z9) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i9 = 0;
        if (z8) {
            HashMap hashMap = new HashMap();
            while (i9 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i9);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i9++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((C2272a) interfaceC0613a).a((View) it2.next(), this, jSONObject, z9);
                }
            }
            return;
        }
        while (i9 < viewGroup.getChildCount()) {
            ((C2272a) interfaceC0613a).a(viewGroup.getChildAt(i9), this, jSONObject, z9);
            i9++;
        }
    }

    public TraceMetric m() {
        List unmodifiableList;
        J newBuilder = TraceMetric.newBuilder();
        newBuilder.k(((Trace) this.f21107c).f14365f);
        newBuilder.i(((Trace) this.f21107c).m.b);
        Trace trace = (Trace) this.f21107c;
        newBuilder.j(trace.m.d(trace.f14371n));
        for (b5.c cVar : ((Trace) this.f21107c).f14366g.values()) {
            newBuilder.g(cVar.f5321c.get(), cVar.b);
        }
        ArrayList arrayList = ((Trace) this.f21107c).f14369j;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                newBuilder.d(new C2400c((Trace) it.next(), 26).m());
            }
        }
        newBuilder.f(((Trace) this.f21107c).getAttributes());
        Trace trace2 = (Trace) this.f21107c;
        synchronized (trace2.f14368i) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (C2221a c2221a : trace2.f14368i) {
                    if (c2221a != null) {
                        arrayList2.add(c2221a);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        PerfSession[] d2 = C2221a.d(unmodifiableList);
        if (d2 != null) {
            newBuilder.a(Arrays.asList(d2));
        }
        return (TraceMetric) newBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [B4.d] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public B4.b n(JSONObject jSONObject) {
        ?? r02;
        int i9 = jSONObject.getInt("settings_version");
        if (i9 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i9 + ". Using default settings values.", null);
            r02 = new R3.e(1);
        } else {
            r02 = new Object();
        }
        return r02.f((r6.b) this.f21107c, jSONObject);
    }

    public synchronized void o(M1.c cVar) {
        cVar.b = null;
        cVar.f1963c = null;
        ((ArrayDeque) this.f21107c).offer(cVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        MediationNativeAdCallback mediationNativeAdCallback = ((C0566k) this.f21107c).f5308i;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        MediationNativeAdCallback mediationNativeAdCallback = ((C0566k) this.f21107c).f5308i;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onComplete(MediaView mediaView) {
        MediationNativeAdCallback mediationNativeAdCallback = ((V2.e) this.f21107c).f3462f;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoComplete();
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    public void onConfigurationChanged(Configuration configuration) {
        AdView.access$001((AdView) this.f21107c, configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        /*
            r7 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r9 = y8.a.c(r0, r9)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r9
            java.lang.reflect.InvocationHandler[] r0 = r9.getPorts()
            int r1 = r0.length
            n1.f[] r1 = new n1.C2475f[r1]
            r2 = 0
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L2c
            n1.f r3 = new n1.f
            r4 = r0[r2]
            r5 = 16
            r6 = 0
            r3.<init>(r5, r6)
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r5 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r4 = y8.a.c(r5, r4)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r4 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r4
            r3.f21833c = r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L2c:
            U0.b r0 = U0.l.f3109a
            boolean r0 = r0.b()
            if (r0 == 0) goto L61
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r9 = r9.getMessagePayload()
            java.lang.Object r9 = y8.a.c(r0, r9)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r9
            int r0 = r9.getType()
            if (r0 == 0) goto L57
            r1 = 1
            if (r0 == r1) goto L4c
            r9 = 0
            r3 = r9
            goto L6b
        L4c:
            T0.c r0 = new T0.c
            byte[] r9 = r9.getAsArrayBuffer()
            r0.<init>(r9)
        L55:
            r3 = r0
            goto L6b
        L57:
            T0.c r0 = new T0.c
            java.lang.String r9 = r9.getAsString()
            r0.<init>(r9)
            goto L55
        L61:
            T0.c r0 = new T0.c
            java.lang.String r9 = r9.getData()
            r0.<init>(r9)
            goto L55
        L6b:
            if (r3 == 0) goto L8d
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r9 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r9 = y8.a.c(r9, r12)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r9 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r9
            J1.v r12 = new J1.v
            r0 = 2
            r12.<init>(r9, r0)
            java.lang.Object r9 = r9.getOrCreatePeer(r12)
            r6 = r9
            U0.h r6 = (U0.h) r6
            java.lang.Object r9 = r7.f21107c
            r1 = r9
            T0.d r1 = (T0.d) r1
            r2 = r8
            r4 = r10
            r5 = r11
            r1.onPostMessage(r2, r3, r4, r5, r6)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.C2400c.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    public String toString() {
        switch (this.b) {
            case 12:
                return "ContentInfoCompat{" + ((ContentInfo) this.f21107c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C2400c(Object obj, int i9) {
        this.b = i9;
        this.f21107c = obj;
    }

    public C2400c(Context context) {
        this.b = 9;
        this.f21107c = new a7.b(context, 10);
    }

    public C2400c(int i9) {
        Handler handler;
        Handler handler2;
        int i10 = 0;
        this.b = i9;
        switch (i9) {
            case 16:
                this.f21107c = new Object();
                new Handler(Looper.getMainLooper(), new T3.c(this, i10));
                return;
            case 18:
                this.f21107c = new C2475f(12);
                return;
            case 20:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler2 = P.i.a(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f21107c = handler2;
                        return;
                    } catch (InstantiationException e9) {
                        e = e9;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f21107c = handler2;
                        return;
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f21107c = handler2;
                        return;
                    } catch (InvocationTargetException e11) {
                        Throwable cause = e11.getCause();
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
                this.f21107c = handler2;
                return;
            case 23:
                char[] cArr = n.f21025a;
                this.f21107c = new ArrayDeque(0);
                return;
            case 27:
                this.f21107c = new int[2];
                return;
            case 28:
                SharedPreferences sharedPreferences = com.facebook.r.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                G7.j.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
                this.f21107c = sharedPreferences;
                return;
            default:
                this.f21107c = new HashSet();
                return;
        }
    }

    @Override // T.InterfaceC0266e
    public ClipData a() {
        ClipData clip;
        clip = ((ContentInfo) this.f21107c).getClip();
        return clip;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onEnterFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onExitFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onFullscreenBackground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onFullscreenForeground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onPause(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onPlay(MediaView mediaView) {
    }

    public C2400c(ContentInfo contentInfo) {
        this.b = 12;
        contentInfo.getClass();
        this.f21107c = B3.a.n(contentInfo);
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onVolumeChange(MediaView mediaView, float f9) {
    }
}
