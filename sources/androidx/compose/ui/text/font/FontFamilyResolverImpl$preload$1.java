package androidx.compose.ui.text.font;

import d0.b0;
import h0.g;
import i0.a;
import j0.c;
import j0.e;
import kotlin.jvm.internal.q;

@e(c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", f = "FontFamilyResolver.kt", l = {45}, m = "preload")
/* loaded from: classes3.dex */
final class FontFamilyResolverImpl$preload$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FontFamilyResolverImpl f17232b;

    /* renamed from: c, reason: collision with root package name */
    public int f17233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$1(FontFamilyResolverImpl fontFamilyResolverImpl, g gVar) {
        super(gVar);
        this.f17232b = fontFamilyResolverImpl;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        FontFamilyResolverImpl$preload$1 fontFamilyResolverImpl$preload$1;
        this.f17231a = obj;
        this.f17233c |= Integer.MIN_VALUE;
        FontFamilyResolverImpl fontFamilyResolverImpl = this.f17232b;
        fontFamilyResolverImpl.getClass();
        int i2 = this.f17233c;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f17233c = i2 - Integer.MIN_VALUE;
            fontFamilyResolverImpl$preload$1 = this;
        } else {
            fontFamilyResolverImpl$preload$1 = new FontFamilyResolverImpl$preload$1(fontFamilyResolverImpl, this);
        }
        Object obj2 = fontFamilyResolverImpl$preload$1.f17231a;
        a aVar = a.f30806a;
        int i3 = fontFamilyResolverImpl$preload$1.f17233c;
        if (i3 == 0) {
            q.m(obj2);
            return b0.f30125a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj2);
        throw null;
    }
}
