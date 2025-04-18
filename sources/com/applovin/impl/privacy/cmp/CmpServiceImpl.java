package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.i4;
import com.applovin.impl.m3;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.yp;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes3.dex */
public class CmpServiceImpl implements AppLovinCmpService, a.d {

    /* renamed from: a, reason: collision with root package name */
    private final j f26097a;

    /* renamed from: b, reason: collision with root package name */
    private final m3 f26098b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.privacy.cmp.a f26099c = b();
    private d d;
    private e e;

    /* loaded from: classes3.dex */
    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f26100a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f26101b;

        /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0091a implements e {
            public C0091a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f26100a.onCompleted(appLovinCmpError);
            }
        }

        public a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f26100a = onCompletedListener;
            this.f26101b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.d
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f26100a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f26101b, new C0091a());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f26104a;

        public b(Activity activity) {
            this.f26104a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f26099c.a(this.f26104a, CmpServiceImpl.this.f26098b, CmpServiceImpl.this);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f26106a;

        public c(Activity activity) {
            this.f26106a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f26099c.b(this.f26106a, CmpServiceImpl.this.f26098b, CmpServiceImpl.this);
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(AppLovinCmpError appLovinCmpError);
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(j jVar) {
        this.f26097a = jVar;
        this.f26098b = new m3(jVar.u().f());
    }

    private void c() {
        if (hasSupportedCmp()) {
            this.f26099c.c();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f26099c != null;
    }

    public void loadCmp(Activity activity, d dVar) {
        if (!hasSupportedCmp()) {
            dVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
            return;
        }
        this.d = dVar;
        b bVar = new b(activity);
        if (this.f26099c.d()) {
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
        this.e = eVar;
        if (this.f26099c.e()) {
            AppLovinSdkUtils.runOnUiThread(cVar);
        } else {
            cVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(@NonNull Activity activity, @NonNull AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f26097a.J();
        if (n.a()) {
            this.f26097a.J().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
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
        d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.a(appLovinCmpError);
        this.d = null;
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        e eVar = this.e;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.e = null;
    }

    private void a() {
        com.applovin.impl.privacy.cmp.a aVar = this.f26099c;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private com.applovin.impl.privacy.cmp.a b() {
        if (yp.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f26097a);
        }
        if (!this.f26097a.u().k() || this.f26097a.u().e() != i4.a.UNIFIED) {
            return null;
        }
        n.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }
}
