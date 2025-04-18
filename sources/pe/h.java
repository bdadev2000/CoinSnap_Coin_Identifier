package pe;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import he.a0;
import he.w;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class h implements Callable {
    public final /* synthetic */ f a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f23623c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Callable f23624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f23625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f23626f;

    public h(j jVar, f fVar, String str, f fVar2, w wVar, boolean z10) {
        this.f23626f = jVar;
        this.a = fVar;
        this.f23622b = str;
        this.f23623c = fVar2;
        this.f23624d = wVar;
        this.f23625e = z10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        j jVar = this.f23626f;
        f fVar = jVar.f23631f;
        f fVar2 = this.a;
        if (fVar != fVar2) {
            e.f23610e.a(2, this.f23622b.toUpperCase(), "- State mismatch, aborting. current:", jVar.f23631f, "from:", fVar2, "to:", this.f23623c);
            return Tasks.forCanceled();
        }
        return ((Task) this.f23624d.call()).continueWithTask(((a0) ((hb.d) jVar.a).f19011c).a.f25395d, new ka.f(this));
    }
}
