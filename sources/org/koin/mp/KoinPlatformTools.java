package org.koin.mp;

import d0.i;
import e0.u;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.koin.core.context.GlobalContext;
import org.koin.core.context.KoinContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.logger.PrintLogger;
import p0.a;
import x0.c;
import z0.m;

/* loaded from: classes.dex */
public final class KoinPlatformTools {

    @NotNull
    public static final KoinPlatformTools INSTANCE = new KoinPlatformTools();

    private KoinPlatformTools() {
    }

    public static /* synthetic */ Logger defaultLogger$default(KoinPlatformTools koinPlatformTools, Level level, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            level = Level.INFO;
        }
        return koinPlatformTools.defaultLogger(level);
    }

    @NotNull
    public final KoinContext defaultContext() {
        return GlobalContext.INSTANCE;
    }

    @NotNull
    public final i defaultLazyMode() {
        return i.f30131a;
    }

    @NotNull
    public final Logger defaultLogger(@NotNull Level level) {
        a.s(level, "level");
        return new PrintLogger(level);
    }

    @NotNull
    public final String generateId() {
        String uuid = UUID.randomUUID().toString();
        a.r(uuid, "toString(...)");
        return uuid;
    }

    @NotNull
    public final String getClassName(@NotNull c cVar) {
        a.s(cVar, "kClass");
        return a.i0(cVar).getName();
    }

    @NotNull
    public final String getStackTrace(@NotNull Exception exc) {
        a.s(exc, "e");
        StringBuilder sb = new StringBuilder();
        sb.append(exc);
        sb.append(InstanceFactory.ERROR_SEPARATOR);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        a.r(stackTrace, "getStackTrace(...)");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            a.r(stackTraceElement.getClassName(), "getClassName(...)");
            if (!(!m.M0(r6, "sun.reflect", false))) {
                break;
            }
            arrayList.add(stackTraceElement);
        }
        sb.append(u.K0(arrayList, InstanceFactory.ERROR_SEPARATOR, null, null, null, 62));
        return sb.toString();
    }

    @NotNull
    public final <K, V> Map<K, V> safeHashMap() {
        return new ConcurrentHashMap();
    }

    /* renamed from: synchronized, reason: not valid java name */
    public final <R> R m818synchronized(@NotNull Object obj, @NotNull q0.a aVar) {
        R r2;
        a.s(obj, "lock");
        a.s(aVar, "block");
        synchronized (obj) {
            r2 = (R) aVar.invoke();
        }
        return r2;
    }
}
