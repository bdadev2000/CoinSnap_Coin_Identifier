package retrofit2;

import retrofit2.DefaultCallAdapterFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 f31362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Callback f31363c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1, Callback callback, Object obj, int i2) {
        this.f31361a = i2;
        this.f31362b = anonymousClass1;
        this.f31363c = callback;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f31361a;
        Callback callback = this.f31363c;
        DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1 anonymousClass1 = this.f31362b;
        Object obj = this.d;
        switch (i2) {
            case 0:
                DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.b(anonymousClass1, callback, (Response) obj);
                return;
            default:
                DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.a(anonymousClass1, callback, (Throwable) obj);
                return;
        }
    }
}
