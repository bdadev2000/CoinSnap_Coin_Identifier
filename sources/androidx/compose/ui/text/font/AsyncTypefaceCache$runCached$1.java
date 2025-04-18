package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {398}, m = "runCached")
/* loaded from: classes4.dex */
public final class AsyncTypefaceCache$runCached$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AsyncTypefaceCache f17219a;

    /* renamed from: b, reason: collision with root package name */
    public AsyncTypefaceCache.Key f17220b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17221c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AsyncTypefaceCache f17222f;

    /* renamed from: g, reason: collision with root package name */
    public int f17223g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, g gVar) {
        super(gVar);
        this.f17222f = asyncTypefaceCache;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f17223g |= Integer.MIN_VALUE;
        return this.f17222f.b(null, null, false, null, this);
    }
}
