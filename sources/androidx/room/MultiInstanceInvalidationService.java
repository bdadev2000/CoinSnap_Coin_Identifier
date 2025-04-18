package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v1.a0;
import v1.z;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public int f2099b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2100c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final a0 f2101d = new a0(this);

    /* renamed from: f, reason: collision with root package name */
    public final z f2102f = new z(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.f2102f;
    }
}
