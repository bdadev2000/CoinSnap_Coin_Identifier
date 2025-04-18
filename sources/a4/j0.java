package a4;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class j0 {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final x f145b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f146c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f147d = new i0(this, true);

    /* renamed from: e, reason: collision with root package name */
    public final i0 f148e = new i0(this, false);

    /* renamed from: f, reason: collision with root package name */
    public boolean f149f;

    public j0(Context context, x xVar, e0 e0Var) {
        this.a = context;
        this.f145b = xVar;
        this.f146c = e0Var;
    }

    public final void a(boolean z10) {
        int i10;
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f149f = z10;
        this.f148e.a(this.a, intentFilter2);
        if (this.f149f) {
            i0 i0Var = this.f147d;
            Context context = this.a;
            synchronized (i0Var) {
                if (!i0Var.a) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (true != i0Var.f143b) {
                            i10 = 4;
                        } else {
                            i10 = 2;
                        }
                        context.registerReceiver(i0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i10);
                    } else {
                        context.registerReceiver(i0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                    }
                    i0Var.a = true;
                }
            }
            return;
        }
        this.f147d.a(this.a, intentFilter);
    }
}
