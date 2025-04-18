package androidx.compose.ui.text.font;

import h0.g;
import j0.c;
import j0.e;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {272, 285}, m = "load")
/* loaded from: classes3.dex */
public final class AsyncFontListLoader$load$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AsyncFontListLoader f17197a;

    /* renamed from: b, reason: collision with root package name */
    public List f17198b;

    /* renamed from: c, reason: collision with root package name */
    public Font f17199c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f17200f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f17201g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AsyncFontListLoader f17202h;

    /* renamed from: i, reason: collision with root package name */
    public int f17203i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, g gVar) {
        super(gVar);
        this.f17202h = asyncFontListLoader;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f17201g = obj;
        this.f17203i |= Integer.MIN_VALUE;
        return this.f17202h.a(this);
    }
}
