package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.SynchronizedObject;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TypefaceRequestCache f17291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypefaceRequest f17292b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceRequestCache$runCached$currentTypefaceResult$1(TypefaceRequestCache typefaceRequestCache, TypefaceRequest typefaceRequest) {
        super(1);
        this.f17291a = typefaceRequestCache;
        this.f17292b = typefaceRequest;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TypefaceResult typefaceResult = (TypefaceResult) obj;
        TypefaceRequestCache typefaceRequestCache = this.f17291a;
        SynchronizedObject synchronizedObject = typefaceRequestCache.f17289a;
        TypefaceRequest typefaceRequest = this.f17292b;
        synchronized (synchronizedObject) {
            try {
                if (typefaceResult.h()) {
                    typefaceRequestCache.f17290b.b(typefaceRequest, typefaceResult);
                } else {
                    typefaceRequestCache.f17290b.c(typefaceRequest);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b0.f30125a;
    }
}
