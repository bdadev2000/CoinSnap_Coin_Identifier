package y6;

import android.util.Log;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* loaded from: classes3.dex */
public final class d implements b {
    public final /* synthetic */ InitializationCompleteCallback a;

    public d(InitializationCompleteCallback initializationCompleteCallback) {
        this.a = initializationCompleteCallback;
    }

    @Override // y6.b
    public final void a(AdError adError) {
        Log.w(PangleMediationAdapter.TAG, adError.toString());
        this.a.onInitializationFailed(adError.getMessage());
    }

    @Override // y6.b
    public final void b() {
        this.a.onInitializationSucceeded();
    }
}
