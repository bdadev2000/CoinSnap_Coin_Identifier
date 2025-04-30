package com.mbridge.msdk.mbnative.f;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.controller.d;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private NativeController f16566a;
    private Handler b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbnative.d.a f16567c;

    /* renamed from: d, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f16568d;

    public a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f16567c.onAdLoadError("current request is loading");
        this.f16567c.b();
    }

    public static void preload(Map<String, Object> map, int i9) {
        ad.c("NativeProvider", "native provider preload");
        new d().a(map, i9);
    }

    public final void b() {
        a(1, "");
    }

    public final void c() {
        try {
            ab.b();
        } catch (Exception unused) {
            ad.b("NativeProvider", "clear cache failed");
        }
    }

    public final void d() {
        try {
            this.f16566a.a();
        } catch (Exception unused) {
            ad.b("NativeProvider", "release failed");
        }
    }

    public final String e() {
        NativeController nativeController = this.f16566a;
        if (nativeController != null) {
            return nativeController.b();
        }
        return "";
    }

    public final String f() {
        NativeController nativeController = this.f16566a;
        if (nativeController != null) {
            return nativeController.c();
        }
        return "";
    }

    public final void a(com.mbridge.msdk.mbnative.d.a aVar) {
        this.f16567c = aVar;
    }

    public final void b(View view, Campaign campaign) {
        ad.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f16566a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view);
    }

    public a(com.mbridge.msdk.mbnative.d.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f16567c = aVar;
        this.f16568d = nativeTrackingListener;
    }

    public final void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f16568d = nativeTrackingListener;
    }

    public final void a(Context context, Resources resources, Map<String, Object> map) {
        this.f16566a = new NativeController(this.f16567c, this.f16568d, map, context);
    }

    public final void a() {
        a(0, "");
    }

    public final void b(View view, List<View> list, Campaign campaign) {
        ad.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f16566a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view, list);
    }

    public final void a(String str) {
        a(0, str);
    }

    public final void a(View view, List<View> list, Campaign campaign) {
        NativeController nativeController = this.f16566a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view, list);
    }

    public final void a(View view, Campaign campaign) {
        ad.c("NativeProvider", "native provider registerView");
        NativeController nativeController = this.f16566a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view);
    }

    private void a(int i9, String str) {
        if (this.f16566a != null) {
            com.mbridge.msdk.mbnative.d.a aVar = this.f16567c;
            if (aVar != null && aVar.a()) {
                if (ai.g()) {
                    g();
                    return;
                } else {
                    this.b.post(new Runnable() { // from class: com.mbridge.msdk.mbnative.f.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.g();
                        }
                    });
                    return;
                }
            }
            com.mbridge.msdk.mbnative.d.a aVar2 = this.f16567c;
            if (aVar2 != null) {
                aVar2.b();
            }
            this.f16566a.a(i9, str);
        }
    }
}
