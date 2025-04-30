package h;

import i.AbstractC2330a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20557a;
    public final /* synthetic */ i b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20558c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2330a f20559d;

    public /* synthetic */ h(i iVar, String str, AbstractC2330a abstractC2330a, int i9) {
        this.f20557a = i9;
        this.b = iVar;
        this.f20558c = str;
        this.f20559d = abstractC2330a;
    }

    @Override // h.c
    public final void a(Object obj) {
        switch (this.f20557a) {
            case 0:
                i iVar = this.b;
                LinkedHashMap linkedHashMap = iVar.b;
                String str = this.f20558c;
                Object obj2 = linkedHashMap.get(str);
                AbstractC2330a abstractC2330a = this.f20559d;
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    ArrayList arrayList = iVar.f20562d;
                    arrayList.add(str);
                    try {
                        iVar.b(intValue, abstractC2330a, obj);
                        return;
                    } catch (Exception e4) {
                        arrayList.remove(str);
                        throw e4;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC2330a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            default:
                i iVar2 = this.b;
                LinkedHashMap linkedHashMap2 = iVar2.b;
                String str2 = this.f20558c;
                Object obj3 = linkedHashMap2.get(str2);
                AbstractC2330a abstractC2330a2 = this.f20559d;
                if (obj3 != null) {
                    int intValue2 = ((Number) obj3).intValue();
                    ArrayList arrayList2 = iVar2.f20562d;
                    arrayList2.add(str2);
                    try {
                        iVar2.b(intValue2, abstractC2330a2, obj);
                        return;
                    } catch (Exception e9) {
                        arrayList2.remove(str2);
                        throw e9;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC2330a2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
    }

    @Override // h.c
    public final void b() {
        switch (this.f20557a) {
            case 0:
                this.b.f(this.f20558c);
                return;
            default:
                this.b.f(this.f20558c);
                return;
        }
    }
}
