package c3;

import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* renamed from: c3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0606d implements InterfaceC0604b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InitializationCompleteCallback f5407a;

    public C0606d(InitializationCompleteCallback initializationCompleteCallback) {
        this.f5407a = initializationCompleteCallback;
    }

    @Override // c3.InterfaceC0604b
    public final void a(AdError adError) {
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f5407a.onInitializationFailed(adError.toString());
    }

    @Override // c3.InterfaceC0604b
    public final void b() {
        this.f5407a.onInitializationSucceeded();
    }
}
