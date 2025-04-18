package androidx.compose.ui.text.font;

import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

@e(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {107}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f17249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FontListFontFamilyTypefaceAdapter f17250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Font f17251c;
    public final /* synthetic */ PlatformFontLoader d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {109}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends i implements l {

        /* renamed from: a, reason: collision with root package name */
        public int f17252a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Font f17253b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PlatformFontLoader f17254c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {110}, m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C00531 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f17255a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlatformFontLoader f17256b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Font f17257c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00531(Font font, PlatformFontLoader platformFontLoader, g gVar) {
                super(2, gVar);
                this.f17256b = platformFontLoader;
                this.f17257c = font;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00531(this.f17257c, this.f17256b, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00531) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f30806a;
                int i2 = this.f17255a;
                if (i2 == 0) {
                    q.m(obj);
                    this.f17255a = 1;
                    obj = this.f17256b.c(this.f17257c, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Font font, PlatformFontLoader platformFontLoader, g gVar) {
            super(1, gVar);
            this.f17253b = font;
            this.f17254c = platformFontLoader;
        }

        @Override // j0.a
        public final g create(g gVar) {
            return new AnonymousClass1(this.f17253b, this.f17254c, gVar);
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((g) obj)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f17252a;
            Font font = this.f17253b;
            try {
                if (i2 == 0) {
                    q.m(obj);
                    C00531 c00531 = new C00531(font, this.f17254c, null);
                    this.f17252a = 1;
                    obj = p0.a.H0(15000L, c00531, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.m(obj);
                }
                if (obj != null) {
                    return obj;
                }
                throw new IllegalStateException("Unable to load font " + font);
            } catch (Exception e) {
                throw new IllegalStateException("Unable to load font " + font, e);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3$2$1(FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, Font font, PlatformFontLoader platformFontLoader, g gVar) {
        super(2, gVar);
        this.f17250b = fontListFontFamilyTypefaceAdapter;
        this.f17251c = font;
        this.d = platformFontLoader;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.f17250b, this.f17251c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f17249a;
        if (i2 == 0) {
            q.m(obj);
            AsyncTypefaceCache asyncTypefaceCache = this.f17250b.f17243a;
            Font font = this.f17251c;
            PlatformFontLoader platformFontLoader = this.d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(font, platformFontLoader, null);
            this.f17249a = 1;
            obj = asyncTypefaceCache.b(font, platformFontLoader, true, anonymousClass1, this);
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
