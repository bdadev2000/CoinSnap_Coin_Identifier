package kotlinx.coroutines.future;

import java.util.function.BiFunction;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements BiFunction {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21079c;

    public /* synthetic */ a(Object obj, int i10) {
        this.f21078b = i10;
        this.f21079c = obj;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i10 = this.f21078b;
        Object obj3 = this.f21079c;
        switch (i10) {
            case 0:
                return FutureKt.a((Function2) obj3, obj, (Throwable) obj2);
            default:
                return FutureKt.b((Job) obj3, obj, (Throwable) obj2);
        }
    }
}
