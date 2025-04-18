package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class oo implements o2 {
    public static final o2.a d = new rs(28);

    /* renamed from: a, reason: collision with root package name */
    public final int f25910a;

    /* renamed from: b, reason: collision with root package name */
    private final f9[] f25911b;

    /* renamed from: c, reason: collision with root package name */
    private int f25912c;

    public oo(f9... f9VarArr) {
        b1.a(f9VarArr.length > 0);
        this.f25911b = f9VarArr;
        this.f25910a = f9VarArr.length;
        a();
    }

    private static int c(int i2) {
        return i2 | 16384;
    }

    public f9 a(int i2) {
        return this.f25911b[i2];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oo.class != obj.getClass()) {
            return false;
        }
        oo ooVar = (oo) obj;
        return this.f25910a == ooVar.f25910a && Arrays.equals(this.f25911b, ooVar.f25911b);
    }

    public int hashCode() {
        if (this.f25912c == 0) {
            this.f25912c = Arrays.hashCode(this.f25911b) + 527;
        }
        return this.f25912c;
    }

    private static String b(int i2) {
        return Integer.toString(i2, 36);
    }

    public int a(f9 f9Var) {
        int i2 = 0;
        while (true) {
            f9[] f9VarArr = this.f25911b;
            if (i2 >= f9VarArr.length) {
                return -1;
            }
            if (f9Var == f9VarArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    private static String a(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private void a() {
        String a2 = a(this.f25911b[0].f23832c);
        int c2 = c(this.f25911b[0].f23833f);
        int i2 = 1;
        while (true) {
            f9[] f9VarArr = this.f25911b;
            if (i2 >= f9VarArr.length) {
                return;
            }
            if (!a2.equals(a(f9VarArr[i2].f23832c))) {
                f9[] f9VarArr2 = this.f25911b;
                a("languages", f9VarArr2[0].f23832c, f9VarArr2[i2].f23832c, i2);
                return;
            } else {
                if (c2 != c(this.f25911b[i2].f23833f)) {
                    a("role flags", Integer.toBinaryString(this.f25911b[0].f23833f), Integer.toBinaryString(this.f25911b[i2].f23833f), i2);
                    return;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ oo a(Bundle bundle) {
        return new oo((f9[]) p2.a(f9.I, bundle.getParcelableArrayList(b(0)), eb.h()).toArray(new f9[0]));
    }

    private static void a(String str, String str2, String str3, int i2) {
        StringBuilder t2 = androidx.compose.foundation.text.input.a.t("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        t2.append(str3);
        t2.append("' (track ");
        t2.append(i2);
        t2.append(")");
        pc.a("TrackGroup", "", new IllegalStateException(t2.toString()));
    }
}
