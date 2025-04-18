package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.o2;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class u implements o2 {

    /* renamed from: h */
    public static final u f27217h = new u(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: i */
    private static final a f27218i = new a(0).c(0);

    /* renamed from: j */
    public static final o2.a f27219j = new ru(10);

    /* renamed from: a */
    public final Object f27220a;

    /* renamed from: b */
    public final int f27221b;

    /* renamed from: c */
    public final long f27222c;
    public final long d;

    /* renamed from: f */
    public final int f27223f;

    /* renamed from: g */
    private final a[] f27224g;

    /* loaded from: classes2.dex */
    public static final class a implements o2 {

        /* renamed from: i */
        public static final o2.a f27225i = new ru(11);

        /* renamed from: a */
        public final long f27226a;

        /* renamed from: b */
        public final int f27227b;

        /* renamed from: c */
        public final Uri[] f27228c;
        public final int[] d;

        /* renamed from: f */
        public final long[] f27229f;

        /* renamed from: g */
        public final long f27230g;

        /* renamed from: h */
        public final boolean f27231h;

        public a(long j2) {
            this(j2, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private static long[] a(long[] jArr, int i2) {
            int length = jArr.length;
            int max = Math.max(i2, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        public static /* synthetic */ a b(Bundle bundle) {
            return a(bundle);
        }

        public boolean c() {
            return this.f27227b == -1 || a() < this.f27227b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f27226a == aVar.f27226a && this.f27227b == aVar.f27227b && Arrays.equals(this.f27228c, aVar.f27228c) && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f27229f, aVar.f27229f) && this.f27230g == aVar.f27230g && this.f27231h == aVar.f27231h;
        }

        public int hashCode() {
            int i2 = this.f27227b * 31;
            long j2 = this.f27226a;
            int hashCode = (Arrays.hashCode(this.f27229f) + ((Arrays.hashCode(this.d) + ((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f27228c)) * 31)) * 31)) * 31;
            long j3 = this.f27230g;
            return ((hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f27231h ? 1 : 0);
        }

        private a(long j2, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j3, boolean z2) {
            b1.a(iArr.length == uriArr.length);
            this.f27226a = j2;
            this.f27227b = i2;
            this.d = iArr;
            this.f27228c = uriArr;
            this.f27229f = jArr;
            this.f27230g = j3;
            this.f27231h = z2;
        }

        public boolean b() {
            if (this.f27227b == -1) {
                return true;
            }
            for (int i2 = 0; i2 < this.f27227b; i2++) {
                int i3 = this.d[i2];
                if (i3 == 0 || i3 == 1) {
                    return true;
                }
            }
            return false;
        }

        public a c(int i2) {
            int[] a2 = a(this.d, i2);
            long[] a3 = a(this.f27229f, i2);
            return new a(this.f27226a, i2, a2, (Uri[]) Arrays.copyOf(this.f27228c, i2), a3, this.f27230g, this.f27231h);
        }

        private static String b(int i2) {
            return Integer.toString(i2, 36);
        }

        private static int[] a(int[] iArr, int i2) {
            int length = iArr.length;
            int max = Math.max(i2, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public static a a(Bundle bundle) {
            long j2 = bundle.getLong(b(0));
            int i2 = bundle.getInt(b(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(2));
            int[] intArray = bundle.getIntArray(b(3));
            long[] longArray = bundle.getLongArray(b(4));
            long j3 = bundle.getLong(b(5));
            boolean z2 = bundle.getBoolean(b(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j2, i2, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j3, z2);
        }

        public int a() {
            return a(-1);
        }

        public int a(int i2) {
            int i3;
            int i4 = i2 + 1;
            while (true) {
                int[] iArr = this.d;
                if (i4 >= iArr.length || this.f27231h || (i3 = iArr[i4]) == 0 || i3 == 1) {
                    break;
                }
                i4++;
            }
            return i4;
        }
    }

    private u(Object obj, a[] aVarArr, long j2, long j3, int i2) {
        this.f27220a = obj;
        this.f27222c = j2;
        this.d = j3;
        this.f27221b = aVarArr.length + i2;
        this.f27224g = aVarArr;
        this.f27223f = i2;
    }

    public static u a(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                aVarArr2[i2] = (a) a.f27225i.a((Bundle) parcelableArrayList.get(i2));
            }
            aVarArr = aVarArr2;
        }
        return new u(null, aVarArr, bundle.getLong(b(2), 0L), bundle.getLong(b(3), -9223372036854775807L), bundle.getInt(b(4)));
    }

    public static /* synthetic */ u b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return xp.a(this.f27220a, uVar.f27220a) && this.f27221b == uVar.f27221b && this.f27222c == uVar.f27222c && this.d == uVar.d && this.f27223f == uVar.f27223f && Arrays.equals(this.f27224g, uVar.f27224g);
    }

    public int hashCode() {
        int i2 = this.f27221b * 31;
        Object obj = this.f27220a;
        return ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f27222c)) * 31) + ((int) this.d)) * 31) + this.f27223f) * 31) + Arrays.hashCode(this.f27224g);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f27220a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f27222c);
        sb.append(", adGroups=[");
        for (int i2 = 0; i2 < this.f27224g.length; i2++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f27224g[i2].f27226a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < this.f27224g[i2].d.length; i3++) {
                sb.append("ad(state=");
                int i4 = this.f27224g[i2].d[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f27224g[i2].f27229f[i3]);
                sb.append(')');
                if (i3 < this.f27224g[i2].d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < this.f27224g.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public int b(long j2, long j3) {
        int i2 = this.f27221b - 1;
        while (i2 >= 0 && a(j2, j3, i2)) {
            i2--;
        }
        if (i2 < 0 || !a(i2).b()) {
            return -1;
        }
        return i2;
    }

    private static String b(int i2) {
        return Integer.toString(i2, 36);
    }

    public a a(int i2) {
        int i3 = this.f27223f;
        return i2 < i3 ? f27218i : this.f27224g[i2 - i3];
    }

    public int a(long j2, long j3) {
        if (j2 == Long.MIN_VALUE) {
            return -1;
        }
        if (j3 != -9223372036854775807L && j2 >= j3) {
            return -1;
        }
        int i2 = this.f27223f;
        while (i2 < this.f27221b && ((a(i2).f27226a != Long.MIN_VALUE && a(i2).f27226a <= j2) || !a(i2).c())) {
            i2++;
        }
        if (i2 < this.f27221b) {
            return i2;
        }
        return -1;
    }

    private boolean a(long j2, long j3, int i2) {
        if (j2 == Long.MIN_VALUE) {
            return false;
        }
        long j4 = a(i2).f27226a;
        return j4 == Long.MIN_VALUE ? j3 == -9223372036854775807L || j2 < j3 : j2 < j4;
    }
}
