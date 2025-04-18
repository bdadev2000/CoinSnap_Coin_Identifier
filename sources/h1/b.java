package h1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f18707c = new b(SetsKt.emptySet(), MapsKt.emptyMap());
    public final Set a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f18708b;

    public b(Set flags, Map allowedViolations) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
        this.a = flags;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : allowedViolations.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
        }
        this.f18708b = linkedHashMap;
    }
}
