package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import java.util.LinkedHashMap;
import q0.a;
import q0.p;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes3.dex */
public final class LazyLayoutItemContentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SaveableStateHolder f4776a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4777b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4778c = new LinkedHashMap();

    /* loaded from: classes3.dex */
    public final class CachedItemContent {

        /* renamed from: a, reason: collision with root package name */
        public final Object f4780a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f4781b;

        /* renamed from: c, reason: collision with root package name */
        public int f4782c;
        public p d;

        public CachedItemContent(int i2, Object obj, Object obj2) {
            this.f4780a = obj;
            this.f4781b = obj2;
            this.f4782c = i2;
        }
    }

    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, a aVar) {
        this.f4776a = saveableStateHolder;
        this.f4777b = aVar;
    }

    public final p a(int i2, Object obj, Object obj2) {
        ComposableLambdaImpl composableLambdaImpl;
        LinkedHashMap linkedHashMap = this.f4778c;
        CachedItemContent cachedItemContent = (CachedItemContent) linkedHashMap.get(obj);
        if (cachedItemContent != null && cachedItemContent.f4782c == i2 && p0.a.g(cachedItemContent.f4781b, obj2)) {
            p pVar = cachedItemContent.d;
            if (pVar != null) {
                return pVar;
            }
            LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1 lazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1 = new LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(LazyLayoutItemContentFactory.this, cachedItemContent);
            Object obj3 = ComposableLambdaKt.f14482a;
            composableLambdaImpl = new ComposableLambdaImpl(1403994769, lazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1, true);
            cachedItemContent.d = composableLambdaImpl;
        } else {
            CachedItemContent cachedItemContent2 = new CachedItemContent(i2, obj, obj2);
            linkedHashMap.put(obj, cachedItemContent2);
            p pVar2 = cachedItemContent2.d;
            if (pVar2 != null) {
                return pVar2;
            }
            LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1 lazyLayoutItemContentFactory$CachedItemContent$createContentLambda$12 = new LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(this, cachedItemContent2);
            Object obj4 = ComposableLambdaKt.f14482a;
            composableLambdaImpl = new ComposableLambdaImpl(1403994769, lazyLayoutItemContentFactory$CachedItemContent$createContentLambda$12, true);
            cachedItemContent2.d = composableLambdaImpl;
        }
        return composableLambdaImpl;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = (CachedItemContent) this.f4778c.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.f4781b;
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.f4777b.invoke();
        int b2 = lazyLayoutItemProvider.b(obj);
        if (b2 != -1) {
            return lazyLayoutItemProvider.d(b2);
        }
        return null;
    }
}
