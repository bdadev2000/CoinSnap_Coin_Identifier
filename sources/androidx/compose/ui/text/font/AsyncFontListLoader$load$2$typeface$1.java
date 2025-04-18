package androidx.compose.ui.text.font;

import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {273}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AsyncFontListLoader$load$2$typeface$1 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f17204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncFontListLoader f17205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Font f17206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, Font font, g gVar) {
        super(1, gVar);
        this.f17205b = asyncFontListLoader;
        this.f17206c = font;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new AsyncFontListLoader$load$2$typeface$1(this.f17205b, this.f17206c, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((AsyncFontListLoader$load$2$typeface$1) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f17204a;
        if (i2 == 0) {
            q.m(obj);
            this.f17204a = 1;
            obj = this.f17205b.p(this.f17206c, this);
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
