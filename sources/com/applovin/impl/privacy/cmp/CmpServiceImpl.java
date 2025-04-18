package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.g4;
import com.applovin.impl.k3;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class CmpServiceImpl implements AppLovinCmpService, a.d {
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final k3 f7020b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.privacy.cmp.a f7021c = b();

    /* renamed from: d, reason: collision with root package name */
    private d f7022d;

    /* renamed from: e, reason: collision with root package name */
    private e f7023e;

    /* loaded from: classes.dex */
    public class a implements d {
        final /* synthetic */ AppLovinCmpService.OnCompletedListener a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f7024b;

        /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0028a implements e {
            public C0028a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.a.onCompleted(appLovinCmpError);
            }
        }

        public a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.a = onCompletedListener;
            this.f7024b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.d
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f7024b, new C0028a());
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        final /* synthetic */ Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f7021c.a(this.a, CmpServiceImpl.this.f7020b, CmpServiceImpl.this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        final /* synthetic */ Activity a;

        public c(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f7021c.b(this.a, CmpServiceImpl.this.f7020b, CmpServiceImpl.this);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(AppLovinCmpError appLovinCmpError);
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(k kVar) {
        this.a = kVar;
        this.f7020b = new k3(kVar.t().f());
    }

    private void c() {
        if (!hasSupportedCmp()) {
            return;
        }
        this.f7021c.c();
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f7021c != null;
    }

    public void loadCmp(Activity activity, d dVar) {
        if (!hasSupportedCmp()) {
            dVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
            return;
        }
        this.f7022d = dVar;
        b bVar = new b(activity);
        if (this.f7021c.d()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        a();
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        a(cmpErrorImpl);
        a();
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowLoaded(Bundle bundle) {
        a((AppLovinCmpError) null);
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        a();
    }

    public void showCmp(Activity activity, e eVar) {
        c cVar = new c(activity);
        this.f7023e = eVar;
        if (this.f7021c.e()) {
            AppLovinSdkUtils.runOnUiThread(cVar);
        } else {
            cVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(@NonNull Activity activity, @NonNull AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.a.L();
        if (t.a()) {
            this.a.L().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            c();
            loadCmp(activity, new a(onCompletedListener, activity));
        }
    }

    @NonNull
    public String toString() {
        return "[CmpService]";
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        d dVar = this.f7022d;
        if (dVar == null) {
            return;
        }
        dVar.a(appLovinCmpError);
        this.f7022d = null;
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f7023e;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.f7023e = null;
    }

    private void a() {
        com.applovin.impl.privacy.cmp.a aVar = this.f7021c;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private com.applovin.impl.privacy.cmp.a b() {
        if (zp.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.a);
        }
        if (!this.a.t().k() || this.a.t().e() != g4.a.UNIFIED) {
            return null;
        }
        t.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }
}
