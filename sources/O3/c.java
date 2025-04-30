package O3;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes2.dex */
public final class c extends com.bumptech.glide.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f2162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TextPaint f2163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.c f2164f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f2165g;

    public c(d dVar, Context context, TextPaint textPaint, com.bumptech.glide.c cVar) {
        super(3);
        this.f2165g = dVar;
        this.f2162d = context;
        this.f2163e = textPaint;
        this.f2164f = cVar;
    }

    @Override // com.bumptech.glide.c
    public final void P(int i9) {
        this.f2164f.P(i9);
    }

    @Override // com.bumptech.glide.c
    public final void Q(Typeface typeface, boolean z8) {
        this.f2165g.g(this.f2162d, this.f2163e, typeface);
        this.f2164f.Q(typeface, z8);
    }
}
