package a3;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;
import w4.v0;

/* loaded from: classes.dex */
public final class c implements PAGSdk.PAGInitCallback {

    /* renamed from: f, reason: collision with root package name */
    public static c f3952f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3953a = false;
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3954c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final f f3955d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final C0339a f3956e = new Object();

    public final void a(Context context, String str, b bVar) {
        if (TextUtils.isEmpty(str)) {
            AdError h6 = v0.h(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            Log.w(PangleMediationAdapter.TAG, h6.toString());
            bVar.a(h6);
            return;
        }
        boolean z8 = this.f3953a;
        ArrayList arrayList = this.f3954c;
        if (z8) {
            arrayList.add(bVar);
            return;
        }
        if (this.b) {
            bVar.b();
            return;
        }
        this.f3953a = true;
        arrayList.add(bVar);
        this.f3956e.getClass();
        PAGConfig build = new PAGConfig.Builder().appId(str).setChildDirected(e.b).setGDPRConsent(PangleMediationAdapter.getGDPRConsent()).setDoNotSell(PangleMediationAdapter.getDoNotSell()).setUserData("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"6.0.0.3.0\"}]").build();
        this.f3955d.getClass();
        PAGSdk.init(context, build, this);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i9, String str) {
        this.f3953a = false;
        this.b = false;
        AdError i10 = v0.i(i9, str);
        ArrayList arrayList = this.f3954c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(i10);
        }
        arrayList.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        this.f3953a = false;
        this.b = true;
        ArrayList arrayList = this.f3954c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        arrayList.clear();
    }
}
