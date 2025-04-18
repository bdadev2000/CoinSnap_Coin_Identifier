package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.m0;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class u implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<u> CREATOR = new l(3);

    /* renamed from: b, reason: collision with root package name */
    public a0[] f11295b;

    /* renamed from: c, reason: collision with root package name */
    public int f11296c;

    /* renamed from: d, reason: collision with root package name */
    public Fragment f11297d;

    /* renamed from: f, reason: collision with root package name */
    public androidx.core.app.h f11298f;

    /* renamed from: g, reason: collision with root package name */
    public w f11299g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11300h;

    /* renamed from: i, reason: collision with root package name */
    public r f11301i;

    /* renamed from: j, reason: collision with root package name */
    public Map f11302j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f11303k;

    /* renamed from: l, reason: collision with root package name */
    public y f11304l;

    /* renamed from: m, reason: collision with root package name */
    public int f11305m;

    /* renamed from: n, reason: collision with root package name */
    public int f11306n;

    public u(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f11296c = -1;
        if (this.f11297d == null) {
            this.f11297d = fragment;
            return;
        }
        throw new com.facebook.q("Can't set fragment once it is already set.");
    }

    public final void a(String str, String str2, boolean z10) {
        Map map = this.f11302j;
        if (map == null) {
            map = new HashMap();
        }
        if (this.f11302j == null) {
            this.f11302j = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = map.get(str) + AbstractJsonLexerKt.COMMA + str2;
        }
        map.put(str, str2);
    }

    public final boolean c() {
        int checkCallingOrSelfPermission;
        String string;
        String string2;
        if (this.f11300h) {
            return true;
        }
        Intrinsics.checkNotNullParameter("android.permission.INTERNET", "permission");
        FragmentActivity h10 = h();
        if (h10 == null) {
            checkCallingOrSelfPermission = -1;
        } else {
            checkCallingOrSelfPermission = h10.checkCallingOrSelfPermission("android.permission.INTERNET");
        }
        if (checkCallingOrSelfPermission != 0) {
            FragmentActivity h11 = h();
            if (h11 == null) {
                string = null;
            } else {
                string = h11.getString(R.string.com_facebook_internet_permission_error_title);
            }
            if (h11 == null) {
                string2 = null;
            } else {
                string2 = h11.getString(R.string.com_facebook_internet_permission_error_message);
            }
            e(ni.a.q(this.f11301i, string, string2, null));
            return false;
        }
        this.f11300h = true;
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(t outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        a0 i10 = i();
        if (i10 != null) {
            k(i10.h(), outcome.f11287b.f11286b, outcome.f11290f, outcome.f11291g, i10.f11179b);
        }
        Map map = this.f11302j;
        if (map != null) {
            outcome.f11293i = map;
        }
        Map map2 = this.f11303k;
        if (map2 != null) {
            outcome.f11294j = map2;
        }
        this.f11295b = null;
        int i11 = -1;
        this.f11296c = -1;
        this.f11301i = null;
        this.f11302j = null;
        this.f11305m = 0;
        this.f11306n = 0;
        androidx.core.app.h hVar = this.f11298f;
        if (hVar != null) {
            x this$0 = (x) hVar.f1189c;
            int i12 = x.f11308h;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            this$0.f11310c = null;
            if (outcome.f11287b == s.CANCEL) {
                i11 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            FragmentActivity activity = this$0.getActivity();
            if (this$0.isAdded() && activity != null) {
                activity.setResult(i11, intent);
                activity.finish();
            }
        }
    }

    public final void f(t pendingResult) {
        t o10;
        Intrinsics.checkNotNullParameter(pendingResult, "outcome");
        if (pendingResult.f11288c != null) {
            Date date = com.facebook.a.f10880n;
            if (z1.d.p()) {
                Intrinsics.checkNotNullParameter(pendingResult, "pendingResult");
                com.facebook.a aVar = pendingResult.f11288c;
                if (aVar != null) {
                    com.facebook.a n10 = z1.d.n();
                    if (n10 != null) {
                        try {
                            if (Intrinsics.areEqual(n10.f10891k, aVar.f10891k)) {
                                o10 = ni.a.o(this.f11301i, aVar, pendingResult.f11289d);
                                e(o10);
                                return;
                            }
                        } catch (Exception e2) {
                            e(ni.a.q(this.f11301i, "Caught exception", e2.getMessage(), null));
                            return;
                        }
                    }
                    o10 = ni.a.q(this.f11301i, "User logged in as different Facebook user.", null, null);
                    e(o10);
                    return;
                }
                throw new com.facebook.q("Can't validate without a token");
            }
        }
        e(pendingResult);
    }

    public final FragmentActivity h() {
        Fragment fragment = this.f11297d;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    public final a0 i() {
        a0[] a0VarArr;
        int i10 = this.f11296c;
        if (i10 < 0 || (a0VarArr = this.f11295b) == null) {
            return null;
        }
        return a0VarArr[i10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r2) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.login.y j() {
        /*
            r4 = this;
            com.facebook.login.y r0 = r4.f11304l
            if (r0 == 0) goto L22
            boolean r1 = m6.a.b(r0)
            r2 = 0
            if (r1 == 0) goto Ld
        Lb:
            r1 = r2
            goto L15
        Ld:
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> L10
            goto L15
        L10:
            r1 = move-exception
            m6.a.a(r0, r1)
            goto Lb
        L15:
            com.facebook.login.r r3 = r4.f11301i
            if (r3 != 0) goto L1a
            goto L1c
        L1a:
            java.lang.String r2 = r3.f11267f
        L1c:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L3e
        L22:
            com.facebook.login.y r0 = new com.facebook.login.y
            androidx.fragment.app.FragmentActivity r1 = r4.h()
            if (r1 != 0) goto L2e
            android.content.Context r1 = com.facebook.x.a()
        L2e:
            com.facebook.login.r r2 = r4.f11301i
            if (r2 != 0) goto L37
            java.lang.String r2 = com.facebook.x.b()
            goto L39
        L37:
            java.lang.String r2 = r2.f11267f
        L39:
            r0.<init>(r1, r2)
            r4.f11304l = r0
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.u.j():com.facebook.login.y");
    }

    public final void k(String str, String str2, String str3, String str4, Map map) {
        boolean z10;
        r rVar = this.f11301i;
        String str5 = "fb_mobile_login_method_complete";
        if (rVar == null) {
            y j3 = j();
            if (!m6.a.b(j3)) {
                try {
                    int i10 = y.f11314c;
                    Bundle i11 = ni.a.i("");
                    i11.putString("2_result", "error");
                    i11.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                    i11.putString("3_method", str);
                    j3.f11315b.b(i11, "fb_mobile_login_method_complete");
                    return;
                } catch (Throwable th2) {
                    m6.a.a(j3, th2);
                    return;
                }
            }
            return;
        }
        y j10 = j();
        String str6 = rVar.f11268g;
        if (rVar.f11276o) {
            str5 = "foa_mobile_login_method_complete";
        }
        if (!m6.a.b(j10)) {
            try {
                int i12 = y.f11314c;
                Bundle i13 = ni.a.i(str6);
                if (str2 != null) {
                    i13.putString("2_result", str2);
                }
                if (str3 != null) {
                    i13.putString("5_error_message", str3);
                }
                if (str4 != null) {
                    i13.putString("4_error_code", str4);
                }
                if (map != null && (!map.isEmpty())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    i13.putString("6_extras", new JSONObject(linkedHashMap).toString());
                }
                i13.putString("3_method", str);
                j10.f11315b.b(i13, str5);
            } catch (Throwable th3) {
                m6.a.a(j10, th3);
            }
        }
    }

    public final void l(int i10, int i11, Intent intent) {
        this.f11305m++;
        if (this.f11301i != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f10876k, false)) {
                m();
                return;
            }
            a0 i12 = i();
            if (i12 != null) {
                if (!(i12 instanceof p) || intent != null || this.f11305m >= this.f11306n) {
                    i12.k(i10, i11, intent);
                }
            }
        }
    }

    public final void m() {
        String str;
        String str2;
        a0 i10 = i();
        if (i10 != null) {
            k(i10.h(), "skipped", null, null, i10.f11179b);
        }
        a0[] a0VarArr = this.f11295b;
        while (a0VarArr != null) {
            int i11 = this.f11296c;
            boolean z10 = true;
            if (i11 >= a0VarArr.length - 1) {
                break;
            }
            this.f11296c = i11 + 1;
            a0 i12 = i();
            boolean z11 = false;
            if (i12 != null) {
                if ((i12 instanceof g0) && !c()) {
                    a("no_internet_permission", "1", false);
                } else {
                    r rVar = this.f11301i;
                    if (rVar != null) {
                        int n10 = i12.n(rVar);
                        this.f11305m = 0;
                        boolean z12 = rVar.f11276o;
                        String str3 = rVar.f11268g;
                        if (n10 > 0) {
                            y j3 = j();
                            String h10 = i12.h();
                            if (z12) {
                                str2 = "foa_mobile_login_method_start";
                            } else {
                                str2 = "fb_mobile_login_method_start";
                            }
                            if (!m6.a.b(j3)) {
                                try {
                                    int i13 = y.f11314c;
                                    Bundle i14 = ni.a.i(str3);
                                    i14.putString("3_method", h10);
                                    j3.f11315b.b(i14, str2);
                                } catch (Throwable th2) {
                                    m6.a.a(j3, th2);
                                }
                            }
                            this.f11306n = n10;
                        } else {
                            y j10 = j();
                            String h11 = i12.h();
                            if (z12) {
                                str = "foa_mobile_login_method_not_tried";
                            } else {
                                str = "fb_mobile_login_method_not_tried";
                            }
                            if (!m6.a.b(j10)) {
                                try {
                                    int i15 = y.f11314c;
                                    Bundle i16 = ni.a.i(str3);
                                    i16.putString("3_method", h11);
                                    j10.f11315b.b(i16, str);
                                } catch (Throwable th3) {
                                    m6.a.a(j10, th3);
                                }
                            }
                            a("not_tried", i12.h(), true);
                        }
                        if (n10 <= 0) {
                            z10 = false;
                        }
                        z11 = z10;
                    }
                }
            }
            if (z11) {
                return;
            }
        }
        r rVar2 = this.f11301i;
        if (rVar2 != null) {
            e(ni.a.q(rVar2, "Login attempt failed.", null, null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelableArray(this.f11295b, i10);
        dest.writeInt(this.f11296c);
        dest.writeParcelable(this.f11301i, i10);
        m0.L(dest, this.f11302j);
        m0.L(dest, this.f11303k);
    }

    public u(Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f11296c = -1;
        Parcelable[] readParcelableArray = source.readParcelableArray(a0.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i10];
            a0 a0Var = parcelable instanceof a0 ? (a0) parcelable : null;
            if (a0Var != null) {
                Intrinsics.checkNotNullParameter(this, "<set-?>");
                a0Var.f11180c = this;
            }
            if (a0Var != null) {
                arrayList.add(a0Var);
            }
            i10++;
        }
        Object[] array = arrayList.toArray(new a0[0]);
        if (array != null) {
            this.f11295b = (a0[]) array;
            this.f11296c = source.readInt();
            this.f11301i = (r) source.readParcelable(r.class.getClassLoader());
            HashMap H = m0.H(source);
            this.f11302j = H == null ? null : MapsKt.toMutableMap(H);
            HashMap H2 = m0.H(source);
            this.f11303k = H2 != null ? MapsKt.toMutableMap(H2) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
