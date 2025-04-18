package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.m2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u implements m2 {

    /* renamed from: h */
    public static final u f8304h = new u(null, new a[0], 0, C.TIME_UNSET, 0);

    /* renamed from: i */
    private static final a f8305i = new a(0).c(0);

    /* renamed from: j */
    public static final m2.a f8306j = new lu(9);
    public final Object a;

    /* renamed from: b */
    public final int f8307b;

    /* renamed from: c */
    public final long f8308c;

    /* renamed from: d */
    public final long f8309d;

    /* renamed from: f */
    public final int f8310f;

    /* renamed from: g */
    private final a[] f8311g;

    /* loaded from: classes.dex */
    public static final class a implements m2 {

        /* renamed from: i */
        public static final m2.a f8312i = new lu(10);
        public final long a;

        /* renamed from: b */
        public final int f8313b;

        /* renamed from: c */
        public final Uri[] f8314c;

        /* renamed from: d */
        public final int[] f8315d;

        /* renamed from: f */
        public final long[] f8316f;

        /* renamed from: g */
        public final long f8317g;

        /* renamed from: h */
        public final boolean f8318h;

        public a(long j3) {
            this(j3, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, C.TIME_UNSET);
            return copyOf;
        }

        public static /* synthetic */ a b(Bundle bundle) {
            return a(bundle);
        }

        public boolean c() {
            return this.f8313b == -1 || a() < this.f8313b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.f8313b == aVar.f8313b && Arrays.equals(this.f8314c, aVar.f8314c) && Arrays.equals(this.f8315d, aVar.f8315d) && Arrays.equals(this.f8316f, aVar.f8316f) && this.f8317g == aVar.f8317g && this.f8318h == aVar.f8318h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f8313b * 31;
            long j3 = this.a;
            int hashCode = (Arrays.hashCode(this.f8316f) + ((Arrays.hashCode(this.f8315d) + ((((i10 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.f8314c)) * 31)) * 31)) * 31;
            long j10 = this.f8317g;
            return ((hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f8318h ? 1 : 0);
        }

        private a(long j3, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j10, boolean z10) {
            a1.a(iArr.length == uriArr.length);
            this.a = j3;
            this.f8313b = i10;
            this.f8315d = iArr;
            this.f8314c = uriArr;
            this.f8316f = jArr;
            this.f8317g = j10;
            this.f8318h = z10;
        }

        public boolean b() {
            if (this.f8313b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f8313b; i10++) {
                int i11 = this.f8315d[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public a c(int i10) {
            int[] a = a(this.f8315d, i10);
            long[] a10 = a(this.f8316f, i10);
            return new a(this.a, i10, a, (Uri[]) Arrays.copyOf(this.f8314c, i10), a10, this.f8317g, this.f8318h);
        }

        private static int[] a(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        public static a a(Bundle bundle) {
            long j3 = bundle.getLong(b(0));
            int i10 = bundle.getInt(b(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(2));
            int[] intArray = bundle.getIntArray(b(3));
            long[] longArray = bundle.getLongArray(b(4));
            long j10 = bundle.getLong(b(5));
            boolean z10 = bundle.getBoolean(b(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j3, i10, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j10, z10);
        }

        public int a() {
            return a(-1);
        }

        public int a(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f8315d;
                if (i12 >= iArr.length || this.f8318h || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }
    }

    private u(Object obj, a[] aVarArr, long j3, long j10, int i10) {
        this.a = obj;
        this.f8308c = j3;
        this.f8309d = j10;
        this.f8307b = aVarArr.length + i10;
        this.f8311g = aVarArr;
        this.f8310f = i10;
    }

    public static u a(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = (a) a.f8312i.a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        return new u(null, aVarArr, bundle.getLong(b(2), 0L), bundle.getLong(b(3), C.TIME_UNSET), bundle.getInt(b(4)));
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
        if (yp.a(this.a, uVar.a) && this.f8307b == uVar.f8307b && this.f8308c == uVar.f8308c && this.f8309d == uVar.f8309d && this.f8310f == uVar.f8310f && Arrays.equals(this.f8311g, uVar.f8311g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i10 = this.f8307b * 31;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i10 + hashCode) * 31) + ((int) this.f8308c)) * 31) + ((int) this.f8309d)) * 31) + this.f8310f) * 31) + Arrays.hashCode(this.f8311g);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f8308c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f8311g.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f8311g[i10].a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f8311g[i10].f8315d.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f8311g[i10].f8315d[i11];
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 4) {
                                    sb2.append('?');
                                } else {
                                    sb2.append('!');
                                }
                            } else {
                                sb2.append('P');
                            }
                        } else {
                            sb2.append('S');
                        }
                    } else {
                        sb2.append('R');
                    }
                } else {
                    sb2.append('_');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f8311g[i10].f8316f[i11]);
                sb2.append(')');
                if (i11 < this.f8311g[i10].f8315d.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f8311g.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    public int b(long j3, long j10) {
        int i10 = this.f8307b - 1;
        while (i10 >= 0 && a(j3, j10, i10)) {
            i10--;
        }
        if (i10 < 0 || !a(i10).b()) {
            return -1;
        }
        return i10;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public a a(int i10) {
        int i11 = this.f8310f;
        if (i10 < i11) {
            return f8305i;
        }
        return this.f8311g[i10 - i11];
    }

    public int a(long j3, long j10) {
        if (j3 == Long.MIN_VALUE) {
            return -1;
        }
        if (j10 != C.TIME_UNSET && j3 >= j10) {
            return -1;
        }
        int i10 = this.f8310f;
        while (i10 < this.f8307b && ((a(i10).a != Long.MIN_VALUE && a(i10).a <= j3) || !a(i10).c())) {
            i10++;
        }
        if (i10 < this.f8307b) {
            return i10;
        }
        return -1;
    }

    private boolean a(long j3, long j10, int i10) {
        if (j3 == Long.MIN_VALUE) {
            return false;
        }
        long j11 = a(i10).a;
        return j11 == Long.MIN_VALUE ? j10 == C.TIME_UNSET || j3 < j10 : j3 < j11;
    }
}
