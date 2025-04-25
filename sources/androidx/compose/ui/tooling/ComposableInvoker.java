package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.tooling.PreviewLogger;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.adjust.sdk.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ComposableInvoker.jvm.kt */
@Deprecated(message = "Use androidx.compose.runtime.reflect.ComposableMethodInvoker instead")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u0002¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J=\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0019J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\t\"\u0006\b\u0000\u0010\u001b\u0018\u0001*\u0002H\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0082\b¢\u0006\u0002\u0010\u001dJ;\u0010\u001e\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u001f0\t2\u0006\u0010\u0015\u001a\u00020\u00142\u001a\u0010\u0018\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0002\u0010 J7\u0010!\u001a\u0004\u0018\u00010\u001f*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\nH\u0002J=\u0010%\u001a\u0004\u0018\u00010\u0001*\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/compose/ui/tooling/ComposableInvoker;", "", "()V", "BITS_PER_INT", "", "SLOTS_PER_INT", "areParameterTypesCompatible", "", "composableMethodTypes", "", "Ljava/lang/Class;", "previewParameterTypes", "([Ljava/lang/Class;[Ljava/lang/Class;)Z", "changedParamCount", "realValueParams", "thisParams", "defaultParamCount", "invokeComposable", "", "className", "", "methodName", "composer", "Landroidx/compose/runtime/Composer;", "args", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)V", "dup", ExifInterface.GPS_DIRECTION_TRUE, "count", "(Ljava/lang/Object;I)[Ljava/lang/Object;", "findCompatibleComposeMethod", "Ljava/lang/reflect/Method;", "([Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "findComposableMethod", "previewParamArgs", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;", "getDefaultValue", "invokeComposableMethod", "instance", "(Ljava/lang/reflect/Method;Ljava/lang/Object;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)Ljava/lang/Object;", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class ComposableInvoker {
    public static final int $stable = 0;
    private static final int BITS_PER_INT = 31;
    public static final ComposableInvoker INSTANCE = new ComposableInvoker();
    private static final int SLOTS_PER_INT = 10;

    private ComposableInvoker() {
    }

    private final boolean areParameterTypesCompatible(Class<?>[] composableMethodTypes, Class<?>[] previewParameterTypes) {
        if (composableMethodTypes.length != previewParameterTypes.length) {
            return false;
        }
        ArrayList arrayList = new ArrayList(composableMethodTypes.length);
        int length = composableMethodTypes.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            Class<?> cls = composableMethodTypes[i];
            int i3 = i2 + 1;
            Class<?> cls2 = previewParameterTypes[i2];
            if (!Intrinsics.areEqual(JvmClassMappingKt.getKotlinClass(cls), JvmClassMappingKt.getKotlinClass(cls2)) && !cls.isAssignableFrom(cls2)) {
                z = false;
            }
            arrayList.add(Boolean.valueOf(z));
            i++;
            i2 = i3;
        }
        ArrayList arrayList2 = arrayList;
        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <T> T[] dup(T t, int i) {
        IntRange until = RangesKt.until(0, i);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(t);
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return (T[]) arrayList.toArray(new Object[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.valueOf(0.0d);
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return 0;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return (byte) 0;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return (char) 0;
                    }
                    break;
                case 3327612:
                    if (name.equals(Constants.LONG)) {
                        return 0L;
                    }
                    break;
                case 64711720:
                    if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                        return false;
                    }
                    break;
                case 97526364:
                    if (name.equals(TypedValues.Custom.S_FLOAT)) {
                        return Float.valueOf(0.0f);
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return (short) 0;
                    }
                    break;
            }
        }
        return null;
    }

    private final Object invokeComposableMethod(Method method, Object obj, Composer composer, Object... objArr) {
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (Intrinsics.areEqual(parameterTypes[length], Composer.class)) {
                    i = length;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        int i3 = i + 1;
        int changedParamCount = changedParamCount(i, obj != null ? 1 : 0) + i3;
        int length2 = method.getParameterTypes().length;
        if ((length2 != changedParamCount ? defaultParamCount(i) : 0) + changedParamCount != length2) {
            throw new IllegalStateException("params don't add up to total params".toString());
        }
        Object[] objArr2 = new Object[length2];
        int i4 = 0;
        while (i4 < length2) {
            if (i4 >= 0 && i4 < i) {
                obj2 = (i4 < 0 || i4 > ArraysKt.getLastIndex(objArr)) ? INSTANCE.getDefaultValue(method.getParameterTypes()[i4]) : objArr[i4];
            } else if (i4 == i) {
                obj2 = composer;
            } else if (i3 <= i4 && i4 < changedParamCount) {
                obj2 = 0;
            } else {
                if (changedParamCount > i4 || i4 >= length2) {
                    throw new IllegalStateException("Unexpected index".toString());
                }
                obj2 = 2097151;
            }
            objArr2[i4] = obj2;
            i4++;
        }
        return method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    private final int changedParamCount(int realValueParams, int thisParams) {
        if (realValueParams == 0) {
            return 1;
        }
        return (int) Math.ceil((realValueParams + thisParams) / 10.0d);
    }

    private final int defaultParamCount(int realValueParams) {
        return (int) Math.ceil(realValueParams / 31.0d);
    }

    public final void invokeComposable(String className, String methodName, Composer composer, Object... args) {
        try {
            Class<?> cls = Class.forName(className);
            Method findComposableMethod = findComposableMethod(cls, methodName, Arrays.copyOf(args, args.length));
            if (findComposableMethod == null) {
                throw new NoSuchMethodException("Composable " + className + '.' + methodName + " not found");
            }
            findComposableMethod.setAccessible(true);
            if (Modifier.isStatic(findComposableMethod.getModifiers())) {
                invokeComposableMethod(findComposableMethod, null, composer, Arrays.copyOf(args, args.length));
            } else {
                invokeComposableMethod(findComposableMethod, cls.getConstructor(new Class[0]).newInstance(new Object[0]), composer, Arrays.copyOf(args, args.length));
            }
        } catch (Exception e) {
            PreviewLogger.Companion.logWarning$ui_tooling_release$default(PreviewLogger.INSTANCE, "Failed to invoke Composable Method '" + className + '.' + methodName + '\'', null, 2, null);
            throw e;
        }
    }

    private final Method findCompatibleComposeMethod(Method[] methodArr, String str, Class<?>... clsArr) {
        Method method;
        int length = methodArr.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methodArr[i];
            if ((Intrinsics.areEqual(str, method2.getName()) || StringsKt.startsWith$default(method2.getName(), str + '-', false, 2, (Object) null)) && INSTANCE.areParameterTypesCompatible(method2.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                method = method2;
                break;
            }
            i++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str + " not found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Method findComposableMethod(Class<?> cls, String str, Object... objArr) {
        Class<?> cls2;
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int changedParamCount = changedParamCount(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                IntRange until = RangesKt.until(0, changedParamCount);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
                Iterator<Integer> it = until.iterator();
                while (it.hasNext()) {
                    ((IntIterator) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                spreadBuilder.addSpread(clsArr);
                spreadBuilder.add(Composer.class);
                spreadBuilder.addSpread(clsArr2);
                return findCompatibleComposeMethod(declaredMethods, str, (Class[]) spreadBuilder.toArray(new Class[spreadBuilder.size()]));
            } catch (ReflectiveOperationException unused) {
                for (Method method : cls.getDeclaredMethods()) {
                    if (Intrinsics.areEqual(method.getName(), str) || StringsKt.startsWith$default(method.getName(), str + '-', false, 2, (Object) null)) {
                        cls2 = method;
                        break;
                    }
                }
                return cls2;
            }
        } catch (ReflectiveOperationException unused2) {
            return cls2;
        }
    }
}
