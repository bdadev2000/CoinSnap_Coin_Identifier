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

/* loaded from: classes4.dex */
public class a {
    private NativeController a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f14061b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbnative.d.a f14062c;

    /* renamed from: d, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f14063d;

    public a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f14062c.onAdLoadError("current request is loading");
        this.f14062c.b();
    }

    public static void preload(Map<String, Object> map, int i10) {
        ad.c("NativeProvider", "native provider preload");
        new d().a(map, i10);
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
            this.a.a();
        } catch (Exception unused) {
            ad.b("NativeProvider", "release failed");
        }
    }

    public final String e() {
        NativeController nativeController = this.a;
        if (nativeController != null) {
            return nativeController.b();
        }
        return "";
    }

    public final String f() {
        NativeController nativeController = this.a;
        if (nativeController != null) {
            return nativeController.c();
        }
        return "";
    }

    public final void a(com.mbridge.msdk.mbnative.d.a aVar) {
        this.f14062c = aVar;
    }

    public final void b(View view, Campaign campaign) {
        ad.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view);
    }

    public a(com.mbridge.msdk.mbnative.d.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f14062c = aVar;
        this.f14063d = nativeTrackingListener;
    }

    public final void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f14063d = nativeTrackingListener;
    }

    public final void a(Context context, Resources resources, Map<String, Object> map) {
        this.a = new NativeController(this.f14062c, this.f14063d, map, context);
    }

    public final void a() {
        a(0, "");
    }

    public final void b(View view, List<View> list, Campaign campaign) {
        ad.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view, list);
    }

    public final void a(String str) {
        a(0, str);
    }

    public final void a(View view, List<View> list, Campaign campaign) {
        NativeController nativeController = this.a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view, list);
    }

    public final void a(View view, Campaign campaign) {
        ad.c("NativeProvider", "native provider registerView");
        NativeController nativeController = this.a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view);
    }

    private void a(int i10, String str) {
        if (this.a != null) {
            com.mbridge.msdk.mbnative.d.a aVar = this.f14062c;
            if (aVar != null && aVar.a()) {
                if (ai.g()) {
                    g();
                    return;
                } else {
                    this.f14061b.post(new Runnable() { // from class: com.mbridge.msdk.mbnative.f.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.g();
                        }
                    });
                    return;
                }
            }
            com.mbridge.msdk.mbnative.d.a aVar2 = this.f14062c;
            if (aVar2 != null) {
                aVar2.b();
            }
            this.a.a(i10, str);
        }
    }
}
