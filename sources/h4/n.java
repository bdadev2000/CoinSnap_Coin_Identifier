package h4;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class n implements j {

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f18761f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f18762g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f18763h;

    /* renamed from: i, reason: collision with root package name */
    public static final Bitmap.Config[] f18764i;

    /* renamed from: j, reason: collision with root package name */
    public static final Bitmap.Config[] f18765j;

    /* renamed from: b, reason: collision with root package name */
    public final c f18766b = new c(2);

    /* renamed from: c, reason: collision with root package name */
    public final d3.g f18767c = new d3.g(21, (com.applovin.impl.mediation.ads.e) null);

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f18768d = new HashMap();

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f18761f = configArr;
        f18762g = configArr;
        f18763h = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f18764i = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f18765j = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String f(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    @Override // h4.j
    public final void a(Bitmap bitmap) {
        int c10 = w4.m.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        m mVar = (m) this.f18766b.h();
        mVar.f18759b = c10;
        mVar.f18760c = config;
        this.f18767c.D(mVar, bitmap);
        NavigableMap h10 = h(bitmap.getConfig());
        Integer num = (Integer) h10.get(Integer.valueOf(mVar.f18759b));
        Integer valueOf = Integer.valueOf(mVar.f18759b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        h10.put(valueOf, Integer.valueOf(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[EDGE_INSN: B:37:0x00ab->B:26:0x00ab BREAK  A[LOOP:0: B:16:0x0068->B:35:0x00a8], SYNTHETIC] */
    @Override // h4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(int r11, int r12, android.graphics.Bitmap.Config r13) {
        /*
            r10 = this;
            char[] r0 = w4.m.a
            int r0 = r11 * r12
            if (r13 != 0) goto L9
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            goto La
        L9:
            r1 = r13
        La:
            int[] r2 = w4.l.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L25
            if (r1 == r4) goto L23
            if (r1 == r3) goto L23
            if (r1 == r2) goto L20
            r1 = r2
            goto L26
        L20:
            r1 = 8
            goto L26
        L23:
            r1 = r4
            goto L26
        L25:
            r1 = r5
        L26:
            int r1 = r1 * r0
            h4.c r0 = r10.f18766b
            h4.k r6 = r0.h()
            h4.m r6 = (h4.m) r6
            r6.f18759b = r1
            r6.f18760c = r13
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            r9 = 0
            if (r7 < r8) goto L47
            android.graphics.Bitmap$Config r7 = d2.a.C()
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L47
            android.graphics.Bitmap$Config[] r2 = h4.n.f18762g
            goto L67
        L47:
            int[] r7 = h4.l.a
            int r8 = r13.ordinal()
            r7 = r7[r8]
            if (r7 == r5) goto L65
            if (r7 == r4) goto L62
            if (r7 == r3) goto L5f
            if (r7 == r2) goto L5c
            android.graphics.Bitmap$Config[] r2 = new android.graphics.Bitmap.Config[r5]
            r2[r9] = r13
            goto L67
        L5c:
            android.graphics.Bitmap$Config[] r2 = h4.n.f18765j
            goto L67
        L5f:
            android.graphics.Bitmap$Config[] r2 = h4.n.f18764i
            goto L67
        L62:
            android.graphics.Bitmap$Config[] r2 = h4.n.f18763h
            goto L67
        L65:
            android.graphics.Bitmap$Config[] r2 = h4.n.f18761f
        L67:
            int r3 = r2.length
        L68:
            if (r9 >= r3) goto Lab
            r4 = r2[r9]
            java.util.NavigableMap r5 = r10.h(r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.lang.Object r5 = r5.ceilingKey(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto La8
            int r7 = r5.intValue()
            int r8 = r1 * 8
            if (r7 > r8) goto La8
            int r2 = r5.intValue()
            if (r2 != r1) goto L95
            if (r4 != 0) goto L8f
            if (r13 == 0) goto Lab
            goto L95
        L8f:
            boolean r1 = r4.equals(r13)
            if (r1 != 0) goto Lab
        L95:
            r0.j(r6)
            int r1 = r5.intValue()
            h4.k r0 = r0.h()
            r6 = r0
            h4.m r6 = (h4.m) r6
            r6.f18759b = r1
            r6.f18760c = r4
            goto Lab
        La8:
            int r9 = r9 + 1
            goto L68
        Lab:
            d3.g r0 = r10.f18767c
            java.lang.Object r0 = r0.o(r6)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lc1
            int r1 = r6.f18759b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.c(r1, r0)
            r0.reconfigure(r11, r12, r13)
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.n.b(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final void c(Integer num, Bitmap bitmap) {
        NavigableMap h10 = h(bitmap.getConfig());
        Integer num2 = (Integer) h10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                h10.remove(num);
                return;
            } else {
                h10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + d(bitmap) + ", this: " + this);
    }

    @Override // h4.j
    public final String d(Bitmap bitmap) {
        return f(w4.m.c(bitmap), bitmap.getConfig());
    }

    @Override // h4.j
    public final String e(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        char[] cArr = w4.m.a;
        int i12 = i10 * i11;
        if (config == null) {
            config2 = Bitmap.Config.ARGB_8888;
        } else {
            config2 = config;
        }
        int i13 = w4.l.a[config2.ordinal()];
        int i14 = 1;
        if (i13 != 1) {
            i14 = 2;
            if (i13 != 2 && i13 != 3) {
                i14 = 4;
                if (i13 == 4) {
                    i14 = 8;
                }
            }
        }
        return f(i14 * i12, config);
    }

    @Override // h4.j
    public final int g(Bitmap bitmap) {
        return w4.m.c(bitmap);
    }

    public final NavigableMap h(Bitmap.Config config) {
        HashMap hashMap = this.f18768d;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // h4.j
    public final Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f18767c.F();
        if (bitmap != null) {
            c(Integer.valueOf(w4.m.c(bitmap)), bitmap);
        }
        return bitmap;
    }

    public final String toString() {
        StringBuilder m10 = eb.j.m("SizeConfigStrategy{groupedMap=");
        m10.append(this.f18767c);
        m10.append(", sortedSizes=(");
        HashMap hashMap = this.f18768d;
        for (Map.Entry entry : hashMap.entrySet()) {
            m10.append(entry.getKey());
            m10.append(AbstractJsonLexerKt.BEGIN_LIST);
            m10.append(entry.getValue());
            m10.append("], ");
        }
        if (!hashMap.isEmpty()) {
            m10.replace(m10.length() - 2, m10.length(), "");
        }
        m10.append(")}");
        return m10.toString();
    }
}
