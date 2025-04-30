package r4;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import u4.C2769n;
import u4.CallableC2766k;
import z.AbstractC2965e;
import z.C2964d;
import z.C2966f;

/* loaded from: classes2.dex */
public final class c implements SuccessContinuation {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f22840c;

    /* renamed from: d, reason: collision with root package name */
    public Object f22841d;

    public c() {
        this.b = 3;
        this.f22840c = new AtomicInteger();
        this.f22841d = new AtomicInteger();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return ((C2769n) this.f22841d).f23138e.l(new CallableC2766k(0, this, (Boolean) obj));
    }

    public String toString() {
        switch (this.b) {
            case 4:
                String str = "[ ";
                if (((C2966f) this.f22840c) != null) {
                    for (int i9 = 0; i9 < 9; i9++) {
                        StringBuilder b = AbstractC2965e.b(str);
                        b.append(((C2966f) this.f22840c).f24489j[i9]);
                        b.append(" ");
                        str = b.toString();
                    }
                }
                StringBuilder c9 = AbstractC2965e.c(str, "] ");
                c9.append((C2966f) this.f22840c);
                return c9.toString();
            default:
                return super.toString();
        }
    }

    public c(Context context) {
        this.b = 0;
        this.f22840c = context;
        this.f22841d = null;
    }

    public c(C2964d c2964d) {
        this.b = 4;
        this.f22841d = c2964d;
    }

    public c(Intent intent, ArrayList arrayList) {
        this.b = 1;
        this.f22840c = intent;
        this.f22841d = arrayList;
    }

    public c(C2769n c2769n, Task task) {
        this.b = 2;
        this.f22841d = c2769n;
        this.f22840c = task;
    }
}
