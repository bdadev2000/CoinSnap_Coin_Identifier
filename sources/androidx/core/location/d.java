package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f18603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f18604c;

    public /* synthetic */ d(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i2) {
        this.f18602a = i2;
        this.f18603b = preRGnssStatusTransport;
        this.f18604c = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18602a) {
            case 0:
                LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport = this.f18603b;
                if (preRGnssStatusTransport.f18591b != this.f18604c) {
                    return;
                }
                preRGnssStatusTransport.f18590a.getClass();
                return;
            default:
                LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport2 = this.f18603b;
                if (preRGnssStatusTransport2.f18591b != this.f18604c) {
                    return;
                }
                preRGnssStatusTransport2.f18590a.getClass();
                return;
        }
    }
}
