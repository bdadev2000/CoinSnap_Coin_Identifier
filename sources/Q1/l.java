package Q1;

import android.graphics.Bitmap;
import android.os.Build;
import j2.n;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f2490d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f2491e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f2492f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f2493g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f2494h;

    /* renamed from: a, reason: collision with root package name */
    public final e f2495a = new e(1);
    public final E1.d b = new E1.d(11);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2496c = new HashMap();

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f2490d = configArr;
        f2491e = configArr;
        f2492f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f2493g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f2494h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i9, Bitmap.Config config) {
        return "[" + i9 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num2 = (Integer) d2.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d2.remove(num);
                return;
            } else {
                d2.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(n.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[EDGE_INSN: B:34:0x00a6->B:20:0x00a6 BREAK  A[LOOP:0: B:10:0x0058->B:32:0x00a3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(int r11, int r12, android.graphics.Bitmap.Config r13) {
        /*
            r10 = this;
            int r0 = r11 * r12
            int r1 = j2.n.d(r13)
            int r1 = r1 * r0
            Q1.e r0 = r10.f2495a
            java.lang.Object r2 = r0.f273c
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            java.lang.Object r2 = r2.poll()
            Q1.i r2 = (Q1.i) r2
            if (r2 != 0) goto L19
            Q1.i r2 = r0.n()
        L19:
            Q1.k r2 = (Q1.k) r2
            r2.b = r1
            r2.f2489c = r13
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L32
            android.graphics.Bitmap$Config r3 = H1.a.C()
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L32
            android.graphics.Bitmap$Config[] r3 = Q1.l.f2491e
            goto L56
        L32:
            int[] r3 = Q1.j.f2487a
            int r4 = r13.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L54
            r4 = 2
            if (r3 == r4) goto L51
            r4 = 3
            if (r3 == r4) goto L4e
            r4 = 4
            if (r3 == r4) goto L4b
            android.graphics.Bitmap$Config[] r3 = new android.graphics.Bitmap.Config[]{r13}
            goto L56
        L4b:
            android.graphics.Bitmap$Config[] r3 = Q1.l.f2494h
            goto L56
        L4e:
            android.graphics.Bitmap$Config[] r3 = Q1.l.f2493g
            goto L56
        L51:
            android.graphics.Bitmap$Config[] r3 = Q1.l.f2492f
            goto L56
        L54:
            android.graphics.Bitmap$Config[] r3 = Q1.l.f2490d
        L56:
            int r4 = r3.length
            r5 = 0
        L58:
            if (r5 >= r4) goto La6
            r6 = r3[r5]
            java.util.NavigableMap r7 = r10.d(r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.Object r7 = r7.ceilingKey(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto La3
            int r8 = r7.intValue()
            int r9 = r1 * 8
            if (r8 > r9) goto La3
            int r3 = r7.intValue()
            if (r3 != r1) goto L85
            if (r6 != 0) goto L7f
            if (r13 == 0) goto La6
            goto L85
        L7f:
            boolean r1 = r6.equals(r13)
            if (r1 != 0) goto La6
        L85:
            r0.m(r2)
            int r1 = r7.intValue()
            java.lang.Object r2 = r0.f273c
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            java.lang.Object r2 = r2.poll()
            Q1.i r2 = (Q1.i) r2
            if (r2 != 0) goto L9c
            Q1.i r2 = r0.n()
        L9c:
            Q1.k r2 = (Q1.k) r2
            r2.b = r1
            r2.f2489c = r6
            goto La6
        La3:
            int r5 = r5 + 1
            goto L58
        La6:
            E1.d r0 = r10.b
            java.lang.Object r0 = r0.h(r2)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lbc
            int r1 = r2.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.a(r1, r0)
            r0.reconfigure(r11, r12, r13)
        Lbc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.l.b(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap hashMap = this.f2496c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final void e(Bitmap bitmap) {
        int c9 = n.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        e eVar = this.f2495a;
        i iVar = (i) ((ArrayDeque) eVar.f273c).poll();
        if (iVar == null) {
            iVar = eVar.n();
        }
        k kVar = (k) iVar;
        kVar.b = c9;
        kVar.f2489c = config;
        this.b.w(kVar, bitmap);
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num = (Integer) d2.get(Integer.valueOf(kVar.b));
        Integer valueOf = Integer.valueOf(kVar.b);
        int i9 = 1;
        if (num != null) {
            i9 = 1 + num.intValue();
        }
        d2.put(valueOf, Integer.valueOf(i9));
    }

    public final String toString() {
        StringBuilder b = AbstractC2965e.b("SizeConfigStrategy{groupedMap=");
        b.append(this.b);
        b.append(", sortedSizes=(");
        HashMap hashMap = this.f2496c;
        for (Map.Entry entry : hashMap.entrySet()) {
            b.append(entry.getKey());
            b.append('[');
            b.append(entry.getValue());
            b.append("], ");
        }
        if (!hashMap.isEmpty()) {
            b.replace(b.length() - 2, b.length(), "");
        }
        b.append(")}");
        return b.toString();
    }
}
