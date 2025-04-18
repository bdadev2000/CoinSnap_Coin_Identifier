package p1;

import androidx.fragment.app.FragmentActivity;
import com.facebook.login.u;
import com.facebook.login.x;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Deferred;
import s.j;
import s.l;
import x5.i;

/* loaded from: classes.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23348c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        super(1);
        this.f23347b = i10;
        this.f23348c = obj;
        this.f23349d = obj2;
    }

    public final Object a(z1.a db2) {
        int i10 = this.f23347b;
        Object obj = this.f23349d;
        Object obj2 = this.f23348c;
        switch (i10) {
            case 1:
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.G((String) obj2, (Object[]) obj);
                return null;
            default:
                Intrinsics.checkNotNullParameter(db2, "db");
                v1.a aVar = (v1.a) obj2;
                aVar.getClass();
                db2.N(null);
                aVar.getClass();
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10 = false;
        switch (this.f23347b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                Object obj2 = this.f23348c;
                if (th2 != null) {
                    if (th2 instanceof CancellationException) {
                        j jVar = (j) obj2;
                        jVar.f24148d = true;
                        l lVar = jVar.f24146b;
                        if (lVar != null && lVar.f24151c.cancel(true)) {
                            z10 = true;
                        }
                        if (z10) {
                            jVar.a = null;
                            jVar.f24146b = null;
                            jVar.f24147c = null;
                        }
                    } else {
                        j jVar2 = (j) obj2;
                        jVar2.f24148d = true;
                        l lVar2 = jVar2.f24146b;
                        if (lVar2 != null && lVar2.f24151c.i(th2)) {
                            z10 = true;
                        }
                        if (z10) {
                            jVar2.a = null;
                            jVar2.f24146b = null;
                            jVar2.f24147c = null;
                        }
                    }
                } else {
                    j jVar3 = (j) obj2;
                    Object completed = ((Deferred) this.f23349d).getCompleted();
                    jVar3.f24148d = true;
                    l lVar3 = jVar3.f24146b;
                    if (lVar3 != null && lVar3.f24151c.h(completed)) {
                        z10 = true;
                    }
                    if (z10) {
                        jVar3.a = null;
                        jVar3.f24146b = null;
                        jVar3.f24147c = null;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                return a((z1.a) obj);
            case 2:
                return a((z1.a) obj);
            case 3:
                androidx.activity.result.a result = (androidx.activity.result.a) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.f595b == -1) {
                    u b3 = ((x) this.f23348c).b();
                    com.facebook.x xVar = com.facebook.x.a;
                    i.s();
                    b3.l(com.facebook.x.f11429i + 0, result.f595b, result.f596c);
                } else {
                    ((FragmentActivity) this.f23349d).finish();
                }
                return Unit.INSTANCE;
            case 4:
                ((Function1) ((qf.a) this.f23348c).f23901l).invoke((rf.a) this.f23349d);
                return Unit.INSTANCE;
            default:
                IOException it = (IOException) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                zh.j jVar4 = (zh.j) this.f23348c;
                h3.a aVar = (h3.a) this.f23349d;
                synchronized (jVar4) {
                    aVar.e();
                }
                return Unit.INSTANCE;
        }
    }
}
