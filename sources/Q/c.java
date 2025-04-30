package Q;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2452a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F1.i f2454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2455e;

    public /* synthetic */ c(String str, Context context, F1.i iVar, int i9, int i10) {
        this.f2452a = i10;
        this.b = str;
        this.f2453c = context;
        this.f2454d = iVar;
        this.f2455e = i9;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2452a) {
            case 0:
                return f.a(this.b, this.f2453c, this.f2454d, this.f2455e);
            default:
                try {
                    return f.a(this.b, this.f2453c, this.f2454d, this.f2455e);
                } catch (Throwable unused) {
                    return new e(-3);
                }
        }
    }
}
