package androidx.activity.result;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d extends c {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.b f598c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f599d;

    public /* synthetic */ d(Object obj, Serializable serializable, f.b bVar, int i10) {
        this.a = i10;
        this.f599d = obj;
        this.f597b = serializable;
        this.f598c = bVar;
    }

    @Override // androidx.activity.result.c
    public final void a(Object obj) {
        int i10 = this.a;
        f.b bVar = this.f598c;
        Object obj2 = this.f599d;
        Serializable serializable = this.f597b;
        switch (i10) {
            case 0:
                g gVar = (g) obj2;
                String str = (String) serializable;
                Integer num = (Integer) gVar.f602b.get(str);
                if (num != null) {
                    gVar.f604d.add(str);
                    try {
                        ((g) obj2).b(num.intValue(), bVar, obj);
                        return;
                    } catch (Exception e2) {
                        gVar.f604d.remove(str);
                        throw e2;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            case 1:
                g gVar2 = (g) obj2;
                String str2 = (String) serializable;
                Integer num2 = (Integer) gVar2.f602b.get(str2);
                if (num2 != null) {
                    gVar2.f604d.add(str2);
                    try {
                        ((g) obj2).b(num2.intValue(), bVar, obj);
                        return;
                    } catch (Exception e10) {
                        gVar2.f604d.remove(str2);
                        throw e10;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                c cVar = (c) ((AtomicReference) serializable).get();
                if (cVar != null) {
                    cVar.a(obj);
                    return;
                }
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
    }

    @Override // androidx.activity.result.c
    public final void b() {
        int i10 = this.a;
        Object obj = this.f599d;
        Serializable serializable = this.f597b;
        switch (i10) {
            case 0:
                ((g) obj).f((String) serializable);
                return;
            case 1:
                ((g) obj).f((String) serializable);
                return;
            default:
                c cVar = (c) ((AtomicReference) serializable).getAndSet(null);
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
