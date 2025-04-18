package m9;

import android.content.Context;

/* loaded from: classes3.dex */
public final class u implements k {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final k f21758b;

    public u(Context context) {
        w wVar = new w();
        this.a = context.getApplicationContext();
        this.f21758b = wVar;
    }

    @Override // m9.k
    public final l createDataSource() {
        return new v(this.a, this.f21758b.createDataSource());
    }
}
