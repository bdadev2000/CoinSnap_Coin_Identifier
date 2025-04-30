package u4;

import android.os.Bundle;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.Callable;

/* renamed from: u4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC2768m implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f23133a;
    public final /* synthetic */ C2769n b;

    public CallableC2768m(C2769n c2769n, long j7) {
        this.b = c2769n;
        this.f23133a = j7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong(CampaignEx.JSON_KEY_TIMESTAMP, this.f23133a);
        this.b.f23144k.h(bundle);
        return null;
    }
}
