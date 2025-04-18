package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.work.impl.WorkDatabase;

@RestrictTo
/* loaded from: classes.dex */
public class PreferenceUtils {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f22195a;

    /* renamed from: androidx.work.impl.utils.PreferenceUtils$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 implements Function<Long, Long> {
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            Long l2 = (Long) obj;
            return Long.valueOf(l2 != null ? l2.longValue() : 0L);
        }
    }

    public PreferenceUtils(WorkDatabase workDatabase) {
        this.f22195a = workDatabase;
    }
}
