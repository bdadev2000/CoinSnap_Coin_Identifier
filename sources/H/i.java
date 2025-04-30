package h;

import G7.w;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.EnumC0504n;
import androidx.lifecycle.InterfaceC0509t;
import androidx.lifecycle.InterfaceC0511v;
import com.mbridge.msdk.foundation.entity.o;
import i.AbstractC2330a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f20560a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f20561c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f20562d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f20563e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f20564f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f20565g = new Bundle();

    public final boolean a(int i9, int i10, Intent intent) {
        b bVar;
        String str = (String) this.f20560a.get(Integer.valueOf(i9));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f20563e.get(str);
        if (eVar != null) {
            bVar = eVar.f20555a;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            ArrayList arrayList = this.f20562d;
            if (arrayList.contains(str)) {
                eVar.f20555a.b(eVar.b.c(i10, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f20564f.remove(str);
        this.f20565g.putParcelable(str, new C2310a(i10, intent));
        return true;
    }

    public abstract void b(int i9, AbstractC2330a abstractC2330a, Object obj);

    public final h c(final String str, InterfaceC0511v interfaceC0511v, final AbstractC2330a abstractC2330a, final b bVar) {
        boolean z8;
        G7.j.e(str, "key");
        G7.j.e(interfaceC0511v, "lifecycleOwner");
        G7.j.e(abstractC2330a, "contract");
        G7.j.e(bVar, "callback");
        AbstractC0505o lifecycle = interfaceC0511v.getLifecycle();
        C0513x c0513x = (C0513x) lifecycle;
        if (c0513x.f4904d.compareTo(EnumC0504n.f4894f) >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            e(str);
            LinkedHashMap linkedHashMap = this.f20561c;
            f fVar = (f) linkedHashMap.get(str);
            if (fVar == null) {
                fVar = new f(lifecycle);
            }
            InterfaceC0509t interfaceC0509t = new InterfaceC0509t() { // from class: h.d
                @Override // androidx.lifecycle.InterfaceC0509t
                public final void b(InterfaceC0511v interfaceC0511v2, EnumC0503m enumC0503m) {
                    i iVar = i.this;
                    G7.j.e(iVar, "this$0");
                    String str2 = str;
                    G7.j.e(str2, "$key");
                    b bVar2 = bVar;
                    G7.j.e(bVar2, "$callback");
                    AbstractC2330a abstractC2330a2 = abstractC2330a;
                    G7.j.e(abstractC2330a2, "$contract");
                    EnumC0503m enumC0503m2 = EnumC0503m.ON_START;
                    LinkedHashMap linkedHashMap2 = iVar.f20563e;
                    if (enumC0503m2 == enumC0503m) {
                        linkedHashMap2.put(str2, new e(abstractC2330a2, bVar2));
                        LinkedHashMap linkedHashMap3 = iVar.f20564f;
                        if (linkedHashMap3.containsKey(str2)) {
                            Object obj = linkedHashMap3.get(str2);
                            linkedHashMap3.remove(str2);
                            bVar2.b(obj);
                        }
                        Bundle bundle = iVar.f20565g;
                        C2310a c2310a = (C2310a) e1.f.m(bundle, str2);
                        if (c2310a != null) {
                            bundle.remove(str2);
                            bVar2.b(abstractC2330a2.c(c2310a.b, c2310a.f20551c));
                            return;
                        }
                        return;
                    }
                    if (EnumC0503m.ON_STOP == enumC0503m) {
                        linkedHashMap2.remove(str2);
                    } else if (EnumC0503m.ON_DESTROY == enumC0503m) {
                        iVar.f(str2);
                    }
                }
            };
            fVar.f20556a.a(interfaceC0509t);
            fVar.b.add(interfaceC0509t);
            linkedHashMap.put(str, fVar);
            return new h(this, str, abstractC2330a, 0);
        }
        throw new IllegalStateException(("LifecycleOwner " + interfaceC0511v + " is attempting to register while current state is " + c0513x.f4904d + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    public final h d(String str, AbstractC2330a abstractC2330a, b bVar) {
        G7.j.e(str, "key");
        e(str);
        this.f20563e.put(str, new e(abstractC2330a, bVar));
        LinkedHashMap linkedHashMap = this.f20564f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bVar.b(obj);
        }
        Bundle bundle = this.f20565g;
        C2310a c2310a = (C2310a) e1.f.m(bundle, str);
        if (c2310a != null) {
            bundle.remove(str);
            bVar.b(abstractC2330a.c(c2310a.b, c2310a.f20551c));
        }
        return new h(this, str, abstractC2330a, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = new N7.a(new N7.e(new w())).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int intValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f20560a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                int intValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue2), str);
                linkedHashMap.put(str, Integer.valueOf(intValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        G7.j.e(str, "key");
        if (!this.f20562d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.f20560a.remove(num);
        }
        this.f20563e.remove(str);
        LinkedHashMap linkedHashMap = this.f20564f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder n2 = o.n("Dropping pending result for request ", str, ": ");
            n2.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", n2.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f20565g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C2310a) e1.f.m(bundle, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f20561c;
        f fVar = (f) linkedHashMap2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.f20556a.b((InterfaceC0509t) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
