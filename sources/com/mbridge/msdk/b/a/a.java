package com.mbridge.msdk.b.a;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class a implements PreloadListener {
    WeakReference<PreloadListener> a;

    /* renamed from: b, reason: collision with root package name */
    private int f12339b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12340c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.a = new WeakReference<>(preloadListener);
        }
    }

    public final boolean a() {
        return this.f12340c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public final void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.a;
        if (weakReference != null && weakReference.get() != null) {
            this.a.get().onPreloadFaild(str);
        }
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public final void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.a;
        if (weakReference != null && weakReference.get() != null) {
            this.a.get().onPreloadSucceed();
        }
    }

    public final void a(boolean z10) {
        this.f12340c = z10;
    }
}
