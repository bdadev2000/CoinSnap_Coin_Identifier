package androidx.compose.ui.text.font;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {57, 58}, m = "awaitLoad")
/* loaded from: classes3.dex */
public final class AndroidFontLoader$awaitLoad$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public AndroidFontLoader f17184a;

    /* renamed from: b, reason: collision with root package name */
    public Font f17185b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f17186c;
    public final /* synthetic */ AndroidFontLoader d;

    /* renamed from: f, reason: collision with root package name */
    public int f17187f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, g gVar) {
        super(gVar);
        this.d = androidFontLoader;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f17186c = obj;
        this.f17187f |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
