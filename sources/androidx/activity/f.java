package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements y1.c {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f570b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.f570b = obj;
    }

    @Override // y1.c
    public final Bundle a() {
        int i10 = this.a;
        Object obj = this.f570b;
        switch (i10) {
            case 0:
                return ComponentActivity.e((ComponentActivity) obj);
            case 1:
                return FragmentActivity.j((FragmentActivity) obj);
            default:
                return FragmentManager.e((FragmentManager) obj);
        }
    }
}
