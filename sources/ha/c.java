package ha;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes3.dex */
public final class c extends p6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f18987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextPaint f18988g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p6.a f18989h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f18990i;

    public c(d dVar, Context context, TextPaint textPaint, p6.a aVar) {
        this.f18990i = dVar;
        this.f18987f = context;
        this.f18988g = textPaint;
        this.f18989h = aVar;
    }

    @Override // p6.a
    public final void n(int i10) {
        this.f18989h.n(i10);
    }

    @Override // p6.a
    public final void o(Typeface typeface, boolean z10) {
        this.f18990i.f(this.f18987f, this.f18988g, typeface);
        this.f18989h.o(typeface, z10);
    }
}
