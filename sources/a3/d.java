package a3;

import android.util.Log;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InitializationCompleteCallback f3957a;

    public d(InitializationCompleteCallback initializationCompleteCallback) {
        this.f3957a = initializationCompleteCallback;
    }

    @Override // a3.b
    public final void a(AdError adError) {
        Log.w(PangleMediationAdapter.TAG, adError.toString());
        this.f3957a.onInitializationFailed(adError.getMessage());
    }

    @Override // a3.b
    public final void b() {
        this.f3957a.onInitializationSucceeded();
    }
}
