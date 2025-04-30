package D0;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final H0.c f582a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final String f583c;

    /* renamed from: d, reason: collision with root package name */
    public final i f584d;

    /* renamed from: e, reason: collision with root package name */
    public final List f585e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f586f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f587g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f588h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f589i;

    public a(Context context, String str, H0.c cVar, i iVar, ArrayList arrayList, boolean z8, int i9, Executor executor, Executor executor2, boolean z9, boolean z10) {
        this.f582a = cVar;
        this.b = context;
        this.f583c = str;
        this.f584d = iVar;
        this.f586f = executor;
        this.f587g = executor2;
        this.f588h = z9;
        this.f589i = z10;
    }

    public final boolean a(int i9, int i10) {
        if (i9 > i10 && this.f589i) {
            return false;
        }
        return this.f588h;
    }
}
