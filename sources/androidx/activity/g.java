package androidx.activity;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements e.b {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f571b;

    public /* synthetic */ g(ComponentActivity componentActivity, int i10) {
        this.a = i10;
        this.f571b = componentActivity;
    }

    @Override // e.b
    public final void a(Context context) {
        int i10 = this.a;
        ComponentActivity componentActivity = this.f571b;
        switch (i10) {
            case 0:
                ComponentActivity.f(componentActivity);
                return;
            default:
                FragmentActivity.i((FragmentActivity) componentActivity, context);
                return;
        }
    }
}
