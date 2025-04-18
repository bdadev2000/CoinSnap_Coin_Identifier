package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;

/* loaded from: classes2.dex */
public interface CompositionLocalMap {
    public static final Companion e8 = Companion.f13770a;

    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f13770a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public static final PersistentCompositionLocalHashMap f13771b = PersistentCompositionLocalHashMap.d;
    }

    Object b(ProvidableCompositionLocal providableCompositionLocal);
}
