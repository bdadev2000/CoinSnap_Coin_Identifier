package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC0725m2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class po implements InterfaceC0725m2 {

    /* renamed from: d */
    public static final InterfaceC0725m2.a f10057d = new C1(4);

    /* renamed from: a */
    public final int f10058a;
    private final d9[] b;

    /* renamed from: c */
    private int f10059c;

    public po(d9... d9VarArr) {
        boolean z8;
        if (d9VarArr.length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.a(z8);
        this.b = d9VarArr;
        this.f10058a = d9VarArr.length;
        a();
    }

    public static /* synthetic */ po b(Bundle bundle) {
        return a(bundle);
    }

    private static int c(int i9) {
        return i9 | 16384;
    }

    public d9 a(int i9) {
        return this.b[i9];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || po.class != obj.getClass()) {
            return false;
        }
        po poVar = (po) obj;
        if (this.f10058a == poVar.f10058a && Arrays.equals(this.b, poVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f10059c == 0) {
            this.f10059c = Arrays.hashCode(this.b) + 527;
        }
        return this.f10059c;
    }

    private static String b(int i9) {
        return Integer.toString(i9, 36);
    }

    public int a(d9 d9Var) {
        int i9 = 0;
        while (true) {
            d9[] d9VarArr = this.b;
            if (i9 >= d9VarArr.length) {
                return -1;
            }
            if (d9Var == d9VarArr[i9]) {
                return i9;
            }
            i9++;
        }
    }

    private static String a(String str) {
        return (str == null || str.equals(com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private void a() {
        String a6 = a(this.b[0].f7203c);
        int c9 = c(this.b[0].f7205f);
        int i9 = 1;
        while (true) {
            d9[] d9VarArr = this.b;
            if (i9 >= d9VarArr.length) {
                return;
            }
            if (!a6.equals(a(d9VarArr[i9].f7203c))) {
                d9[] d9VarArr2 = this.b;
                a("languages", d9VarArr2[0].f7203c, d9VarArr2[i9].f7203c, i9);
                return;
            } else {
                if (c9 != c(this.b[i9].f7205f)) {
                    a("role flags", Integer.toBinaryString(this.b[0].f7205f), Integer.toBinaryString(this.b[i9].f7205f), i9);
                    return;
                }
                i9++;
            }
        }
    }

    public static /* synthetic */ po a(Bundle bundle) {
        return new po((d9[]) AbstractC0729n2.a(d9.f7194I, bundle.getParcelableArrayList(b(0)), ab.h()).toArray(new d9[0]));
    }

    private static void a(String str, String str2, String str3, int i9) {
        StringBuilder o3 = com.mbridge.msdk.foundation.entity.o.o("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        o3.append(str3);
        o3.append("' (track ");
        o3.append(i9);
        o3.append(")");
        kc.a("TrackGroup", "", new IllegalStateException(o3.toString()));
    }
}
