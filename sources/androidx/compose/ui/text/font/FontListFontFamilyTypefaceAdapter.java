package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.DispatcherKt;
import b1.a0;
import b1.f0;
import b1.k1;
import d0.k;
import g1.f;
import h0.a;
import h0.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.q;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {

    /* renamed from: c, reason: collision with root package name */
    public static final FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1 f17242c = new a(a0.f22284a);

    /* renamed from: a, reason: collision with root package name */
    public final AsyncTypefaceCache f17243a;

    /* renamed from: b, reason: collision with root package name */
    public final f f17244b;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache) {
        m mVar = m.f30726a;
        this.f17243a = asyncTypefaceCache;
        this.f17244b = p0.a.c(f17242c.u(DispatcherKt.f17429a).u(mVar).u(new k1(null)));
    }

    public final TypefaceResult a(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, l lVar, l lVar2) {
        k kVar;
        Object a2;
        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult;
        Object d;
        ArrayList arrayList;
        FontFamily fontFamily = typefaceRequest.f17286a;
        if (!(fontFamily instanceof FontListFontFamily)) {
            return null;
        }
        List list = ((FontListFontFamily) fontFamily).f17241c;
        FontWeight fontWeight = typefaceRequest.f17287b;
        int i2 = typefaceRequest.f17288c;
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            Font font = (Font) obj;
            if (p0.a.g(font.getWeight(), fontWeight) && FontStyle.a(font.b(), i2)) {
                arrayList2.add(obj);
            }
        }
        if (!(!arrayList2.isEmpty())) {
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                Object obj2 = list.get(i4);
                if (FontStyle.a(((Font) obj2).b(), i2)) {
                    arrayList3.add(obj2);
                }
            }
            if (!arrayList3.isEmpty()) {
                list = arrayList3;
            }
            List list2 = list;
            int compareTo = fontWeight.compareTo(FontWeight.f17264b);
            int i5 = fontWeight.f17274a;
            if (compareTo < 0) {
                int size3 = list2.size();
                int i6 = 0;
                FontWeight fontWeight2 = null;
                FontWeight fontWeight3 = null;
                while (true) {
                    if (i6 >= size3) {
                        break;
                    }
                    FontWeight weight = ((Font) list2.get(i6)).getWeight();
                    int E = p0.a.E(weight.f17274a, i5);
                    int i7 = weight.f17274a;
                    if (E >= 0) {
                        if (p0.a.E(i7, i5) <= 0) {
                            fontWeight2 = weight;
                            fontWeight3 = fontWeight2;
                            break;
                        }
                        if (fontWeight3 == null || p0.a.E(i7, fontWeight3.f17274a) < 0) {
                            fontWeight3 = weight;
                        }
                    } else if (fontWeight2 == null || p0.a.E(i7, fontWeight2.f17274a) > 0) {
                        fontWeight2 = weight;
                    }
                    i6++;
                }
                if (fontWeight2 == null) {
                    fontWeight2 = fontWeight3;
                }
                arrayList = new ArrayList(list2.size());
                int size4 = list2.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    Object obj3 = list2.get(i8);
                    if (p0.a.g(((Font) obj3).getWeight(), fontWeight2)) {
                        arrayList.add(obj3);
                    }
                }
            } else {
                FontWeight fontWeight4 = FontWeight.f17265c;
                if (fontWeight.compareTo(fontWeight4) > 0) {
                    int size5 = list2.size();
                    int i9 = 0;
                    FontWeight fontWeight5 = null;
                    FontWeight fontWeight6 = null;
                    while (true) {
                        if (i9 >= size5) {
                            break;
                        }
                        FontWeight weight2 = ((Font) list2.get(i9)).getWeight();
                        int E2 = p0.a.E(weight2.f17274a, i5);
                        int i10 = weight2.f17274a;
                        if (E2 >= 0) {
                            if (p0.a.E(i10, i5) <= 0) {
                                fontWeight5 = weight2;
                                fontWeight6 = fontWeight5;
                                break;
                            }
                            if (fontWeight6 == null || p0.a.E(i10, fontWeight6.f17274a) < 0) {
                                fontWeight6 = weight2;
                            }
                        } else if (fontWeight5 == null || p0.a.E(i10, fontWeight5.f17274a) > 0) {
                            fontWeight5 = weight2;
                        }
                        i9++;
                    }
                    if (fontWeight6 != null) {
                        fontWeight5 = fontWeight6;
                    }
                    arrayList = new ArrayList(list2.size());
                    int size6 = list2.size();
                    for (int i11 = 0; i11 < size6; i11++) {
                        Object obj4 = list2.get(i11);
                        if (p0.a.g(((Font) obj4).getWeight(), fontWeight5)) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    int size7 = list2.size();
                    int i12 = 0;
                    FontWeight fontWeight7 = null;
                    FontWeight fontWeight8 = null;
                    while (true) {
                        if (i12 >= size7) {
                            break;
                        }
                        FontWeight weight3 = ((Font) list2.get(i12)).getWeight();
                        if (p0.a.E(weight3.f17274a, fontWeight4.f17274a) <= 0) {
                            int E3 = p0.a.E(weight3.f17274a, i5);
                            int i13 = weight3.f17274a;
                            if (E3 >= 0) {
                                if (p0.a.E(i13, i5) <= 0) {
                                    fontWeight7 = weight3;
                                    fontWeight8 = fontWeight7;
                                    break;
                                }
                                if (fontWeight8 == null || p0.a.E(i13, fontWeight8.f17274a) < 0) {
                                    fontWeight8 = weight3;
                                }
                            } else if (fontWeight7 == null || p0.a.E(i13, fontWeight7.f17274a) > 0) {
                                fontWeight7 = weight3;
                            }
                        }
                        i12++;
                    }
                    if (fontWeight8 != null) {
                        fontWeight7 = fontWeight8;
                    }
                    arrayList = new ArrayList(list2.size());
                    int size8 = list2.size();
                    for (int i14 = 0; i14 < size8; i14++) {
                        Object obj5 = list2.get(i14);
                        if (p0.a.g(((Font) obj5).getWeight(), fontWeight7)) {
                            arrayList.add(obj5);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        FontWeight fontWeight9 = FontWeight.f17265c;
                        int size9 = list2.size();
                        int i15 = 0;
                        FontWeight fontWeight10 = null;
                        FontWeight fontWeight11 = null;
                        while (true) {
                            if (i15 >= size9) {
                                break;
                            }
                            FontWeight weight4 = ((Font) list2.get(i15)).getWeight();
                            if (fontWeight9 == null || p0.a.E(weight4.f17274a, fontWeight9.f17274a) >= 0) {
                                int E4 = p0.a.E(weight4.f17274a, i5);
                                int i16 = weight4.f17274a;
                                if (E4 >= 0) {
                                    if (p0.a.E(i16, i5) <= 0) {
                                        fontWeight10 = weight4;
                                        fontWeight11 = fontWeight10;
                                        break;
                                    }
                                    if (fontWeight11 == null || p0.a.E(i16, fontWeight11.f17274a) < 0) {
                                        fontWeight11 = weight4;
                                    }
                                } else if (fontWeight10 == null || p0.a.E(i16, fontWeight10.f17274a) > 0) {
                                    fontWeight10 = weight4;
                                }
                            }
                            i15++;
                        }
                        if (fontWeight11 != null) {
                            fontWeight10 = fontWeight11;
                        }
                        arrayList = new ArrayList(list2.size());
                        int size10 = list2.size();
                        for (int i17 = 0; i17 < size10; i17++) {
                            Object obj6 = list2.get(i17);
                            if (p0.a.g(((Font) obj6).getWeight(), fontWeight10)) {
                                arrayList.add(obj6);
                            }
                        }
                    }
                }
            }
            arrayList2 = arrayList;
        }
        AsyncTypefaceCache asyncTypefaceCache = this.f17243a;
        int size11 = arrayList2.size();
        int i18 = 0;
        ArrayList arrayList4 = null;
        while (true) {
            if (i18 >= size11) {
                kVar = new k(arrayList4, ((FontFamilyResolverImpl$createDefaultTypeface$1) lVar2).invoke(typefaceRequest));
                break;
            }
            Font font2 = (Font) arrayList2.get(i18);
            int a3 = font2.a();
            if (FontLoadingStrategy.a(a3, 0)) {
                synchronized (asyncTypefaceCache.f17215c) {
                    try {
                        platformFontLoader.b();
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font2, null);
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f17213a.a(key);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f17214b.a(key);
                        }
                        if (asyncTypefaceResult2 != null) {
                            a2 = asyncTypefaceResult2.f17216a;
                        } else {
                            try {
                                a2 = platformFontLoader.a(font2);
                                AsyncTypefaceCache.a(asyncTypefaceCache, font2, platformFontLoader, a2);
                            } catch (Exception e) {
                                throw new IllegalStateException("Unable to load font " + font2, e);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (a2 == null) {
                    throw new IllegalStateException("Unable to load font " + font2);
                }
                kVar = new k(arrayList4, FontSynthesis_androidKt.a(typefaceRequest.d, a2, font2, typefaceRequest.f17287b, typefaceRequest.f17288c));
            } else if (FontLoadingStrategy.a(a3, 1)) {
                synchronized (asyncTypefaceCache.f17215c) {
                    try {
                        platformFontLoader.b();
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font2, null);
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult3 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f17213a.a(key2);
                        if (asyncTypefaceResult3 == null) {
                            asyncTypefaceResult3 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f17214b.a(key2);
                        }
                        if (asyncTypefaceResult3 != null) {
                            d = asyncTypefaceResult3.f17216a;
                        } else {
                            try {
                                d = platformFontLoader.a(font2);
                            } catch (Throwable th2) {
                                d = q.d(th2);
                            }
                            if (d instanceof d0.m) {
                                d = null;
                            }
                            AsyncTypefaceCache.a(asyncTypefaceCache, font2, platformFontLoader, d);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (d != null) {
                    kVar = new k(arrayList4, FontSynthesis_androidKt.a(typefaceRequest.d, d, font2, typefaceRequest.f17287b, typefaceRequest.f17288c));
                    break;
                }
                i18++;
            } else {
                if (!FontLoadingStrategy.a(a3, 2)) {
                    throw new IllegalStateException("Unknown font type " + font2);
                }
                asyncTypefaceCache.getClass();
                platformFontLoader.b();
                AsyncTypefaceCache.Key key3 = new AsyncTypefaceCache.Key(font2, null);
                synchronized (asyncTypefaceCache.f17215c) {
                    asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f17213a.a(key3);
                    if (asyncTypefaceResult == null) {
                        asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.f17214b.a(key3);
                    }
                }
                if (asyncTypefaceResult != null) {
                    Object obj7 = asyncTypefaceResult.f17216a;
                    if (obj7 != null) {
                        kVar = new k(arrayList4, FontSynthesis_androidKt.a(typefaceRequest.d, obj7, font2, typefaceRequest.f17287b, typefaceRequest.f17288c));
                        break;
                    }
                } else if (arrayList4 == null) {
                    arrayList4 = f0.w(font2);
                } else {
                    arrayList4.add(font2);
                }
                i18++;
            }
        }
        List list3 = (List) kVar.f30134a;
        Object obj8 = kVar.f30135b;
        if (list3 == null) {
            return new TypefaceResult.Immutable(obj8, true);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list3, obj8, typefaceRequest, this.f17243a, lVar, platformFontLoader);
        e.v(this.f17244b, null, 4, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1);
        return new TypefaceResult.Async(asyncFontListLoader);
    }
}
