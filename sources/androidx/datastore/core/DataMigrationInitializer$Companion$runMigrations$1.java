package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import h0.g;
import j0.c;
import j0.e;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
/* loaded from: classes4.dex */
public final class DataMigrationInitializer$Companion$runMigrations$1<T> extends c {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f18956a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f18957b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18958c;
    public final /* synthetic */ DataMigrationInitializer.Companion d;

    /* renamed from: f, reason: collision with root package name */
    public int f18959f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$1(DataMigrationInitializer.Companion companion, g gVar) {
        super(gVar);
        this.d = companion;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f18958c = obj;
        this.f18959f |= Integer.MIN_VALUE;
        return DataMigrationInitializer.Companion.a(this.d, null, null, this);
    }
}
