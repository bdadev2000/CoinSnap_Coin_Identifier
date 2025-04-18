package a4;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzhe;
import v8.u0;

/* loaded from: classes.dex */
public final class g0 {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public Object f132b;

    public g0() {
        this.f132b = n9.a.a;
    }

    public final void a(int i10) {
        u0.m(!this.a);
        ((SparseBooleanArray) this.f132b).append(i10, true);
    }

    public final n9.g b() {
        u0.m(!this.a);
        this.a = true;
        return new n9.g((SparseBooleanArray) this.f132b);
    }

    public final synchronized boolean c() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public final synchronized void d(g4.g0 g0Var, boolean z10) {
        if (!this.a && !z10) {
            this.a = true;
            g0Var.a();
            this.a = false;
        }
        ((Handler) this.f132b).obtainMessage(1, g0Var).sendToTarget();
    }

    public final void e(zzhe zzheVar) {
        if (this.a) {
            zzb.zzk("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            i7.p pVar = (i7.p) this.f132b;
            f7.a aVar = new f7.a(zzheVar, f7.d.DEFAULT, null);
            pVar.getClass();
            pVar.a(aVar, new com.facebook.appevents.m(8));
        } catch (Throwable unused) {
            zzb.zzk("BillingLogger", "logging failed.");
        }
    }

    public /* synthetic */ g0(Object obj, boolean z10) {
        this.f132b = obj;
        this.a = z10;
    }

    public g0(Context context) {
        try {
            i7.r.b(context);
            this.f132b = i7.r.a().c(g7.a.f18230e).a("PLAY_BILLING_LIBRARY", new f7.c("proto"), new z1.d(5));
        } catch (Throwable unused) {
            this.a = true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(int i10) {
        this();
        if (i10 != 2) {
            if (i10 == 3) {
            } else if (i10 != 4) {
                this.f132b = new Handler(Looper.getMainLooper(), new g4.j0(0));
            } else {
                this.f132b = new SparseBooleanArray();
            }
        }
    }
}
