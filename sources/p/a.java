package p;

import kotlin.jvm.internal.r;
import okhttp3.CacheControl;

/* loaded from: classes3.dex */
public final class a extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f31209a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(0);
        this.f31209a = cVar;
    }

    @Override // q0.a
    public final Object invoke() {
        return CacheControl.Companion.parse(this.f31209a.f31214f);
    }
}
