package b1;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class b implements ReadOnlyProperty {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final z0.a f2272b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f2273c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineScope f2274d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2275e;

    /* renamed from: f, reason: collision with root package name */
    public volatile c1.c f2276f;

    public b(String name, z0.a aVar, Function1 produceMigrations, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = name;
        this.f2272b = aVar;
        this.f2273c = produceMigrations;
        this.f2274d = scope;
        this.f2275e = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        c1.c cVar;
        Context thisRef = (Context) obj;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        c1.c cVar2 = this.f2276f;
        if (cVar2 == null) {
            synchronized (this.f2275e) {
                if (this.f2276f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    z0.a aVar = this.f2272b;
                    Function1 function1 = this.f2273c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f2276f = p6.a.d(aVar, (List) function1.invoke(applicationContext), this.f2274d, new a(0, applicationContext, this));
                }
                cVar = this.f2276f;
                Intrinsics.checkNotNull(cVar);
            }
            return cVar;
        }
        return cVar2;
    }
}
