package o0;

import com.google.android.gms.common.api.Api;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class h implements y0.j {

    /* renamed from: a, reason: collision with root package name */
    public final File f31196a;

    /* renamed from: b, reason: collision with root package name */
    public final i f31197b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31198c;

    public h(File file) {
        i iVar = i.f31199a;
        this.f31196a = file;
        this.f31197b = iVar;
        this.f31198c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // y0.j
    public final Iterator iterator() {
        return new f(this);
    }
}
