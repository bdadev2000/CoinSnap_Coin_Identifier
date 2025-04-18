package org.koin.core.instance;

import com.facebook.internal.NativeProtocol;
import d0.b0;
import e0.q;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;
import org.koin.core.annotation.KoinReflectAPI;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.logger.Level;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;
import org.koin.mp.KoinPlatformTimeTools;
import p0.a;
import x0.c;

/* loaded from: classes4.dex */
public final class InstanceBuilderKt {
    private static final Object createInstance(Object[] objArr, Constructor<? extends Object> constructor) {
        Object newInstance = objArr.length == 0 ? constructor.newInstance(new Object[0]) : constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        a.p(newInstance);
        return newInstance;
    }

    private static final Object[] getArguments(Constructor<?> constructor, Scope scope, ParametersHolder parametersHolder) {
        int length = constructor.getParameterTypes().length;
        if (length == 0) {
            return new Object[0];
        }
        Object[] objArr = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            objArr[i2] = b0.f30125a;
        }
        for (int i3 = 0; i3 < length; i3++) {
            Class<?> cls = constructor.getParameterTypes()[i3];
            a.p(cls);
            j a2 = g0.a(cls);
            Object orNull = scope.getOrNull(a2, null, new InstanceBuilderKt$getArguments$1(parametersHolder));
            if (orNull == null && (orNull = parametersHolder.getOrNull(a2)) == null) {
                throw new NoBeanDefFoundException("No definition found for class '" + a2 + '\'');
            }
            objArr[i3] = orNull;
        }
        return objArr;
    }

    @d0.a
    @KoinReflectAPI
    public static final <T> T newInstance(Scope scope, ParametersHolder parametersHolder) {
        okio.a.b(scope, "<this>", parametersHolder, "defParams");
        throw null;
    }

    public static Object newInstance$default(Scope scope, ParametersHolder parametersHolder, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            parametersHolder = ParametersHolderKt.emptyParametersHolder();
        }
        okio.a.b(scope, "<this>", parametersHolder, "defParams");
        throw null;
    }

    @d0.a
    @NotNull
    @KoinReflectAPI
    public static final <T> T newInstance(@NotNull Scope scope, @NotNull c cVar, @NotNull ParametersHolder parametersHolder) {
        Object[] arguments;
        T t2;
        a.s(scope, "<this>");
        a.s(cVar, "kClass");
        a.s(parametersHolder, NativeProtocol.WEB_DIALOG_PARAMS);
        Level level = scope.getLogger().getLevel();
        Level level2 = Level.DEBUG;
        if (level == level2) {
            scope.getLogger().debug("|- creating new instance - " + KClassExtKt.getFullName(cVar));
        }
        Constructor<?>[] constructors = a.i0(cVar).getConstructors();
        a.r(constructors, "getConstructors(...)");
        Constructor constructor = (Constructor) q.b0(constructors);
        if (constructor != null) {
            if (scope.getLogger().getLevel() == level2) {
                long timeInNanoSeconds = KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds();
                arguments = getArguments(constructor, scope, parametersHolder);
                double doubleValue = Double.valueOf(Double.valueOf((r10.getTimeInNanoSeconds() - timeInNanoSeconds) / 1000000.0d).doubleValue()).doubleValue();
                scope.getLogger().debug("|- got arguments in " + doubleValue + " ms");
            } else {
                arguments = getArguments(constructor, scope, parametersHolder);
            }
            if (scope.getLogger().getLevel() == level2) {
                long timeInNanoSeconds2 = KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds();
                t2 = (T) createInstance(arguments, constructor);
                double doubleValue2 = Double.valueOf(Double.valueOf((r10.getTimeInNanoSeconds() - timeInNanoSeconds2) / 1000000.0d).doubleValue()).doubleValue();
                scope.getLogger().debug("|- created instance in " + doubleValue2 + " ms");
            } else {
                t2 = (T) createInstance(arguments, constructor);
            }
            a.q(t2, "null cannot be cast to non-null type T of org.koin.core.instance.InstanceBuilderKt.newInstance");
            return t2;
        }
        throw new IllegalStateException(("No constructor found for class '" + KClassExtKt.getFullName(cVar) + '\'').toString());
    }
}
