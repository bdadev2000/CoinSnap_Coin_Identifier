package androidx.compose.ui.text.font;

import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f17210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncFontListLoader f17211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Font f17212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, Font font, g gVar) {
        super(2, gVar);
        this.f17211b = asyncFontListLoader;
        this.f17212c = font;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.f17211b, this.f17212c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f17210a;
        if (i2 == 0) {
            q.m(obj);
            PlatformFontLoader platformFontLoader = this.f17211b.f17194f;
            this.f17210a = 1;
            obj = platformFontLoader.c(this.f17212c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return obj;
    }
}
