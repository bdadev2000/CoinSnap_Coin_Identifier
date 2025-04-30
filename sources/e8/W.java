package e8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final c8.g[] f20141a = new c8.g[0];
    public static final a8.b[] b = new a8.b[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f20142c = new Object();

    public static final G a(a8.b bVar, String str) {
        return new G(str, new H(bVar));
    }

    public static final Set b(c8.g gVar) {
        G7.j.e(gVar, "<this>");
        if (gVar instanceof InterfaceC2236k) {
            return ((InterfaceC2236k) gVar).b();
        }
        HashSet hashSet = new HashSet(gVar.f());
        int f9 = gVar.f();
        for (int i9 = 0; i9 < f9; i9++) {
            hashSet.add(gVar.g(i9));
        }
        return hashSet;
    }

    public static final c8.g[] c(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list != null) {
            Object[] array = list.toArray(new c8.g[0]);
            G7.j.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (c8.g[]) array;
        }
        return f20141a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0171, code lost:
    
        if (r12 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x012a, code lost:
    
        if (r12 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c8 A[Catch: NoSuchFieldException -> 0x01cb, TRY_LEAVE, TryCatch #4 {NoSuchFieldException -> 0x01cb, blocks: (B:63:0x01bd, B:64:0x01c4, B:66:0x01c8), top: B:62:0x01bd }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final a8.b d(M7.b r16, a8.b... r17) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.W.d(M7.b, a8.b[]):a8.b");
    }

    public static final int e(c8.g gVar, c8.g[] gVarArr) {
        int i9;
        G7.j.e(gVar, "<this>");
        G7.j.e(gVarArr, "typeParams");
        int hashCode = (gVar.a().hashCode() * 31) + Arrays.hashCode(gVarArr);
        c8.i iVar = new c8.i(gVar, 0);
        int i10 = 1;
        int i11 = 1;
        while (true) {
            int i12 = 0;
            if (!iVar.hasNext()) {
                break;
            }
            int i13 = i11 * 31;
            String a6 = ((c8.g) iVar.next()).a();
            if (a6 != null) {
                i12 = a6.hashCode();
            }
            i11 = i13 + i12;
        }
        c8.i iVar2 = new c8.i(gVar, 0);
        while (iVar2.hasNext()) {
            int i14 = i10 * 31;
            com.bumptech.glide.c kind = ((c8.g) iVar2.next()).getKind();
            if (kind != null) {
                i9 = kind.hashCode();
            } else {
                i9 = 0;
            }
            i10 = i14 + i9;
        }
        return (((hashCode * 31) + i11) * 31) + i10;
    }

    public static final M7.b f(M7.d dVar) {
        G7.j.e(dVar, "<this>");
        M7.b bVar = ((G7.x) dVar).f1337a;
        if (bVar instanceof M7.b) {
            return bVar;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + bVar).toString());
    }

    public static final void g(M7.b bVar) {
        G7.j.e(bVar, "<this>");
        throw new IllegalArgumentException("Serializer for class '" + ((G7.e) bVar).b() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }

    public static final void h(int i9, int i10, c8.g gVar) {
        String str;
        G7.j.e(gVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i11 = (~i9) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(gVar.g(i12));
            }
            i11 >>>= 1;
        }
        String a6 = gVar.a();
        G7.j.e(a6, "serialName");
        if (arrayList.size() == 1) {
            str = Q7.n0.m(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", a6, "', but it was missing");
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + a6 + "', but they were missing";
        }
        throw new a8.c(arrayList, str, null);
    }

    public static final void i(M7.b bVar, String str) {
        String j7;
        G7.j.e(bVar, "baseClass");
        String str2 = "in the scope of '" + ((G7.e) bVar).b() + '\'';
        if (str == null) {
            j7 = AbstractC2914a.d("Class discriminator was missing and no default polymorphic serializers were registered ", str2);
        } else {
            j7 = Q7.n0.j("Class '", str, "' is not registered for polymorphic serialization ", str2, ".\nMark the base class as 'sealed' or register the serializer explicitly.");
        }
        throw new IllegalArgumentException(j7);
    }
}
