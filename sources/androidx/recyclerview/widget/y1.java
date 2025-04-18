package androidx.recyclerview.widget;

import android.content.res.TypedArray;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public final class y1 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f2084b;

    /* renamed from: c, reason: collision with root package name */
    public int f2085c;

    /* renamed from: d, reason: collision with root package name */
    public int f2086d;

    /* renamed from: e, reason: collision with root package name */
    public int f2087e;

    public y1(TypedArray typedArray) {
        this.a = typedArray.getInteger(20, 0);
        this.f2084b = typedArray.getInteger(16, 0);
        this.f2085c = typedArray.getInteger(17, 0);
        this.f2086d = typedArray.getInteger(18, 0);
        this.f2087e = typedArray.getInteger(19, 0);
    }

    public static y1 b(String str) {
        char c10;
        v8.u0.d(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String C = c6.k.C(split[i14].trim());
            C.getClass();
            switch (C.hashCode()) {
                case 100571:
                    if (C.equals(TtmlNode.END)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (C.equals(MimeTypes.BASE_TYPE_TEXT)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (C.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (C.equals(TtmlNode.TAG_STYLE)) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i12 = i14;
                    break;
            }
        }
        if (i10 != -1 && i11 != -1 && i13 != -1) {
            return new y1(i10, i11, i12, i13, split.length);
        }
        return null;
    }

    public static se.b c(int i10) {
        for (se.b bVar : se.b.values()) {
            if (bVar.f25005b == i10) {
                return bVar;
            }
        }
        return null;
    }

    public boolean a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 2;
        if ((i13 & 7) != 0) {
            int i15 = this.f2086d;
            int i16 = this.f2084b;
            if (i15 > i16) {
                i12 = 1;
            } else if (i15 == i16) {
                i12 = 2;
            } else {
                i12 = 4;
            }
            if (((i12 << 0) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 112) != 0) {
            int i17 = this.f2086d;
            int i18 = this.f2085c;
            if (i17 > i18) {
                i11 = 1;
            } else if (i17 == i18) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            if (((i11 << 4) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 1792) != 0) {
            int i19 = this.f2087e;
            int i20 = this.f2084b;
            if (i19 > i20) {
                i10 = 1;
            } else if (i19 == i20) {
                i10 = 2;
            } else {
                i10 = 4;
            }
            if (((i10 << 8) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 28672) != 0) {
            int i21 = this.f2087e;
            int i22 = this.f2085c;
            if (i21 > i22) {
                i14 = 1;
            } else if (i21 != i22) {
                i14 = 4;
            }
            if ((i13 & (i14 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public y1(int i10, int i11, int i12, int i13, int i14) {
        this.a = i10;
        this.f2084b = i11;
        this.f2085c = i12;
        this.f2086d = i13;
        this.f2087e = i14;
    }

    public y1(int i10, int i11, int i12, int i13) {
        this.a = i10;
        this.f2085c = 2;
        this.f2084b = i11;
        this.f2086d = i12;
        this.f2087e = i13;
    }

    public /* synthetic */ y1(int i10) {
        if (i10 != 2) {
            this.a = 0;
            return;
        }
        this.a = 0;
        this.f2084b = 0;
        this.f2085c = 1;
        this.f2086d = 1;
        this.f2087e = 0;
    }
}
