package jb;

import android.os.Bundle;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class l implements Callable {
    public final /* synthetic */ long a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f19903b;

    public l(m mVar, long j3) {
        this.f19903b = mVar;
        this.a = j3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong(CampaignEx.JSON_KEY_TIMESTAMP, this.a);
        this.f19903b.f19914k.f(bundle);
        return null;
    }
}
