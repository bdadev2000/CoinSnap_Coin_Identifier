package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.transition.FragmentTransitionSupport;
import e0.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class FragmentTransition {

    /* renamed from: a, reason: collision with root package name */
    public static final FragmentTransitionImpl f19828a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FragmentTransitionImpl f19829b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.FragmentTransitionImpl, java.lang.Object] */
    static {
        FragmentTransitionImpl fragmentTransitionImpl;
        try {
            fragmentTransitionImpl = (FragmentTransitionImpl) FragmentTransitionSupport.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            fragmentTransitionImpl = null;
        }
        f19829b = fragmentTransitionImpl;
    }

    public static final void a(Fragment fragment, Fragment fragment2, boolean z2, ArrayMap arrayMap) {
        p0.a.s(fragment, "inFragment");
        p0.a.s(fragment2, "outFragment");
        if ((z2 ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(arrayMap.size());
            Iterator it = arrayMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(arrayMap.size());
            Iterator it2 = arrayMap.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String b(ArrayMap arrayMap, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (p0.a.g(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
        }
        return (String) u.F0(arrayList);
    }

    public static final void c(int i2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i2);
        }
    }
}
