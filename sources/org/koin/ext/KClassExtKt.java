package org.koin.ext;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.koin.mp.KoinPlatformTools;
import p0.a;
import x0.c;

/* loaded from: classes4.dex */
public final class KClassExtKt {

    @NotNull
    private static final Map<c, String> classNames = KoinPlatformTools.INSTANCE.safeHashMap();

    @NotNull
    public static final String getFullName(@NotNull c cVar) {
        a.s(cVar, "<this>");
        String str = classNames.get(cVar);
        return str == null ? saveCache(cVar) : str;
    }

    @NotNull
    public static final String saveCache(@NotNull c cVar) {
        a.s(cVar, "<this>");
        String className = KoinPlatformTools.INSTANCE.getClassName(cVar);
        classNames.put(cVar, className);
        return className;
    }
}
