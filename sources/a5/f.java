package a5;

import com.bytedance.sdk.component.qsH.DSW;
import com.bytedance.sdk.component.qsH.qsH;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f extends qsH {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f189b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f190c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.activity.i iVar, g gVar) {
        super("ProxyTask", 10);
        this.f190c = iVar;
        this.f191d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f189b;
        Object obj = this.f190c;
        switch (i10) {
            case 0:
                ((DSW) obj).run();
                return;
            case 1:
                Iterator it = ((HashSet) obj).iterator();
                while (it.hasNext()) {
                    try {
                        ((File) it.next()).delete();
                    } catch (Throwable unused) {
                    }
                }
                return;
            default:
                ((g) this.f191d).run();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c5.a aVar, HashSet hashSet) {
        super("trimSize", 1);
        this.f191d = aVar;
        this.f190c = hashSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, DSW dsw) {
        super("processCacheNetWorkConcurrent");
        this.f191d = gVar;
        this.f190c = dsw;
    }
}
