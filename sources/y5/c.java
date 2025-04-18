package y5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final List f27914b;

    /* renamed from: c, reason: collision with root package name */
    public final List f27915c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27916d;

    public c(String eventName, b method, a type, String appVersion, ArrayList path, ArrayList parameters, String componentId, String pathType, String activityName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.a = eventName;
        this.f27914b = path;
        this.f27915c = parameters;
        this.f27916d = activityName;
    }
}
