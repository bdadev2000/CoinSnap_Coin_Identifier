package wh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 {
    public String a;

    /* renamed from: d, reason: collision with root package name */
    public String f27022d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f27024f;

    /* renamed from: g, reason: collision with root package name */
    public List f27025g;

    /* renamed from: h, reason: collision with root package name */
    public String f27026h;

    /* renamed from: b, reason: collision with root package name */
    public String f27020b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f27021c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f27023e = -1;

    public b0() {
        ArrayList arrayList = new ArrayList();
        this.f27024f = arrayList;
        arrayList.add("");
    }

    public final d0 a() {
        int collectionSizeOrDefault;
        ArrayList arrayList;
        int collectionSizeOrDefault2;
        String n10;
        String str = this.a;
        if (str != null) {
            char[] cArr = d0.f27032k;
            String n11 = c0.n(this.f27020b, 0, 0, false, 7);
            String n12 = c0.n(this.f27021c, 0, 0, false, 7);
            String str2 = this.f27022d;
            if (str2 != null) {
                int i10 = this.f27023e;
                if (i10 == -1) {
                    String str3 = this.a;
                    Intrinsics.checkNotNull(str3);
                    i10 = c0.f(str3);
                }
                int i11 = i10;
                ArrayList arrayList2 = this.f27024f;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    char[] cArr2 = d0.f27032k;
                    arrayList3.add(c0.n(str4, 0, 0, false, 7));
                }
                List list = this.f27025g;
                String str5 = null;
                if (list == null) {
                    arrayList = null;
                } else {
                    List<String> list2 = list;
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    arrayList = new ArrayList(collectionSizeOrDefault2);
                    for (String str6 : list2) {
                        if (str6 == null) {
                            n10 = null;
                        } else {
                            char[] cArr3 = d0.f27032k;
                            n10 = c0.n(str6, 0, 0, true, 3);
                        }
                        arrayList.add(n10);
                    }
                }
                String str7 = this.f27026h;
                if (str7 != null) {
                    char[] cArr4 = d0.f27032k;
                    str5 = c0.n(str7, 0, 0, false, 7);
                }
                return new d0(str, n11, n12, str2, i11, arrayList3, arrayList, str5, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public final void b(String str) {
        ArrayList arrayList;
        if (str != null) {
            char[] cArr = d0.f27032k;
            String e2 = c0.e(str, 0, 0, " \"'<>#", true, false, true, false, 211);
            if (e2 != null) {
                arrayList = c0.o(e2);
                this.f27025g = arrayList;
            }
        }
        arrayList = null;
        this.f27025g = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x026b, code lost:
    
        if ((1 <= r1 && r1 < 65536) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r14 == ':') goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x039d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(wh.d0 r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.b0.c(wh.d0, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r1 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (r1 != wh.c0.f(r2)) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.b0.toString():java.lang.String");
    }
}
