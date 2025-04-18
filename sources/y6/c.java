package y6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class c implements PAGSdk.PAGInitCallback {

    /* renamed from: f, reason: collision with root package name */
    public static c f27931f;
    public boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27932b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f27933c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final f f27934d = new f();

    /* renamed from: e, reason: collision with root package name */
    public final a f27935e = new a();

    public final void a(Context context, String str, b bVar) {
        if (TextUtils.isEmpty(str)) {
            AdError i10 = com.bumptech.glide.d.i(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            Log.w(PangleMediationAdapter.TAG, i10.toString());
            bVar.a(i10);
            return;
        }
        boolean z10 = this.a;
        ArrayList arrayList = this.f27933c;
        if (z10) {
            arrayList.add(bVar);
            return;
        }
        if (this.f27932b) {
            bVar.b();
            return;
        }
        this.a = true;
        arrayList.add(bVar);
        this.f27935e.getClass();
        PAGConfig build = new PAGConfig.Builder().appId(str).setChildDirected(e.f27936b).setGDPRConsent(PangleMediationAdapter.getGDPRConsent()).setDoNotSell(PangleMediationAdapter.getDoNotSell()).setUserData(String.format("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"%s\"}]", "6.3.0.4.0")).build();
        this.f27934d.getClass();
        PAGSdk.init(context, build, this);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        this.a = false;
        this.f27932b = false;
        AdError j3 = com.bumptech.glide.d.j(i10, str);
        ArrayList arrayList = this.f27933c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(j3);
        }
        arrayList.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        this.a = false;
        this.f27932b = true;
        ArrayList arrayList = this.f27933c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        arrayList.clear();
    }
}
