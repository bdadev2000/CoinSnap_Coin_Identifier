package a7;

import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* loaded from: classes3.dex */
public final class d implements b {
    public final /* synthetic */ InitializationCompleteCallback a;

    public d(InitializationCompleteCallback initializationCompleteCallback) {
        this.a = initializationCompleteCallback;
    }

    @Override // a7.b
    public final void a(AdError adError) {
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.a.onInitializationFailed(adError.toString());
    }

    @Override // a7.b
    public final void b() {
        this.a.onInitializationSucceeded();
    }
}
