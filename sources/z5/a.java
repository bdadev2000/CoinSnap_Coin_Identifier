package z5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public List f28520b;

    public a(String eventName, ArrayList deprecateParams) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(deprecateParams, "deprecateParams");
        this.a = eventName;
        this.f28520b = deprecateParams;
    }
}
