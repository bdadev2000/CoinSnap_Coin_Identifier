package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0785a;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.H;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import n1.C2475f;
import org.json.JSONObject;
import q4.C2645d;

/* loaded from: classes.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new com.facebook.y(8);
    public z[] b;

    /* renamed from: c, reason: collision with root package name */
    public int f13770c;

    /* renamed from: d, reason: collision with root package name */
    public Fragment f13771d;

    /* renamed from: f, reason: collision with root package name */
    public F2.d f13772f;

    /* renamed from: g, reason: collision with root package name */
    public C2475f f13773g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13774h;

    /* renamed from: i, reason: collision with root package name */
    public q f13775i;

    /* renamed from: j, reason: collision with root package name */
    public Map f13776j;

    /* renamed from: k, reason: collision with root package name */
    public LinkedHashMap f13777k;
    public x l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public int f13778n;

    public final void a(String str, String str2, boolean z8) {
        Map map = this.f13776j;
        if (map == null) {
            map = new HashMap();
        }
        if (this.f13776j == null) {
            this.f13776j = map;
        }
        if (map.containsKey(str) && z8) {
            str2 = map.get(str) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean c() {
        int checkCallingOrSelfPermission;
        String string;
        if (this.f13774h) {
            return true;
        }
        FragmentActivity f9 = f();
        if (f9 == null) {
            checkCallingOrSelfPermission = -1;
        } else {
            checkCallingOrSelfPermission = f9.checkCallingOrSelfPermission("android.permission.INTERNET");
        }
        if (checkCallingOrSelfPermission != 0) {
            FragmentActivity f10 = f();
            String str = null;
            if (f10 == null) {
                string = null;
            } else {
                string = f10.getString(R.string.com_facebook_internet_permission_error_title);
            }
            if (f10 != null) {
                str = f10.getString(R.string.com_facebook_internet_permission_error_message);
            }
            q qVar = this.f13775i;
            ArrayList arrayList = new ArrayList();
            if (string != null) {
                arrayList.add(string);
            }
            if (str != null) {
                arrayList.add(str);
            }
            d(new s(qVar, r.ERROR, null, TextUtils.join(": ", arrayList), null));
            return false;
        }
        this.f13774h = true;
        return true;
    }

    public final void d(s sVar) {
        G7.j.e(sVar, "outcome");
        z g9 = g();
        r rVar = sVar.b;
        if (g9 != null) {
            i(g9.f(), rVar.b, sVar.f13765f, sVar.f13766g, g9.b);
        }
        Map map = this.f13776j;
        if (map != null) {
            sVar.f13768i = map;
        }
        LinkedHashMap linkedHashMap = this.f13777k;
        if (linkedHashMap != null) {
            sVar.f13769j = linkedHashMap;
        }
        this.b = null;
        int i9 = -1;
        this.f13770c = -1;
        this.f13775i = null;
        this.f13776j = null;
        this.m = 0;
        this.f13778n = 0;
        F2.d dVar = this.f13772f;
        if (dVar != null) {
            w wVar = (w) dVar.f1130c;
            G7.j.e(wVar, "this$0");
            wVar.f13781c = null;
            if (rVar == r.CANCEL) {
                i9 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", sVar);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            FragmentActivity activity = wVar.getActivity();
            if (wVar.isAdded() && activity != null) {
                activity.setResult(i9, intent);
                activity.finish();
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(s sVar) {
        s sVar2;
        G7.j.e(sVar, "outcome");
        C0785a c0785a = sVar.f13763c;
        if (c0785a != null) {
            Date date = C0785a.f13439n;
            if (com.facebook.appevents.g.q()) {
                C0785a m = com.facebook.appevents.g.m();
                r rVar = r.ERROR;
                if (m != null) {
                    try {
                        if (G7.j.a(m.f13449k, c0785a.f13449k)) {
                            sVar2 = new s(this.f13775i, r.SUCCESS, sVar.f13763c, sVar.f13764d, null, null);
                            d(sVar2);
                            return;
                        }
                    } catch (Exception e4) {
                        q qVar = this.f13775i;
                        String message = e4.getMessage();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("Caught exception");
                        if (message != null) {
                            arrayList.add(message);
                        }
                        d(new s(qVar, rVar, null, null, TextUtils.join(": ", arrayList), null));
                        return;
                    }
                }
                q qVar2 = this.f13775i;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("User logged in as different Facebook user.");
                sVar2 = new s(qVar2, rVar, null, null, TextUtils.join(": ", arrayList2), null);
                d(sVar2);
                return;
            }
        }
        d(sVar);
    }

    public final FragmentActivity f() {
        Fragment fragment = this.f13771d;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    public final z g() {
        z[] zVarArr;
        int i9 = this.f13770c;
        if (i9 < 0 || (zVarArr = this.b) == null) {
            return null;
        }
        return zVarArr[i9];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (G7.j.a(r1, r2) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.login.x h() {
        /*
            r4 = this;
            com.facebook.login.x r0 = r4.l
            if (r0 == 0) goto L22
            boolean r1 = O2.a.b(r0)
            r2 = 0
            if (r1 == 0) goto Ld
        Lb:
            r1 = r2
            goto L15
        Ld:
            java.lang.String r1 = r0.f13786a     // Catch: java.lang.Throwable -> L10
            goto L15
        L10:
            r1 = move-exception
            O2.a.a(r0, r1)
            goto Lb
        L15:
            com.facebook.login.q r3 = r4.f13775i
            if (r3 != 0) goto L1a
            goto L1c
        L1a:
            java.lang.String r2 = r3.f13746f
        L1c:
            boolean r1 = G7.j.a(r1, r2)
            if (r1 != 0) goto L3e
        L22:
            com.facebook.login.x r0 = new com.facebook.login.x
            androidx.fragment.app.FragmentActivity r1 = r4.f()
            if (r1 != 0) goto L2e
            android.content.Context r1 = com.facebook.r.a()
        L2e:
            com.facebook.login.q r2 = r4.f13775i
            if (r2 != 0) goto L37
            java.lang.String r2 = com.facebook.r.b()
            goto L39
        L37:
            java.lang.String r2 = r2.f13746f
        L39:
            r0.<init>(r1, r2)
            r4.l = r0
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.t.h():com.facebook.login.x");
    }

    public final void i(String str, String str2, String str3, String str4, HashMap hashMap) {
        q qVar = this.f13775i;
        String str5 = "fb_mobile_login_method_complete";
        if (qVar == null) {
            x h6 = h();
            if (!O2.a.b(h6)) {
                try {
                    int i9 = x.f13785c;
                    Bundle o3 = C2645d.o("");
                    o3.putString("2_result", "error");
                    o3.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                    o3.putString("3_method", str);
                    h6.b.i(o3, "fb_mobile_login_method_complete");
                    return;
                } catch (Throwable th) {
                    O2.a.a(h6, th);
                    return;
                }
            }
            return;
        }
        x h9 = h();
        String str6 = qVar.f13747g;
        if (qVar.f13753o) {
            str5 = "foa_mobile_login_method_complete";
        }
        if (!O2.a.b(h9)) {
            try {
                int i10 = x.f13785c;
                Bundle o9 = C2645d.o(str6);
                o9.putString("2_result", str2);
                if (str3 != null) {
                    o9.putString("5_error_message", str3);
                }
                if (str4 != null) {
                    o9.putString("4_error_code", str4);
                }
                if (hashMap != null && (!hashMap.isEmpty())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    o9.putString("6_extras", new JSONObject(linkedHashMap).toString());
                }
                o9.putString("3_method", str);
                h9.b.i(o9, str5);
            } catch (Throwable th2) {
                O2.a.a(h9, th2);
            }
        }
    }

    public final void j(int i9, int i10, Intent intent) {
        this.m++;
        if (this.f13775i != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f13398k, false)) {
                k();
                return;
            }
            z g9 = g();
            if (g9 != null) {
                if (!(g9 instanceof o) || intent != null || this.m >= this.f13778n) {
                    g9.i(i9, i10, intent);
                }
            }
        }
    }

    public final void k() {
        String str;
        String str2;
        z g9 = g();
        if (g9 != null) {
            i(g9.f(), "skipped", null, null, g9.b);
        }
        z[] zVarArr = this.b;
        while (zVarArr != null) {
            int i9 = this.f13770c;
            if (i9 >= zVarArr.length - 1) {
                break;
            }
            this.f13770c = i9 + 1;
            z g10 = g();
            if (g10 != null) {
                if ((g10 instanceof C) && !c()) {
                    a("no_internet_permission", "1", false);
                } else {
                    q qVar = this.f13775i;
                    if (qVar == null) {
                        continue;
                    } else {
                        int l = g10.l(qVar);
                        this.m = 0;
                        boolean z8 = qVar.f13753o;
                        String str3 = qVar.f13747g;
                        if (l > 0) {
                            x h6 = h();
                            String f9 = g10.f();
                            if (z8) {
                                str2 = "foa_mobile_login_method_start";
                            } else {
                                str2 = "fb_mobile_login_method_start";
                            }
                            if (!O2.a.b(h6)) {
                                try {
                                    int i10 = x.f13785c;
                                    Bundle o3 = C2645d.o(str3);
                                    o3.putString("3_method", f9);
                                    h6.b.i(o3, str2);
                                } catch (Throwable th) {
                                    O2.a.a(h6, th);
                                }
                            }
                            this.f13778n = l;
                        } else {
                            x h9 = h();
                            String f10 = g10.f();
                            if (z8) {
                                str = "foa_mobile_login_method_not_tried";
                            } else {
                                str = "fb_mobile_login_method_not_tried";
                            }
                            if (!O2.a.b(h9)) {
                                try {
                                    int i11 = x.f13785c;
                                    Bundle o9 = C2645d.o(str3);
                                    o9.putString("3_method", f10);
                                    h9.b.i(o9, str);
                                } catch (Throwable th2) {
                                    O2.a.a(h9, th2);
                                }
                            }
                            a("not_tried", g10.f(), true);
                        }
                        if (l > 0) {
                            return;
                        }
                    }
                }
            }
        }
        q qVar2 = this.f13775i;
        if (qVar2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            d(new s(qVar2, r.ERROR, null, null, TextUtils.join(": ", arrayList), null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "dest");
        parcel.writeParcelableArray(this.b, i9);
        parcel.writeInt(this.f13770c);
        parcel.writeParcelable(this.f13775i, i9);
        H.N(parcel, this.f13776j);
        H.N(parcel, this.f13777k);
    }
}
