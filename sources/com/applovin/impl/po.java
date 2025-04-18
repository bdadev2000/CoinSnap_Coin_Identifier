package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes.dex */
public final class po implements m2 {

    /* renamed from: d */
    public static final m2.a f6992d = new lu(3);
    public final int a;

    /* renamed from: b */
    private final d9[] f6993b;

    /* renamed from: c */
    private int f6994c;

    public po(d9... d9VarArr) {
        boolean z10;
        if (d9VarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.a(z10);
        this.f6993b = d9VarArr;
        this.a = d9VarArr.length;
        a();
    }

    public static /* synthetic */ po b(Bundle bundle) {
        return a(bundle);
    }

    private static int c(int i10) {
        return i10 | JsonLexerKt.BATCH_SIZE;
    }

    public d9 a(int i10) {
        return this.f6993b[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || po.class != obj.getClass()) {
            return false;
        }
        po poVar = (po) obj;
        if (this.a == poVar.a && Arrays.equals(this.f6993b, poVar.f6993b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f6994c == 0) {
            this.f6994c = Arrays.hashCode(this.f6993b) + 527;
        }
        return this.f6994c;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public int a(d9 d9Var) {
        int i10 = 0;
        while (true) {
            d9[] d9VarArr = this.f6993b;
            if (i10 >= d9VarArr.length) {
                return -1;
            }
            if (d9Var == d9VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    private static String a(String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private void a() {
        String a = a(this.f6993b[0].f4219c);
        int c10 = c(this.f6993b[0].f4221f);
        int i10 = 1;
        while (true) {
            d9[] d9VarArr = this.f6993b;
            if (i10 >= d9VarArr.length) {
                return;
            }
            if (!a.equals(a(d9VarArr[i10].f4219c))) {
                d9[] d9VarArr2 = this.f6993b;
                a("languages", d9VarArr2[0].f4219c, d9VarArr2[i10].f4219c, i10);
                return;
            } else {
                if (c10 != c(this.f6993b[i10].f4221f)) {
                    a("role flags", Integer.toBinaryString(this.f6993b[0].f4221f), Integer.toBinaryString(this.f6993b[i10].f4221f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public static /* synthetic */ po a(Bundle bundle) {
        return new po((d9[]) n2.a(d9.I, bundle.getParcelableArrayList(b(0)), ab.h()).toArray(new d9[0]));
    }

    private static void a(String str, String str2, String str3, int i10) {
        StringBuilder p10 = a4.j.p("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        p10.append(str3);
        p10.append("' (track ");
        p10.append(i10);
        p10.append(")");
        kc.a("TrackGroup", "", new IllegalStateException(p10.toString()));
    }
}
