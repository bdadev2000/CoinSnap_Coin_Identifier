package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.InterfaceC0725m2;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.applovin.impl.u */
/* loaded from: classes.dex */
public final class C0761u implements InterfaceC0725m2 {

    /* renamed from: h */
    public static final C0761u f11516h = new C0761u(null, new a[0], 0, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, 0);

    /* renamed from: i */
    private static final a f11517i = new a(0).c(0);

    /* renamed from: j */
    public static final InterfaceC0725m2.a f11518j = new C1(10);

    /* renamed from: a */
    public final Object f11519a;
    public final int b;

    /* renamed from: c */
    public final long f11520c;

    /* renamed from: d */
    public final long f11521d;

    /* renamed from: f */
    public final int f11522f;

    /* renamed from: g */
    private final a[] f11523g;

    /* renamed from: com.applovin.impl.u$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0725m2 {

        /* renamed from: i */
        public static final InterfaceC0725m2.a f11524i = new C1(11);

        /* renamed from: a */
        public final long f11525a;
        public final int b;

        /* renamed from: c */
        public final Uri[] f11526c;

        /* renamed from: d */
        public final int[] f11527d;

        /* renamed from: f */
        public final long[] f11528f;

        /* renamed from: g */
        public final long f11529g;

        /* renamed from: h */
        public final boolean f11530h;

        public a(long j7) {
            this(j7, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private static long[] a(long[] jArr, int i9) {
            int length = jArr.length;
            int max = Math.max(i9, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
            return copyOf;
        }

        public static /* synthetic */ a b(Bundle bundle) {
            return a(bundle);
        }

        public boolean c() {
            return this.b == -1 || a() < this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f11525a == aVar.f11525a && this.b == aVar.b && Arrays.equals(this.f11526c, aVar.f11526c) && Arrays.equals(this.f11527d, aVar.f11527d) && Arrays.equals(this.f11528f, aVar.f11528f) && this.f11529g == aVar.f11529g && this.f11530h == aVar.f11530h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i9 = this.b * 31;
            long j7 = this.f11525a;
            int hashCode = (Arrays.hashCode(this.f11528f) + ((Arrays.hashCode(this.f11527d) + ((((i9 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + Arrays.hashCode(this.f11526c)) * 31)) * 31)) * 31;
            long j9 = this.f11529g;
            return ((hashCode + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f11530h ? 1 : 0);
        }

        private a(long j7, int i9, int[] iArr, Uri[] uriArr, long[] jArr, long j9, boolean z8) {
            AbstractC0669a1.a(iArr.length == uriArr.length);
            this.f11525a = j7;
            this.b = i9;
            this.f11527d = iArr;
            this.f11526c = uriArr;
            this.f11528f = jArr;
            this.f11529g = j9;
            this.f11530h = z8;
        }

        public boolean b() {
            if (this.b == -1) {
                return true;
            }
            for (int i9 = 0; i9 < this.b; i9++) {
                int i10 = this.f11527d[i9];
                if (i10 == 0 || i10 == 1) {
                    return true;
                }
            }
            return false;
        }

        public a c(int i9) {
            int[] a6 = a(this.f11527d, i9);
            long[] a9 = a(this.f11528f, i9);
            return new a(this.f11525a, i9, a6, (Uri[]) Arrays.copyOf(this.f11526c, i9), a9, this.f11529g, this.f11530h);
        }

        private static int[] a(int[] iArr, int i9) {
            int length = iArr.length;
            int max = Math.max(i9, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        private static String b(int i9) {
            return Integer.toString(i9, 36);
        }

        public static a a(Bundle bundle) {
            long j7 = bundle.getLong(b(0));
            int i9 = bundle.getInt(b(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(2));
            int[] intArray = bundle.getIntArray(b(3));
            long[] longArray = bundle.getLongArray(b(4));
            long j9 = bundle.getLong(b(5));
            boolean z8 = bundle.getBoolean(b(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j7, i9, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j9, z8);
        }

        public int a() {
            return a(-1);
        }

        public int a(int i9) {
            int i10;
            int i11 = i9 + 1;
            while (true) {
                int[] iArr = this.f11527d;
                if (i11 >= iArr.length || this.f11530h || (i10 = iArr[i11]) == 0 || i10 == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }
    }

    private C0761u(Object obj, a[] aVarArr, long j7, long j9, int i9) {
        this.f11519a = obj;
        this.f11520c = j7;
        this.f11521d = j9;
        this.b = aVarArr.length + i9;
        this.f11523g = aVarArr;
        this.f11522f = i9;
    }

    public static C0761u a(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i9 = 0; i9 < parcelableArrayList.size(); i9++) {
                aVarArr2[i9] = (a) a.f11524i.a((Bundle) parcelableArrayList.get(i9));
            }
            aVarArr = aVarArr2;
        }
        return new C0761u(null, aVarArr, bundle.getLong(b(2), 0L), bundle.getLong(b(3), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET), bundle.getInt(b(4)));
    }

    public static /* synthetic */ C0761u b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0761u.class != obj.getClass()) {
            return false;
        }
        C0761u c0761u = (C0761u) obj;
        if (yp.a(this.f11519a, c0761u.f11519a) && this.b == c0761u.b && this.f11520c == c0761u.f11520c && this.f11521d == c0761u.f11521d && this.f11522f == c0761u.f11522f && Arrays.equals(this.f11523g, c0761u.f11523g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i9 = this.b * 31;
        Object obj = this.f11519a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i9 + hashCode) * 31) + ((int) this.f11520c)) * 31) + ((int) this.f11521d)) * 31) + this.f11522f) * 31) + Arrays.hashCode(this.f11523g);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f11519a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f11520c);
        sb.append(", adGroups=[");
        for (int i9 = 0; i9 < this.f11523g.length; i9++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f11523g[i9].f11525a);
            sb.append(", ads=[");
            for (int i10 = 0; i10 < this.f11523g[i9].f11527d.length; i10++) {
                sb.append("ad(state=");
                int i11 = this.f11523g[i9].f11527d[i10];
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    sb.append('?');
                                } else {
                                    sb.append('!');
                                }
                            } else {
                                sb.append('P');
                            }
                        } else {
                            sb.append('S');
                        }
                    } else {
                        sb.append('R');
                    }
                } else {
                    sb.append('_');
                }
                sb.append(", durationUs=");
                sb.append(this.f11523g[i9].f11528f[i10]);
                sb.append(')');
                if (i10 < this.f11523g[i9].f11527d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i9 < this.f11523g.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public int b(long j7, long j9) {
        int i9 = this.b - 1;
        while (i9 >= 0 && a(j7, j9, i9)) {
            i9--;
        }
        if (i9 < 0 || !a(i9).b()) {
            return -1;
        }
        return i9;
    }

    private static String b(int i9) {
        return Integer.toString(i9, 36);
    }

    public a a(int i9) {
        int i10 = this.f11522f;
        if (i9 < i10) {
            return f11517i;
        }
        return this.f11523g[i9 - i10];
    }

    public int a(long j7, long j9) {
        if (j7 == Long.MIN_VALUE) {
            return -1;
        }
        if (j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j7 >= j9) {
            return -1;
        }
        int i9 = this.f11522f;
        while (i9 < this.b && ((a(i9).f11525a != Long.MIN_VALUE && a(i9).f11525a <= j7) || !a(i9).c())) {
            i9++;
        }
        if (i9 < this.b) {
            return i9;
        }
        return -1;
    }

    private boolean a(long j7, long j9, int i9) {
        if (j7 == Long.MIN_VALUE) {
            return false;
        }
        long j10 = a(i9).f11525a;
        return j10 == Long.MIN_VALUE ? j9 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || j7 < j9 : j7 < j10;
    }
}
