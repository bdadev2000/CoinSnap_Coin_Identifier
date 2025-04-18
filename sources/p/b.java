package p;

import kotlin.jvm.internal.r;
import okhttp3.MediaType;

/* loaded from: classes3.dex */
public final class b extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f31210a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f31210a = cVar;
    }

    @Override // q0.a
    public final Object invoke() {
        String str = this.f31210a.f31214f.get("Content-Type");
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }
}
