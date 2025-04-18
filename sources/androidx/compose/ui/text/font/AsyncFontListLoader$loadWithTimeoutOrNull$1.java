package androidx.compose.ui.text.font;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {304}, m = "loadWithTimeoutOrNull$ui_text_release")
/* loaded from: classes2.dex */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public Font f17207a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncFontListLoader f17209c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, g gVar) {
        super(gVar);
        this.f17209c = asyncFontListLoader;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f17208b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f17209c.p(null, this);
    }
}
