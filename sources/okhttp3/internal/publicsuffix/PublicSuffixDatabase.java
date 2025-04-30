package okhttp3.internal.publicsuffix;

import G7.j;
import O7.g;
import Q7.n0;
import android.support.v4.media.session.a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import r8.k;
import u7.AbstractC2816g;
import u7.AbstractC2817h;
import u7.C2824o;
import w8.n;
import w8.t;

/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f22023e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f22024f = a.w("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f22025g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f22026a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f22027c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f22028d;

    public static List c(String str) {
        Object next;
        int i9 = 0;
        List U8 = g.U(str, new char[]{'.'});
        if (j.a(AbstractC2816g.P(U8), "")) {
            List list = U8;
            int size = U8.size() - 1;
            if (size < 0) {
                size = 0;
            }
            if (size >= 0) {
                if (size == 0) {
                    return C2824o.b;
                }
                if (list instanceof Collection) {
                    if (size >= list.size()) {
                        return AbstractC2816g.T(list);
                    }
                    if (size == 1) {
                        if (list instanceof List) {
                            next = AbstractC2816g.K(list);
                        } else {
                            Iterator it = list.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                throw new NoSuchElementException("Collection is empty.");
                            }
                        }
                        return a.w(next);
                    }
                }
                ArrayList arrayList = new ArrayList(size);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                    i9++;
                    if (i9 == size) {
                        break;
                    }
                }
                return AbstractC2817h.C(arrayList);
            }
            throw new IllegalArgumentException(n0.f(size, "Requested element count ", " is less than zero.").toString());
        }
        return U8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00bd, code lost:
    
        G7.j.k("publicSuffixListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00c0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00c1, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r3 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        r8 = (byte[][]) r4.clone();
        r9 = r8.length - 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (r10 >= r9) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        r11 = r10 + 1;
        r8[r10] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f22023e;
        r12 = r13.f22027c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r12 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        r10 = q.C2609l.h(r12, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (r10 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        if (r10 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        r3 = r3 - 1;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r7 >= r3) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        r8 = r7 + 1;
        r9 = r13.f22028d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        if (r9 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        r7 = q.C2609l.h(r9, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        if (r7 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        if (r7 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
    
        r3 = O7.g.U(G7.j.j(r7, "!"), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
    
        if (r2.size() != r3.size()) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013c, code lost:
    
        if (((java.lang.String) r3.get(0)).charAt(0) == '!') goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0149, code lost:
    
        if (((java.lang.String) r3.get(0)).charAt(0) != '!') goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014b, code lost:
    
        r2 = r2.size();
        r3 = r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0153, code lost:
    
        r2 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015f, code lost:
    
        r3 = new N7.j(c(r14), 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016a, code lost:
    
        if (r2 < 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016c, code lost:
    
        if (r2 != 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016f, code lost:
    
        r3 = new N7.c(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0175, code lost:
    
        r14 = new java.lang.StringBuilder();
        r14.append((java.lang.CharSequence) "");
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0187, code lost:
    
        if (r3.hasNext() == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0189, code lost:
    
        r4 = r3.next();
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018e, code lost:
    
        if (r0 <= 1) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0190, code lost:
    
        r14.append((java.lang.CharSequence) ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0195, code lost:
    
        com.facebook.appevents.i.a(r14, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0199, code lost:
    
        r14.append((java.lang.CharSequence) "");
        r14 = r14.toString();
        G7.j.d(r14, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a5, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b7, code lost:
    
        throw new java.lang.IllegalArgumentException(Q7.n0.f(r2, "Requested element count ", " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0155, code lost:
    
        r2 = r2.size();
        r3 = r3.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:
    
        if (r5 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f3, code lost:
    
        if (r10 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f5, code lost:
    
        r3 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f22024f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f8, code lost:
    
        if (r5 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fa, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0104, code lost:
    
        r5 = u7.C2824o.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0106, code lost:
    
        if (r4 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0108, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0109, code lost:
    
        if (r10 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010b, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0115, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0118, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0121, code lost:
    
        if (r4.size() <= r5.size()) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0123, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0125, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010d, code lost:
    
        r3 = O7.g.U(r10, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00fc, code lost:
    
        r4 = O7.g.U(r5, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00d7, code lost:
    
        G7.j.k("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00dc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00dd, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(com.mbridge.msdk.thrid.okhttp.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        t f9 = k.f(new n(k.y(resourceAsStream)));
        try {
            long readInt = f9.readInt();
            f9.require(readInt);
            byte[] readByteArray = f9.f24039c.readByteArray(readInt);
            long readInt2 = f9.readInt();
            f9.require(readInt2);
            byte[] readByteArray2 = f9.f24039c.readByteArray(readInt2);
            a.f(f9, null);
            synchronized (this) {
                this.f22027c = readByteArray;
                this.f22028d = readByteArray2;
            }
            this.b.countDown();
        } finally {
        }
    }
}
