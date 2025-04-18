package pe;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public final class g implements OnCompleteListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f23621c;

    public g(j jVar, int i10) {
        this.f23621c = jVar;
        this.f23620b = i10;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        j jVar = this.f23621c;
        if (this.f23620b == jVar.f23633h) {
            jVar.f23632g = jVar.f23631f;
        }
    }
}
