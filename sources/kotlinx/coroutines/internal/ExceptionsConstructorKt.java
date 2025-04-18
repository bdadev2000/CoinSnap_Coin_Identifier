package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CopyableThrowable;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007\"\b\b\u0000\u0010\b*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0002\u001a.\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a!\u0010\r\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00062\u0006\u0010\u000e\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u0082\u0010\u001a\u0018\u0010\u0012\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0014\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¨\u0006\u0015"}, d2 = {"ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "throwableFields", "", "createConstructor", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "E", "clz", "Ljava/lang/Class;", "safeCtor", "block", "tryCopyException", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1#2:117\n11335#3:118\n11670#3,3:119\n12904#3,3:136\n1963#4,14:122\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n45#1:118\n45#1:119,3\n82#1:136,3\n63#1:122,14\n*E\n"})
/* loaded from: classes3.dex */
public final class ExceptionsConstructorKt {
    private static final CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(Throwable.class, -1);

    static {
        CtorCache ctorCache2;
        try {
            if (FastServiceLoaderKt.getANDROID_DETECTED()) {
                ctorCache2 = WeakMapCtorCache.INSTANCE;
            } else {
                ctorCache2 = ClassValueCtorCache.INSTANCE;
            }
        } catch (Throwable unused) {
            ctorCache2 = WeakMapCtorCache.INSTANCE;
        }
        ctorCache = ctorCache2;
    }

    public static final /* synthetic */ Function1 access$createConstructor(Class cls) {
        return createConstructor(cls);
    }

    public static final <E extends Throwable> Function1<Throwable, Throwable> createConstructor(Class<E> cls) {
        Object obj;
        Function1<Throwable, Throwable> function1;
        Pair pair;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Throwable th2) {
                return null;
            }
        };
        if (throwableFields != fieldsCountOrDefault(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i10 = 0;
        while (true) {
            obj = null;
            if (i10 >= length) {
                break;
            }
            final Constructor<?> constructor = constructors[i10];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 != 0) {
                if (length2 != 1) {
                    if (length2 != 2) {
                        pair = TuplesKt.to(null, -1);
                    } else if (Intrinsics.areEqual(parameterTypes[0], String.class) && Intrinsics.areEqual(parameterTypes[1], Throwable.class)) {
                        pair = TuplesKt.to(safeCtor(new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Throwable invoke(Throwable th2) {
                                Object newInstance = constructor.newInstance(th2.getMessage(), th2);
                                Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                return (Throwable) newInstance;
                            }
                        }), 3);
                    } else {
                        pair = TuplesKt.to(null, -1);
                    }
                } else {
                    Class<?> cls2 = parameterTypes[0];
                    if (Intrinsics.areEqual(cls2, String.class)) {
                        pair = TuplesKt.to(safeCtor(new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Throwable invoke(Throwable th2) {
                                Object newInstance = constructor.newInstance(th2.getMessage());
                                Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                Throwable th3 = (Throwable) newInstance;
                                th3.initCause(th2);
                                return th3;
                            }
                        }), 2);
                    } else if (Intrinsics.areEqual(cls2, Throwable.class)) {
                        pair = TuplesKt.to(safeCtor(new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Throwable invoke(Throwable th2) {
                                Object newInstance = constructor.newInstance(th2);
                                Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                return (Throwable) newInstance;
                            }
                        }), 1);
                    } else {
                        pair = TuplesKt.to(null, -1);
                    }
                }
            } else {
                pair = TuplesKt.to(safeCtor(new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Throwable invoke(Throwable th2) {
                        Object newInstance = constructor.newInstance(new Object[0]);
                        Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        Throwable th3 = (Throwable) newInstance;
                        th3.initCause(th2);
                        return th3;
                    }
                }), 0);
            }
            arrayList.add(pair);
            i10++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Pair) obj).getSecond()).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((Pair) next).getSecond()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        Pair pair2 = (Pair) obj;
        if (pair2 != null && (function1 = (Function1) pair2.getFirst()) != null) {
            return function1;
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    private static final int fieldsCount(Class<?> cls, int i10) {
        do {
            int length = cls.getDeclaredFields().length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (!Modifier.isStatic(r0[i12].getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i10;
    }

    public static /* synthetic */ int fieldsCount$default(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return fieldsCount(cls, i10);
    }

    private static final int fieldsCountOrDefault(Class<?> cls, int i10) {
        Object m145constructorimpl;
        JvmClassMappingKt.getKotlinClass(cls);
        try {
            Result.Companion companion = Result.INSTANCE;
            m145constructorimpl = Result.m145constructorimpl(Integer.valueOf(fieldsCount$default(cls, 0, 1, null)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m145constructorimpl = Result.m145constructorimpl(ResultKt.createFailure(th2));
        }
        Integer valueOf = Integer.valueOf(i10);
        if (Result.m151isFailureimpl(m145constructorimpl)) {
            m145constructorimpl = valueOf;
        }
        return ((Number) m145constructorimpl).intValue();
    }

    private static final Function1<Throwable, Throwable> safeCtor(final Function1<? super Throwable, ? extends Throwable> function1) {
        return new Function1<Throwable, Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Throwable invoke(Throwable th2) {
                Object m145constructorimpl;
                Function1<Throwable, Throwable> function12 = function1;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Throwable invoke = function12.invoke(th2);
                    if (!Intrinsics.areEqual(th2.getMessage(), invoke.getMessage()) && !Intrinsics.areEqual(invoke.getMessage(), th2.toString())) {
                        invoke = null;
                    }
                    m145constructorimpl = Result.m145constructorimpl(invoke);
                } catch (Throwable th3) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m145constructorimpl = Result.m145constructorimpl(ResultKt.createFailure(th3));
                }
                return (Throwable) (Result.m151isFailureimpl(m145constructorimpl) ? null : m145constructorimpl);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E tryCopyException(E e2) {
        Object m145constructorimpl;
        if (e2 instanceof CopyableThrowable) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m145constructorimpl = Result.m145constructorimpl(((CopyableThrowable) e2).createCopy());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m145constructorimpl = Result.m145constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m151isFailureimpl(m145constructorimpl)) {
                m145constructorimpl = null;
            }
            return (E) m145constructorimpl;
        }
        return (E) ctorCache.get(e2.getClass()).invoke(e2);
    }
}
