package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f1813f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final LinkedHashMap a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1814b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1815c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1816d;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f1817e;

    public q0(HashMap initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.f1814b = new LinkedHashMap();
        this.f1815c = new LinkedHashMap();
        this.f1816d = new LinkedHashMap();
        this.f1817e = new p0(this, 0);
        linkedHashMap.putAll(initialState);
    }

    public static Bundle a(q0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = MapsKt.toMap(this$0.f1814b).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this$0.a;
            boolean z10 = true;
            e0 e0Var = null;
            if (hasNext) {
                Map.Entry entry = (Map.Entry) it.next();
                String key = (String) entry.getKey();
                Bundle a = ((y1.c) entry.getValue()).a();
                Intrinsics.checkNotNullParameter(key, "key");
                if (a != null) {
                    Class[] clsArr = f1813f;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 29) {
                            Class cls = clsArr[i10];
                            Intrinsics.checkNotNull(cls);
                            if (cls.isInstance(a)) {
                                break;
                            }
                            i10++;
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                }
                if (z10) {
                    Object obj = this$0.f1815c.get(key);
                    if (obj instanceof e0) {
                        e0Var = (e0) obj;
                    }
                    if (e0Var != null) {
                        e0Var.setValue(a);
                    } else {
                        linkedHashMap.put(key, a);
                    }
                    MutableStateFlow mutableStateFlow = (MutableStateFlow) this$0.f1816d.get(key);
                    if (mutableStateFlow != null) {
                        mutableStateFlow.setValue(a);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Can't put value with type ");
                    Intrinsics.checkNotNull(a);
                    sb2.append(a.getClass());
                    sb2.append(" into saved state");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                Pair[] pairArr = {TuplesKt.to("keys", arrayList), TuplesKt.to("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                for (int i11 = 0; i11 < 2; i11++) {
                    Pair pair = pairArr[i11];
                    String str2 = (String) pair.component1();
                    Object component2 = pair.component2();
                    if (component2 == null) {
                        bundle.putString(str2, null);
                    } else if (component2 instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) component2).booleanValue());
                    } else if (component2 instanceof Byte) {
                        bundle.putByte(str2, ((Number) component2).byteValue());
                    } else if (component2 instanceof Character) {
                        bundle.putChar(str2, ((Character) component2).charValue());
                    } else if (component2 instanceof Double) {
                        bundle.putDouble(str2, ((Number) component2).doubleValue());
                    } else if (component2 instanceof Float) {
                        bundle.putFloat(str2, ((Number) component2).floatValue());
                    } else if (component2 instanceof Integer) {
                        bundle.putInt(str2, ((Number) component2).intValue());
                    } else if (component2 instanceof Long) {
                        bundle.putLong(str2, ((Number) component2).longValue());
                    } else if (component2 instanceof Short) {
                        bundle.putShort(str2, ((Number) component2).shortValue());
                    } else if (component2 instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) component2);
                    } else if (component2 instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) component2);
                    } else if (component2 instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) component2);
                    } else if (component2 instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) component2);
                    } else if (component2 instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) component2);
                    } else if (component2 instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) component2);
                    } else if (component2 instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) component2);
                    } else if (component2 instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) component2);
                    } else if (component2 instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) component2);
                    } else if (component2 instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) component2);
                    } else if (component2 instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) component2);
                    } else if (component2 instanceof Object[]) {
                        Class<?> componentType = component2.getClass().getComponentType();
                        Intrinsics.checkNotNull(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Intrinsics.checkNotNull(component2, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                            bundle.putParcelableArray(str2, (Parcelable[]) component2);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            Intrinsics.checkNotNull(component2, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                            bundle.putStringArray(str2, (String[]) component2);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            Intrinsics.checkNotNull(component2, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                            bundle.putCharSequenceArray(str2, (CharSequence[]) component2);
                        } else if (Serializable.class.isAssignableFrom(componentType)) {
                            bundle.putSerializable(str2, (Serializable) component2);
                        } else {
                            throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                    } else if (component2 instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) component2);
                    } else if (component2 instanceof IBinder) {
                        bundle.putBinder(str2, (IBinder) component2);
                    } else if (component2 instanceof Size) {
                        j0.c.a(bundle, str2, (Size) component2);
                    } else if (component2 instanceof SizeF) {
                        j0.c.b(bundle, str2, (SizeF) component2);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + component2.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                    }
                }
                return bundle;
            }
        }
    }

    public q0() {
        this.a = new LinkedHashMap();
        this.f1814b = new LinkedHashMap();
        this.f1815c = new LinkedHashMap();
        this.f1816d = new LinkedHashMap();
        this.f1817e = new p0(this, 1);
    }
}
