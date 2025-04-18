package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d0.k;
import e0.e0;
import e1.i1;
import e1.m0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class SavedStateHandle {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f20090f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f20091a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f20092b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f20093c;
    public final LinkedHashMap d;
    public final d e;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static SavedStateHandle a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    p0.a.r(str, SDKConstants.PARAM_KEY);
                    hashMap.put(str, bundle2.get(str));
                }
                return new SavedStateHandle(hashMap);
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            p0.a.p(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(UserMetadata.KEYDATA_FILENAME);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = parcelableArrayList.get(i2);
                p0.a.q(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i2));
            }
            return new SavedStateHandle(linkedHashMap);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public final void h(Object obj) {
            super.h(obj);
        }
    }

    public SavedStateHandle(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f20091a = linkedHashMap;
        this.f20092b = new LinkedHashMap();
        this.f20093c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new d(this, 0);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(SavedStateHandle savedStateHandle) {
        p0.a.s(savedStateHandle, "this$0");
        for (Map.Entry entry : e0.x(savedStateHandle.f20092b).entrySet()) {
            savedStateHandle.c(((SavedStateRegistry.SavedStateProvider) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = savedStateHandle.f20091a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return BundleKt.a(new k(UserMetadata.KEYDATA_FILENAME, arrayList), new k("values", arrayList2));
    }

    public final Object b(String str) {
        LinkedHashMap linkedHashMap = this.f20091a;
        try {
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            this.d.remove(str);
            return null;
        }
    }

    public final void c(Object obj, String str) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        if (obj != null) {
            Class[] clsArr = f20090f;
            for (int i2 = 0; i2 < 29; i2++) {
                Class cls = clsArr[i2];
                p0.a.p(cls);
                if (!cls.isInstance(obj)) {
                }
            }
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            p0.a.p(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f20093c.get(str);
        MutableLiveData mutableLiveData = obj2 instanceof MutableLiveData ? (MutableLiveData) obj2 : null;
        if (mutableLiveData != null) {
            mutableLiveData.h(obj);
        } else {
            this.f20091a.put(str, obj);
        }
        m0 m0Var = (m0) this.d.get(str);
        if (m0Var == null) {
            return;
        }
        ((i1) m0Var).h(obj);
    }

    public SavedStateHandle() {
        this.f20091a = new LinkedHashMap();
        this.f20092b = new LinkedHashMap();
        this.f20093c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new d(this, 1);
    }
}
