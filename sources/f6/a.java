package f6;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public Map f17681b;

    public a(String eventName, HashMap restrictiveParams) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(restrictiveParams, "restrictiveParams");
        this.a = eventName;
        this.f17681b = restrictiveParams;
    }
}
