package k;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class r {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f20174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f20175c;

    public r(w wVar, Context context, ActionProvider actionProvider) {
        this.f20175c = wVar;
        this.a = context;
        this.f20174b = actionProvider;
    }

    public abstract /* bridge */ /* synthetic */ boolean a();

    public abstract View b(MenuItem menuItem);

    public abstract /* bridge */ /* synthetic */ boolean c();

    public abstract void d(fb.c cVar);
}
