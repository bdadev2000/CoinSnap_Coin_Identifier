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

    /* renamed from: a, reason: collision with root package name */
    private final k f10085a;
    private final k3 b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.privacy.cmp.a f10086c = b();

    /* renamed from: d, reason: collision with root package name */
    private d f10087d;

    /* renamed from: e, reason: collision with root package name */
    private e f10088e;

    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f10089a;
        final /* synthetic */ Activity b;

        /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0028a implements e {
            public C0028a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f10089a.onCompleted(appLovinCmpError);
            }
        }

        public a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f10089a = onCompletedListener;
            this.b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.d
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f10089a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.b, new C0028a());
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f10092a;

        public b(Activity activity) {
            this.f10092a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f10086c.a(this.f10092a, CmpServiceImpl.this.b, CmpServiceImpl.this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f10093a;

        public c(Activity activity) {
            this.f10093a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f10086c.b(this.f10093a, CmpServiceImpl.this.b, CmpServiceImpl.this);
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
        this.f10085a = kVar;
        this.b = new k3(kVar.t().f());
    }

    private void c() {
        if (!hasSupportedCmp()) {
            return;
        }
        this.f10086c.c();
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        if (this.f10086c != null) {
            return true;
        }
        return false;
    }

    public void loadCmp(Activity activity, d dVar) {
        if (!hasSupportedCmp()) {
            dVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
            return;
        }
        this.f10087d = dVar;
        b bVar = new b(activity);
        if (this.f10086c.d()) {
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
        this.f10088e = eVar;
        if (this.f10086c.e()) {
            AppLovinSdkUtils.runOnUiThread(cVar);
        } else {
            cVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(@NonNull Activity activity, @NonNull AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f10085a.L();
        if (t.a()) {
            this.f10085a.L().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
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
        d dVar = this.f10087d;
        if (dVar == null) {
            return;
        }
        dVar.a(appLovinCmpError);
        this.f10087d = null;
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f10088e;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.f10088e = null;
    }

    private void a() {
        com.applovin.impl.privacy.cmp.a aVar = this.f10086c;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private com.applovin.impl.privacy.cmp.a b() {
        if (zp.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f10085a);
        }
        if (!this.f10085a.t().k() || this.f10085a.t().e() != g4.a.UNIFIED) {
            return null;
        }
        t.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }
}
