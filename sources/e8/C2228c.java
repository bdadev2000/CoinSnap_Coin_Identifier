package e8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: e8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2228c extends r {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final L f20156c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2228c(a8.b bVar, int i9) {
        super(bVar);
        this.b = i9;
        switch (i9) {
            case 1:
                G7.j.e(bVar, "eSerializer");
                super(bVar);
                c8.g descriptor = bVar.getDescriptor();
                G7.j.e(descriptor, "elementDesc");
                this.f20156c = new C2227b(descriptor, 2);
                return;
            case 2:
                G7.j.e(bVar, "eSerializer");
                super(bVar);
                c8.g descriptor2 = bVar.getDescriptor();
                G7.j.e(descriptor2, "elementDesc");
                this.f20156c = new C2227b(descriptor2, 3);
                return;
            default:
                G7.j.e(bVar, "element");
                c8.g descriptor3 = bVar.getDescriptor();
                G7.j.e(descriptor3, "elementDesc");
                this.f20156c = new C2227b(descriptor3, 1);
                return;
        }
    }

    @Override // e8.AbstractC2226a
    public final Object a() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // e8.AbstractC2226a
    public final int b(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                G7.j.e(arrayList, "<this>");
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                G7.j.e(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                G7.j.e(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // e8.AbstractC2226a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        G7.j.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // e8.AbstractC2226a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        G7.j.e(collection, "<this>");
        return collection.size();
    }

    @Override // e8.AbstractC2226a
    public final Object g(Object obj) {
        switch (this.b) {
            case 0:
                G7.j.e(null, "<this>");
                return new ArrayList((Collection) null);
            case 1:
                G7.j.e(null, "<this>");
                return new HashSet((Collection) null);
            default:
                G7.j.e(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // a8.b
    public final c8.g getDescriptor() {
        switch (this.b) {
            case 0:
                return (C2227b) this.f20156c;
            case 1:
                return (C2227b) this.f20156c;
            default:
                return (C2227b) this.f20156c;
        }
    }

    @Override // e8.AbstractC2226a
    public final Object h(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                G7.j.e(arrayList, "<this>");
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                G7.j.e(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                G7.j.e(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // e8.r
    public final void i(int i9, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                G7.j.e(arrayList, "<this>");
                arrayList.add(i9, obj2);
                return;
            case 1:
                HashSet hashSet = (HashSet) obj;
                G7.j.e(hashSet, "<this>");
                hashSet.add(obj2);
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                G7.j.e(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                return;
        }
    }
}
