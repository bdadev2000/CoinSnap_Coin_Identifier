package sc;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes3.dex */
public final class b implements q {
    public final Bundle a;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // sc.q
    public final Boolean a() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // sc.q
    public final Duration b() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return Duration.m1482boximpl(DurationKt.toDuration(bundle.getInt("firebase_sessions_sessions_restart_timeout"), DurationUnit.SECONDS));
        }
        return null;
    }

    @Override // sc.q
    public final Double c() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // sc.q
    public final Object d(Continuation continuation) {
        return Unit.INSTANCE;
    }
}
