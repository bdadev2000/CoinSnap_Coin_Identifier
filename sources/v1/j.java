package v1;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25891b;

    /* renamed from: c, reason: collision with root package name */
    public final z1.f f25892c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.g f25893d;

    /* renamed from: e, reason: collision with root package name */
    public final List f25894e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25895f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f25896g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f25897h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f25898i;

    /* renamed from: j, reason: collision with root package name */
    public final Intent f25899j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f25900k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f25901l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f25902m;

    /* renamed from: n, reason: collision with root package name */
    public final Callable f25903n;

    /* renamed from: o, reason: collision with root package name */
    public final List f25904o;

    /* renamed from: p, reason: collision with root package name */
    public final List f25905p;

    public j(Context context, String str, z1.f sqliteOpenHelperFactory, androidx.work.g migrationContainer, ArrayList arrayList, boolean z10, e0 journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.a = context;
        this.f25891b = str;
        this.f25892c = sqliteOpenHelperFactory;
        this.f25893d = migrationContainer;
        this.f25894e = arrayList;
        this.f25895f = z10;
        this.f25896g = journalMode;
        this.f25897h = queryExecutor;
        this.f25898i = transactionExecutor;
        this.f25899j = null;
        this.f25900k = z11;
        this.f25901l = z12;
        this.f25902m = linkedHashSet;
        this.f25903n = null;
        this.f25904o = typeConverters;
        this.f25905p = autoMigrationSpecs;
    }
}
