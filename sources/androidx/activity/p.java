package androidx.activity;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p {
    public final Executor a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f583b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f584c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f585d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f586e;

    public p(n executor, e reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.a = executor;
        this.f583b = reportFullyDrawn;
        this.f584c = new Object();
        this.f586e = new ArrayList();
    }
}
