package androidx.emoji2.text;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements k, k4.z, k4.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1519b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1520c;

    public /* synthetic */ p(Context context, int i10) {
        this.f1519b = i10;
        this.f1520c = context;
    }

    @Override // k4.l
    public final Class a() {
        return Drawable.class;
    }

    @Override // k4.l
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // k4.z
    public final k4.y c(k4.d0 d0Var) {
        int i10 = this.f1519b;
        Context context = this.f1520c;
        switch (i10) {
            case 1:
                return new k4.m(context, this);
            case 2:
                return new k4.m(context, d0Var.b(Integer.class, AssetFileDescriptor.class));
            default:
                return new k4.v(context, 2);
        }
    }

    @Override // androidx.emoji2.text.k
    public final void d(com.facebook.appevents.i iVar) {
        int i10 = 0;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer", i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new n(i10, this, iVar, threadPoolExecutor));
    }

    @Override // k4.l
    public final Object e(Resources resources, int i10, Resources.Theme theme) {
        Context context = this.f1520c;
        return com.facebook.internal.i.u(context, context, i10, theme);
    }

    public p(Context context) {
        this.f1519b = 0;
        this.f1520c = context.getApplicationContext();
    }
}
