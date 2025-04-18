package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* loaded from: classes4.dex */
public abstract class FragmentHostCallback<E> extends FragmentContainer {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f19731a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f19732b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f19733c;
    public final FragmentManager d;

    public FragmentHostCallback(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.d = new FragmentManager();
        this.f19731a = fragmentActivity;
        this.f19732b = fragmentActivity;
        this.f19733c = handler;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public View b(int i2) {
        return null;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean c() {
        return true;
    }

    public void d(PrintWriter printWriter, String[] strArr) {
    }

    public abstract FragmentActivity e();

    public LayoutInflater f() {
        return LayoutInflater.from(this.f19732b);
    }

    public boolean g(String str) {
        return false;
    }

    public void h() {
    }
}
