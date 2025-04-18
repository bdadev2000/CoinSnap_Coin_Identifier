package androidx.compose.ui.text.font;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class FontFamilyResolverImpl$preload$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FontFamilyResolverImpl f17234a;

    /* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f17235a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass2 f17236a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$2(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.f17234a = fontFamilyResolverImpl;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        FontFamilyResolverImpl fontFamilyResolverImpl = this.f17234a;
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = fontFamilyResolverImpl.d;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.f17235a;
        l lVar = fontFamilyResolverImpl.f17229f;
        PlatformFontLoader platformFontLoader = fontFamilyResolverImpl.f17226a;
        TypefaceResult a2 = fontListFontFamilyTypefaceAdapter.a(typefaceRequest, platformFontLoader, anonymousClass1, lVar);
        if (a2 == null) {
            a2 = fontFamilyResolverImpl.e.a(typefaceRequest, platformFontLoader, AnonymousClass2.f17236a, lVar);
            if (a2 == null) {
                throw new IllegalStateException("Could not load font");
            }
        }
        return a2;
    }
}
