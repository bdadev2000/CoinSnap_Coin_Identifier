package androidx.room;

import androidx.room.IMultiInstanceInvalidationCallback;

/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationClient$callback$1 extends IMultiInstanceInvalidationCallback.Stub {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21307b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationClient f21308a;

    public MultiInstanceInvalidationClient$callback$1(MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        this.f21308a = multiInstanceInvalidationClient;
        attachInterface(this, IMultiInstanceInvalidationCallback.l8);
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public final void g(String[] strArr) {
        p0.a.s(strArr, "tables");
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f21308a;
        multiInstanceInvalidationClient.f21298c.execute(new androidx.core.content.res.a(5, multiInstanceInvalidationClient, strArr));
    }
}
