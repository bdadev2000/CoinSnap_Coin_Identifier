package k0;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements Callable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f20196c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f20197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20198e;

    public /* synthetic */ d(String str, Context context, c cVar, int i10, int i11) {
        this.a = i11;
        this.f20195b = str;
        this.f20196c = context;
        this.f20197d = cVar;
        this.f20198e = i10;
    }

    public final f a() {
        int i10 = this.a;
        Context context = this.f20196c;
        String str = this.f20195b;
        int i11 = this.f20198e;
        c cVar = this.f20197d;
        switch (i10) {
            case 0:
                return g.a(str, context, cVar, i11);
            default:
                try {
                    return g.a(str, context, cVar, i11);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.a) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
