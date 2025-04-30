package i8;

import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.facebook.internal.C1838g;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u7.AbstractC2818i;
import u7.C2824o;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20875a;
    public List b;

    /* renamed from: c, reason: collision with root package name */
    public int f20876c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f20877d;

    /* renamed from: e, reason: collision with root package name */
    public Object f20878e;

    /* renamed from: f, reason: collision with root package name */
    public Object f20879f;

    /* renamed from: g, reason: collision with root package name */
    public Object f20880g;

    /* renamed from: h, reason: collision with root package name */
    public Object f20881h;

    /* renamed from: i, reason: collision with root package name */
    public Object f20882i;

    public t(C2364a c2364a, C1838g c1838g, InterfaceC2373j interfaceC2373j, C2365b c2365b) {
        List k6;
        this.f20875a = 1;
        G7.j.e(c2364a, "address");
        G7.j.e(c1838g, "routeDatabase");
        G7.j.e(interfaceC2373j, NotificationCompat.CATEGORY_CALL);
        G7.j.e(c2365b, "eventListener");
        this.f20878e = c2364a;
        this.f20879f = c1838g;
        this.f20880g = interfaceC2373j;
        this.f20881h = c2365b;
        C2824o c2824o = C2824o.b;
        this.b = c2824o;
        this.f20882i = c2824o;
        this.f20877d = new ArrayList();
        u uVar = c2364a.f20805h;
        G7.j.e(uVar, "url");
        URI g9 = uVar.g();
        if (g9.getHost() == null) {
            k6 = j8.b.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = c2364a.f20804g.select(g9);
            List<Proxy> list = select;
            if (list != null && !list.isEmpty()) {
                G7.j.d(select, "proxiesOrNull");
                k6 = j8.b.w(select);
            } else {
                k6 = j8.b.k(Proxy.NO_PROXY);
            }
        }
        this.b = k6;
        this.f20876c = 0;
    }

    public u a() {
        ArrayList arrayList;
        String f9;
        String f10;
        String str = (String) this.f20878e;
        if (str != null) {
            String f11 = C2365b.f(0, 0, (String) this.f20879f, 7, false);
            String f12 = C2365b.f(0, 0, (String) this.f20880g, 7, false);
            String str2 = (String) this.f20881h;
            if (str2 != null) {
                int b = b();
                ArrayList arrayList2 = this.f20877d;
                ArrayList arrayList3 = new ArrayList(AbstractC2818i.E(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(C2365b.f(0, 0, (String) it.next(), 7, false));
                }
                List list = this.b;
                if (list == null) {
                    arrayList = null;
                } else {
                    List<String> list2 = list;
                    arrayList = new ArrayList(AbstractC2818i.E(list2, 10));
                    for (String str3 : list2) {
                        if (str3 == null) {
                            f9 = null;
                        } else {
                            f9 = C2365b.f(0, 0, str3, 3, true);
                        }
                        arrayList.add(f9);
                    }
                }
                String str4 = (String) this.f20882i;
                if (str4 == null) {
                    f10 = null;
                } else {
                    f10 = C2365b.f(0, 0, str4, 7, false);
                }
                return new u(str, f11, f12, str2, b, arrayList3, arrayList, f10, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public int b() {
        int i9 = this.f20876c;
        if (i9 == -1) {
            String str = (String) this.f20878e;
            G7.j.b(str);
            if (str.equals("http")) {
                return 80;
            }
            if (!str.equals(Constants.SCHEME)) {
                return -1;
            }
            return 443;
        }
        return i9;
    }

    public boolean c() {
        boolean z8;
        if (this.f20876c < this.b.size()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8 && !(!this.f20877d.isEmpty())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x027e, code lost:
    
        if (r1 < 65536) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0081, code lost:
    
        if (r5 == ':') goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00e1 A[EDGE_INSN: B:179:0x00e1->B:16:0x00e1 BREAK  A[LOOP:0: B:10:0x00cc->B:177:0x00dc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0154  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(i8.u r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.t.d(i8.u, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r1 != r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.t.toString():java.lang.String");
    }

    public t() {
        this.f20875a = 0;
        this.f20879f = "";
        this.f20880g = "";
        this.f20876c = -1;
        ArrayList arrayList = new ArrayList();
        this.f20877d = arrayList;
        arrayList.add("");
    }
}
