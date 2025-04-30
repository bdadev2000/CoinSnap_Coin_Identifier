package e0;

import java.io.File;
import java.io.FileOutputStream;
import y7.AbstractC2954c;

/* loaded from: classes.dex */
public final class F extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public G f19945f;

    /* renamed from: g, reason: collision with root package name */
    public File f19946g;

    /* renamed from: h, reason: collision with root package name */
    public FileOutputStream f19947h;

    /* renamed from: i, reason: collision with root package name */
    public FileOutputStream f19948i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f19949j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G f19950k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(G g9, w7.f fVar) {
        super(fVar);
        this.f19950k = g9;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f19949j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f19950k.j(null, this);
    }
}
