package androidx.compose.animation.core;

import q0.l;

/* loaded from: classes2.dex */
public final class VectorConvertersKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TwoWayConverter f2340a = new TwoWayConverterImpl(VectorConvertersKt$FloatToVector$1.f2351a, VectorConvertersKt$FloatToVector$2.f2352a);

    /* renamed from: b, reason: collision with root package name */
    public static final TwoWayConverter f2341b = new TwoWayConverterImpl(VectorConvertersKt$IntToVector$1.f2357a, VectorConvertersKt$IntToVector$2.f2358a);

    /* renamed from: c, reason: collision with root package name */
    public static final TwoWayConverter f2342c = new TwoWayConverterImpl(VectorConvertersKt$DpToVector$1.f2349a, VectorConvertersKt$DpToVector$2.f2350a);
    public static final TwoWayConverter d = new TwoWayConverterImpl(VectorConvertersKt$DpOffsetToVector$1.f2347a, VectorConvertersKt$DpOffsetToVector$2.f2348a);
    public static final TwoWayConverter e = new TwoWayConverterImpl(VectorConvertersKt$SizeToVector$1.f2363a, VectorConvertersKt$SizeToVector$2.f2364a);

    /* renamed from: f, reason: collision with root package name */
    public static final TwoWayConverter f2343f = new TwoWayConverterImpl(VectorConvertersKt$OffsetToVector$1.f2359a, VectorConvertersKt$OffsetToVector$2.f2360a);

    /* renamed from: g, reason: collision with root package name */
    public static final TwoWayConverter f2344g = new TwoWayConverterImpl(VectorConvertersKt$IntOffsetToVector$1.f2353a, VectorConvertersKt$IntOffsetToVector$2.f2354a);

    /* renamed from: h, reason: collision with root package name */
    public static final TwoWayConverter f2345h = new TwoWayConverterImpl(VectorConvertersKt$IntSizeToVector$1.f2355a, VectorConvertersKt$IntSizeToVector$2.f2356a);

    /* renamed from: i, reason: collision with root package name */
    public static final TwoWayConverter f2346i = new TwoWayConverterImpl(VectorConvertersKt$RectToVector$1.f2361a, VectorConvertersKt$RectToVector$2.f2362a);

    public static final TwoWayConverter a(l lVar, l lVar2) {
        return new TwoWayConverterImpl(lVar, lVar2);
    }
}
